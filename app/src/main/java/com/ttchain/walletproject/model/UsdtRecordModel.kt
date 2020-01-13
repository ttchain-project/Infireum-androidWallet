package com.ttchain.walletproject.model

import android.text.TextUtils
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.UsdtTransRecordData
import com.ttchain.walletproject.utils.TimeUtils
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*


class UsdtRecordModel {

    var mUserTransAddress: String? = null

    var mCoinData: CoinData? = null

    fun getUsdtTransactionRecordDataList(
            dataList: List<ApiUsdtTransactionRecordResponse.ItemsBean>
    ): List<UsdtTransRecordData> {
        if (TextUtils.isEmpty(mUserTransAddress) || mCoinData == null) {
            return emptyList()
        }

        val resultList = ArrayList<UsdtTransRecordData>()

        for (data in dataList) {
            val transRecordData = UsdtTransRecordData().apply {
                txId = getTransTxId(data)
                status = getStatus(data)
                fromCoinData = mCoinData!!
                fromAmount = getTransAmount(data)
                fromAddress = getPayFromAddress(data)
                toCoinData = mCoinData!!
                toAmount = getTransAmount(data)
                toAddress = getReceiptToAddress(data)
                feeCoinData = mCoinData!!
                totalFee = getTotalMinerFee(data)
                date = getTransTime(data)
                block = getBlockNumber(data)
                syncDate = TimeUtils.getNowTimestamp().toString()
            }
            resultList.add(transRecordData)
        }

        return resultList
    }

    private fun getTransTxId(data: ApiUsdtTransactionRecordResponse.ItemsBean): String {
        return data.txid
    }

    private fun isConfirmations(data: ApiUsdtTransactionRecordResponse.ItemsBean): Boolean {
        return data.confirmations > 0 && data.block > 0
    }

    private fun getStatus(data: ApiUsdtTransactionRecordResponse.ItemsBean): Int {
        return if (mUserTransAddress != null) {
            when (mUserTransAddress) {
                data.sendingaddress -> {
                    GlobalConstant.TRANSACTION_STATE_OUTCOME
                }
                data.referenceaddress -> {
                    GlobalConstant.TRANSACTION_STATE_INCOME
                }
                else -> {
                    GlobalConstant.TRANSACTION_STATE_ERROR
                }
            }
        } else GlobalConstant.TRANSACTION_STATE_ERROR
    }

    private fun getReceiptToAddress(data: ApiUsdtTransactionRecordResponse.ItemsBean): String {
        return data.referenceaddress
    }

    private fun getPayFromAddress(data: ApiUsdtTransactionRecordResponse.ItemsBean): String {
        return data.sendingaddress
    }

    private fun getTransAmount(data: ApiUsdtTransactionRecordResponse.ItemsBean): BigDecimal {

        return BigDecimal(data.amount)
    }

    private fun getTotalMinerFee(data: ApiUsdtTransactionRecordResponse.ItemsBean): BigDecimal {
        return BigDecimal(data.fee.toString())
    }

    private fun getTransTime(data: ApiUsdtTransactionRecordResponse.ItemsBean): String {
        return data.blocktime.toString()
        //        return "";
    }

    private fun getBlockNumber(data: ApiUsdtTransactionRecordResponse.ItemsBean): String {
        return data.block.toString()
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
