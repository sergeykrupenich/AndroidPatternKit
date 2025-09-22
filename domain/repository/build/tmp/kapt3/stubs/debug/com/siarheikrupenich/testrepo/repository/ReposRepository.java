package com.siarheikrupenich.testrepo.repository;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Lcom/siarheikrupenich/testrepo/repository/ReposRepository;", "", "getRepos", "Lcom/siarheikrupenich/testrepo/core/network/data/ResultWithFallback;", "", "Lcom/siarheikrupenich/testrepo/repository/model/Repo;", "isRefreshing", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearRepos", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "repository_debug"})
public abstract interface ReposRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRepos(boolean isRefreshing, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.siarheikrupenich.testrepo.core.network.data.ResultWithFallback<? extends java.util.List<com.siarheikrupenich.testrepo.repository.model.Repo>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearRepos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}