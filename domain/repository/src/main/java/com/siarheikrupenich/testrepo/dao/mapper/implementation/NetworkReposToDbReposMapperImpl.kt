package com.siarheikrupenich.testrepo.dao.mapper.implementation

import com.siarheikrupenich.testrepo.dao.entity.LicenseEntity
import com.siarheikrupenich.testrepo.dao.entity.OwnerEntity
import com.siarheikrupenich.testrepo.dao.entity.PermissionsEntity
import com.siarheikrupenich.testrepo.dao.entity.RepoEntity
import com.siarheikrupenich.testrepo.dao.entity.RepoWithRelations
import com.siarheikrupenich.testrepo.dao.mapper.NetworkReposToDbReposMapper
import com.siarheikrupenich.testrepo.network.entity.RepoApiEntity

class NetworkReposToDbReposMapperImpl: NetworkReposToDbReposMapper {

    override fun map(param: List<RepoApiEntity>): List<RepoWithRelations> {
        return param.map { repoEntity ->
            RepoWithRelations(
                repo = createRepoEntity(repoEntity),
                owner = createOwnerEntity(repoEntity),
                license = createLicenseEntity(repoEntity),
                permissions = createPermissionsEntity(repoEntity)
            )
        }
    }

    private fun createRepoEntity(repoEntity: RepoApiEntity): RepoEntity = RepoEntity(
        id = repoEntity.id,
        name = repoEntity.name,
        fullName = repoEntity.fullName,
        private = repoEntity.private,
        htmlUrl = repoEntity.htmlUrl,
        description = repoEntity.description,
        fork = repoEntity.fork,
        url = repoEntity.url,
        createdAt = repoEntity.createdAt,
        updatedAt = repoEntity.updatedAt,
        pushedAt = repoEntity.pushedAt,
        gitUrl = repoEntity.gitUrl,
        sshUrl = repoEntity.sshUrl,
        cloneUrl = repoEntity.cloneUrl,
        svnUrl = repoEntity.svnUrl,
        homepage = repoEntity.homepage,
        size = repoEntity.size,
        stargazersCount = repoEntity.stargazersCount,
        watchersCount = repoEntity.watchersCount,
        language = repoEntity.language,
        hasIssues = repoEntity.hasIssues,
        hasProjects = repoEntity.hasProjects,
        hasDownloads = repoEntity.hasDownloads,
        hasWiki = repoEntity.hasWiki,
        hasPages = repoEntity.hasPages,
        hasDiscussions = repoEntity.hasDiscussions,
        forksCount = repoEntity.forksCount,
        mirrorUrl = repoEntity.mirrorUrl,
        archived = repoEntity.archived,
        disabled = repoEntity.disabled,
        openIssuesCount = repoEntity.openIssuesCount,
        allowForking = repoEntity.allowForking,
        isTemplate = repoEntity.isTemplate,
        webCommitSignoffRequired = repoEntity.webCommitSignoffRequired,
        topics = repoEntity.topics.toList(),
        visibility = repoEntity.visibility,
        forks = repoEntity.forks,
        openIssues = repoEntity.openIssues,
        watchers = repoEntity.watchers,
        defaultBranch = repoEntity.defaultBranch,
        ownerId = repoEntity.owner.id,
        licenseKey = repoEntity.license?.key,
        permissionsId = 0,
    )

    private fun createOwnerEntity(repoEntity: RepoApiEntity) = OwnerEntity(
        id = repoEntity.owner.id,
        login = repoEntity.owner.login,
        avatarUrl = repoEntity.owner.avatarUrl,
        gravatarId = repoEntity.owner.gravatarId,
        url = repoEntity.owner.url,
        htmlUrl = repoEntity.owner.htmlUrl,
        followersUrl = repoEntity.owner.followersUrl,
        followingUrl = repoEntity.owner.followingUrl,
        gistsUrl = repoEntity.owner.gistsUrl,
        starredUrl = repoEntity.owner.starredUrl,
        subscriptionsUrl = repoEntity.owner.subscriptionsUrl,
        organizationsUrl = repoEntity.owner.organizationsUrl,
        reposUrl = repoEntity.owner.reposUrl,
        eventsUrl = repoEntity.owner.eventsUrl,
        receivedEventsUrl = repoEntity.owner.receivedEventsUrl,
        type = repoEntity.owner.type,
        siteAdmin = repoEntity.owner.siteAdmin,
    )

    private fun createLicenseEntity(repoEntity: RepoApiEntity) = repoEntity.license?.let {
        LicenseEntity(
            key = repoEntity.license.key,
            name = repoEntity.license.name,
            spdxId = repoEntity.license.spdxId,
            url = repoEntity.license.url,
            nodeId = repoEntity.license.nodeId,
        )
    }

    private fun createPermissionsEntity(repoEntity: RepoApiEntity) = PermissionsEntity(
        repoId = repoEntity.id ?: 0,
        admin = repoEntity.permissions.admin,
        maintain = repoEntity.permissions.maintain,
        push = repoEntity.permissions.push,
        triage = repoEntity.permissions.triage,
        pull = repoEntity.permissions.pull,
    )
}
