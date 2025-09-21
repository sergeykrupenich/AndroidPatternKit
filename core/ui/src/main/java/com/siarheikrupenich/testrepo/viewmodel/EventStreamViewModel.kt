package com.siarheikrupenich.testrepo.viewmodel

import androidx.lifecycle.viewModelScope
import com.siarheikrupenich.testrepo.viewmodel.state.UiEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

abstract class EventStreamViewModel<Event : UiEvent, State, Result>(
    initialState: State
) : MviBaseViewModel() {

    private val _state = MutableStateFlow(initialState)
    val uiState: StateFlow<State> = _state.asStateFlow()

    private val _events = MutableSharedFlow<Event>(extraBufferCapacity = 64)
    val events: SharedFlow<Event> = _events.asSharedFlow()

    private val eventTransformerRegistry: MutableMap<Class<out Event>, suspend (Event) -> Result> =
        hashMapOf()

    private val commandTransformerRegistry: MutableMap<Class<out Event>, suspend (Event) -> Unit> =
        hashMapOf()

    init {
        startProcessing()
    }

    private fun startProcessing() {
        viewModelScope.launch(Dispatchers.Default + parentJob) {
            events.collect { event ->
//                launch(Dispatchers.Default + parentJob) {
                eventTransformerRegistry[event::class.java]?.invoke(event)?.let { result ->
                    sendResult(result)
                }
                commandTransformerRegistry[event::class.java]?.invoke(event)
//                }
            }
        }
    }

    fun nextEvent(event: Event) {
        _events.tryEmit(event)
    }

    suspend fun sendResult(result: Result) {
        val newState = reduce(lastState(), result)
        _state.emit(newState)
    }

    fun lastState(): State = _state.value

    @Suppress("UNCHECKED_CAST")
    fun <T : Event> query(event: Class<T>, transformer: suspend (T) -> Result) {
        eventTransformerRegistry[event] = transformer as suspend (Event) -> Result
    }

    @Suppress("UNCHECKED_CAST")
    fun <T : Event> command(event: Class<out T>, transformer: suspend (T) -> Unit) {
        commandTransformerRegistry[event] = transformer as suspend (Event) -> Unit
    }

    protected abstract suspend fun reduce(previousState: State, result: Result): State
}
