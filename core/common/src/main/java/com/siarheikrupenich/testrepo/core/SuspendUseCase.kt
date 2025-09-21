package com.siarheikrupenich.testrepo.core

fun interface SuspendUseCase<in T, out O> {

    suspend operator fun invoke(param: T): O
}
