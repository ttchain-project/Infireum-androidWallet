package com.ttchain.walletproject.model


import android.content.Context
import androidx.core.content.edit

class ApiHelperImpl(private val mContext: Context) : ApiHelper {

    companion object {
        const val API_DATA_PREFS = "api_data_prefs"
        const val MINER_FEE_ETH = "MINER_FEE_ETH"
        const val MINER_FEE_BTC = "MINER_FEE_BTC"
    }

    override val ethMinerFeeFromApi: String
        get() {
            val prefs = mContext.getSharedPreferences(API_DATA_PREFS, Context.MODE_PRIVATE)
            return prefs.getString(MINER_FEE_ETH, "") ?: ""
        }

    override val btcMinerFeeFromApi: String
        get() {
            val prefs = mContext.getSharedPreferences(API_DATA_PREFS, Context.MODE_PRIVATE)
            return prefs.getString(MINER_FEE_BTC, "") ?: ""
        }

    override// TODO member auth
    val auth: String
        get() = ""

    override// TODO lang
    val lang: String
        get() = "zh-cn"

    override// TODO nation id
    val nationId: String
        get() = ""

    override fun saveEthMinerFeeFromApi(string: String) {
        mContext.getSharedPreferences(API_DATA_PREFS, Context.MODE_PRIVATE).edit {
            putString(MINER_FEE_ETH, string)
        }
    }

    override fun saveBtcMinerFeeFromApi(string: String) {
        mContext.getSharedPreferences(API_DATA_PREFS, Context.MODE_PRIVATE).edit {
            putString(MINER_FEE_BTC, string)
        }
    }
}
