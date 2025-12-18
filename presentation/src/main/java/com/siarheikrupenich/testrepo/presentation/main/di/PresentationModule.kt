package com.siarheikrupenich.testrepo.presentation.main.di

import com.siarheikrupenich.domain.usecase.GetReposUseCase
import com.siarheikrupenich.testrepo.presentation.main.data.mapper.RepoUiModelMapper
import com.siarheikrupenich.testrepo.presentation.main.data.mapper.RepoUiModelMapperImpl
import com.siarheikrupenich.testrepo.presentation.main.data.usecase.GetUiReposUseCase
import com.siarheikrupenich.testrepo.presentation.main.data.usecase.GetUiReposUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
internal class PresentationModule {

    @Provides
    fun provideRepoUiModelMapper(): RepoUiModelMapper =
        RepoUiModelMapperImpl()

    @Provides
    fun provideGetUiReposUseCase(
        getReposUseCase: GetReposUseCase,
        mapper: RepoUiModelMapper
    ): GetUiReposUseCase = GetUiReposUseCaseImpl(getReposUseCase, mapper)
}