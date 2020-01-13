package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ApiUsdtTransactionRecordResponse : Serializable {

    @SerializedName("address")
    val address: String = ""
    @SerializedName("current_page")
    val currentPage: Int = 0
    @SerializedName("pages")
    val pages: Int = 0
    @SerializedName("transactions")
    val items: List<ItemsBean> = arrayListOf()

    class ItemsBean : Serializable {
        @SerializedName("amount")
        val amount: String = ""
        @SerializedName("referenceaddress")
        val referenceaddress: String = ""
        @SerializedName("sendingaddress")
        val sendingaddress: String = ""
        @SerializedName("blocktime")
        val blocktime: Long = 0
        @SerializedName("block")
        val block: Int = 0
        @SerializedName("txid")
        val txid: String = ""
        @SerializedName("confirmations")
        val confirmations: Int = 0
        @SerializedName("fee")
        val fee: String = ""
    }
}
