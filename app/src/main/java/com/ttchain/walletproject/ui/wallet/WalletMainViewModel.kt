package com.ttchain.walletproject.ui.wallet

import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.repository.BalanceApiRepository
import com.ttchain.walletproject.repository.BalanceRepository
import com.ttchain.walletproject.repository.BaseCoinTransferRepository
import com.ttchain.walletproject.repository.BroadcastRepository
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.rx.RxBusTag
import com.ttchain.walletproject.toMain
import io.reactivex.Observable
import org.json.JSONObject
import java.math.BigInteger

class WalletMainViewModel(
    private val dbHelper: DbHelper,
    private val balanceApiRepository: BalanceApiRepository,
    private val balanceRepository: BalanceRepository,
    private val broadcastRepository: BroadcastRepository
) : BaseViewModel() {

    private val mainChinWalletDataList: List<WalletData>
        get() {
            val walletDataList = arrayListOf<WalletData>()
            for (walletData in dbHelper.getWalletDataList()) {
                if (walletData.mainCoinId == CoinEnum.TTN.coinId) {
                    continue
                }
                walletDataList.add(walletData)
            }
            return walletDataList
        }

    private val queryApiTotal: Int
        get() {
            var total = 0
            for (walletData in dbHelper.getWalletDataList()) {
                total += if (walletData.mainCoinId == CoinEnum.TTN.coinId) {
                    continue
                } else if (walletData.mainCoinId == CoinEnum.BTC.coinId) {
                    2
                } else {
                    1
                }
            }
            return total
        }

    private var hasQueriedTotal = 0

    private fun addHasQueriedTotal() {
        this.hasQueriedTotal = hasQueriedTotal + 1
    }

    private fun clearHasQueriedTotal() {
        this.hasQueriedTotal = 0
    }

    fun updateAssetDataByApi() {
        add(
            Observable.fromIterable(mainChinWalletDataList)
                .subscribe({ walletData ->
                    when (walletData.mainCoinId) {
                        CoinEnum.BTC.coinId -> {
                            performUpdateBalanceByCoinApiRequest(
                                walletData.address,
                                CoinEnum.BTC.coinId
                            )
                            performUpdateBalanceByCoinApiRequest(
                                walletData.address,
                                CoinEnum.USDT.coinId
                            )
                        }
                        else -> {
//                            performUpdateBalanceByCoinApiRequest(
//                                walletData.address,
//                                walletData.mainCoinId
//                            )
                            performGetErc20Balance(
                                walletData.address,
                                null,
                                walletData.mainCoinId
                            )
                        }
                    }

                }, {
                })
        )
    }

    private fun performGetErc20Balance(address: String, contract: String?, coinId: String) {
        val model =
            if (contract != null)
                BaseCoinTransferRepository.getInfuraErc20BalanceModel(address, contract)
            else BaseCoinTransferRepository.getInfuraEthBalanceModel(address)

        add(
            broadcastRepository.performMainnetInfuraRequest(model)
                .map {
                    val balance = BigInteger(it.data?.replace("0x", ""), 16)
                    val jsonObj = JSONObject()
                    jsonObj.put("balance", balance)
                    return@map jsonObj.toString()
                }
                .flatMap {
                    return@flatMap Observable.fromIterable(
                        balanceRepository.getAssetDataList(
                            it, address, coinId
                        )
                    )
                }
                .map {
                    return@map balanceRepository.updateAssetData(it)
                }
                .toMain()
                .subscribe({
                    updateCoinBalanceSubject.onNext(true)
                }, {
                    updateCoinBalanceSubject.onNext(true)
                })
        )
    }

    private fun performUpdateBalanceByCoinApiRequest(address: String, coinId: String) {
        if (address.isEmpty() || coinId.isEmpty()) {
            return
        }
        add(
            balanceApiRepository.performGetBalance(
                address,
                balanceRepository.getBalanceQueryMap(coinId)
            )
                .flatMap {
                    return@flatMap Observable.fromIterable(
                        balanceRepository.getAssetDataList(
                            it,
                            address,
                            coinId
                        )
                    )
                }
                .map {
                    return@map balanceRepository.updateAssetData(it)
                }
                .toMain()
                .subscribe({
                    updateCoinBalanceSubject.onNext(true)
                }, {
                    updateCoinBalanceSubject.onNext(true)
                })
        )
    }

    fun initSubject() {
        add(
            updateCoinBalanceSubject.subscribe({ status ->
                if (status) {
                    addHasQueriedTotal()
                }
                if (hasQueriedTotal == queryApiTotal) {
                    clearHasQueriedTotal()
                    RxBus.getInstance().post(RxBusTag.CT_WALLET_REFRESH, true)
                }
            }, {
            })
        )
    }

}