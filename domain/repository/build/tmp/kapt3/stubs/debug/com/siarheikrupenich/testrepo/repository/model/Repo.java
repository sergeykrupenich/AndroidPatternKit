package com.siarheikrupenich.testrepo.repository.model;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bg\b\u0086\b\u0018\u00002\u00020\u0001B\u00f1\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\u0018\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\u0018\u0012\b\u0010\'\u001a\u0004\u0018\u00010(\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\b\u0012\u0006\u0010+\u001a\u00020\b\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0018\u0012\u0006\u00100\u001a\u00020\u0018\u0012\u0006\u00101\u001a\u00020\u0018\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u000204\u00a2\u0006\u0004\b5\u00106J\u0010\u0010j\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00108J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\t\u0010l\u001a\u00020\u0005H\u00c6\u0003J\t\u0010m\u001a\u00020\bH\u00c6\u0003J\t\u0010n\u001a\u00020\nH\u00c6\u0003J\t\u0010o\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010q\u001a\u00020\bH\u00c6\u0003J\t\u0010r\u001a\u00020\u0005H\u00c6\u0003J\t\u0010s\u001a\u00020\u0005H\u00c6\u0003J\t\u0010t\u001a\u00020\u0005H\u00c6\u0003J\t\u0010u\u001a\u00020\u0005H\u00c6\u0003J\t\u0010v\u001a\u00020\u0005H\u00c6\u0003J\t\u0010w\u001a\u00020\u0005H\u00c6\u0003J\t\u0010x\u001a\u00020\u0005H\u00c6\u0003J\t\u0010y\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010{\u001a\u00020\u0018H\u00c6\u0003J\t\u0010|\u001a\u00020\u0018H\u00c6\u0003J\t\u0010}\u001a\u00020\u0018H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0084\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0018H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0018H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050-H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0018H\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0018H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0018H\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u000204H\u00c6\u0003J\u00d0\u0003\u0010\u0095\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\u00182\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\u00182\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010)\u001a\u00020\b2\b\b\u0002\u0010*\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020\b2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-2\b\b\u0002\u0010.\u001a\u00020\u00052\b\b\u0002\u0010/\u001a\u00020\u00182\b\b\u0002\u00100\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u000204H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0096\u0001J\u0015\u0010\u0097\u0001\u001a\u00020\b2\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0018H\u00d6\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010;R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010;R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010;R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010>R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010;R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010;R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010;R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010;R\u0011\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010;R\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010;R\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010;R\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010;R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010;R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010NR\u0011\u0010\u001a\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010NR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010;R\u0011\u0010\u001c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010>R\u0011\u0010\u001d\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010>R\u0011\u0010\u001e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010>R\u0011\u0010\u001f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010>R\u0011\u0010 \u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010>R\u0011\u0010!\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010>R\u0011\u0010\"\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010NR\u0013\u0010#\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010;R\u0011\u0010$\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010>R\u0011\u0010%\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010>R\u0011\u0010&\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010NR\u0013\u0010\'\u001a\u0004\u0018\u00010(\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010)\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010>R\u0011\u0010*\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010>R\u0011\u0010+\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010>R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050-\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u0010.\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010;R\u0011\u0010/\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010NR\u0011\u00100\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010NR\u0011\u00101\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010NR\u0011\u00102\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010;R\u0011\u00103\u001a\u000204\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010i\u00a8\u0006\u009b\u0001"}, d2 = {"Lcom/siarheikrupenich/testrepo/repository/model/Repo;", "", "id", "", "name", "", "fullName", "private", "", "owner", "Lcom/siarheikrupenich/testrepo/repository/model/Owner;", "htmlUrl", "description", "fork", "url", "createdAt", "updatedAt", "pushedAt", "gitUrl", "sshUrl", "cloneUrl", "svnUrl", "homepage", "size", "", "stargazersCount", "watchersCount", "language", "hasIssues", "hasProjects", "hasDownloads", "hasWiki", "hasPages", "hasDiscussions", "forksCount", "mirrorUrl", "archived", "disabled", "openIssuesCount", "license", "Lcom/siarheikrupenich/testrepo/repository/model/License;", "allowForking", "isTemplate", "webCommitSignoffRequired", "topics", "", "visibility", "forks", "openIssues", "watchers", "defaultBranch", "permissions", "Lcom/siarheikrupenich/testrepo/repository/model/Permissions;", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/siarheikrupenich/testrepo/repository/model/Owner;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ZZZZZZILjava/lang/String;ZZILcom/siarheikrupenich/testrepo/repository/model/License;ZZZLjava/util/List;Ljava/lang/String;IIILjava/lang/String;Lcom/siarheikrupenich/testrepo/repository/model/Permissions;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getFullName", "getPrivate", "()Z", "getOwner", "()Lcom/siarheikrupenich/testrepo/repository/model/Owner;", "getHtmlUrl", "getDescription", "getFork", "getUrl", "getCreatedAt", "getUpdatedAt", "getPushedAt", "getGitUrl", "getSshUrl", "getCloneUrl", "getSvnUrl", "getHomepage", "getSize", "()I", "getStargazersCount", "getWatchersCount", "getLanguage", "getHasIssues", "getHasProjects", "getHasDownloads", "getHasWiki", "getHasPages", "getHasDiscussions", "getForksCount", "getMirrorUrl", "getArchived", "getDisabled", "getOpenIssuesCount", "getLicense", "()Lcom/siarheikrupenich/testrepo/repository/model/License;", "getAllowForking", "getWebCommitSignoffRequired", "getTopics", "()Ljava/util/List;", "getVisibility", "getForks", "getOpenIssues", "getWatchers", "getDefaultBranch", "getPermissions", "()Lcom/siarheikrupenich/testrepo/repository/model/Permissions;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/siarheikrupenich/testrepo/repository/model/Owner;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ZZZZZZILjava/lang/String;ZZILcom/siarheikrupenich/testrepo/repository/model/License;ZZZLjava/util/List;Ljava/lang/String;IIILjava/lang/String;Lcom/siarheikrupenich/testrepo/repository/model/Permissions;)Lcom/siarheikrupenich/testrepo/repository/model/Repo;", "equals", "other", "hashCode", "toString", "repository_debug"})
public final class Repo {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fullName = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siarheikrupenich.testrepo.repository.model.Owner owner = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String htmlUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    private final boolean fork = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String createdAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updatedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pushedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String gitUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String sshUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cloneUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String svnUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String homepage = null;
    private final int size = 0;
    private final int stargazersCount = 0;
    private final int watchersCount = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String language = null;
    private final boolean hasIssues = false;
    private final boolean hasProjects = false;
    private final boolean hasDownloads = false;
    private final boolean hasWiki = false;
    private final boolean hasPages = false;
    private final boolean hasDiscussions = false;
    private final int forksCount = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String mirrorUrl = null;
    private final boolean archived = false;
    private final boolean disabled = false;
    private final int openIssuesCount = 0;
    @org.jetbrains.annotations.Nullable()
    private final com.siarheikrupenich.testrepo.repository.model.License license = null;
    private final boolean allowForking = false;
    private final boolean isTemplate = false;
    private final boolean webCommitSignoffRequired = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topics = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String visibility = null;
    private final int forks = 0;
    private final int openIssues = 0;
    private final int watchers = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String defaultBranch = null;
    @org.jetbrains.annotations.NotNull()
    private final com.siarheikrupenich.testrepo.repository.model.Permissions permissions = null;
    
