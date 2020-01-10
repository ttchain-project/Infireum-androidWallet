package com.ttchain.walletproject.koin

import com.ttchain.walletproject.helper.MockHelper
import com.ttchain.walletproject.helper.MockHelperImpl
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.ui.agreement.AgreementViewModel
import com.ttchain.walletproject.ui.create_id.CreateIdViewModel
import com.ttchain.walletproject.ui.create_id.mnemonics.MnemonicsStartViewModel
import com.ttchain.walletproject.ui.dapp.DappViewModel
import com.ttchain.walletproject.ui.discovery.DiscoveryViewModel
import com.ttchain.walletproject.ui.enter_password.EnterPasswordViewModel
import com.ttchain.walletproject.ui.login.LoginViewModel
import com.ttchain.walletproject.ui.me.MeViewModel
import com.ttchain.walletproject.ui.restorebymnemonics_new.RestoreByMnemonicsViewModel
import com.ttchain.walletproject.ui.restorebymnemonics_new.restorenouserinfo.RestoreNoUserInfoViewModel
import com.ttchain.walletproject.ui.splash.SplashViewModel
import com.ttchain.walletproject.ui.userwalletsqrcodeparseresult.UserWalletQrCodeParseResultViewModel
import com.ttchain.walletproject.ui.trend.TrendViewModel
import com.ttchain.walletproject.ui.wallet.WalletMainViewModel
import com.ttchain.walletproject.ui.wallet.wallet_list.WalletListViewModel
import com.ttchain.walletproject.ui.webview.WebViewViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SplashViewModel(get(), get(), get(), get(), get()) }
    viewModel { LoginViewModel(get()) }
    viewModel { AgreementViewModel(get(), get()) }
    viewModel { EnterPasswordViewModel() }
    viewModel { UserWalletQrCodeParseResultViewModel(get(), get(), get(), get(), get()) }
    viewModel { CreateIdViewModel(get(), get(), get()) }
    viewModel { MnemonicsStartViewModel(get(), get(), get(), get()) }
    viewModel { RestoreByMnemonicsViewModel(get(), get()) }
    viewModel { RestoreNoUserInfoViewModel(get(), get(), get()) }

    viewModel { WalletMainViewModel(get(), get(), get()) }
    viewModel { WalletListViewModel(get(), get(), get(), get(), get(), get()) }
    viewModel { DiscoveryViewModel(get(), get(), get()) }
    viewModel { DappViewModel(get(), get()) }
    viewModel { TrendViewModel(get(), get()) }
    viewModel { WebViewViewModel(get(), get(), get()) }
    viewModel { MeViewModel(get(), get(), get(), get(), get(), get()) }
}

val repositoryModule = module {
    //Core repository
//    single { WalletRepository(get(), get(), get()) }
    single { CoinRepository(get(), get(), get(), get()) }
    single { BalanceRepository(get()) }
//    single { MinerFeeRepository(get()) }
    //Helper repository
    single { SplashRepository(get(), get(), get()) }
    single { VerifyRepository(get(), get(), get()) }
    single { RestoreRepository(get(), get()) }
//    single { TtnRepository(get(), get()) }
    //Api repository
    single { InfoRepositoryCo(get()) }
    single { HelperRepository(get()) }
    single { HelperRepositoryCo(get()) }
    single { ImRepositoryCo(get()) }
    single { BroadcastRepository(get()) }
    single { BalanceApiRepository(get()) }
}

val helperModule = module {
    single<SystemHelper> { SystemHelperImpl(get()) }
    single<ApiHelper> { ApiHelperImpl(get()) }
    single<UserHelper> { UserHelperImpl(get()) }
    single<DbHelper> { DbHelperImpl(get()) }
    single<MockHelper> { MockHelperImpl(get()) }
    single { BaseMainModel(get(), get(), get()) }
}

val appModule = listOf(
    viewModelModule,
    repositoryModule,
    networkModule,
    helperModule
)