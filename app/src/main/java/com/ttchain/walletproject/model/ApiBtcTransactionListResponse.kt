package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ApiBtcTransactionListResponse : Serializable {

    /**
     * totalItems : 4
     * from : 0
     * to : 1
     * items : [{"txid":"d1373e910d189f854f484078a569176ba42e3868da7cbd8c322033e1df7b777a","version":1,"locktime":0,"vin":[{"txid":"4a1b8cd687135acafd55ce9cdc67dc255d40062775dc0523a4d7fcc9e58bca32","vout":1,"scriptSig":{"asm":"30450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6[ALL] 04c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9","hex":"4830450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6014104c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9"},"sequence":4294967295,"n":0,"addr":"1Hpy4U6WQJgFovooHNfJ9ytAN2cX2wZH6y","valueSat":487500,"value":0.004875,"doubleSpentTxID":null}],"vout":[{"value":"0.00001000","n":0,"scriptPubKey":{"hex":"76a9144daa5535243de20092a3b666322aefb75b590d9088ac","asm":"OP_DUP OP_HASH160 4daa5535243de20092a3b666322aefb75b590d90 OP_EQUALVERIFY OP_CHECKSIG","addresses":["185f5hrF85wa4bjYK2fJCoozi1qP6jhk9y"],"type":"pubkeyhash"},"spentTxId":null,"spentIndex":null,"spentHeight":null},{"value":"0.00486200","n":1,"scriptPubKey":{"hex":"76a914b8945bed634551db53247dd560424759c1c97d6a88ac","asm":"OP_DUP OP_HASH160 b8945bed634551db53247dd560424759c1c97d6a OP_EQUALVERIFY OP_CHECKSIG","addresses":["1Hpy4U6WQJgFovooHNfJ9ytAN2cX2wZH6y"],"type":"pubkeyhash"},"spentTxId":null,"spentIndex":null,"spentHeight":null}],"blockheight":-1,"confirmations":0,"time":1534231064,"valueOut":0.004872,"size":258,"valueIn":0.004875,"fees":3.0E-6}]
     */

    @SerializedName("totalItems")
    var totalItems: Int = 0
    @SerializedName("from")
    var from: Int = 0
    @SerializedName("to")
    var to: Int = 0
    @SerializedName("items")
    var items: List<ItemsBean> = arrayListOf()

    class ItemsBean : Serializable {
        /**
         * txid : d1373e910d189f854f484078a569176ba42e3868da7cbd8c322033e1df7b777a
         * version : 1
         * locktime : 0
         * vin : [{"txid":"4a1b8cd687135acafd55ce9cdc67dc255d40062775dc0523a4d7fcc9e58bca32","vout":1,"scriptSig":{"asm":"30450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6[ALL] 04c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9","hex":"4830450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6014104c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9"},"sequence":4294967295,"n":0,"addr":"1Hpy4U6WQJgFovooHNfJ9ytAN2cX2wZH6y","valueSat":487500,"value":0.004875,"doubleSpentTxID":null}]
         * vout : [{"value":"0.00001000","n":0,"scriptPubKey":{"hex":"76a9144daa5535243de20092a3b666322aefb75b590d9088ac","asm":"OP_DUP OP_HASH160 4daa5535243de20092a3b666322aefb75b590d90 OP_EQUALVERIFY OP_CHECKSIG","addresses":["185f5hrF85wa4bjYK2fJCoozi1qP6jhk9y"],"type":"pubkeyhash"},"spentTxId":null,"spentIndex":null,"spentHeight":null},{"value":"0.00486200","n":1,"scriptPubKey":{"hex":"76a914b8945bed634551db53247dd560424759c1c97d6a88ac","asm":"OP_DUP OP_HASH160 b8945bed634551db53247dd560424759c1c97d6a OP_EQUALVERIFY OP_CHECKSIG","addresses":["1Hpy4U6WQJgFovooHNfJ9ytAN2cX2wZH6y"],"type":"pubkeyhash"},"spentTxId":null,"spentIndex":null,"spentHeight":null}]
         * blockheight : -1
         * confirmations : 0
         * time : 1534231064
         * valueOut : 0.004872
         * size : 258
         * valueIn : 0.004875
         * fees : 3.0E-6
         */

        @SerializedName("txid")
        var txid: String = ""
        @SerializedName("version")
        var version: Int = 0
        @SerializedName("locktime")
        var locktime: Int = 0
        @SerializedName("blockheight")
        var blockheight: Int = 0
        @SerializedName("confirmations")
        var confirmations: Int = 0
        @SerializedName("time")
        var time: Long = 0
        @SerializedName("valueOut")
        var valueOut: Double = 0.toDouble()
        @SerializedName("size")
        var size: Int = 0
        @SerializedName("valueIn")
        var valueIn: Double = 0.toDouble()
        @SerializedName("fees")
        var fees: Double = 0.toDouble()
        @SerializedName("vin")
        var vin: List<VinBean> = arrayListOf()
        @SerializedName("vout")
        var vout: List<VoutBean> = arrayListOf()

        class VinBean : Serializable {
            /**
             * txid : 4a1b8cd687135acafd55ce9cdc67dc255d40062775dc0523a4d7fcc9e58bca32
             * vout : 1
             * scriptSig : {"asm":"30450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6[ALL] 04c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9","hex":"4830450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6014104c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9"}
             * sequence : 4294967295
             * n : 0
             * addr : 1Hpy4U6WQJgFovooHNfJ9ytAN2cX2wZH6y
             * valueSat : 487500
             * value : 0.004875
             * doubleSpentTxID : null
             */

            @SerializedName("txid")
            var txid: String = ""
            @SerializedName("vout")
            var vout: Int = 0
            @SerializedName("scriptSig")
            var scriptSig: ScriptSigBean? = null
            @SerializedName("sequence")
            var sequence: Long = 0
            @SerializedName("n")
            var n: Int = 0
            @SerializedName("addr")
            var addr: String = ""
            @SerializedName("valueSat")
            var valueSat: Double = 0.toDouble()
            @SerializedName("value")
            var value: Double = 0.toDouble()
            @SerializedName("doubleSpentTxID")
            var doubleSpentTxID: Any? = null

            class ScriptSigBean : Serializable {
                /**
                 * asm : 30450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6[ALL] 04c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9
                 * hex : 4830450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6014104c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9
                 */

                @SerializedName("asm")
                var asm: String? = null
                @SerializedName("hex")
                var hex: String? = null
            }
        }

        class VoutBean : Serializable {
            /**
             * value : 0.00001000
             * n : 0
             * scriptPubKey : {"hex":"76a9144daa5535243de20092a3b666322aefb75b590d9088ac","asm":"OP_DUP OP_HASH160 4daa5535243de20092a3b666322aefb75b590d90 OP_EQUALVERIFY OP_CHECKSIG","addresses":["185f5hrF85wa4bjYK2fJCoozi1qP6jhk9y"],"type":"pubkeyhash"}
             * spentTxId : null
             * spentIndex : null
             * spentHeight : null
             */

            @SerializedName("value")
            var value: String = ""
            @SerializedName("n")
            var n: Int = 0
            @SerializedName("scriptPubKey")
            var scriptPubKey: ScriptPubKeyBean? = null
            @SerializedName("spentTxId")
            var spentTxId: Any? = null
            @SerializedName("spentIndex")
            var spentIndex: Any? = null
            @SerializedName("spentHeight")
            var spentHeight: Any? = null

            class ScriptPubKeyBean : Serializable {
                /**
                 * hex : 76a9144daa5535243de20092a3b666322aefb75b590d9088ac
                 * asm : OP_DUP OP_HASH160 4daa5535243de20092a3b666322aefb75b590d90 OP_EQUALVERIFY OP_CHECKSIG
                 * addresses : ["185f5hrF85wa4bjYK2fJCoozi1qP6jhk9y"]
                 * type : pubkeyhash
                 */

                @SerializedName("hex")
                var hex: String = ""
                @SerializedName("asm")
                var asm: String = ""
                @SerializedName("type")
                var type: String = ""
                @SerializedName("addresses")
                var addresses: List<String> = arrayListOf()
            }
        }
    }
}
