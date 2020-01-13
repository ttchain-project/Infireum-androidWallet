package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ApiBlockChainBtcTransactionListResponse : Serializable {

    //    "hash160": "4aa76e3c743e0765c5960916cc8bacdfd28ca4e4",
    //            "address": "17ojaUjas5K1zDrzhFknFxsBg3JdeL97UJ",
    //            "n_tx": 153,
    //            "total_received": 5644196,
    //            "total_sent": 5627558,
    //            "final_balance": 16638,
    //            "txs": []

    @SerializedName("n_tx")
    var totalItems: Int = 0
    //    @SerializedName("from")
    //    private int from;
    //    @SerializedName("to")
    //    private int to;
    //    public int getFrom() {
    //        return from;
    //    }
    //
    //    public void setFrom(int from) {
    //        this.from = from;
    //    }
    //
    //    public int getTo() {
    //        return to;
    //    }
    //
    //    public void setTo(int to) {
    //        this.to = to;
    //    }

    @SerializedName("txs")
    var items: List<ItemsBean> = arrayListOf()

    class ItemsBean : Serializable {
        //        "ver":2,
        //        "inputs":[],
        //        "weight":1664,
        //        "relayed_by":"0.0.0.0",
        //        "out":[],
        //        "lock_time":0,
        //        "result":0,
        //        "size":416,
        //        "time":1558491698,
        //        "tx_index":450188934,
        //        "vin_sz":2,
        //        "hash":"5851afa111629616f78a189905f37e989729b54299bc598c7240f2c68f40ae5e",
        //        "vout_sz":3

        @SerializedName("hash")
        var txid: String = ""
        @SerializedName("ver")
        var version: Int = 0
        @SerializedName("lock_time")
        var locktime: Int = 0
        @SerializedName("block_height") // block_index現在只回傳 0
        var blockheight: Int = 0
        //        @SerializedName("confirmations")
        //        private int confirmations;
        //        public int getConfirmations() {
        //            return confirmations;
        //        }
        //
        //        public void setConfirmations(int confirmations) {
        //            this.confirmations = confirmations;
        //        }

        @SerializedName("time")
        var time: Long = 0
        @SerializedName("vout_sz")
        var valueOut: Double = 0.toDouble()
        @SerializedName("size")
        var size: Int = 0
        @SerializedName("vin_sz")
        var valueIn: Double = 0.toDouble()
        //        @SerializedName("fees")
        //        private double fees;
        //        public double getFees() {
        //            return fees;
        //        }
        //
        //        public void setFees(double fees) {
        //            this.fees = fees;
        //        }

        @SerializedName("inputs")
        var vin: List<VinBean> = arrayListOf()
        @SerializedName("out")
        var vout: List<VoutBean> = arrayListOf()

        class PrevOut : Serializable {

            @SerializedName("addr")
            val addr: String = ""
            @SerializedName("value")
            val value: Double = 0.toDouble()
        }

        class VinBean : Serializable {
            //            {
            //                "sequence":4294967295,
            //                    "witness":"",
            //                    "prev_out":{
            //                "spent":true,
            //                        "spending_outpoints":[
            //                {
            //                    "tx_index":450188934,
            //                        "n":0
            //                }
            //                ],
            //                "tx_index":447549712,
            //                        "type":0,
            //                        "addr":"17ojaUjas5K1zDrzhFknFxsBg3JdeL97UJ",
            //                        "value":50546,
            //                        "n":0,
            //                        "script":"76a9144aa76e3c743e0765c5960916cc8bacdfd28ca4e488ac"
            //            },
            //                "script":"473044022053305b511e6ee05e3fc2cc49ef8449e1e6649b68637af5ecf6397ae82c993b1f02207adc60ae6670c322a35d5885eee4c3ad0685ac3bb2bbc23c2db1fe7af4101bd40121031feed25e0705a2c3a1dd7a941e97fd8a0dc1d74bb2a3d68f10a2e2eed5df0841"
            //            }

            @SerializedName("prev_out")
            val prevOut: PrevOut = PrevOut()
        }

        class VoutBean : Serializable {
            //            {
            //                "spent":false,
            //                    "tx_index":450188934,
            //                    "type":0,
            //                    "addr":"16RmMmRGYoCugQAdfBRYoDPCU8CEpeUfqc",
            //                    "value":10000,
            //                    "n":0,
            //                    "script":"76a9143b87a3e595461b5d2e02a90f97f81b7a6468f19f88ac"
            //            }

            @SerializedName("value")
            val value: String = ""
            @SerializedName("addr")
            val addr: String = ""
        }
    }
}
