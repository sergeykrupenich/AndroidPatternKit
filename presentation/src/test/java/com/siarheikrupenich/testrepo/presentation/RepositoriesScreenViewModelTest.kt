package com.siarheikrupenich.testrepo.presentation

import app.cash.turbine.test
import com.siarheikrupenich.testrepo.core.network.data.RepoError
import com.siarheikrupenich.testrepo.core.tests.BaseTest
import com.siarheikrupenich.testrepo.presentation.data.RepoUi
import com.siarheikrupenich.testrepo.presentation.data.usecase.GetUiReposUseCase
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.confirmVerified
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Assert
import org.junit.Test
import com.siarheikrupenich.testrepo.presentation.data.RepoState
import com.siarheikrupenich.testrepo.presentation.mvvm.MvvmReposScreenViewModel
import kotlinx.coroutines.test.advanceUntilIdle

@OptIn(ExperimentalCoroutinesApi::class)
class RepositoriesScreenViewModelTest : BaseTest() {

    private val testResult = RepoState.Success(
        listOf(RepoUi(0, "test title", "test desc"))
    )
    private val testUseCase: GetUiReposUseCase = mockk {
        coEvery { this@mockk.invoke(any()) } returns testResult
    }
    private val errorTestUseCase: GetUiReposUseCase = mockk {
        coEvery { this@mockk.invoke(any()) } returns RepoState.Error(
            error = RepoError.Unknown(error = Exception("Test Exception")),
            repos = null
        )
    }
    private val testViewModel = MvvmReposScreenViewModel.ViewModel(testUseCase)
    private val errorTestViewModel = MvvmReposScreenViewModel.ViewModel(errorTestUseCase)

    @Test
    fun `receiving repos works properly`() = runRepoTest {
        testViewModel.input.loadRepos(true)
        testViewModel.output.repoState.test {
            val receivedState = awaitItem()
            assert(receivedState is RepoState.Success)
            Assert.assertEquals(testResult, receivedState)

            cancelAndIgnoreRemainingEvents()
        }

        coVerify { testUseCase(true) }
        confirmVerified(testUseCase)
    }

    @Test
    fun `refresh() works properly`() = runRepoTest {
        testViewModel.input.loadRepos(true)
        testViewModel.output.repoState.test {
            val receivedState = awaitItem()
            Assert.assertEquals(testResult, receivedState)

            testViewModel.input.loadRepos(true)
            val refreshedLoadingState = awaitItem()

            advanceUntilIdle()

            val refreshedState = awaitItem()
            Assert.assertEquals(RepoState.Loading, refreshedLoadingState)
            Assert.assertEquals(testResult, refreshedState)
        }

        coVerify { testUseCase(true) }
        confirmVerified(testUseCase)
    }

    @Test
    fun `error catching works properly`() = runRepoTest {
        errorTestViewModel.input.loadRepos(true)
        errorTestViewModel.output.repoState.test {
            advanceUntilIdle()

            val receivedState = awaitItem()
            val receivedError = (receivedState as? RepoState.Error)

            assert(receivedError is RepoState.Error)

            val exceptionState = RepoState.Error(
                error = RepoError.Unknown(error = Exception("Test Exception")),
                repos = null
            )
            Assert.assertEquals(receivedError?.error?.message, exceptionState.error?.message)
        }
    }
}
