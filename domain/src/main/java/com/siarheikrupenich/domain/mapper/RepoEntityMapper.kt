package com.siarheikrupenich.domain.mapper

import com.siarheikrupenich.domain.model.DomainRepoEntity
import com.siarheikrupenich.testrepo.core.Mapper
import com.siarheikrupenich.testrepo.repository.model.Repo

internal interface RepoEntityMapper: Mapper<Repo, DomainRepoEntity>
