package com.siarheikrupenich.testrepo.presentation.main.data.usecase

import com.siarheikrupenich.domain.usecase.GetReposUseCase
import com.siarheikrupenich.testrepo.presentation.main.data.RepoState
import com.siarheikrupenich.testrepo.presentation.main.data.mapCatching
import com.siarheikrupenich.testrepo.presentation.main.data.mapToRepoState
import com.siarheikrupenich.testrepo.presentation.main.data.mapper.RepoUiModelMapper
import javax.inject.Inject

internal class GetUiReposUseCaseImpl @Inject constructor(
    private val getRepos: GetReposUseCase,
    private val mapper: RepoUiModelMapper
): GetUiReposUseCase {

    override suspend fun invoke(param: Boolean): RepoState {
        return getRepos(param).mapCatching {
            it.map(mapper::map)
        }.mapToRepoState()
    }
}
