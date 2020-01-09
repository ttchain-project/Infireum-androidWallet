package com.ttchain.walletproject.koin

import com.ttchain.walletproject.ui.wallet.WalletMainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { WalletMainViewModel() }
}

val appModule = listOf(
    viewModelModule

)