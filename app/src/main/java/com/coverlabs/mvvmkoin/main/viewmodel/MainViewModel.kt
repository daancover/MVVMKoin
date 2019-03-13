package com.coverlabs.mvvmkoin.main.viewmodel

import android.arch.lifecycle.ViewModel
import com.coverlabs.mvvmkoin.network.repository.GeneralRepository

class MainViewModel(val repository: GeneralRepository) : ViewModel() {
    fun callService() {

    }
}