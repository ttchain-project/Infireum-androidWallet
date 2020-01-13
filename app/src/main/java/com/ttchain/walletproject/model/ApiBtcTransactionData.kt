package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ApiBtcTransactionData : Serializable {

    /**
     * address : 3D2oetdNuZUqQHPJmcMDDHYoqkyNVsFk9r
     * txid : 005400e8b2c81a3e774ed4c2143e6dd57253a797e4101e0f485f9850f139bd3c
     * vout : 0
     * scriptPubKey : a9147c6775e20e3e938d2d7e9d79ac310108ba501ddb87
     * amount : 1.0E-4
     * satoshis : 10000
     * height : 452440
     * confirmations : 81298
     */
    @SerializedName("address")
    var address: String = ""
    @SerializedName("txid")
    var txid: String = ""
    @SerializedName("vout")
    var vout: Double = 0.0
    @SerializedName("scriptPubKey")
    var scriptPubKey: String = ""
    @SerializedName("amount")
    var amount: Double = 0.0
    @SerializedName("satoshis")
    var satoshis: Double = 0.0
    @SerializedName("height")
    var height: Int = 0
    @SerializedName("confirmations")
    var confirmations: Int = 0
}
