package com.siarheikrupenich.testrepo.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlinx.coroutines.Dispatchers;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007\u00a2\u0006\u0002\b\fH\u0004\u00a2\u0006\u0002\u0010\rJ6\u0010\u000e\u001a\u00020\u00052\'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007\u00a2\u0006\u0002\b\fH\u0004\u00a2\u0006\u0002\u0010\rJ@\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007\u00a2\u0006\u0002\b\fH\u0002\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/siarheikrupenich/testrepo/viewmodel/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "runOnDefault", "Lkotlinx/coroutines/Job;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "runOnIO", "runCoroutine", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "ui_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.Job runOnDefault(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.Job runOnIO(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    private final kotlinx.coroutines.Job runCoroutine(kotlin.coroutines.CoroutineContext context, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
}