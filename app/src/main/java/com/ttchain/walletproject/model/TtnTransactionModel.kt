package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable
import java.util.ArrayList


class TtnTransactionModel : Serializable {
    //	"fee":"0",
    //            "address":"891e52e88160903d9903d6e2883f4ab5ce00c52b",
    //            "balance": "100000",
    //            "nonce":6,
    //            "type":"ttn",
    //            "input":"",
    //            "PrivateKey":"b87ec70ac75267ed2ca16d01925da70a30dc7a2fe1eddaf0660d13f23f4d80e5",
    //            "crypto":"cic",
    //            "out":[{"token":"3DG",
    //            "balance":"50000000"}]
    @SerializedName("fee")
    var fee: String? = null
    @SerializedName("address")
    var address: String? = null
    @SerializedName("balance")
    var balance: String? = null
    @SerializedName("nonce")
    var nonce: Int? = null
    @SerializedName("type")
    var type: String? = null
    @SerializedName("input")
    var input: String? = null
    @SerializedName("PrivateKey")
    var PrivateKey: String? = null
    @SerializedName("crypto")
    var crypto: String? = null
    @SerializedName("out")
    var out: ArrayList<OutModel>? = null
}
