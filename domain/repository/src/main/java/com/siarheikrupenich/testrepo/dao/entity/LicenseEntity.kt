package com.siarheikrupenich.testrepo.dao.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "license")
data class LicenseEntity(
    @PrimaryKey val key: String,
    val name: String,
    val spdxId: String,
    val url: String?,
    val nodeId: String
)
