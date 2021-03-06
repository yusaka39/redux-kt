package io.github.yusaka39.reduxkt

/**
 * Created by yusaka on 3/15/17.
 */
internal typealias Dispatcher = (Action) -> Unit
typealias Middleware<State> = (State) -> (Dispatcher) -> Dispatcher
