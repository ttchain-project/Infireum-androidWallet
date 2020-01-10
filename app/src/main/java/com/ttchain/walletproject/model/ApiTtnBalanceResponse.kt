package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class ApiTtnBalanceResponse : Serializable {

    /**
     * balance : 8430041199537820
     * code : 0
     * message : json
     * transactions:[]
     */

    @SerializedName("Address")
    val address: String? = null
    @SerializedName("Nonce")
    var nonce: Double? = null
    @SerializedName("Balance")
    val balance: String = ""
    @SerializedName("Token")
    val token: TtnBalanceData? = null
    @SerializedName("Transaction")
    var transactions: List<TtnTransactionData>? = null
}
