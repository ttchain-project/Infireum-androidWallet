package com.ttchain.walletproject.koin

import com.ttchain.walletproject.ui.discovery.DiscoveryViewModel
import com.ttchain.walletproject.ui.me.MeViewModel
import com.ttchain.walletproject.ui.wallet.WalletMainViewModel
import com.ttchain.walletproject.ui.wallet.wallet_list.WalletListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { WalletMainViewModel() }
    viewModel { WalletListViewModel() }
    viewModel { DiscoveryViewModel() }
    viewModel { MeViewModel() }
}

val appModule = listOf(
    viewModelModule

)