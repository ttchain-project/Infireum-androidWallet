package com.ttchain.walletproject.ui.search_coin

import android.content.Context
import android.text.TextUtils
import androidx.core.util.Pair
import com.ttchain.walletproject.base.BaseRecyclerViewViewModel
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.model.CoinEntity
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.Utils
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class SearchCoinViewModel(
    private val context: Context,
    private val baseMainModel: BaseMainModel,
    private val coinRepository: CoinRepository,
    private val balanceRepository: BalanceRepository,
    private val helperRepository: HelperRepository,
    private val balanceApiRepository: BalanceApiRepository
) : BaseRecyclerViewViewModel<CoinEntity>() {

    private var queryWord = ""

    fun onMenuSearchSubmit(query: String) {
        queryWord = query
        if (Utils.getInternetStatus(context)) {
            performApiSearchCoinByWordRequest(queryWord)
        } else {
            performGetCoinDataListByWord(queryWord)
        }
    }

    private fun performApiSearchCoinByWordRequest(word: String) {
        add(
            Observable.just(word)
                .flatMap { query ->
                    var mainCoinId: String? =
                        RuleUtils.getMainCoinId(baseMainModel.selectedWalletData.address)
                    if (mainCoinId.orEmpty().isEmpty()) {
                        mainCoinId = null
                    }
                    return@flatMap helperRepository.performGetCoinDataList(
                        null,
                        query,
                        RuleUtils.getChainType(baseMainModel.selectedWalletData.address).value,
                        mainCoinId
                    )
                }
                .map { it.data }
                .map { data ->
                    coinRepository.updateCoinDataList(data)
                    return@map true
                }
                .toMain()
                .compose(
                    loadingRecyclerView(
                        mRequestStatus,
                        showLoading = true,
                        closeLoading = false
                    )
                )
                .subscribe({ status ->
                    if (status!!) {
                        performGetCoinDataListByWord(word)
                    }
                }, { onSubscribeError(it) })
        )
    }

    private fun performGetCoinDataListByWord(word: String) {
        add(
            Observable.just(word)
                .map { coinRepository.getSearchCoinEntityList(it) }
                .toMain()
                .compose(
                    loadingRecyclerView(
                        mRequestStatus,
                        showLoading = false,
                        closeLoading = true
                    )
                )
                .subscribe(
                    { this.onSubscribeComplete(it) },
                    { this.onSubscribeError(it) })
        )
    }

    fun onClickCoinAction(coinId: String, isAdded: Boolean) {
        add(Observable.just(Pair(coinId, isAdded))
            .throttleFirst(GlobalConstant.GAP_TIME_LONG.toLong(), TimeUnit.MILLISECONDS)
            .map { s ->
                if (s.second != null && s.second!!) {
                    coinRepository.deleteCoinSelectionData(s.first ?: "")
                    coinRepository.deleteAssetData(s.first ?: "")
                } else {
                    if (!coinRepository.isCoinSelectionDataExist(s.first ?: "")) {
                        coinRepository.addCoinSelectionData(s.first ?: "")
                    }
                    if (!coinRepository.isCoinAssetDataExist(s.first ?: "")) {
                        coinRepository.addCoinAssetData(s.first ?: "")
                        performUpdateCoinAssetRequest(s.first ?: "")
                        return@map false
                    }
                }
                return@map true
            }
            .toMain()
            .compose(loadingView(showLoading = true, closeLoading = false))
            .subscribe({ isSearch ->
                if (queryWord.isNotEmpty() && isSearch!!) {
                    if (Utils.getInternetStatus(context)) {
                        performApiSearchCoinByWordRequest(queryWord)
                    } else {
                        performGetCoinDataListByWord(queryWord)
                    }
                }
            }, { })
        )
    }

    private fun performUpdateCoinAssetRequest(coinId: String) {
        val walletData = baseMainModel.selectedWalletData
        val coinData = baseMainModel.getCoinDataByCoinId(coinId)
        if (walletData._id > 0 && coinData._id > 0) {
            performUpdateBalanceByCoinApiRequest(walletData.address, coinId)
        }
    }


    private fun performUpdateBalanceByCoinApiRequest(address: String, coinId: String) {
        if (TextUtils.isEmpty(address) || TextUtils.isEmpty(coinId)) {
            return
        }
        add(
            balanceApiRepository.performGetBalance(
                address,
                balanceRepository.getBalanceQueryMap(coinId)
            )
                .flatMap { response ->
                    Observable.fromIterable(
                        balanceRepository.getAssetDataList(response, address, coinId)
                    )
                }
                .map { balanceBean -> balanceRepository.updateAssetData(balanceBean) }
                .toMain()
                .subscribe({
                    updateCoinBalanceSubject.onNext(true)
                }, {
                    updateCoinBalanceSubject.onNext(true)
                })
        )
    }
}