package com.ttchain.walletproject.model

import android.text.TextUtils
import com.ttchain.walletproject.App.Companion.ttnFee
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.TransRecordData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.TimeUtils
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*


class TtnTransRecordModel {

    var mUserTransAddress: String? = null

    var ttnCoinData: CoinData? = null
    var btcnCoinData: CoinData? = null
    var usdtnCoinData: CoinData? = null
    var ethnCoinData: CoinData? = null
    var exrCoinData: CoinData? = null
    var mccCoinData: CoinData? = null
    var ttn1CoinData: CoinData? = null
    var dai1CoinData: CoinData? = null
    var tusd1CoinData: CoinData? = null

    fun getTtnTransactionRecordDataList(
        dataList: List<TtnTransactionData>
    ): List<TransRecordData> {
        if (TextUtils.isEmpty(mUserTransAddress)) {
            return emptyList()
        }

        val resultList = ArrayList<TransRecordData>()

        for (data in dataList) {
            val mCoinData = getTxCoinData(data)
            resultList.add(TransRecordData().apply {
                txId = getTransTxId(data)
                status = getStatus(data)
                fromCoinData = mCoinData!!
                fromAmount = getTransAmount(mCoinData, data)
                fromAddress = getPayFromAddress(data)
                toCoinData = mCoinData
                toAmount = getTransAmount(mCoinData, data)
                toAddress = getReceiptToAddress(data)
                feeCoinData = mCoinData
                totalFee = NumberUtils.valueOf(getTotalMinerFee(data), 18)
                date = getTransTime(data)
                block = getBlockNumber(data)
                syncDate = TimeUtils.getNowTimestamp().toString()
            })
        }

        return resultList
    }

    private fun getTxCoinData(data: TtnTransactionData): CoinData? {
        return when {
            data.out == null -> ttnCoinData
            data.out!![0].token == CoinEnum.BTCN.inputName -> btcnCoinData
            data.out!![0].token == CoinEnum.USDTN.inputName -> usdtnCoinData
            data.out!![0].token == CoinEnum.ETHN.inputName -> usdtnCoinData
            data.out!![0].token == CoinEnum.EXR.inputName -> exrCoinData
            data.out!![0].token == CoinEnum.MCC.inputName -> mccCoinData
            data.out!![0].token == CoinEnum.TTN1.inputName -> ttn1CoinData
            data.out!![0].token == CoinEnum.DAI1.inputName -> dai1CoinData
            data.out!![0].token == CoinEnum.TUSD1.inputName -> tusd1CoinData
            else -> null
        }
    }

    private fun getTransTxId(data: TtnTransactionData): String {
        return data.tx!!
    }

    private fun getStatus(data: TtnTransactionData): Int {
        if (data.from == mUserTransAddress) {
            return GlobalConstant.TRANSACTION_STATE_OUTCOME
        } else if (data.to == mUserTransAddress) {
            return GlobalConstant.TRANSACTION_STATE_INCOME
        }

        return GlobalConstant.TRANSACTION_STATE_ERROR
    }

    private fun getReceiptToAddress(data: TtnTransactionData): String {
        return data.to ?: ""
    }

    private fun getPayFromAddress(data: TtnTransactionData): String {
        return data.from
    }

    private fun getTransAmount(mCoinData: CoinData, data: TtnTransactionData): BigDecimal {
        //        if(data.getOut().getBtr()!=null) {
        //            return NumberUtils.valueOf(data.getOut().getBtr(), 8);
        //        }else if(data.getOut().getCry()!=null){
        //            return NumberUtils.valueOf(data.getOut().getCry(), 8);
        //        }else if(data.getOut().getCi1()!=null){
        //            return NumberUtils.valueOf(data.getOut().getCi1(), 18);
        //        }else if(data.getOut().getCi2()!=null){
        //            return NumberUtils.valueOf(data.getOut().getCi2(), 18);
        //        }else {
        //            return NumberUtils.valueOf(0);
        //        }
        //        return NumberUtils.valueOf(data.getBalance(), 18);

        var balance = NumberUtils.valueOf(0.0)

        when {
            mCoinData.coinId == CoinEnum.TTN.coinId ->
                balance = data.balance?.let {
                    if (it.isNotEmpty()) NumberUtils.valueOf(it, 18) else NumberUtils.valueOf(0.0)
                } ?: run {
                    NumberUtils.valueOf(0.0)
                }
            mCoinData.coinId == CoinEnum.BTCN.coinId -> for (outData in data.out!!) {
                if (outData.token == CoinEnum.BTCN.inputName) {
                    balance = NumberUtils.valueOf(outData.balance, 8)
                }
            }
            mCoinData.coinId == CoinEnum.USDTN.coinId -> for (outData in data.out!!) {
                if (outData.token == CoinEnum.USDTN.inputName) {
                    balance = NumberUtils.valueOf(outData.balance, 8)
                }
            }
            mCoinData.coinId == CoinEnum.EXR.coinId -> for (outData in data.out!!) {
                if (outData.token == CoinEnum.EXR.inputName) {
                    balance = NumberUtils.valueOf(outData.balance, 18)
                }
            }
            mCoinData.coinId == CoinEnum.MCC.coinId -> for (outData in data.out!!) {
                if (outData.token == CoinEnum.MCC.inputName) {
                    balance = NumberUtils.valueOf(outData.balance, 18)
                }
            }
            mCoinData.coinId == CoinEnum.TTN1.coinId -> for (outData in data.out!!) {
                if (outData.token == CoinEnum.TTN1.inputName) {
                    balance = NumberUtils.valueOf(outData.balance, 18)
                }
            }
            mCoinData.coinId == CoinEnum.DAI1.coinId -> for (outData in data.out!!) {
                if (outData.token == CoinEnum.DAI1.inputName) {
                    balance = NumberUtils.valueOf(outData.balance, 18)
                }
            }
            mCoinData.coinId == CoinEnum.TUSD1.coinId -> for (outData in data.out!!) {
                if (outData.token == CoinEnum.TUSD1.inputName) {
                    balance = NumberUtils.valueOf(outData.balance, 18)
                }
            }
        }

        return balance
    }

    private fun getTotalMinerFee(data: TtnTransactionData): BigDecimal {
        return data.fee?.let {
            if (it.isNotEmpty()) NumberUtils.valueOf(it, 18) else NumberUtils.valueOf(ttnFee, 18)
        } ?: run {
            NumberUtils.valueOf(ttnFee, 18)
        }
    }

    private fun getTransTime(data: TtnTransactionData): String {
        return NumberUtils.formatFloorDouble(data.timestamp)
    }

    private fun getBlockNumber(data: TtnTransactionData): String {
        //        return String.valueOf(data.getBlockheight());
        return "0" //TODO BlockNumber?
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
