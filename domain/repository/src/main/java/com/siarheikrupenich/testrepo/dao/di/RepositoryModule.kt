package com.siarheikrupenich.testrepo.dao.di

import com.siarheikrupenich.testrepo.dao.mapper.DbReposToReposMapper
import com.siarheikrupenich.testrepo.dao.mapper.NetworkReposToDbReposMapper
import com.siarheikrupenich.testrepo.dao.mapper.implementation.DbReposToReposMapperImpl
import com.siarheikrupenich.testrepo.dao.mapper.implementation.NetworkReposToDbReposMapperImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
internal class RepositoryModule {

    @Provides
    fun provideDbReposToReposMapper(): DbReposToReposMapper {
        return DbReposToReposMapperImpl()
    }

    @Provides
    fun provideNetworkReposToDbReposMapper(): NetworkReposToDbReposMapper {
        return NetworkReposToDbReposMapperImpl()
    }
}