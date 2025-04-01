package com.siarheikrupenich.testrepo.dao.mapper

import com.siarheikrupenich.testrepo.core.Mapper
import com.siarheikrupenich.testrepo.dao.entity.RepoWithRelations
import com.siarheikrupenich.testrepo.network.entity.RepoApiEntity

interface NetworkReposToDbReposMapper: Mapper<List<RepoApiEntity>, List<RepoWithRelations>>
