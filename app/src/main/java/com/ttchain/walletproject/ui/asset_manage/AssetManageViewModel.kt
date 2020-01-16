package com.ttchain.walletproject.ui.asset_manage

import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseRecyclerViewViewModel
import com.ttchain.walletproject.enums.ManageBeanIdType
import com.ttchain.walletproject.model.CoinEntity
import com.ttchain.walletproject.repository.CoinRepository
import com.ttchain.walletproject.toMain
import io.reactivex.Observable

class AssetManageViewModel(
    private val coinRepository: CoinRepository
) : BaseRecyclerViewViewModel<CoinEntity>() {


    fun requestData() {
        performGetAssetCoinBeanList()
    }

    private fun performGetAssetCoinBeanList() {
        add(
            Observable.just<List<CoinEntity>>(coinRepository.getAssetCoinEntityList())
                .toMain()
                .compose(loadingRecyclerView(mRequestStatus))
                .subscribe(
                    { this.onSubscribeComplete(it) },
                    { this.onSubscribeError(it) })
        )
    }

    fun updateCoinSelectionSelected(coinSelectionId: Int, selected: Boolean) {
        coinRepository.updateCoinSelectionSelected(coinSelectionId, selected)
    }

    fun deleteCoinSelectionData(coinSelectedID: Int) {
        val data = coinRepository.getCoinSelectionData(coinSelectedID)
        coinRepository.deleteAssetData(data.coinData.coinId)
        coinRepository.deleteCoinSelectionData(coinSelectedID)
        performGetDeleteCoinBeanList()
    }

    private fun performGetDeleteCoinBeanList() {
        add(
            Observable.just(coinRepository.getDeleteCoinEntityList())
                .toMain()
                .compose(loadingRecyclerView(mRequestStatus))
                .subscribe(
                    { this.onSubscribeComplete(it) },
                    { this.onSubscribeError(it) })
        )
    }

    var setMenuTypeIdLiveData = MutableLiveData<Int>()
    var updateMenuItemLiveData = MutableLiveData<Boolean>()

    fun onClickMenuDeleteFinish() {
        setMenuTypeIdLiveData.value = ManageBeanIdType.DEFAULT.type
        updateMenuItemLiveData.value = true
        requestData()
    }
}