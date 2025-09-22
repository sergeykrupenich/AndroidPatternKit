package com.siarheikrupenich.testrepo.viewmodel

import com.siarheikrupenich.testrepo.viewmodel.state.UiEvent

abstract class ReducerSupportStreamViewModel<Event : UiEvent, State, Result : Any>(
    initialState: State
) : EventStreamViewModel<Event, State, Result>(initialState) {

    private val reducerRegistry: MutableMap<Class<out Result>, suspend (State, Result) -> State> =
        HashMap()

    override suspend fun reduce(previousState: State, result: Result): State =
        reducerRegistry[result::class.java]!!(previousState, result)

    @Suppress("UNCHECKED_CAST")
    fun <T : Result> reducer(result: Class<T>, reducer: suspend (State, T) -> State) {
        reducerRegistry[result] = reducer as suspend (State, Result) -> State
    }
}
