package com.git4u.tt_wallet_android.net.api.response

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ApiUsdtBalanceResponse : Serializable {

    @SerializedName("balance")
    val balances: List<ItemsBean> = arrayListOf()

    class ItemsBean : Serializable {

        @SerializedName("symbol")
        val symbol: String = ""
        @SerializedName("value")
        val value: String = ""
    }
}
