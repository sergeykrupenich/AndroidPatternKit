package com.siarheikrupenich.testrepo.dao.di;

@dagger.Module()
@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lcom/siarheikrupenich/testrepo/dao/di/RepositoryModule;", "", "<init>", "()V", "provideDbReposToReposMapper", "Lcom/siarheikrupenich/testrepo/dao/mapper/DbReposToReposMapper;", "provideNetworkReposToDbReposMapper", "Lcom/siarheikrupenich/testrepo/dao/mapper/NetworkReposToDbReposMapper;", "repository_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.mapper.DbReposToReposMapper provideDbReposToReposMapper() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.siarheikrupenich.testrepo.dao.mapper.NetworkReposToDbReposMapper provideNetworkReposToDbReposMapper() {
        return null;
    }
}