package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable


class ApiEtherscanResponse : Serializable {
    /**
     * status : 1
     * message : OK
     * result : [{"blockNumber":"6078057","timeStamp":"1533259422","hash":"0xd738f0a70c6bee34eefc61bfe6be4379f10540f0a73aad72c1d35dda99e8c9da","nonce":"1","blockHash":"0x626890442e4955a0296fdac5258f7fc850cfe4e06af990d7d2b651100980bd11","transactionIndex":"53","from":"0x4db346127cb8e65e6ab6fd611ce718eef38be995","to":"0xb5a5f22694352c15b00323844ad545abb2b11028","value":"0","gas":"55000","gasPrice":"21000000000","isError":"0","txreceipt_status":"1","input":"0xa9059cbb000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000014542ba12a337c00000","contractAddress":"","cumulativeGasUsed":"2676003","gasUsed":"21632","confirmations":"41626"}]
     */
    @SerializedName("status")
    var status: String? = null
    @SerializedName("message")
    var message: String? = null
    @SerializedName("result")
    var result: List<TransactionDataEth>? = null

}
