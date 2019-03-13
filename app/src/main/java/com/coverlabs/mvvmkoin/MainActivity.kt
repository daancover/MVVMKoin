package com.coverlabs.mvvmkoin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.koin.android.architecture.ext.getViewModel

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = getViewModel()
    }
}
