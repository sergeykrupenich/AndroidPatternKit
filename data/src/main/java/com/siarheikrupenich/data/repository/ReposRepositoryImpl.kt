package com.siarheikrupenich.data.repository

import com.siarheikrupenich.data.dao.ReposDao
import com.siarheikrupenich.data.network.ReposNetworkApi
import com.siarheikrupenich.testrepo.dao.mapper.DbReposToReposMapper
import com.siarheikrupenich.testrepo.dao.mapper.NetworkReposToDbReposMapper
import com.siarheikrupenich.testrepo.core.network.data.RepoError
import com.siarheikrupenich.testrepo.core.network.data.ResultWithFallback
import com.siarheikrupenich.testrepo.dao.entity.RepoWithRelations
import com.siarheikrupenich.testrepo.repository.model.Repo
import com.siarheikrupenich.testrepo.repository.ReposRepository
import javax.inject.Inject
import okio.IOException
import retrofit2.HttpException

internal class ReposRepositoryImpl @Inject constructor(
    private val reposNetworkApi: ReposNetworkApi,
    private val reposDao: ReposDao,
    private val networkReposToDbReposMapper: NetworkReposToDbReposMapper,
    private val dbReposToReposMapper: DbReposToReposMapper,
) : ReposRepository {

    override suspend fun getRepos(isRefreshing: Boolean): ResultWithFallback<List<Repo>> {
        return runCatching {
            val dbRepos = reposDao.getReposWithRelations()
            if (isRefreshing) {
                reposNetworkApi.getRepos().fold({ result ->
                    reposDao.insertReposWithRelations(networkReposToDbReposMapper.map(result))
                    ResultWithFallback.Success(
                        dbReposToReposMapper.map(reposDao.getReposWithRelations())
                    )
                }, { error ->
                    error.errorToResultWithFallback(dbRepos)
                })
            } else {
                ResultWithFallback.Success(dbReposToReposMapper.map(dbRepos))
            }
        }.getOrElse { error ->
            error.exceptionToResultWithFallback(reposDao.getReposWithRelations())
        }
    }

    override suspend fun clearRepos() {
        reposDao.clearRepos()
    }

    private fun Throwable.exceptionToResultWithFallback(
        data: List<RepoWithRelations>,
    ): ResultWithFallback.Failure<List<Repo>> {
        return if (data.isNotEmpty()) {
            ResultWithFallback.Failure(
                dbReposToReposMapper.map(data), RepoError.Unknown(this)
            )
        } else {
            ResultWithFallback.Failure<List<Repo>>(
                data = null,
                RepoError.Unknown(this)
            )
        }
    }

    private fun Throwable.errorToResultWithFallback(
        localData: List<RepoWithRelations>
    ): ResultWithFallback.Failure<List<Repo>> {
        val repoError = when (this) {
            is IOException -> RepoError.NetworkLost
            is HttpException ->
                if (code() == 401)
                    RepoError.Unauthorized
                else RepoError.Unknown(this)

            else -> RepoError.Unknown(this)
        }
        return ResultWithFallback.Failure(
            dbReposToReposMapper.map(localData),
            repoError
        )
    }
}
