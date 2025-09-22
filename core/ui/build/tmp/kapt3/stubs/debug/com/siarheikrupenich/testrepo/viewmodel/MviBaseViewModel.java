package com.siarheikrupenich.testrepo.viewmodel;

import androidx.lifecycle.ViewModel;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/siarheikrupenich/testrepo/viewmodel/MviBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "getParentJob", "()Lkotlinx/coroutines/CompletableJob;", "onCleared", "", "ui_debug"})
public abstract class MviBaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    
    public MviBaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.CompletableJob getParentJob() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}