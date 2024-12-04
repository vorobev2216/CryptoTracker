package com.plcoding.crypto_project.crypto.presentation.coin_list

import com.plcoding.crypto_project.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}