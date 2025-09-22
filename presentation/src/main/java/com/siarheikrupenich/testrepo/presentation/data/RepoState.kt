package com.siarheikrupenich.testrepo.presentation.data

import com.siarheikrupenich.testrepo.core.network.data.RepoError
import com.siarheikrupenich.testrepo.core.network.data.ResultWithFallback

sealed interface RepoState {

    data class Success(val repos: List<RepoUi>): RepoState

    data object Empty: RepoState

    data object Loading: RepoState

    data class Error(val error: RepoError?, val repos: List<RepoUi>?): RepoState
}

internal fun ResultWithFallback<List<RepoUi>>.mapToRepoState(): RepoState = when (this) {
    is ResultWithFallback.Success -> {
        if (data.isEmpty()) {
            RepoState.Empty
        } else {
            RepoState.Success(data)
        }
    }
    is ResultWithFallback.Failure -> RepoState.Error(error, data)
}

inline fun <T, R> ResultWithFallback<T>.mapCatching(transform: (T) -> R): ResultWithFallback<R> {
    return try {
        when (this) {
            is ResultWithFallback.Success -> ResultWithFallback.Success(transform(data))
            is ResultWithFallback.Failure -> ResultWithFallback.Failure(
                data?.let { transform(it) },
                error
            )
        }
    } catch (e: Exception) {
        ResultWithFallback.Failure(
            data = null,
            error = RepoError.Unknown(e)
        )
    }
}
