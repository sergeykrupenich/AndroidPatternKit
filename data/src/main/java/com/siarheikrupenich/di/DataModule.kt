package com.siarheikrupenich.di

import android.content.Context
import com.siarheikrupenich.data.dao.ReposDao
import com.siarheikrupenich.data.dao.ReposDatabase
import com.siarheikrupenich.data.network.ReposNetworkApi
import com.siarheikrupenich.data.repository.ReposRepositoryImpl
import com.siarheikrupenich.testrepo.dao.mapper.NetworkReposToDbReposMapper
import com.siarheikrupenich.testrepo.dao.mapper.DbReposToReposMapper
import com.siarheikrupenich.testrepo.repository.ReposRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
internal class DataModule {

    @Provides
    fun provideReposRepository(
        reposNetworkApi: ReposNetworkApi,
        reposDao: ReposDao,
        networkReposToDbReposMapper: NetworkReposToDbReposMapper,
        dbReposToReposMapper: DbReposToReposMapper
    ): ReposRepository {
        return ReposRepositoryImpl(
            reposNetworkApi,
            reposDao,
            networkReposToDbReposMapper,
            dbReposToReposMapper
        )
    }

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): ReposDatabase {
        return ReposDatabase.getInstance(context)
    }

    @Provides
    fun provideReposDao(database: ReposDatabase): ReposDao {
        return database.reposDao()
    }

    companion object {
        @Provides
        @Singleton
        fun provideReposNetworkApi(retrofit: Retrofit): ReposNetworkApi =
            retrofit.create(ReposNetworkApi::class.java)
    }
}