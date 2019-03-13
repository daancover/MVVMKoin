package com.coverlabs.mvvmkoin

import android.app.Application
import com.coverlabs.mvvmkoin.di.appModule
import com.coverlabs.mvvmkoin.di.networkModule
import com.coverlabs.mvvmkoin.di.repositoryModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(
            appModule,
            repositoryModule,
            networkModule
        ))
    }
}