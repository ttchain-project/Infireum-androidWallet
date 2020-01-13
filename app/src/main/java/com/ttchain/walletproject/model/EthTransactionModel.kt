package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class EthTransactionModel : Serializable {

    /**
     * token : eth
     * privateKey : ffea96f4c8910006bdb25eb908b00b4f647b4e3f9ee9571c1f89121e9180f585
     */
    @SerializedName("token")
    var token: String? = null
    @SerializedName("privateKey")
    var privateKey: String? = null
    @SerializedName("contractAddress")
    var contractAddress: String? = null
    @SerializedName("encry")
    var encry: Boolean? = null
}
