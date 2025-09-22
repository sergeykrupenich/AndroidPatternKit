package com.siarheikrupenich.testrepo.network.entity

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.siarheikrupenich.testrepo.repository.model.License
import com.siarheikrupenich.testrepo.repository.model.Owner

@Keep
data class RepoApiEntity(

    @SerializedName("id")
    val id: Long?,

    @SerializedName("node_id") val nodeId: String,
    val name: String,

    @SerializedName("full_name")
    val fullName: String,

    @SerializedName("private")
    val private: Boolean,

    @SerializedName("owner")
    val owner: OwnerApiEntity,

    @SerializedName("html_url")
    val htmlUrl: String,

    @SerializedName("description")
    val description: String?,

    @SerializedName("fork")
    val fork: Boolean,

    @SerializedName("url")
    val url: String,

    @SerializedName("created_at")
    val createdAt: String,

    @SerializedName("updated_at")
    val updatedAt: String,

    @SerializedName("pushed_at")
    val pushedAt: String,

    @SerializedName("git_url")
    val gitUrl: String,

    @SerializedName("ssh_url")
    val sshUrl: String,

    @SerializedName("clone_url")
    val cloneUrl: String,

    @SerializedName("svn_url")
    val svnUrl: String,

    @SerializedName("homepage")
    val homepage: String?,

    @SerializedName("size")
    val size: Int,

    @SerializedName("stargazers_count")
    val stargazersCount: Int,

    @SerializedName("watchers_count")
    val watchersCount: Int,

    @SerializedName("language")
    val language: String?,

    @SerializedName("has_issues")
    val hasIssues: Boolean,

    @SerializedName("has_projects")
    val hasProjects: Boolean,

    @SerializedName("has_downloads")
    val hasDownloads: Boolean,

    @SerializedName("has_wiki")
    val hasWiki: Boolean,

    @SerializedName("has_pages")
    val hasPages: Boolean,

    @SerializedName("has_discussions")
    val hasDiscussions: Boolean,

    @SerializedName("forks_count")
    val forksCount: Int,

    @SerializedName("mirror_url")
    val mirrorUrl: String?,

    @SerializedName("archived")
    val archived: Boolean,

    @SerializedName("disabled")
    val disabled: Boolean,

    @SerializedName("open_issues_count")
    val openIssuesCount: Int,

    @SerializedName("license")
    val license: LicenseApiEntity?,

    @SerializedName("allow_forking")
    val allowForking: Boolean,

    @SerializedName("is_template")
    val isTemplate: Boolean,

    @SerializedName("web_commit_signoff_required")
    val webCommitSignoffRequired: Boolean,

    @SerializedName("topics")
    val topics: List<String>,

    @SerializedName("visibility")
    val visibility: String,

    @SerializedName("forks")
    val forks: Int,

    @SerializedName("open_issues")
    val openIssues: Int,

    @SerializedName("watchers")
    val watchers: Int,

    @SerializedName("default_branch")
    val defaultBranch: String,

    @SerializedName("permissions")
    val permissions: PermissionsApiEntity
)
