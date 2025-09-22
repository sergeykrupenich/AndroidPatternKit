package com.siarheikrupenich.testrepo.dao.mapper

import com.siarheikrupenich.testrepo.core.Mapper
import com.siarheikrupenich.testrepo.dao.entity.RepoWithRelations
import com.siarheikrupenich.testrepo.repository.model.Repo

interface DbReposToReposMapper: Mapper<List<RepoWithRelations>, List<Repo>>
