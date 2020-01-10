package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable
import java.util.ArrayList


class TtnTransactionData : Serializable {

    /**
     * Transaction:[
     * {
     * "blockHash": "35b1c92c1e6f23cfc2a413b1a4c6fd9533fef76c54c39b0c99ee68ed2d9283ef",
     * "tx": "035d4386a88eeb3eac4ddad5f6125a840a8db04e5bf400dcc6d63cbea9e7baa8",
     * "version": "sDAGraph",
     * "from": "c12a90a88b2fd5862f8496f98bbdd7cbcb3dfe73",
     * "to": "217b30f8540aa96fbe9ce319f057e9d46fb1880c",
     * "balance": "10000",
     * "out": null,
     * "nonce": 0,
     * "fee": "0",
     * "type": "ttn",
     * "input": "",
     * "sign": "32313738333232353033383635303035303039323336303135303438303631353839333738343838373533313339323332383436343438343536373834313535323039373331313134383232783437343634323739313539373338353537393430373230313739313830393137343836393432323339373631333337393434323838303431323434303637303933373539303333393033383135",
     * "crypto": "cic",
     * "publicKey": "04125d3ea3de826f81690b06472fd555e068459e375bab482486a420181c32315b7fc1b807213267f6ea82538310e4d317544ffaab8350e84ad5a0a61a6a2007fa",
     * "protocol": null,
     * "timeLock": {
     * "type": "",
     * "amount": "",
     * "time": "1970-01-01T08:00:00+08:00",
     * "endTime": "1970-01-01T08:00:00+08:00",
     * "unlockAmount": "0",
     * "intervalTime": 0
     * },
     * "timestamp": 1555912684
     * }]
     */

    @SerializedName("nonce")
    val nonce: String? = null
    @SerializedName("publicKey")
    val publicKey: String? = null
    @SerializedName("fee")
    val fee: String? = null
    @SerializedName("type")
    val type: String? = null
    @SerializedName("timestamp")
    val timestamp = 0.0
    @SerializedName("input")
    val input: String? = null
    @SerializedName("from")
    val from = ""
    @SerializedName("sign")
    val sign: String? = null
    @SerializedName("out")
    var out: ArrayList<TtnTransactionOutData>? = null
    @SerializedName("to")
    val to: String? = null
    @SerializedName("tx")
    val tx: String? = null
    @SerializedName("balance")
    val balance: String? = null
    @SerializedName("blockHash")
    val blockHash: String? = null
}
