package com.ttchain.walletproject.koin

import com.ttchain.walletproject.base.BaseCoinRecordViewModel
import com.ttchain.walletproject.base.BaseCoinTransferViewModel
import com.ttchain.walletproject.base.BaseConfigViewModel
import com.ttchain.walletproject.helper.MockHelper
import com.ttchain.walletproject.helper.MockHelperImpl
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.ui.agreement.AgreementViewModel
import com.ttchain.walletproject.ui.asset.AssetListViewModel
import com.ttchain.walletproject.ui.asset_manage.AssetManageViewModel
import com.ttchain.walletproject.ui.coin_record.CoinRecordViewModel
import com.ttchain.walletproject.ui.coin_record.list.CoinRecordListViewModel
import com.ttchain.walletproject.ui.coin_transfer.CoinTransferViewModel
import com.ttchain.walletproject.ui.create_id.CreateIdViewModel
import com.ttchain.walletproject.ui.create_id.mnemonics.MnemonicsStartViewModel
import com.ttchain.walletproject.ui.dapp.DappViewModel
import com.ttchain.walletproject.ui.discovery.DiscoveryViewModel
import com.ttchain.walletproject.ui.enter_password.EnterPasswordViewModel
import com.ttchain.walletproject.ui.login.LoginViewModel
import com.ttchain.walletproject.ui.me.MeViewModel
import com.ttchain.walletproject.ui.me.commonaddress.CommonAddressViewModel
import com.ttchain.walletproject.ui.me.commonaddress.operation_new.OperationCommAddressNewViewModel
import com.ttchain.walletproject.ui.me.currency.CurrencyViewModel
import com.ttchain.walletproject.ui.me.languagesetting.LanguageSettingViewModel
import com.ttchain.walletproject.ui.me.selectbackupmethod.SelectBackupMethodViewModel
import com.ttchain.walletproject.ui.me.selectexportwallet.SelectExportWalletViewModel
import com.ttchain.walletproject.ui.me.userwalletmnemonic.UserWalletMnemonicViewModel
import com.ttchain.walletproject.ui.me.userwalletsqrcode.UserWalletQrCodeViewModel
import com.ttchain.walletproject.ui.me.usinglocker.UsingLockerViewModel
import com.ttchain.walletproject.ui.receiptasset.ReceiptAssetViewModel
import com.ttchain.walletproject.ui.restorebymnemonics_new.RestoreByMnemonicsViewModel
import com.ttchain.walletproject.ui.restorebymnemonics_new.restoremnemonicswalletlist.RestoreWalletListViewModel
import com.ttchain.walletproject.ui.restorebymnemonics_new.restorenouserinfo.RestoreNoUserInfoViewModel
import com.ttchain.walletproject.ui.search_coin.SearchCoinViewModel
import com.ttchain.walletproject.ui.splash.SplashViewModel
import com.ttchain.walletproject.ui.trend.TrendViewModel
import com.ttchain.walletproject.ui.ttn.ttndetail.TtnDetailViewModel
import com.ttchain.walletproject.ui.ttn.ttnreceipt.TtnReceiptAssetViewModel
import com.ttchain.walletproject.ui.ttn.ttnrecord.TtnRecordViewModel
import com.ttchain.walletproject.ui.ttn.ttntransfer.TtnTransferViewModel
import com.ttchain.walletproject.ui.userwalletsqrcodeparseresult.UserWalletQrCodeParseResultViewModel
import com.ttchain.walletproject.ui.wallet.WalletMainViewModel
import com.ttchain.walletproject.ui.wallet.exportkey.ExportKeyViewModel
import com.ttchain.walletproject.ui.wallet.wallet_list.WalletListViewModel
import com.ttchain.walletproject.ui.wallet_setting.WalletSettingViewModel
import com.ttchain.walletproject.ui.webview.WebViewViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { BaseCoinRecordViewModel(get(), get(), get(), get(), get(), get()) }
    viewModel { BaseConfigViewModel(get(), get()) }
    viewModel { SplashViewModel(get(), get(), get(), get(), get()) }
    viewModel { LoginViewModel(get()) }
    viewModel { AgreementViewModel(get(), get()) }
    viewModel { EnterPasswordViewModel() }
    viewModel { UserWalletQrCodeParseResultViewModel(get(), get(), get()) }
    viewModel { CreateIdViewModel(get(), get(), get()) }
    viewModel { MnemonicsStartViewModel(get(), get(), get(), get()) }
    viewModel { RestoreByMnemonicsViewModel(get()) }
    viewModel { RestoreNoUserInfoViewModel(get(), get(), get()) }
    viewModel { RestoreWalletListViewModel(get()) }
    viewModel { AssetListViewModel(get(), get(), get(), get(), get(), get(), get(), get()) }
    viewModel { CoinRecordViewModel(get(), get(), get(), get(), get(), get(), get(), get(), get()) }
    viewModel { CoinRecordListViewModel(get(), get()) }
    viewModel { WalletSettingViewModel(get(), get(), get(), get()) }
    viewModel { ReceiptAssetViewModel(get(), get(), get()) }
    viewModel { BaseCoinTransferViewModel(get(), get(), get(), get(), get(), get()) }
    viewModel {
        CoinTransferViewModel(get(), get(), get(), get(), get(), get(), get(), get(), get())
    }
    viewModel { AssetManageViewModel(get()) }
    viewModel { SearchCoinViewModel(get(), get(), get(), get(), get(), get(), get()) }
    viewModel { WalletMainViewModel(get(), get(), get(), get()) }
    viewModel { WalletListViewModel(get(), get(), get(), get(), get(), get(), get(), get(), get()) }
    viewModel { DiscoveryViewModel(get(), get(), get()) }
    viewModel { DappViewModel(get(), get()) }
    viewModel { TrendViewModel(get(), get()) }
    viewModel { WebViewViewModel(get(), get(), get()) }
    viewModel { MeViewModel(get(), get(), get(), get(), get()) }
    viewModel { LanguageSettingViewModel(get()) }
    viewModel { CurrencyViewModel(get(), get()) }
    viewModel { CommonAddressViewModel(get(), get(), get(), get()) }
    viewModel { OperationCommAddressNewViewModel(get(), get(), get(), get(), get()) }
    viewModel { SelectBackupMethodViewModel(get(), get(), get()) }
    viewModel { SelectExportWalletViewModel(get(), get(), get()) }
    viewModel { ExportKeyViewModel(get(), get()) }
    viewModel { UserWalletQrCodeViewModel(get(), get(), get()) }
    viewModel { UserWalletMnemonicViewModel(get(), get()) }
    viewModel { UsingLockerViewModel(get()) }
    //ttn
    viewModel { TtnDetailViewModel(get(), get(), get(), get()) }
    viewModel { TtnReceiptAssetViewModel(get(), get()) }
    viewModel { TtnRecordViewModel(get(), get(), get(), get()) }
    viewModel { TtnTransferViewModel(get(), get(), get(), get(), get(), get()) }
}

