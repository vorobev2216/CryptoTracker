package com.plcoding.crypto_project.crypto.presentation.coin_list

import com.plcoding.crypto_project.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClick(val coinUi: CoinUi): CoinListAction
}