    public Repo(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, boolean p3_1990234817, @org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.repository.model.Owner owner, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean fork, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String pushedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String gitUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String sshUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String cloneUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String svnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, int size, int stargazersCount, int watchersCount, @org.jetbrains.annotations.Nullable()
    java.lang.String language, boolean hasIssues, boolean hasProjects, boolean hasDownloads, boolean hasWiki, boolean hasPages, boolean hasDiscussions, int forksCount, @org.jetbrains.annotations.Nullable()
    java.lang.String mirrorUrl, boolean archived, boolean disabled, int openIssuesCount, @org.jetbrains.annotations.Nullable()
    com.siarheikrupenich.testrepo.repository.model.License license, boolean allowForking, boolean isTemplate, boolean webCommitSignoffRequired, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> topics, @org.jetbrains.annotations.NotNull()
    java.lang.String visibility, int forks, int openIssues, int watchers, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultBranch, @org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.repository.model.Permissions permissions) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final boolean getPrivate() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.repository.model.Owner getOwner() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHtmlUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final boolean getFork() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPushedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGitUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSshUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCloneUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSvnUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final int getStargazersCount() {
        return 0;
    }
    
    public final int getWatchersCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    public final boolean getHasIssues() {
        return false;
    }
    
    public final boolean getHasProjects() {
        return false;
    }
    
