package com.siarheikrupenich.testrepo.dao.mapper.implementation

import com.siarheikrupenich.testrepo.dao.entity.RepoWithRelations
import com.siarheikrupenich.testrepo.dao.mapper.DbReposToReposMapper
import com.siarheikrupenich.testrepo.repository.model.License
import com.siarheikrupenich.testrepo.repository.model.Owner
import com.siarheikrupenich.testrepo.repository.model.Permissions
import com.siarheikrupenich.testrepo.repository.model.Repo

internal class DbReposToReposMapperImpl : DbReposToReposMapper {

    override fun map(param: List<RepoWithRelations>): List<Repo> {
        return param.map { createRepo(it) }
    }

    private fun createRepo(it: RepoWithRelations) = Repo(
        id = it.repo.id,
        name = it.repo.name,
        fullName = it.repo.fullName,
        private = it.repo.private,
        owner = createOwner(it),
        htmlUrl = it.repo.htmlUrl,
        description = it.repo.description,
        fork = it.repo.fork,
        url = it.repo.url,
        createdAt = it.repo.createdAt,
        updatedAt = it.repo.updatedAt,
        pushedAt = it.repo.pushedAt,
        gitUrl = it.repo.gitUrl,
        sshUrl = it.repo.sshUrl,
        cloneUrl = it.repo.cloneUrl,
        svnUrl = it.repo.svnUrl,
        homepage = it.repo.homepage,
        size = it.repo.size,
        stargazersCount = it.repo.stargazersCount,
        watchersCount = it.repo.watchersCount,
        language = it.repo.language,
        hasIssues = it.repo.hasIssues,
        hasProjects = it.repo.hasProjects,
        hasDownloads = it.repo.hasDownloads,
        hasWiki = it.repo.hasWiki,
        hasPages = it.repo.hasPages,
        hasDiscussions = it.repo.hasDiscussions,
        forksCount = it.repo.forksCount,
        mirrorUrl = it.repo.mirrorUrl,
        archived = it.repo.archived,
        disabled = it.repo.disabled,
        openIssuesCount = it.repo.openIssuesCount,
        license = createLicense(it),
        allowForking = it.repo.allowForking,
        isTemplate = it.repo.isTemplate,
        webCommitSignoffRequired = it.repo.webCommitSignoffRequired,
        topics = it.repo.topics.toList(),
        visibility = it.repo.visibility,
        forks = it.repo.forks,
        openIssues = it.repo.openIssues,
        watchers = it.repo.watchers,
        defaultBranch = it.repo.defaultBranch,
        permissions = createPermissions(it)
    )

    private fun createPermissions(it: RepoWithRelations): Permissions {
        return Permissions(
            admin = it.permissions.admin,
            maintain = it.permissions.maintain,
            push = it.permissions.push,
            triage = it.permissions.triage,
            pull = it.permissions.pull
        )
    }

    private fun createLicense(it: RepoWithRelations): License? {
        return it.license?.let { license ->
            License(
                key = license.key,
                name = license.name,
                spdxId = license.spdxId,
                url = license.url,
                nodeId = license.nodeId,
            )
        }
    }

    private fun createOwner(it: RepoWithRelations) = Owner(
        login = it.owner.login,
        id = it.owner.id,
        avatarUrl = it.owner.avatarUrl,
        gravatarId = it.owner.gravatarId,
        url = it.owner.url,
        htmlUrl = it.owner.htmlUrl,
        followersUrl = it.owner.followersUrl,
        followingUrl = it.owner.followingUrl,
        gistsUrl = it.owner.gistsUrl,
        starredUrl = it.owner.starredUrl,
        subscriptionsUrl = it.owner.subscriptionsUrl,
        organizationsUrl = it.owner.organizationsUrl,
        reposUrl = it.owner.reposUrl,
        eventsUrl = it.owner.eventsUrl,
        receivedEventsUrl = it.owner.receivedEventsUrl,
        type = it.owner.type,
        siteAdmin = it.owner.siteAdmin,
    )
}
