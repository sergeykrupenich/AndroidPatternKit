package com.siarheikrupenich.testrepo.network.entity

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class LicenseApiEntity(

    @SerializedName("key")
    val key: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("spdx_id")
    val spdxId: String,

    @SerializedName("url")
    val url: String?,

    @SerializedName("node_id")
    val nodeId: String
)
