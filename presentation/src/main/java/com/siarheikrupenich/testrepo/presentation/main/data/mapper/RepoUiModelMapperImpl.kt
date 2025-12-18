package com.siarheikrupenich.testrepo.presentation.main.data.mapper

import com.siarheikrupenich.domain.model.DomainRepoEntity
import com.siarheikrupenich.testrepo.presentation.main.data.RepoUi

internal class RepoUiModelMapperImpl: RepoUiModelMapper {

    override fun map(param: DomainRepoEntity): RepoUi = with(param) {
        RepoUi(id, title, description)
    }
}
