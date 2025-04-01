package com.siarheikrupenich.domain.usecase

import com.siarheikrupenich.domain.model.DomainRepoEntity
import com.siarheikrupenich.domain.mapper.RepoEntityMapper
import com.siarheikrupenich.testrepo.core.network.data.ResultWithFallback
import com.siarheikrupenich.testrepo.core.network.data.map
import com.siarheikrupenich.testrepo.repository.ReposRepository

internal class GetReposUseCaseImpl(
    private val mapper: RepoEntityMapper,
    private val repository: ReposRepository
) : GetReposUseCase {

    override suspend operator fun invoke(param: Boolean): ResultWithFallback<List<DomainRepoEntity>> =
        repository.getRepos(param)
            .map { listOfRepositoryData ->
                listOfRepositoryData.map { repositoryData -> mapper.map(repositoryData) }
            }
}
