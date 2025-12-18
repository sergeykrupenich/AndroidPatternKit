package com.siarheikrupenich.domain.mapper

import com.siarheikrupenich.domain.model.DomainRepoEntity
import com.siarheikrupenich.testrepo.repository.model.Repo

internal class RepoEntityMapperImpl: RepoEntityMapper {

    override fun map(param: Repo): DomainRepoEntity = with(param) {
        DomainRepoEntity(
            id = id ?: 0,
            title = fullName,
            description = description.orEmpty()
        )
    }
}
