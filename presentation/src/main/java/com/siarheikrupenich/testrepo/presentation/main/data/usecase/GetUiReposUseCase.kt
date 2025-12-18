package com.siarheikrupenich.testrepo.presentation.main.data.usecase

import com.siarheikrupenich.testrepo.core.SuspendUseCase
import com.siarheikrupenich.testrepo.presentation.main.data.RepoState

interface GetUiReposUseCase: SuspendUseCase<Boolean, RepoState>
