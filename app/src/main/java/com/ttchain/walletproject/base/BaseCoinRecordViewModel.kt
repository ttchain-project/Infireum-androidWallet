package com.ttchain.walletproject.base

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.TransRecordData
import com.ttchain.walletproject.database.data.UsdtTransRecordData
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.repository.*
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.RuleUtils
import com.ttchain.walletproject.utils.TimeUtils
import io.reactivex.Observable
import io.reactivex.functions.BiFunction
import io.reactivex.subjects.BehaviorSubject
import java.io.Serializable
import java.util.ArrayList
import java.util.HashMap

open class BaseCoinRecordViewModel(
    private val etherscanApiRepository: EtherscanApiRepository,
    private val baseMainModel: BaseMainModel,
    private val broadcastRepository: BroadcastRepository,
    private val omniExplorerRepository: OmniExplorerRepository,
    private val blockExplorerRepository: BlockExplorerRepository,
    private val baseCoinRecordRepository: BaseCoinRecordRepository
) : BaseViewModel() {

    companion object {
        fun isEthRecordData(data: TransRecordData): Boolean {
            var isValid = false
            data.block?.let {
                if (data.block!!.isNotEmpty()) {
                    isValid = data.block!!.toLong() > 0
                }
            }
            return RuleUtils.isChainType(data.fromCoinData.chainType, ChainType.ETH) &&
                    data.fromCoinData.coinId == CoinEnum.ETH.coinId &&
                    data.toCoinData.coinId == CoinEnum.ETH.coinId && isValid
        }

        fun isBtcRecordData(data: TransRecordData): Boolean {
            var isValid = false
            data.block?.let {
                if (data.block!!.isNotEmpty()) {
                    isValid = data.block!!.toLong() > 0
                }
            }
            return RuleUtils.isChainType(data.fromCoinData.chainType, ChainType.BTC) &&
                    data.fromCoinData.coinId == CoinEnum.BTC.coinId &&
                    data.toCoinData.coinId == CoinEnum.BTC.coinId && isValid
        }
    }

    private fun isErc20RecordData(data: TransRecordData): Boolean {
        return RuleUtils.isChainType(data.fromCoinData.chainType, ChainType.ETH) &&
                data.fromCoinData.coinId == userErc20ContractAddress &&
                data.toCoinData.coinId == userErc20ContractAddress
    }

    var syncTransRecordDataListFinish = MutableLiveData<Boolean>()

    data class QueryMapBean(var _id: Int = -1) : Serializable {
        var isEth = true
        var address = ""
        var startBlock = "0"
        val endBlock = "99999999"
        var pageNow = 1
        val offset = 25
        var latestTimeStamp = "0"
        var resultTransactionDataList: ArrayList<TransactionDataEth> = ArrayList()
    }

    var isEthRecord = true
    var userEthAddress = ""
    var userErc20ContractAddress = ""
    var userTransCoinId = CoinEnum.ETH.coinId
    var startBlock = "0"
    val endBlock = "99999999"
    var pageNow = 1
    var pageNowToken = 1
    val offset = 25
    var latestTimeStamp = "0"

    var resultTransactionDataList: ArrayList<TransactionDataEth>? = null
    var resultErrorTransactionDataList: ArrayList<TransactionDataEth>? = null

    var index = 0
    var userBtcAddress = ""
    var resultBtcResponseBeanList: ArrayList<ApiBlockChainBtcTransactionListResponse.ItemsBean>? =
        null

    val ethRecordRequestSubject = BehaviorSubject.create<QueryMapBean>()

    val erc20RecordRequestSubject =
        BehaviorSubject.create<QueryMapBean>()

    var usdtPage = 1
    var resultUsdtResponseBeanList: ArrayList<ApiUsdtTransactionRecordResponse.ItemsBean>? = null

    fun getFilterEthRecordDataObservable(): Observable<List<TransRecordData>> {
        return ethRecordRequestSubject.map { bean ->
            val model = EthRecordModel()
            return@map model.getEthSeriesTransactionRecordDataList(
                bean.resultTransactionDataList,
                bean.address,
                bean.latestTimeStamp,
                baseMainModel
            )
        }
    }

    fun getFilterErcRecordDataObservable(): Observable<List<TransRecordData>> {
        return erc20RecordRequestSubject.map { bean ->
            val model = EthRecordModel()
            return@map model.getEthSeriesTransactionRecordDataList(
                bean.resultTransactionDataList,
                bean.address,
                bean.latestTimeStamp,
                baseMainModel
            )
        }
    }

    init {
        syncTransRecordDataListFinish.value = false

        add(Observable.zip(
            getFilterEthRecordDataObservable(),
            getFilterErcRecordDataObservable(),
            BiFunction { t1: List<TransRecordData>, t2: List<TransRecordData> ->
                val list1 = t1.toMutableList()
                val resultList = ArrayList<TransRecordData>()

                run {
                    var i = list1.size - 1
                    val j = 0
                    while (i >= j) {
                        for (item2 in t2) {
                            if (list1[i].txId == item2.txId) {
                                list1.removeAt(i)
                            }
                        }
                        i--
                    }
                }

                resultList.addAll(list1)
                resultList.addAll(t2.toList())
                return@BiFunction resultList
            })
            .flatMap {
                return@flatMap mergeTransRecordCommentsListObservable(it)
            }
            .map {
                for (nowData in it) {
                    val txId = nowData.txId
                    val data = baseCoinRecordRepository.getTransRecordDataByTxId(txId)
                    if (data._id > 0) {
                        // update
                        nowData._id = data._id
                        if (nowData.fromAmount.toDouble() > 0.0) {
                            baseCoinRecordRepository.updateTransRecordData(nowData)
                        } else {
                            if (nowData.status == GlobalConstant.TRANSACTION_STATE_ERROR) {
                                baseCoinRecordRepository.updateTransRecordData(nowData)
                            } else {
                                // contract record didn't update
                            }
                        }
                    } else {
                        // insert
                        baseCoinRecordRepository.addTransRecordData(nowData)
                    }
                }
                return@map ""
            }
            .toMain()
            .compose(loadingView(showLoading = true, closeLoading = false))
            .subscribe({
                syncTransRecordDataListFinish.value = true
            }, {
                isLoading.postValue(false)
                throwableMessage.value = it.message
                syncTransRecordDataListFinish.value = true
            })
        )
    }

    @SuppressLint("DefaultLocale")
    fun mergeTransRecordCommentsListObservable(recordList: List<TransRecordData>): Observable<List<TransRecordData>> {
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
            }
            .toMain()
            .doOnError {
               consumerThrowable(it)
            }
    }

    private fun getQueryMap(queryMapBean: QueryMapBean): Map<String, String> {
        val queryMap = HashMap<String, String>()
        queryMap["module"] = "account"
        queryMap["action"] = "txlist"
        queryMap["address"] = queryMapBean.address
        queryMap["startblock"] = queryMapBean.startBlock
        queryMap["endblock"] = queryMapBean.endBlock
        queryMap["page"] = queryMapBean.pageNow.toString()
        queryMap["offset"] = queryMapBean.offset.toString()
        queryMap["sort"] = "desc"
        queryMap["apikey"] = "YourApiKey"
        return queryMap
    }

    private fun getTokenQueryMap(queryMapBean: QueryMapBean): Map<String, String> {
        val queryMap = HashMap<String, String>()
        queryMap["module"] = "account"
        queryMap["action"] = "tokentx"
        if (userErc20ContractAddress.isNotEmpty()) {
            queryMap["contractaddress"] = userErc20ContractAddress
        }
        queryMap["address"] = queryMapBean.address
        queryMap["page"] = queryMapBean.pageNow.toString()
        queryMap["offset"] = queryMapBean.offset.toString()
        queryMap["sort"] = "desc"
        queryMap["apikey"] = "YourApiKey"
        return queryMap
    }

    private fun getQueryMap(): Map<String, String> {
        val queryMap = HashMap<String, String>()
        queryMap["module"] = "account"
        queryMap["action"] = "txlist"
        queryMap["address"] = userEthAddress
        queryMap["startblock"] = startBlock
        queryMap["endblock"] = endBlock
        queryMap["page"] = pageNow.toString()
        queryMap["offset"] = offset.toString()
        queryMap["sort"] = "desc"
        queryMap["apikey"] = "YourApiKey"
        return queryMap
    }

    private fun getTokenQueryMap(): Map<String, String> {
        val queryMap = HashMap<String, String>()
        queryMap["module"] = "account"
        queryMap["action"] = "tokentx"
        if (userErc20ContractAddress.isNotEmpty()) {
            if (userErc20ContractAddress.contains("_FIAT")) {
                queryMap["contractaddress"] =
                    userErc20ContractAddress.substring(0, userErc20ContractAddress.lastIndex - 4)
            } else {
                queryMap["contractaddress"] = userErc20ContractAddress
            }
        }
        queryMap["address"] = userEthAddress
        queryMap["page"] = pageNowToken.toString()
        queryMap["offset"] = offset.toString()
        queryMap["sort"] = "desc"
        queryMap["apikey"] = "YourApiKey"
        return queryMap
    }

    fun performGetErc20TransactionRecordDataList() {
        isEthRecord = false
        resultTransactionDataList = ArrayList()
        pageNow = 1
        resultErrorTransactionDataList = ArrayList()
        pageNowToken = 1
        startBlock = "0"
        latestTimeStamp = "0"

        val dataList = baseCoinRecordRepository.getTransRecordDataListByAddress(
            userEthAddress
        )

        val latestData = getLatestErc20RecordData(dataList)
        latestData?.let {
            if (latestData._id > 0) {
                latestData.block?.let {
                    startBlock = (it.toLong() + 1).toString()
                }
                latestTimeStamp = latestData.date
            }
        }

        performGetApiErc20TransactionRecordDataList(getTokenQueryMap())
        performGetApiErc20ErrorTransactionRecordDataList(getQueryMap())
    }

    fun getLatestBtcRecordData(list: List<TransRecordData>): TransRecordData? {
        for (data in list) {
            if (isBtcRecordData(data)) {
                return data
            }
        }
        return null
    }

    fun getLatestEthRecordData(list: List<TransRecordData>): TransRecordData? {
        for (data in list) {
            if (isEthRecordData(data)) {
                return data
            }
        }
        return null
    }

    fun getLatestErc20RecordData(list: List<TransRecordData>): TransRecordData? {
        for (data in list) {
            if (userErc20ContractAddress.isNotEmpty()) {
                if (isErc20RecordData(data)) {
                    return data
                }
            } else if (!isEthRecordData(data)) {
                return data
            }
        }
        return null
    }

    fun performGetEthTransactionRecordDataList() {
        isEthRecord = true
        resultTransactionDataList = ArrayList()
        pageNow = 1
        startBlock = "0"
        latestTimeStamp = "0"

        val dataList = baseCoinRecordRepository.getTransRecordDataListByAddress(
            userEthAddress
        )

        val latestData = getLatestEthRecordData(dataList)
        latestData?.let {
            if (latestData._id > 0) {
                latestData.block?.let {
                    startBlock = (it.toLong() + 1).toString()
                }
                latestTimeStamp = latestData.date
            }
        }

        performGetApiEthTransactionRecordDataList(getQueryMap())
    }

    fun performGetApiEthTransactionRecordDataList(queryMap: Map<String, String>) {
        add(
            etherscanApiRepository.performGetEtherscanApiResult(queryMap)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({ result ->
                    val list = result.result
                    val listSize = list!!.size
                    if (listSize > 0 &&
                        TimeUtils.isTimestampInRange(list[0].timeStamp!!) &&
                        TimeUtils.compareTimestamp(latestTimeStamp, list[0].timeStamp!!) <= 0
                    ) {
                        pageNow++
                        resultTransactionDataList?.addAll(list)
                        performGetApiEthTransactionRecordDataList(getQueryMap())
                    } else {
                        resultTransactionDataList?.let {
                            performSyncTransRecordDataList(false, it.toList())
                        }
                    }
                }, {
                    isLoading.postValue(false)
                    throwableMessage.value = it.message
                    syncTransRecordDataListFinish.value = true
                })
        )
    }

    fun performGetBtcTransactionRecordDataList() {
        resultBtcResponseBeanList = ArrayList()
        latestTimeStamp = "0"

        val dataList = baseCoinRecordRepository.getTransRecordDataListByAddress(
            userBtcAddress
        )
        val latestData = getLatestBtcRecordData(dataList)
        latestData?.let {
            if (latestData._id > 0) {
                latestTimeStamp = latestData.date
            }
        }

        performGetApiBtcTransactionRecordDataList()
    }

    fun performGetApiBtcTransactionRecordDataList() {
        if (userBtcAddress.isEmpty()) {
            return
        }

        add(
            blockExplorerRepository.getBtcTransactionRecord(userBtcAddress)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({ response ->
                    val itemList = response.items
                    if (itemList.isNotEmpty() &&
                        TimeUtils.compareTimestamp(latestTimeStamp, itemList[0].time.toString()) < 0
                    ) {
                        for (item in itemList) {
                            if (TimeUtils.isTimestampInRange(item.time) &&
                                TimeUtils.compareTimestamp(
                                    latestTimeStamp,
                                    item.time.toString()
                                ) < 0
                            ) {
                                resultBtcResponseBeanList?.add(item)
                            }
                        }

                        resultBtcResponseBeanList?.let {
                            performSyncBtcTransRecordDataList(it.toList())
                        }
                    } else {
                        resultBtcResponseBeanList?.let {
                            performSyncBtcTransRecordDataList(it.toList())
                        }
                    }
                }, {
                    isLoading.postValue(false)
                    throwableMessage.value = it.message
                    syncTransRecordDataListFinish.value = true
                })
        )
    }

    fun performSyncBtcTransRecordDataList(list: List<ApiBlockChainBtcTransactionListResponse.ItemsBean>) {
        add(Observable.just(list)
            .map {
                val transCoinData = baseMainModel.getCoinDataByCoinId(userTransCoinId)
                val model = BtcRecordModel()
                model.mUserTransAddress = userBtcAddress
                model.mCoinData = transCoinData
                return@map model.getBtcTransactionRecordDataList(it)
            }
            .flatMap {
                return@flatMap mergeTransRecordCommentsListObservable(it)
            }
            .flatMap {
                return@flatMap Observable.fromIterable(it)
            }
            .map { nowData ->
                val txId = nowData.txId
                val data = baseCoinRecordRepository.getTransRecordDataByTxId(txId)
                if (data._id > 0) {
                    // update
                    nowData._id = data._id
                    baseCoinRecordRepository.updateTransRecordData(nowData)
                } else {
                    // insert
                    baseCoinRecordRepository.addTransRecordData(nowData)
                }
                return@map nowData
            }
            .toMain()
            .compose(loadingView(showLoading = true, closeLoading = false))
            .toList()
            .subscribe({
                syncTransRecordDataListFinish.value = true
            }, {
                isLoading.postValue(false)
                throwableMessage.value = it.message
                syncTransRecordDataListFinish.value = true
            })
        )
    }

    fun performGetUsdtTransactionRecordDataList() {
        resultUsdtResponseBeanList = ArrayList()
        latestTimeStamp = "0"

        performGetApiUsdtTransactionRecordDataList()
    }

    fun performGetApiUsdtTransactionRecordDataList() {
        if (userBtcAddress.isEmpty()) {
            return
        }
        val request = UsdtTransactionRecordModel(userBtcAddress, usdtPage.toString())
        add(
            omniExplorerRepository.postUsdtTransactionRecord(request)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({ response ->
                    val itemList = response.items

                    if (response.pages == 0) {
                        syncTransRecordDataListFinish.value = true
                    } else {

                        if (itemList.isNotEmpty()) {
                            for (item in itemList) {
                                resultUsdtResponseBeanList?.add(item)
                            }
                        }
                        if (response.currentPage == response.pages || response.currentPage == 4) {
                            resultUsdtResponseBeanList?.let {
                                performSyncUsdtTransRecordDataList(it.toList())
                            }
                        } else {
                            usdtPage++
                            performGetApiUsdtTransactionRecordDataList()
                        }
                    }
                }, {
                    isLoading.postValue(false)
                    throwableMessage.value = it.message
                    syncTransRecordDataListFinish.value = true
                })
        )
    }

    fun performSyncUsdtTransRecordDataList(list: List<ApiUsdtTransactionRecordResponse.ItemsBean>) {
        add(Observable.just(list)
            .map {
                val transCoinData = baseMainModel.getCoinDataByCoinId(userTransCoinId)
                val model = UsdtRecordModel()
                model.mUserTransAddress = userBtcAddress
                model.mCoinData = transCoinData
                model.getUsdtTransactionRecordDataList(it)
                return@map model.getUsdtTransactionRecordDataList(it)
            }
            .flatMap { recordList ->
                return@flatMap mergeUsdtTransRecordCommentsListObservable(recordList)
            }
            .flatMap {
                return@flatMap Observable.fromIterable(it)
            }
            .map { nowData ->
                val txId = nowData.txId
                val data = baseCoinRecordRepository.getUsdtTransRecordDataByTxId(txId)
                if (data._id > 0) {
                    // update
                    nowData._id = data._id
                    baseCoinRecordRepository.updateUsdtTransRecordData(nowData)
                } else {
                    // insert
                    baseCoinRecordRepository.addUsdtTransRecordData(nowData)
                }
                return@map nowData
            }
            .toMain()
            .compose(loadingView(showLoading = true, closeLoading = false))
            .toList()
            .subscribe({
                syncTransRecordDataListFinish.value = true
            }, {
                isLoading.postValue(false)
                throwableMessage.value = it.message
                syncTransRecordDataListFinish.value = true
            })
        )
    }

    @SuppressLint("DefaultLocale")
    fun mergeUsdtTransRecordCommentsListObservable(recordList: List<UsdtTransRecordData>): Observable<List<UsdtTransRecordData>> {
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
            }
            .toMain()
            .doOnError {
               consumerThrowable(it)
            }
    }

    fun performGetApiErc20TransactionRecordDataList(queryMap: Map<String, String>) {
        add(
            etherscanApiRepository.performGetEtherscanApiResult(queryMap)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({
                    val list = it.result
                    list?.let {
                        val listSize = list.size
                        if (listSize > 0 && list[0].timeStamp != null &&
                            TimeUtils.isTimestampInRange(list[0].timeStamp!!) &&
                            TimeUtils.compareTimestamp(latestTimeStamp, list[0].timeStamp!!) <= 0
                        ) {
                            pageNowToken++
                            resultTransactionDataList?.addAll(list)
                            performGetApiErc20TransactionRecordDataList(getTokenQueryMap())
                        } else {
                            resultTransactionDataList?.let { lists ->
                                // set erc20 data
                                performSyncTransRecordDataList(false, lists.toList())
                            }
                        }
                    }
                }, {
                    isLoading.postValue(false)
                    throwableMessage.value = it.message
                    syncTransRecordDataListFinish.value = true
                })
        )
    }

    fun performSyncTransRecordDataList(isErc20Error: Boolean, list: List<TransactionDataEth>) {
        add(Observable.just(list)
            .map {
                val transCoinData = baseMainModel.getCoinDataByCoinId(userTransCoinId)
                val model = EthRecordModel()
                model.mUserTransAddress = userEthAddress
                model.mTransCoinData = transCoinData
                model.mContractAddress = userErc20ContractAddress
                return@map when {
                    isErc20Error ->
                        model.getErc20ErrorTransactionRecordDataList(it, latestTimeStamp)
                    else ->
                        model.getEthErc20TransRecordDataList(isEthRecord, it, latestTimeStamp)
                }
            }
            .flatMap {
                return@flatMap mergeTransRecordCommentsListObservable(it)
            }
            .flatMap {
                return@flatMap Observable.fromIterable(it)
            }
            .map { nowData ->
                val txId = nowData.txId
                val data = baseCoinRecordRepository.getTransRecordDataByTxId(txId)
                if (data._id > 0) {
                    // update
                    nowData._id = data._id
                    if (nowData.fromAmount.toDouble() > 0.0) {
                        baseCoinRecordRepository.updateTransRecordData(nowData)
                    } else {
                        if (nowData.status == GlobalConstant.TRANSACTION_STATE_ERROR) {
                            baseCoinRecordRepository.updateTransRecordData(nowData)
                        } else {
                            // contract record didn't update
                        }
                    }
                } else {
                    // insert
                    baseCoinRecordRepository.addTransRecordData(nowData)
                }
                return@map nowData
            }
            .toMain()
            .compose(loadingView(showLoading = true, closeLoading = false))
            .toList()
            .subscribe({
                syncTransRecordDataListFinish.value = true
            }, {
                isLoading.postValue(false)
                throwableMessage.value = it.message
                syncTransRecordDataListFinish.value = true
            })
        )
    }

    fun performGetApiErc20ErrorTransactionRecordDataList(queryMap: Map<String, String>) {
        add(
            etherscanApiRepository.performGetEtherscanApiResult(queryMap)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({ result ->
                    val list = result.result
                    list?.let {
                        val listSize = it.size
                        if (listSize > 0 && it[0].timeStamp != null &&
                            TimeUtils.isTimestampInRange(it[0].timeStamp!!) &&
                            TimeUtils.compareTimestamp(latestTimeStamp, list[0].timeStamp!!) <= 0
                        ) {
                            pageNow++
                            resultErrorTransactionDataList?.addAll(list)
                            performGetApiErc20ErrorTransactionRecordDataList(getQueryMap())
                        } else {
                            resultErrorTransactionDataList?.let { lists ->
                                // set erc20 error data
                                performSyncTransRecordDataList(true, lists.toList())

                            }
                        }
                    }
                }, {
                    isLoading.postValue(false)
                    throwableMessage.value = it.message
                    syncTransRecordDataListFinish.value = true
                })
        )
    }
}