package com.plcoding.crypto_project.di

import com.plcoding.crypto_project.core.data.networking.HttpClientFactory
import com.plcoding.crypto_project.crypto.data.networking.RemoteCoinDataSource
import com.plcoding.crypto_project.crypto.domain.CoinDataSource
import com.plcoding.crypto_project.crypto.presentation.coin_list.CoinListViewModel
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}