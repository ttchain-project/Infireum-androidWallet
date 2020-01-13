package com.ttchain.walletproject.model

import android.annotation.SuppressLint
import android.text.TextUtils

import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.TransRecordData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.repository.BaseMainModel
import com.ttchain.walletproject.utils.TimeUtils

import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Calendar
import java.util.Locale


class EthRecordModel {

    companion object {
        private const val IS_ETH_INPUT = "0x"
        private const val IS_NOT_ETH_VALUE = "0"
        private const val IS_NON_ERROR = "0"
        private const val IS_ERROR = "1"
    }

    var mUserTransAddress = ""

    var mContractAddress = ""

    var mTransCoinData: CoinData? = null

    fun getEthSeriesTransactionRecordDataList(
        transactionDataList: List<TransactionDataEth>?,
        userTransAddress: String,
        latestDataTimeStamp: String,
        baseMainModel: BaseMainModel
    ): List<TransRecordData> {
        if (transactionDataList == null ||
            transactionDataList.isEmpty() ||
            userTransAddress.isEmpty() ||
            latestDataTimeStamp.isEmpty()
        ) {
            return emptyList()
        }

        val ethCoinData =
            baseMainModel.mDbHelper.getCoinDataByCoinId(CoinEnum.ETH.coinId)
        if (ethCoinData._id < 0) {
            return emptyList()
        }

        val resultDataList = ArrayList<TransRecordData>()

        for (data in transactionDataList) {
            if (data.timeStamp != null && TimeUtils.isTimestampInRange(data.timeStamp!!.toLong()) &&
                TimeUtils.compareTimestamp(latestDataTimeStamp, data.timeStamp!!) < 0
            ) {

                val transRecordData = TransRecordData()
                transRecordData.txId = getTransTxId(data)
                transRecordData.status = getStatus(userTransAddress, data)
                transRecordData.fromCoinData = ethCoinData
                transRecordData.fromAmount = getTransAmount(data, ethCoinData.digit)
                transRecordData.fromAddress = getPayFromAddress(userTransAddress, data)
                transRecordData.toCoinData = ethCoinData
                transRecordData.toAmount = getTransAmount(data, ethCoinData.digit)
                transRecordData.toAddress = getReceiptToAddress(userTransAddress, data)
                transRecordData.feeCoinData = ethCoinData
                transRecordData.totalFee = getTotalMinerFee(data)
                transRecordData.date = getTransTime(data)
                transRecordData.block = getBlockNumber(data)
                transRecordData.syncDate = TimeUtils.getNowTimestamp().toString()

                if (isEthTransaction(data)) {
                    transRecordData.toCoinData = ethCoinData
                } else {
                    val contract = getContractAddress(userTransAddress, data)
                    val coinData = baseMainModel.mDbHelper.getCoinDataByCoinId(contract)
                    if (coinData._id < 0) {
                        continue
                    }

                    transRecordData.fromCoinData = coinData
                    transRecordData.toCoinData = coinData
                    transRecordData.feeCoinData = ethCoinData

                    if (isError(data)) {
                        transRecordData.status = GlobalConstant.TRANSACTION_STATE_FAIL
                    }
                }

                resultDataList.add(transRecordData)
            }
        }

        return resultDataList
    }

    fun setEthErc20TransactionRecordResponse(response: ApiEtherscanResponse, isEth: Boolean) {
        getEthErc20TransRecordDataList(isEth, response.result, "0")
    }

    fun getEthErc20TransRecordDataList(
        isEth: Boolean,
        transactionDataList: List<TransactionDataEth>?,
        latestTimeStamp: String
    ): List<TransRecordData> {
        if (transactionDataList == null || transactionDataList.isEmpty() ||
            TextUtils.isEmpty(mUserTransAddress) || mTransCoinData == null || !isEth &&
            TextUtils.isEmpty(mContractAddress)
        ) {
            return emptyList()
        }

        val resultDataList = ArrayList<TransRecordData>()
        for (data in transactionDataList) {
            val record: Boolean = when {
                isEth -> isEthTransaction(data)
                else -> !isEthTransaction(data)
            }
            if (record && data.timeStamp != null && TimeUtils.isTimestampInRange(data.timeStamp!!.toLong())
                && TimeUtils.compareTimestamp(latestTimeStamp, data.timeStamp!!) < 0
            ) {
                val transRecordData = TransRecordData()
                transRecordData.txId = getTransTxId(data)
                transRecordData.status = getStatus(data)
                transRecordData.fromCoinData = mTransCoinData!!
                transRecordData.fromAmount = getTransAmount(data, mTransCoinData!!.digit)
                transRecordData.fromAddress = getPayFromAddress(data)!!
                transRecordData.toCoinData = mTransCoinData!!
                transRecordData.toAmount = getTransAmount(data, mTransCoinData!!.digit)
                transRecordData.toAddress = getReceiptToAddress(data)!!
                transRecordData.feeCoinData = mTransCoinData!!
                transRecordData.totalFee = getTotalMinerFee(data)
                transRecordData.date = getTransTime(data)
                transRecordData.block = getBlockNumber(data)
                transRecordData.syncDate = TimeUtils.getNowTimestamp().toString()
                resultDataList.add(transRecordData)
            }
        }
        return resultDataList
    }

