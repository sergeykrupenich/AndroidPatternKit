package com.siarheikrupenich.testrepo.dao.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "repos",
    foreignKeys = [
        ForeignKey(
            entity = OwnerEntity::class,
            parentColumns = ["id"],
            childColumns = ["ownerId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = LicenseEntity::class,
            parentColumns = ["key"],
            childColumns = ["licenseKey"],
            onDelete = ForeignKey.SET_NULL
        ),
        ForeignKey(
            entity = PermissionsEntity::class,
            parentColumns = ["id"],
            childColumns = ["permissionsId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["ownerId"]), Index(value = ["licenseKey"]), Index(value = ["permissionsId"])]
)
data class RepoEntity(
    @PrimaryKey val id: Long?,
    val name: String,
    val fullName: String,
    val private: Boolean,
    val htmlUrl: String,
    val description: String?,
    val fork: Boolean,
    val url: String,
    val createdAt: String,
    val updatedAt: String,
    val pushedAt: String,
    val gitUrl: String,
    val sshUrl: String,
    val cloneUrl: String,
    val svnUrl: String,
    val homepage: String?,
    val size: Int,
    val stargazersCount: Int,
    val watchersCount: Int,
    val language: String?,
    val hasIssues: Boolean,
    val hasProjects: Boolean,
    val hasDownloads: Boolean,
    val hasWiki: Boolean,
    val hasPages: Boolean,
    val hasDiscussions: Boolean,
    val forksCount: Int,
    val mirrorUrl: String?,
    val archived: Boolean,
    val disabled: Boolean,
    val openIssuesCount: Int,
    val allowForking: Boolean,
    val isTemplate: Boolean,
    val webCommitSignoffRequired: Boolean,
    val topics: List<String>,
    val visibility: String,
    val forks: Int,
    val openIssues: Int,
    val watchers: Int,
    val defaultBranch: String,
    val ownerId: Long,
    val licenseKey: String? = null,
    val permissionsId: Long,
)
