package com.siarheikrupenich.testrepo.repository.model

data class License(
    val key: String,
    val name: String,
    val spdxId: String,
    val url: String?,
    val nodeId: String
)