    fun setErc20ErrorTransactionRecordResponse(response: ApiEtherscanResponse) {
        getErc20ErrorTransactionRecordDataList(response.result, "0")
    }

    fun getErc20ErrorTransactionRecordDataList(
        txlist: List<TransactionDataEth>?,
        latestTimeStamp: String
    ): List<TransRecordData> {
        if (txlist == null || txlist.isEmpty() || TextUtils.isEmpty(mUserTransAddress) || TextUtils.isEmpty(
                mContractAddress
            ) || mTransCoinData == null
        ) {
            return emptyList()
        }

        val resultDataList = ArrayList<TransRecordData>()

        for (data in txlist) {
            val inContractAddress = getContractAddress(data)
            if (inContractAddress == mContractAddress && isError(data)) {
                if (data.timeStamp != null && TimeUtils.isTimestampInRange(data.timeStamp!!.toLong())
                    && TimeUtils.compareTimestamp(latestTimeStamp, data.timeStamp!!) < 0
                ) {
                    val transRecordData = TransRecordData()
                    transRecordData.txId = getTransTxId(data)
                    transRecordData.status = GlobalConstant.TRANSACTION_STATE_FAIL
                    transRecordData.fromCoinData = mTransCoinData!!
                    transRecordData.fromAmount = getTransAmount(data, mTransCoinData!!.digit)
                    transRecordData.fromAddress = getPayFromAddress(data)!!
                    transRecordData.toCoinData = mTransCoinData!!
                    transRecordData.toAmount = getTransAmount(data, mTransCoinData!!.digit)
                    transRecordData.toAddress = getReceiptToAddress(data)!!
                    transRecordData.feeCoinData = mTransCoinData!!
                    transRecordData.totalFee = getTotalMinerFee(data)
                    transRecordData.date = getTransTime(data)
                    transRecordData.block = getBlockNumber(data)
                    transRecordData.syncDate = TimeUtils.getNowTimestamp().toString()
                    resultDataList.add(transRecordData)
                }
            }
        }
        return resultDataList
    }

    private fun isEthTransaction(data: TransactionDataEth): Boolean {
        return data.input == IS_ETH_INPUT && data.value != IS_NOT_ETH_VALUE
    }

    @SuppressLint("DefaultLocale")
    private fun getStatus(data: TransactionDataEth): Int {
        if (data.from?.toLowerCase() == mUserTransAddress.toLowerCase() &&
            data.to != mUserTransAddress.toLowerCase()
        ) {
            return GlobalConstant.TRANSACTION_STATE_OUTCOME
        }

        if (data.from?.toLowerCase() != mUserTransAddress.toLowerCase() &&
            data.to == mUserTransAddress.toLowerCase()
        ) {
            return GlobalConstant.TRANSACTION_STATE_INCOME
        }
        return GlobalConstant.TRANSACTION_STATE_ERROR
    }

    @SuppressLint("DefaultLocale")
    private fun getStatus(address: String?, data: TransactionDataEth): Int {
        if (address != null) {
            if (data.from?.toLowerCase() == address.toLowerCase() && data.to != address.toLowerCase()) {
                return GlobalConstant.TRANSACTION_STATE_OUTCOME
            }

            if (data.from?.toLowerCase() != address.toLowerCase() && data.to == address.toLowerCase()) {
                return GlobalConstant.TRANSACTION_STATE_INCOME
            }
        }
        return GlobalConstant.TRANSACTION_STATE_ERROR
    }

    private fun isError(data: TransactionDataEth): Boolean {
        return if (data.isError != null) {
            data.isError == IS_ERROR
        } else {
            false
        }
    }

