package com.siarheikrupenich.testrepo.viewmodel;

import com.siarheikrupenich.testrepo.viewmodel.state.UiEvent;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u0003*\b\b\u0002\u0010\u0004*\u00020\u00052\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u000f\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0002H\u0094@\u00a2\u0006\u0002\u0010\u0012JM\u0010\u0013\u001a\u00020\u0014\"\b\b\u0003\u0010\u0015*\u00028\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00150\f2(\u0010\u0013\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r\u00a2\u0006\u0002\u0010\u0016RD\u0010\n\u001a8\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00020\f\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/siarheikrupenich/testrepo/viewmodel/ReducerSupportStreamViewModel;", "Event", "Lcom/siarheikrupenich/testrepo/viewmodel/state/UiEvent;", "State", "Result", "", "Lcom/siarheikrupenich/testrepo/viewmodel/EventStreamViewModel;", "initialState", "<init>", "(Ljava/lang/Object;)V", "reducerRegistry", "", "Ljava/lang/Class;", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "reduce", "previousState", "result", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reducer", "", "T", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function3;)V", "ui_debug"})
public abstract class ReducerSupportStreamViewModel<Event extends com.siarheikrupenich.testrepo.viewmodel.state.UiEvent, State extends java.lang.Object, Result extends java.lang.Object> extends com.siarheikrupenich.testrepo.viewmodel.EventStreamViewModel<Event, State, Result> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Class<? extends Result>, kotlin.jvm.functions.Function3<State, Result, kotlin.coroutines.Continuation<? super State>, java.lang.Object>> reducerRegistry = null;
    
    public ReducerSupportStreamViewModel(State initialState) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object reduce(State previousState, @org.jetbrains.annotations.NotNull()
    Result result, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super State> $completion) {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <T extends Result>void reducer(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> result, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super State, ? super T, ? super kotlin.coroutines.Continuation<? super State>, ? extends java.lang.Object> reducer) {
    }
}