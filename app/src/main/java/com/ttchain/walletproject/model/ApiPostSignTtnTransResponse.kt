package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class ApiPostSignTtnTransResponse : Serializable {

    /**
     * method : sendTransaction
     * result :
     * txid :
     */
    @SerializedName("method")
    var method: String? = null
    @SerializedName("result")
    var result: SignTtnTransResultData? = null
    @SerializedName("message")
    var messgae: String? = null
    @SerializedName("txid")
    var txid: String? = null

}
