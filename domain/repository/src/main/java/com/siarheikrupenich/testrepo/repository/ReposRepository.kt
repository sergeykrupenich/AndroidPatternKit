package com.siarheikrupenich.testrepo.repository

import com.siarheikrupenich.testrepo.core.network.data.ResultWithFallback
import com.siarheikrupenich.testrepo.repository.model.Repo

interface ReposRepository {

    suspend fun getRepos(isRefreshing: Boolean): ResultWithFallback<List<Repo>>

    suspend fun clearRepos()
}
