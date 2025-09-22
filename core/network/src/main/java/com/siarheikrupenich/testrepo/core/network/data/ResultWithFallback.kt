package com.siarheikrupenich.testrepo.core.network.data

sealed class ResultWithFallback<out T> {
    data class Success<T>(val data: T) : ResultWithFallback<T>()
    data class Failure<T>(val data: T?, val error: RepoError) : ResultWithFallback<T>()
}

inline fun <T, R> ResultWithFallback<T>.map(transform: (T) -> R): ResultWithFallback<R> {
    return when (this) {
        is ResultWithFallback.Success -> ResultWithFallback.Success(transform(data))
        is ResultWithFallback.Failure -> ResultWithFallback.Failure(
            data?.let { transform(it) },
            error
        )
    }
}
