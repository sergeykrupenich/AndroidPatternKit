package com.siarheikrupenich.testrepo.presentation.main.mv

import com.siarheikrupenich.testrepo.core.network.data.RepoError
import com.siarheikrupenich.testrepo.presentation.main.data.RepoState
import com.siarheikrupenich.testrepo.presentation.main.data.RepoUi
import com.siarheikrupenich.testrepo.presentation.main.data.usecase.GetUiReposUseCase
import com.siarheikrupenich.testrepo.viewmodel.ReducerSupportStreamViewModel
import com.siarheikrupenich.testrepo.viewmodel.state.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ReposScreenViewModel @Inject constructor(
    private val getRepos: GetUiReposUseCase,
): ReducerSupportStreamViewModel<RepoUiEvent, com.siarheikrupenich.testrepo.presentation.main.mv.RepoState, RepoState>(
    RepoState(isLoading = true)
) {
    init {
        query(RepoUiEvent.LoadRepos::class.java) { event ->
            getRepos(event.isRefreshing)
        }
        reducer(RepoState.Loading::class.java) { currentResult, state ->
            currentResult.copy(
                isLoading = true,
                isEmpty = false,
            )
        }
        reducer(RepoState.Empty::class.java) { currentResult, state ->
            currentResult.copy(
                isLoading = false,
                isEmpty = true,
            )
        }
        reducer(RepoState.Error::class.java) { currentResult, state ->
            currentResult.copy(
                isLoading = false,
                isEmpty = false,
                error = state.error,
                repos = state.repos
            )
        }
        reducer(RepoState.Success::class.java) { currentResult, state ->
            currentResult.copy(
                isLoading = false,
                isEmpty = false,
                repos = state.repos
            )
        }
    }
}

sealed class RepoUiEvent : UiEvent {
    data class LoadRepos(val isRefreshing: Boolean) : RepoUiEvent()
}

data class RepoState(
    val isLoading: Boolean = false,
    val isEmpty: Boolean = false,
    val repos: List<RepoUi>? = null,
    val error: RepoError? = null
)
