package com.ttchain.walletproject.utils

import com.ttchain.walletproject.model.CoinBean
import com.ttchain.walletproject.model.RecordBean
import com.ttchain.walletproject.model.ResponseBTCTransactionData
import java.text.SimpleDateFormat
import java.util.*

object SortUtils {
    fun getCoinBeanDataListByCoinID(source: List<CoinBean>): List<CoinBean> {
        Collections.sort(source) { left, right -> left.coinID - right.coinID }
        return source
    }

    fun getCoinBeanDataListByName(source: List<CoinBean>): List<CoinBean> {
        Collections.sort(source) { left, right -> left.displayName.compareTo(right.displayName) }
        return source
    }

    fun getCoinBeanDataListByAmount(source: List<CoinBean>): List<CoinBean> {
        Collections.sort(source) { left, right ->
            right.amountValue.compareTo(left.amountValue)
        }
        return source
    }

    fun getBtcTransactionDataByAmount(list: List<ResponseBTCTransactionData>): List<ResponseBTCTransactionData> {
        Collections.sort(list) { left, right ->
            right.amount.compareTo(left.amount)
        }
        return list
    }

    fun getRecordBeanDataListByDate(source: List<RecordBean>): List<RecordBean> {
        val DATA_FORMAT = "MM/dd/yyyy HH:mm:ss"
        val formatter = SimpleDateFormat(DATA_FORMAT)
        Collections.sort(source) { left, right ->
            try {
                val rightTs = formatter.parse(right.date).time
                val leftTs = formatter.parse(left.date).time
                return@sort rightTs.compareTo(leftTs)
            } catch (e: Exception) {
                return@sort 0
            }
        }

        return source
    }
}
