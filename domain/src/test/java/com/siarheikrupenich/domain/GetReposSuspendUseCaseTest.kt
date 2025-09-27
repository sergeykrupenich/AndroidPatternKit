package com.siarheikrupenich.domain

import com.siarheikrupenich.testrepo.core.tests.BaseTest
import com.siarheikrupenich.domain.mapper.RepoEntityMapperImpl
import com.siarheikrupenich.testrepo.repository.ReposRepository
import com.siarheikrupenich.domain.usecase.GetReposUseCase
import com.siarheikrupenich.domain.usecase.GetReposUseCaseImpl
import com.siarheikrupenich.testrepo.core.network.data.ResultWithFallback
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Test
import org.junit.Assert.assertEquals

@OptIn(ExperimentalCoroutinesApi::class)
class GetReposSuspendUseCaseTest : BaseTest() {
    private val testMapper = RepoEntityMapperImpl()
    private val testRepository: ReposRepository = mockk()

    private val useCase: GetReposUseCase = GetReposUseCaseImpl(testMapper, testRepository)

    @Test
    fun `loadRepositories() returns expected value`() = runRepoTest {
        coEvery { testRepository.getRepos(false) } returns ResultWithFallback.Success(
            DomainTestObjects.repos
        )

        val result = useCase(false)

        coVerify { testRepository.getRepos(false) }
        assert(result is ResultWithFallback.Success)

        val repos = (result as? ResultWithFallback.Success)?.data
        if (repos == null || repos.isEmpty()) assert(false, { "Repos must not be null or empty" })

        repos?.forEachIndexed { index, item ->
            assert(item.title.contains("desc", ignoreCase = true))
        }

        assertEquals("test 1", "test 1")
    }
}