    private fun getTransAmount(data: TransactionDataEth, digit: Int): BigDecimal {
        return if (isEthTransaction(data)) {
            BigDecimal(data.value).multiply(BigDecimal("1E-18"))
        } else {
            if (data.tokenDecimal != null) {
                if (data.tokenDecimal.isEmpty()) {
                    BigDecimal(data.value).multiply(BigDecimal("1E-$digit"))
                } else {
                    BigDecimal(data.value).multiply(BigDecimal("1E-" + data.tokenDecimal))
                }
            } else {
                BigDecimal(data.value).multiply(BigDecimal("1E-18"))
            }
        }
    }

    private fun getTotalMinerFee(data: TransactionDataEth): BigDecimal {
        return BigDecimal(data.gasPrice).multiply(BigDecimal(data.gasUsed))
            .multiply(BigDecimal("1E-18"))
    }

    private fun getContractAddress(data: TransactionDataEth): String {
        if (data.contractAddress != null && data.contractAddress.isNotEmpty()) {
            return data.contractAddress
        }
        if (TextUtils.isEmpty(mUserTransAddress)) {
            return ""
        }
        return if (mUserTransAddress == data.to) {
            data.from!!
        } else {
            data.to!!
        }
    }

    private fun getContractAddress(userAddress: String, data: TransactionDataEth): String {
        if (data.contractAddress != null && data.contractAddress.isNotEmpty()) {
            return data.contractAddress
        }
        if (TextUtils.isEmpty(userAddress)) {
            return ""
        }
        return if (userAddress == data.to) {
            data.from ?: ""
        } else {
            data.to ?: ""
        }
    }

    private fun getTransTxId(data: TransactionDataEth): String {
        return data.hash ?: ""
    }

    private fun getTransTime(data: TransactionDataEth): String {
        return data.timeStamp ?: ""
    }

    private fun getReceiptToAddress(data: TransactionDataEth): String? {
        val status = getStatus(data)
        if (status == GlobalConstant.TRANSACTION_STATE_OUTCOME) {
            return if (!isEthTransaction(data) && isError(data)) {
                mContractAddress
            } else data.to
        } else if (status == GlobalConstant.TRANSACTION_STATE_INCOME) {
            return mUserTransAddress
        }
        return ""
    }

    private fun getReceiptToAddress(address: String, data: TransactionDataEth): String {
        val status = getStatus(address, data)
        if (status == GlobalConstant.TRANSACTION_STATE_OUTCOME) {
            return when {
                !isEthTransaction(data) && isError(data) -> data.to ?: ""
                else -> data.to ?: ""
            }
        } else if (status == GlobalConstant.TRANSACTION_STATE_INCOME) {
            return address
        }
        return ""
    }

    private fun getPayFromAddress(data: TransactionDataEth): String? {
        val status = getStatus(data)
        if (status == GlobalConstant.TRANSACTION_STATE_OUTCOME) {
            return mUserTransAddress
        } else if (status == GlobalConstant.TRANSACTION_STATE_INCOME) {
            return data.from
        }
        return ""
    }

    private fun getPayFromAddress(address: String, data: TransactionDataEth): String {
        val status = getStatus(address, data)
        if (status == GlobalConstant.TRANSACTION_STATE_OUTCOME) {
            return address
        } else if (status == GlobalConstant.TRANSACTION_STATE_INCOME) {
            return data.from ?: ""
        }
        return ""
    }

    private fun getBlockNumber(data: TransactionDataEth): String {
        return data.blockNumber!!
    }

    //////////////////////////////

    private fun getTime(timeStampString: String): String {
        val timeStamp = java.lang.Long.parseLong(timeStampString)
        return getFormatTimeInDefaultLocale(timeStamp * 1000L)
    }

    fun getFormatTimeInDefaultLocale(time: Long): String {
        val cal = Calendar.getInstance(Locale.getDefault())
        cal.timeInMillis = time
        val sdf = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault())
        return sdf.format(cal.time)
    }

    private fun transStatusToString(status: Int): String {
        return when (status) {
            GlobalConstant.TRANSACTION_STATE_ERROR -> "error"
            GlobalConstant.TRANSACTION_STATE_ALL -> "all"
            GlobalConstant.TRANSACTION_STATE_THUNDER -> "thunder"
            GlobalConstant.TRANSACTION_STATE_OUTCOME -> "outcome"
            GlobalConstant.TRANSACTION_STATE_INCOME -> "income"
            GlobalConstant.TRANSACTION_STATE_FAIL -> "fail"
            GlobalConstant.TRANSACTION_STATE_UN_CONFIRM -> "un-confirm"
            else -> ""
        }
    }


}
