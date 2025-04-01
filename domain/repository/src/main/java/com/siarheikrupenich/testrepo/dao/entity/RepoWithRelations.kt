package com.siarheikrupenich.testrepo.dao.entity

import androidx.room.Embedded
import androidx.room.Relation

data class RepoWithRelations(
    @Embedded val repo: RepoEntity,

    @Relation(
        parentColumn = "ownerId",
        entityColumn = "id"
    )
    val owner: OwnerEntity,

    @Relation(
        parentColumn = "licenseKey",
        entityColumn = "key"
    )
    val license: LicenseEntity?,

    @Relation(
        parentColumn = "permissionsId",
        entityColumn = "id"
    )
    val permissions: PermissionsEntity
)
