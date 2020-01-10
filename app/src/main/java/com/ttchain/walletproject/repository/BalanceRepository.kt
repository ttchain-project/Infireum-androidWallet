package com.ttchain.walletproject.repository

import android.annotation.SuppressLint
import com.google.gson.JsonParser
import com.ttchain.walletproject.App.Companion.DEFAULT_AMOUNT
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.BalanceBean
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.utils.RuleUtils
import org.json.JSONException
import org.json.JSONObject
import java.math.BigDecimal
import java.util.*

class BalanceRepository(
    private val dbHelper: DbHelper
) : BaseRepository() {

    @SuppressLint("DefaultLocale")
    fun getBalanceQueryMap(coinId: String): Map<String, String> {
        val queryMap = HashMap<String, String>()
        val balanceCoinData = dbHelper.getCoinDataByCoinId(coinId)
        if (balanceCoinData._id > 0) {
            val mainCoinData = dbHelper.getCoinDataByCoinId(balanceCoinData.mainCoinId)
            if (mainCoinData._id > 0) {
                when (balanceCoinData.coinId) {
                    CoinEnum.BTC.coinId, CoinEnum.USDT.coinId -> {
                        queryMap["token"] = balanceCoinData.chainName.toUpperCase()
                    }
                    else -> {
                        queryMap["token"] = mainCoinData.chainName.toUpperCase()
                        if (balanceCoinData.contract != null && balanceCoinData.contract!!.isNotEmpty()) {
                            queryMap["contractAddress"] = balanceCoinData.contract!!
                        }
                    }
                }
            }
        }
        return queryMap
    }

    @SuppressLint("DefaultLocale")
    fun getAssetDataList(response: String, address: String, coinId: String): List<BalanceBean> {
        val resultList = ArrayList<BalanceBean>()
        when {
            RuleUtils.isChainType(address, ChainType.ETH) -> try {
                val jsonObj = JSONObject(response)
                val balanceObj = jsonObj.getString("balance")
                var balance = DEFAULT_AMOUNT
                if (balanceObj != null) {
                    balance = balanceObj.toString()
                }
                resultList.add(createBalanceBean(address, coinId, balance))
            } catch (e: JSONException) {
                e.printStackTrace()
            }
            RuleUtils.isChainType(address, ChainType.BTC) -> try {
                val jsonObj = JSONObject(response)
                val balanceObj = jsonObj.getString("balance")
                var balance = DEFAULT_AMOUNT
                if (balanceObj != null) {
                    balance = balanceObj.toString()
                }
                resultList.add(createBalanceBean(address, coinId, balance))
            } catch (e: JSONException) {
                e.printStackTrace()
            }
            else -> try {

                val jsonObj = JsonParser().parse(response).asJsonObject
                val balanceObj = jsonObj.get("balance").asJsonObject

                val coinData = dbHelper.getCoinDataByCoinId(coinId)
                val coinDataList = dbHelper.getCoinDataListByMainCoinId(coinData.mainCoinId)
                for (item in coinDataList) {
                    try {
                        if (balanceObj.has(item.chainName.toLowerCase())) {
                            val amount = balanceObj.get(item.chainName.toLowerCase()).asString
                            resultList.add(createBalanceBean(address, item.coinId, amount))
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }
            } catch (e: JSONException) {
                e.printStackTrace()
            }
        }
        return resultList
    }

    fun updateAssetData(balanceBean: BalanceBean): Boolean {
        val walletData = dbHelper.getWalletDataByAddress(balanceBean.address)
        val coinData = dbHelper.getCoinDataByCoinId(balanceBean.coinId)
        if (walletData._id > 0 && coinData._id > 0) {
            val assetData = dbHelper.getAssetDataByWalletIDAndCoinID(walletData._id, coinData._id)
            if (assetData._id > 0) {
                assetData.amount =
                    BigDecimal(balanceBean.balance).multiply(BigDecimal("1E-" + coinData.digit))
                dbHelper.updateAssetData(assetData)
                return true
            }
        }
        return false
    }

    private fun createBalanceBean(address: String, coinId: String, balance: String): BalanceBean {
        return BalanceBean().apply {
            this.address = address
            this.coinId = coinId
            this.balance = balance
        }
    }
}