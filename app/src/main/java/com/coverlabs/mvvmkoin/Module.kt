package com.coverlabs.mvvmkoin

import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit

private val retrofit: Retrofit = createNetworkClient()

private val generalApi: GeneralApi = retrofit.create(GeneralApi::class.java)

val appModule = module {
    viewModel { MainViewModel(get()) }
}

val repositoryModule = module {
    single { GeneralRepository(get()) }
}

val networkModule = module {
    single { generalApi }
}

val databaseModule = module {

}

val sharedPrefModule = module {

}

fun createNetworkClient(): Retrofit {
    return Retrofit.Builder()
        .baseUrl("")
        .build()
}