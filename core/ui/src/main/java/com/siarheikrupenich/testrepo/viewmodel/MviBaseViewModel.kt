package com.siarheikrupenich.testrepo.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Job

abstract class MviBaseViewModel : ViewModel() {

    protected val parentJob = Job()

    override fun onCleared() {
        parentJob.cancel()
    }
}
