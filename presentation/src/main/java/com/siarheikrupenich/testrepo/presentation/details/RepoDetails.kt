package com.siarheikrupenich.testrepo.presentation.details

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun RepoDetailsScreen(
    repo: RepoUiModel,
    modifier: Modifier = Modifier,
//    onOpenUrl: (String) -> Unit = {}
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        item {
            HeaderSection(repo)
        }

        item {
            OwnerSection(repo.owner)
        }

        repo.description?.let {
            item {
                DescriptionSection(it)
            }
        }

        item {
            StatsSection(repo)
        }

        if (repo.topics.isNotEmpty()) {
            item {
                TopicsSection(repo.topics)
            }
        }

        item {
            MetaSection(repo)
        }

        item {
            LinksSection(repo, onOpenUrl)
        }

        item {
            FeaturesSection(repo)
        }
    }
}

@Composable
private fun HeaderSection(repo: RepoUiModel) {
    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
        Text(
            text = repo.name,
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = repo.fullName,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            AssistChip(
                onClick = {},
                label = { Text(repo.visibility) }
            )

            if (repo.archived) {
                AssistChip(
                    onClick = {},
                    label = { Text("Archived") }
                )
            }

            if (repo.disabled) {
                AssistChip(
                    onClick = {},
                    label = { Text("Disabled") }
                )
            }
        }
    }
}

@Composable
private fun OwnerSection(owner: Owner) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        AsyncImage(
            model = owner.avatarUrl,
            contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Column {
            Text(owner.login, fontWeight = FontWeight.Medium)
            Text(
                text = owner.type,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
private fun DescriptionSection(description: String) {
    Text(
        text = description,
        style = MaterialTheme.typography.bodyMedium
    )
}
@Composable
private fun StatsSection(repo: RepoUiModel) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        StatItem("Stars", repo.stargazersCount)
        StatItem("Forks", repo.forksCount)
        StatItem("Watchers", repo.watchersCount)
        StatItem("Issues", repo.openIssuesCount)
    }
}

@Composable
private fun StatItem(label: String, value: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = value.toString(),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Composable
private fun TopicsSection(topics: List<String>) {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        topics.forEach { topic ->
            AssistChip(
                onClick = {},
                label = { Text(topic) }
            )
        }
    }
}

@Composable
private fun MetaSection(repo: RepoUiModel) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        MetaRow("Language", repo.language ?: "—")
        MetaRow("License", repo.license?.name ?: "—")
        MetaRow("Default branch", repo.defaultBranch)
        MetaRow("Size", "${repo.size} KB")
        MetaRow("Created", repo.createdAt)
        MetaRow("Updated", repo.updatedAt)
        MetaRow("Last push", repo.pushedAt)
    }
}

@Composable
private fun MetaRow(label: String, value: String) {
    Row {
        Text(
            text = "$label:",
            modifier = Modifier.width(140.dp),
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(text = value)
    }
}

@Composable
private fun LinksSection(
    repo: RepoUiModel,
    onOpenUrl: (String) -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        LinkItem("HTML", repo.htmlUrl, onOpenUrl)
        LinkItem("Clone", repo.cloneUrl, onOpenUrl)
        LinkItem("SSH", repo.sshUrl, onOpenUrl)
        repo.homepage?.let {
            LinkItem("Homepage", it, onOpenUrl)
        }
    }
}

@Composable
private fun LinkItem(
    label: String,
    url: String,
    onOpenUrl: (String) -> Unit
) {
    Text(
        text = "$label: $url",
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.clickable { onOpenUrl(url) }
    )
}

@Composable
private fun FeaturesSection(repo: RepoUiModel) {
    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
        FeatureItem("Issues", repo.hasIssues)
        FeatureItem("Projects", repo.hasProjects)
        FeatureItem("Wiki", repo.hasWiki)
        FeatureItem("Pages", repo.hasPages)
        FeatureItem("Discussions", repo.hasDiscussions)
        FeatureItem("Downloads", repo.hasDownloads)
        FeatureItem("Allow forking", repo.allowForking)
        FeatureItem("Template", repo.isTemplate)
        FeatureItem("Commit signoff required", repo.webCommitSignoffRequired)
    }
}

@Composable
private fun FeatureItem(label: String, enabled: Boolean) {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Icon(
            imageVector = if (enabled) Icons.Default.Check else Icons.Default.Close,
            contentDescription = null
        )
        Text(label)
    }
}
