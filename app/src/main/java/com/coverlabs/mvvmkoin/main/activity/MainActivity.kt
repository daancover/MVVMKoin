package com.coverlabs.mvvmkoin.main.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.coverlabs.mvvmkoin.R
import com.coverlabs.mvvmkoin.main.viewmodel.MainViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.callService()
    }
}
