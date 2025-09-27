package com.siarheikrupenich.domain

import com.siarheikrupenich.domain.mapper.RepoEntityMapper
import com.siarheikrupenich.domain.mapper.RepoEntityMapperImpl
import org.junit.Assert.assertEquals
import org.junit.Test

class DomainRepoEntityMapperTest {

    private val mapper: RepoEntityMapper = RepoEntityMapperImpl()

    @Test
    fun `convert() return expected value`() {
        DomainTestObjects.repos.forEach { repoApiEntity ->
            val test = mapper.map(repoApiEntity)
            assertEquals(repoApiEntity.id, test.id)
            assert(repoApiEntity.name.contains("desc", ignoreCase = true))
            assert(repoApiEntity.fullName.contains("Full name", ignoreCase = true))
        }
    }
}
