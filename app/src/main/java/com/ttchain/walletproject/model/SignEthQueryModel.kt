package com.ttchain.walletproject.model

class SignEthQueryModel {

    /**
     * nonce : 0x6e
     * gasLimit : 60000
     * to : 0x57feF7a574bb03e6586699f65eaE9065116F6D09
     * value : 15950000000000000000000
     * gasPrice : 40000000000
     */

    var nonce: String? = null
    var gasLimit: String? = null
    var to: String? = null
    var value: String? = null
    var gasPrice: String? = null

    override fun toString(): String {
        if (nonce != null && gasLimit != null && to != null && value != null && gasPrice != null) {

            val sb = StringBuilder()
            sb.append("{")
            sb.append("\"nonce\":\"").append(nonce).append("\"").append(",")
            sb.append("\"gasLimit\":\"").append(gasLimit).append("\"").append(",")
            sb.append("\"to\":\"").append(to).append("\"").append(",")
            sb.append("\"value\":\"").append(value).append("\"").append(",")
            sb.append("\"gasPrice\":\"").append(gasPrice).append("\"")
            sb.append("}")
            return sb.toString()
        }

        return ""
    }
}
