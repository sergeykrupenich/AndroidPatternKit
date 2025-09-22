package com.siarheikrupenich.testrepo.presentation.mvvm

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.siarheikrupenich.testrepo.presentation.data.RepoState
import com.siarheikrupenich.testrepo.presentation.ui.LoadingState
import com.siarheikrupenich.testrepo.presentation.ui.RepoEmptyState
import com.siarheikrupenich.testrepo.presentation.ui.RepoItem
import com.siarheikrupenich.testrepo.presentation.R

@Composable
fun ReposScreenMvvm() {
    val viewModel: MvvmReposScreenViewModel.ViewModel = hiltViewModel()
    val repoState by viewModel.output.repoState.collectAsState()

    RepoState(repoState, viewModel as MvvmReposScreenViewModel.Input)
}

@Composable
private fun RepoState(repoState: RepoState, reposInput: MvvmReposScreenViewModel.Input) {
    when (repoState) {
        is RepoState.Success -> LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(repoState.repos.count()) { repoIndex ->
                RepoItem(repoState.repos[repoIndex])
            }
        }
        RepoState.Empty -> RepoEmptyState(
            stateMessage = stringResource(R.string.empty_state_title),
            contentDescription = stringResource(R.string.empty_content_description),
            stateImageDrawableRes = R.drawable.ic_empty_state,
            buttonTitle = stringResource(R.string.retry),
            emptyButtonAction = {
                reposInput.loadRepos(true)
            }
        )
        is RepoState.Error -> RepoEmptyState(
            stateMessage = repoState.error?.message ?:
                stringResource(R.string.common_error_message),
            contentDescription = stringResource(R.string.error_content_description),
            stateImageDrawableRes = R.drawable.ic_error,
            buttonTitle = stringResource(R.string.retry),
            emptyButtonAction = {
                reposInput.loadRepos(true)
            },
            repos = repoState.repos
        )
        RepoState.Loading -> LoadingState()
    }
}
