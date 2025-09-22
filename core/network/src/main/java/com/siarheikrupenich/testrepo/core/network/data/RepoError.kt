package com.siarheikrupenich.testrepo.core.network.data

sealed class RepoError(val message: String? = null) {

    data object NetworkLost : RepoError("No internet connection")

    data object Unauthorized : RepoError("Unauthorized access")

    data class Unknown(val error: Throwable) : RepoError(error.message)
}
