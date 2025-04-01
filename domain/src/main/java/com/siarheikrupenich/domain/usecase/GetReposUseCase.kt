package com.siarheikrupenich.domain.usecase

import com.siarheikrupenich.domain.model.DomainRepoEntity
import com.siarheikrupenich.testrepo.core.SuspendUseCase
import com.siarheikrupenich.testrepo.core.network.data.ResultWithFallback

interface GetReposUseCase: SuspendUseCase<Boolean, ResultWithFallback<List<DomainRepoEntity>>>