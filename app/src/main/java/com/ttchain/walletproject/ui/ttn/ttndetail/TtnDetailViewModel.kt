package com.ttchain.walletproject.ui.ttn.ttndetail

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.App.Companion.rateList
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.model.ApiTtnBalanceResponse
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.repository.HelperRepository
import com.ttchain.walletproject.repository.TtnRepository
import com.ttchain.walletproject.repository.TtnServerApiRepository
import com.ttchain.walletproject.showNumber
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.NumberUtils
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class TtnDetailViewModel(
    private val dbHelper: DbHelper,
    private val ttnRepository: TtnRepository,
    private val helperRepository: HelperRepository,
    private val ttnServerApiRepository: TtnServerApiRepository
) : BaseViewModel() {

    var coinId = ""
    val fiatIcon = ttnRepository.getPrefFiatData().symbol

    init {
        add(Observable.interval(0, 10, TimeUnit.SECONDS)
            .subscribe {
                getRateAndBalance()
            })
    }

    private fun getTtnWalletData(): WalletData {
        return ttnRepository.getTtnWalletData()
    }

    fun getRateAndBalance() {
        add(
            helperRepository.getAllCoinToCurrency(ttnRepository.getPrefFiatData().name)
                .toMain()
                .subscribe({
                    rateList = it.data ?: arrayListOf()
                    getBalance()
                }, {
                })
        )
    }

    var getBalanceLiveData = MutableLiveData<ApiTtnBalanceResponse>()

    private fun getBalance() {
        val address = getTtnWalletData().address
        add(
            ttnServerApiRepository.performGetTtnBalanceWithContractAddress(address)
                .toMain()
                .subscribe({
                    getBalanceLiveData.value = it
                }, {
                    consumerThrowable(it)
                })
        )
    }

    fun getFiat(coinId: String, amount: String): String {
        val rate =
            rateList.find { it.identifier == coinId }?.rate?.toBigDecimal() ?: 0.toBigDecimal()
        return "≈$fiatIcon ${NumberUtils.show(amount.toBigDecimal().multiply(rate), showNumber)}"
    }

    fun getCoinDataByCoinId(coinId: String): CoinData {
        return dbHelper.getCoinDataByCoinId(coinId)
    }
}