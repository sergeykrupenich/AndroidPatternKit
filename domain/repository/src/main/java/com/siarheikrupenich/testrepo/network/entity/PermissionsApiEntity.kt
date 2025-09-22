package com.siarheikrupenich.testrepo.network.entity

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

@Keep
data class PermissionsApiEntity(

    @SerializedName("admin")
    val admin: Boolean,

    @SerializedName("maintain")
    val maintain: Boolean,

    @SerializedName("push")
    val push: Boolean,

    @SerializedName("triage")
    val triage: Boolean,

    @SerializedName("pull")
    val pull: Boolean
)
