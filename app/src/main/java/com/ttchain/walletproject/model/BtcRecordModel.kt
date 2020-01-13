package com.ttchain.walletproject.model

import android.text.TextUtils
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.data.CoinData
import com.ttchain.walletproject.database.data.TransRecordData
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.TimeUtils
import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*


class BtcRecordModel {

    var mUserTransAddress: String? = null

    var mCoinData: CoinData? = null

    fun getBtcTransactionRecordDataList(
        dataList: List<ApiBlockChainBtcTransactionListResponse.ItemsBean>
    ): List<TransRecordData> {
        if (TextUtils.isEmpty(mUserTransAddress) || mCoinData == null) {
            return emptyList()
        }
        val resultList = ArrayList<TransRecordData>()
        for (data in dataList) {
            resultList.add(TransRecordData().apply {
                txId = getTransTxId(data)
                status = getStatus(data)
                fromCoinData = mCoinData!!
                fromAmount = getTransAmount(data)
                fromAddress = getPayFromAddress(data)!!
                toCoinData = mCoinData!!
                toAmount = getTransAmount(data)
                toAddress = getReceiptToAddress(data)!!
                feeCoinData = mCoinData!!
                totalFee = getTotalMinerFee(data)
                date = getTransTime(data)
                block = getBlockNumber(data)
                syncDate = TimeUtils.getNowTimestamp().toString()
            })
        }

        return resultList
    }

    private fun getTransTxId(data: ApiBlockChainBtcTransactionListResponse.ItemsBean): String {
        return data.txid
    }

    private fun isConfirmations(data: ApiBtcTransactionListResponse.ItemsBean): Boolean {
        return data.confirmations > 0 && data.blockheight > 0
    }

    private fun getStatus(data: ApiBlockChainBtcTransactionListResponse.ItemsBean): Int {
        if (mUserTransAddress != null) {
            for (bean in data.vin) {
                if (mUserTransAddress == bean.prevOut.addr) {
                    return GlobalConstant.TRANSACTION_STATE_OUTCOME
                }
            }
            for (bean in data.vout) {
                if (mUserTransAddress == bean.addr) {
                    return GlobalConstant.TRANSACTION_STATE_INCOME
                }
            }
        }
        return GlobalConstant.TRANSACTION_STATE_ERROR
    }

    private fun getReceiptToAddress(data: ApiBlockChainBtcTransactionListResponse.ItemsBean): String? {
        val status = getStatus(data)
        var resultAddress: String? = null
        var addressCount = 0
        if (status == GlobalConstant.TRANSACTION_STATE_OUTCOME) {
            val voutBeanList = data.vout
            for (bean in voutBeanList) {
                if (mUserTransAddress != bean.addr) {
                    if (TextUtils.isEmpty(resultAddress)) {
                        resultAddress = bean.addr
                    }
                    addressCount++
                }
            }
        } else if (status == GlobalConstant.TRANSACTION_STATE_INCOME) {
            return mUserTransAddress
        }

        return if (resultAddress != null) {
            if (addressCount > 1) {
                "$resultAddress(+$addressCount)"
            } else resultAddress
        } else ""
    }

    private fun getPayFromAddress(data: ApiBlockChainBtcTransactionListResponse.ItemsBean): String? {
        val status = getStatus(data)
        var resultAddress: String? = null
        var addressCount = 0
        if (status == GlobalConstant.TRANSACTION_STATE_INCOME) {
            val vinBeanList = data.vin
            for (bean in vinBeanList) {
                val address = bean.prevOut.addr
                if (mUserTransAddress != address) {
                    if (TextUtils.isEmpty(resultAddress)) {
                        resultAddress = address
                    }
                    addressCount++
                }
            }
        } else if (status == GlobalConstant.TRANSACTION_STATE_OUTCOME) {
            return mUserTransAddress
        }


        return if (resultAddress != null) {
            if (addressCount > 1) {
                "$resultAddress(+$addressCount)"
            } else resultAddress
        } else ""
    }

    private fun getTransAmount(data: ApiBlockChainBtcTransactionListResponse.ItemsBean): BigDecimal {
        val status = getStatus(data)
        val amountList = ArrayList<String>()
        if (status == GlobalConstant.TRANSACTION_STATE_OUTCOME) {
            val vinBeanList = data.vin
            var mVinValue: Double?
            var vin = BigDecimal(0)
            var mVoutValue = "0"
            for (bean in vinBeanList) {
                val address = bean.prevOut.addr
                if (mUserTransAddress == address) {
                    mVinValue = bean.prevOut.value
                    vin = vin.add(NumberUtils.valueOf(mVinValue!!))
                }
            }
            val voutBeanList = data.vout
            for (bean in voutBeanList) {
                if (mUserTransAddress == bean.addr) {
                    mVoutValue = bean.value
                    break
                }
            }
            val vout = BigDecimal(mVoutValue)
            val finalAmount = vin.subtract(vout)

            amountList.add(finalAmount.toPlainString())

        } else if (status == GlobalConstant.TRANSACTION_STATE_INCOME) {
            val voutBeanList = data.vout
            for (bean in voutBeanList) {
                if (mUserTransAddress == bean.addr) {
                    amountList.add(bean.value)
                }
            }
        }

        var total = BigDecimal("0")

        for (amount in amountList) {
            total = total.add(BigDecimal(amount))
        }

        return total.divide(BigDecimal("1E8"))
    }

    private fun getTotalMinerFee(data: ApiBlockChainBtcTransactionListResponse.ItemsBean): BigDecimal {
        var inValue = BigDecimal("0")
        for (bean in data.vin) {
            inValue = inValue.add(BigDecimal(bean.prevOut.value!!))
        }

        var outValue = BigDecimal("0")
        for (bean in data.vout) {
            outValue = outValue.add(BigDecimal(bean.value))
        }

        return inValue.subtract(outValue).divide(BigDecimal("1E8"))
    }

    private fun getTransTime(data: ApiBlockChainBtcTransactionListResponse.ItemsBean): String {
        return data.time.toString()
    }

    private fun getBlockNumber(data: ApiBlockChainBtcTransactionListResponse.ItemsBean): String {
        return data.blockheight.toString()
    }

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
