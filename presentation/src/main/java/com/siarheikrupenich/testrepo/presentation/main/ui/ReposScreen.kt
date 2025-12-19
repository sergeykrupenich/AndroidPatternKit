package com.siarheikrupenich.testrepo.presentation.main.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.siarheikrupenich.testrepo.presentation.R
import com.siarheikrupenich.testrepo.presentation.main.mv.RepoState
import com.siarheikrupenich.testrepo.presentation.main.mv.ReposScreenViewModel
import com.siarheikrupenich.testrepo.presentation.main.mv.RepoUiEvent
import kotlin.collections.count
import kotlin.collections.isNotEmpty

@Composable
fun ReposScreen(
    onRepoItemSelected: (Long) -> Unit,
) {
    val viewModel: ReposScreenViewModel = hiltViewModel()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    LaunchedEffect(Unit) {
        viewModel.nextEvent(
            RepoUiEvent.LoadRepos(isRefreshing = true)
        )
    }
    RepoState(
        repoState = uiState,
        onRepoItemSelected = onRepoItemSelected,
        onUpdate = {
            viewModel.nextEvent(
                RepoUiEvent.LoadRepos(isRefreshing = true)
            )
        }
    )
}

@Composable
private fun RepoState(
    repoState: RepoState,
    onRepoItemSelected: (Long) -> Unit,
    onUpdate: (() -> Unit)? = null,
) {
    repoState.repos?.let { items ->
        if (items.isNotEmpty()) {
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(repoState.repos.count()) { repoIndex ->
                    RepoItem(repoState.repos[repoIndex], onRepoItemSelected)
                }
            }
        }
    }
    repoState.error?.let { error ->
        RepoEmptyState(
            stateMessage = error.message ?:
                stringResource(R.string.common_error_message),
            contentDescription = stringResource(R.string.error_content_description),
            stateImageDrawableRes = R.drawable.ic_error,
            buttonTitle = stringResource(R.string.retry),
            emptyButtonAction = {
                onUpdate?.invoke()
            },
            repos = repoState.repos
        )
    }
    if (repoState.isEmpty) {
        RepoEmptyState(
            stateMessage = stringResource(R.string.empty_state_title),
            contentDescription = stringResource(R.string.empty_content_description),
            stateImageDrawableRes = R.drawable.ic_empty_state,
            buttonTitle = stringResource(R.string.retry),
            emptyButtonAction = {
                onUpdate?.invoke()
            }
        )
    }
    if (repoState.isLoading) {
        LoadingState()
    }
}
