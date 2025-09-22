package com.siarheikrupenich.testrepo.viewmodel;

import com.siarheikrupenich.testrepo.viewmodel.state.UiEvent;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u00a2\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0013\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00028\u0002H\u0086@\u00a2\u0006\u0002\u0010#J\u000b\u0010$\u001a\u00028\u0001\u00a2\u0006\u0002\u0010%JG\u0010&\u001a\u00020\u001c\"\b\b\u0003\u0010\'*\u00028\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\'0\u00172\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\'\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018\u00a2\u0006\u0002\u0010)JI\u0010*\u001a\u00020\u001c\"\b\b\u0003\u0010\'*\u00028\u00002\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\'0\u00172\"\u0010(\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018\u00a2\u0006\u0002\u0010)J\u001e\u0010+\u001a\u00028\u00012\u0006\u0010,\u001a\u00028\u00012\u0006\u0010\"\u001a\u00028\u0002H\u00a4@\u00a2\u0006\u0002\u0010-R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R>\u0010\u0015\u001a2\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00180\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\u001b\u001a2\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00180\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lcom/siarheikrupenich/testrepo/viewmodel/EventStreamViewModel;", "Event", "Lcom/siarheikrupenich/testrepo/viewmodel/state/UiEvent;", "State", "Result", "Lcom/siarheikrupenich/testrepo/viewmodel/MviBaseViewModel;", "initialState", "<init>", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "eventTransformerRegistry", "", "Ljava/lang/Class;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "commandTransformerRegistry", "", "startProcessing", "nextEvent", "event", "(Lcom/siarheikrupenich/testrepo/viewmodel/state/UiEvent;)V", "sendResult", "result", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastState", "()Ljava/lang/Object;", "query", "T", "transformer", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function2;)V", "command", "reduce", "previousState", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ui_debug"})
public abstract class EventStreamViewModel<Event extends com.siarheikrupenich.testrepo.viewmodel.state.UiEvent, State extends java.lang.Object, Result extends java.lang.Object> extends com.siarheikrupenich.testrepo.viewmodel.MviBaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<State> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<State> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<Event> _events = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<Event> events = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Class<? extends Event>, kotlin.jvm.functions.Function2<Event, kotlin.coroutines.Continuation<? super Result>, java.lang.Object>> eventTransformerRegistry = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.Class<? extends Event>, kotlin.jvm.functions.Function2<Event, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>> commandTransformerRegistry = null;
    
    public EventStreamViewModel(State initialState) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<State> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<Event> getEvents() {
        return null;
    }
    
    private final void startProcessing() {
    }
    
    public final void nextEvent(@org.jetbrains.annotations.NotNull()
    Event event) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendResult(Result result, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final State lastState() {
        return null;
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <T extends Event>void query(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> event, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super Result>, ? extends java.lang.Object> transformer) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <T extends Event>void command(@org.jetbrains.annotations.NotNull()
    java.lang.Class<? extends T> event, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> transformer) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object reduce(State previousState, Result result, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super State> $completion);
}