val repositoryModule = module {
    single { BaseCoinTransferRepository(get(), get(), get()) }
    //Core repository
    single { WalletRepository(get(), get(), get()) }
    single { CoinRepository(get(), get(), get(), get()) }
    single { BalanceRepository(get()) }
    single { MinerFeeRepository(get()) }
    //Helper repository
    single { SplashRepository(get(), get(), get()) }
    single { VerifyRepository(get(), get(), get()) }
    single { RestoreRepository(get(), get()) }
    single { TtnRepository(get(), get()) }
    //Api repository
    single { InfoRepositoryCo(get()) }
    single { HelperRepository(get()) }
    single { HelperRepositoryCo(get()) }
    single { BroadcastRepository(get()) }
    single { BalanceApiRepository(get()) }
    single { TtnServerApiRepository(get()) }
    single { TtnClientApiRepository(get()) }
    single { EtherscanApiRepository(get()) }
    single { BaseCoinRecordRepository(get()) }
    single { BlockExplorerRepository(get()) }
    single { OmniExplorerRepository(get()) }
}

val helperModule = module {
    single<SystemHelper> { SystemHelperImpl(get()) }
    single<ApiHelper> { ApiHelperImpl(get()) }
    single<UserHelper> { UserHelperImpl(get()) }
    single<DbHelper> { DbHelperImpl(get()) }
    single<MockHelper> { MockHelperImpl(get()) }
    single { BaseMainModel(get(), get(), get()) }
    single { RecordModel(get(), get(), get(), get()) }
}

val appModule = listOf(
    viewModelModule,
    repositoryModule,
    networkModule,
    helperModule
)