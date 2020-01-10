package com.ttchain.walletproject.koin

import com.ttchain.walletproject.helper.MockHelper
import com.ttchain.walletproject.helper.MockHelperImpl
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.InfoRepositoryCo
import com.ttchain.walletproject.repository.SplashRepository
import com.ttchain.walletproject.ui.discovery.DiscoveryViewModel
import com.ttchain.walletproject.ui.me.MeViewModel
import com.ttchain.walletproject.ui.splash.SplashViewModel
import com.ttchain.walletproject.ui.wallet.WalletMainViewModel
import com.ttchain.walletproject.ui.wallet.wallet_list.WalletListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SplashViewModel(get(), get(), get(), get(), get()) }
    viewModel { WalletMainViewModel() }
    viewModel { WalletListViewModel() }
    viewModel { DiscoveryViewModel(get(), get(), get()) }
    viewModel { MeViewModel() }
}

val repositoryModule = module {
    //Helper repository
    single { SplashRepository(get(), get(), get()) }
    //Api repository
    single { InfoRepositoryCo(get()) }
}

val helperModule = module {
    single<SystemHelper> { SystemHelperImpl(get()) }
    single<ApiHelper> { ApiHelperImpl(get()) }
    single<UserHelper> { UserHelperImpl(get()) }
    single<DbHelper> { DbHelperImpl(get()) }
    single<MockHelper> { MockHelperImpl(get()) }
}

val appModule = listOf(
    viewModelModule,
    repositoryModule,
    networkModule,
    helperModule
)