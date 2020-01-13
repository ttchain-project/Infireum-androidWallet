package com.ttchain.walletproject.ui.ttn.ttnrecord

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.TransRecordData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.repository.BroadcastRepository
import com.ttchain.walletproject.repository.TtnClientApiRepository
import com.ttchain.walletproject.toMain
import io.reactivex.Observable
import java.util.*

class TtnRecordViewModel(
    private val baseMainModel: BaseMainModel,
    private val dbHelper: DbHelper,
    private val ttnClientApiRepository: TtnClientApiRepository,
    private val broadcastRepository: BroadcastRepository
) : BaseViewModel() {

    var setCoinIdDataLiveData = MutableLiveData<CoinData>()

    fun setCoinIdData(bundleValue: String) {
        Observable.just(baseMainModel.getCoinDataByCoinId(bundleValue))
            .toMain()
            .compose(loadingView())
            .subscribe {
                setCoinIdDataLiveData.value = it
            }
    }

    var resultTtnResponseBeanList = ArrayList<TtnTransactionData>()

    var performGetApiTtnTransactionRecordDataListLiveData = MutableLiveData<ApiTtnBalanceResponse>()
    var performGetApiTtnTransactionRecordDataErrorListLiveData = MutableLiveData<Throwable>()

    fun performGetApiTtnTransactionRecordDataList() {
        resultTtnResponseBeanList = ArrayList()
        val address = baseMainModel.ttnWalletData.address
        add(
            ttnClientApiRepository.performGetTtnAccountData(address)
                .toMain()
                .subscribe({
                    performGetApiTtnTransactionRecordDataListLiveData.value = it
                }, {
                    performGetApiTtnTransactionRecordDataErrorListLiveData.value = it
                })
        )
    }

    var performSyncTtnTransRecordDataListLiveData = MutableLiveData<TransRecordData>()
    var performSyncTtnTransRecordDataListErrorLiveData = MutableLiveData<Throwable>()

    fun performSyncTtnTransRecordDataList(list: List<TtnTransactionData>) {
        add(Observable.just(list)
            .map {
                val model = TtnTransRecordModel()
                    .apply {
                        mUserTransAddress = baseMainModel.ttnWalletData.address
                        ttnCoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.TTN.coinId)
                        btcnCoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.BTCN.coinId)
                        usdtnCoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.USDTN.coinId)
                        ethnCoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.ETHN.coinId)
                        exrCoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.EXR.coinId)
                        mccCoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.MCC.coinId)
                        ttn1CoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.TTN1.coinId)
                        dai1CoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.DAI1.coinId)
                        tusd1CoinData =
                            baseMainModel.getCoinDataByCoinId(CoinEnum.TUSD1.coinId)
                    }
                return@map model.getTtnTransactionRecordDataList(it)
            }
            .flatMap {
                return@flatMap mergeTransRecordCommentsListObservable(it)
            }
            .flatMap {
                return@flatMap Observable.fromIterable(it)
            }
            .map { nowData ->
                val txId = nowData.txId
                val data = getTransRecordDataByTxId(txId)
                if (data._id > 0) {
                    //update
                    nowData._id = data._id
                    updateTransRecordData(nowData)
                } else {
                    //insert
                    addTransRecordData(nowData)
                }
                return@map nowData
            }
            .toMain()
            .compose(loadingView(showLoading = true, closeLoading = true))
            .subscribe({ _id ->
                performSyncTtnTransRecordDataListLiveData.value = _id
            }, { throwable ->
                performSyncTtnTransRecordDataListErrorLiveData.value = throwable
            })
        )
    }

    @SuppressLint("DefaultLocale")
    private fun mergeTransRecordCommentsListObservable(recordList: List<TransRecordData>): Observable<List<TransRecordData>> {
        val model = TransactionData()
        if (recordList.isNotEmpty()) {
            for (item in recordList) {
                model.addTxIDsItem(item.txId)
            }
        } else {
            model.addTxIDsItem("")
        }

        return broadcastRepository.performGetCommentsRequest(model)
            .map {
                return@map it.data
            }
            .map {
                for (item in it) {
                    for (iItem in recordList) {
                        if (item.txID.toLowerCase() == iItem.txId.toLowerCase()) {
                            iItem.note = item.comments
                        }
                    }
                }
                return@map recordList
            }.toMain()
    }

    private fun getTransRecordDataByTxId(txId: String): TransRecordData {
        return dbHelper.getTransRecordDataByTxId(txId)
    }

    private fun updateTransRecordData(data: TransRecordData) {
        dbHelper.updateTransRecordData(data)
    }

    private fun addTransRecordData(data: TransRecordData) {
        dbHelper.addTransRecordData(data)
    }
}