    public final boolean getHasDownloads() {
        return false;
    }
    
    public final boolean getHasWiki() {
        return false;
    }
    
    public final boolean getHasPages() {
        return false;
    }
    
    public final boolean getHasDiscussions() {
        return false;
    }
    
    public final int getForksCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMirrorUrl() {
        return null;
    }
    
    public final boolean getArchived() {
        return false;
    }
    
    public final boolean getDisabled() {
        return false;
    }
    
    public final int getOpenIssuesCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siarheikrupenich.testrepo.repository.model.License getLicense() {
        return null;
    }
    
    public final boolean getAllowForking() {
        return false;
    }
    
    public final boolean isTemplate() {
        return false;
    }
    
    public final boolean getWebCommitSignoffRequired() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTopics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getVisibility() {
        return null;
    }
    
    public final int getForks() {
        return 0;
    }
    
    public final int getOpenIssues() {
        return 0;
    }
    
    public final int getWatchers() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDefaultBranch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.repository.model.Permissions getPermissions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component17() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int component19() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component21() {
        return null;
    }
    
    public final boolean component22() {
        return false;
    }
    
    public final boolean component23() {
        return false;
    }
    
    public final boolean component24() {
        return false;
    }
    
    public final boolean component25() {
        return false;
    }
    
    public final boolean component26() {
        return false;
    }
    
    public final boolean component27() {
        return false;
    }
    
    public final int component28() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component30() {
        return false;
    }
    
    public final boolean component31() {
        return false;
    }
    
    public final int component32() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.siarheikrupenich.testrepo.repository.model.License component33() {
        return null;
    }
    
    public final boolean component34() {
        return false;
    }
    
    public final boolean component35() {
        return false;
    }
    
    public final boolean component36() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component38() {
        return null;
    }
    
    public final int component39() {
        return 0;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final int component40() {
        return 0;
    }
    
    public final int component41() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.repository.model.Permissions component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.repository.model.Owner component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.repository.model.Repo copy(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, boolean p3_1990234817, @org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.repository.model.Owner owner, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean fork, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String createdAt, @org.jetbrains.annotations.NotNull()
    java.lang.String updatedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String pushedAt, @org.jetbrains.annotations.NotNull()
    java.lang.String gitUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String sshUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String cloneUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String svnUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String homepage, int size, int stargazersCount, int watchersCount, @org.jetbrains.annotations.Nullable()
    java.lang.String language, boolean hasIssues, boolean hasProjects, boolean hasDownloads, boolean hasWiki, boolean hasPages, boolean hasDiscussions, int forksCount, @org.jetbrains.annotations.Nullable()
    java.lang.String mirrorUrl, boolean archived, boolean disabled, int openIssuesCount, @org.jetbrains.annotations.Nullable()
    com.siarheikrupenich.testrepo.repository.model.License license, boolean allowForking, boolean isTemplate, boolean webCommitSignoffRequired, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> topics, @org.jetbrains.annotations.NotNull()
    java.lang.String visibility, int forks, int openIssues, int watchers, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultBranch, @org.jetbrains.annotations.NotNull()
    com.siarheikrupenich.testrepo.repository.model.Permissions permissions) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}