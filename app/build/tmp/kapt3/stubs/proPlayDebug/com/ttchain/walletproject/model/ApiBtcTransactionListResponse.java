package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse;", "Ljava/io/Serializable;", "()V", "from", "", "getFrom", "()I", "setFrom", "(I)V", "items", "", "Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "to", "getTo", "setTo", "totalItems", "getTotalItems", "setTotalItems", "ItemsBean", "app_proPlayDebug"})
public final class ApiBtcTransactionListResponse implements java.io.Serializable {
    
    /**
     * totalItems : 4
     * from : 0
     * to : 1
     * items : [{"txid":"d1373e910d189f854f484078a569176ba42e3868da7cbd8c322033e1df7b777a","version":1,"locktime":0,"vin":[{"txid":"4a1b8cd687135acafd55ce9cdc67dc255d40062775dc0523a4d7fcc9e58bca32","vout":1,"scriptSig":{"asm":"30450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6[ALL] 04c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9","hex":"4830450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6014104c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9"},"sequence":4294967295,"n":0,"addr":"1Hpy4U6WQJgFovooHNfJ9ytAN2cX2wZH6y","valueSat":487500,"value":0.004875,"doubleSpentTxID":null}],"vout":[{"value":"0.00001000","n":0,"scriptPubKey":{"hex":"76a9144daa5535243de20092a3b666322aefb75b590d9088ac","asm":"OP_DUP OP_HASH160 4daa5535243de20092a3b666322aefb75b590d90 OP_EQUALVERIFY OP_CHECKSIG","addresses":["185f5hrF85wa4bjYK2fJCoozi1qP6jhk9y"],"type":"pubkeyhash"},"spentTxId":null,"spentIndex":null,"spentHeight":null},{"value":"0.00486200","n":1,"scriptPubKey":{"hex":"76a914b8945bed634551db53247dd560424759c1c97d6a88ac","asm":"OP_DUP OP_HASH160 b8945bed634551db53247dd560424759c1c97d6a OP_EQUALVERIFY OP_CHECKSIG","addresses":["1Hpy4U6WQJgFovooHNfJ9ytAN2cX2wZH6y"],"type":"pubkeyhash"},"spentTxId":null,"spentIndex":null,"spentHeight":null}],"blockheight":-1,"confirmations":0,"time":1534231064,"valueOut":0.004872,"size":258,"valueIn":0.004875,"fees":3.0E-6}]
     */
    @com.google.gson.annotations.SerializedName(value = "totalItems")
    private int totalItems;
    @com.google.gson.annotations.SerializedName(value = "from")
    private int from;
    @com.google.gson.annotations.SerializedName(value = "to")
    private int to;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean> items;
    
    public final int getTotalItems() {
        return 0;
    }
    
    public final void setTotalItems(int p0) {
    }
    
    public final int getFrom() {
        return 0;
    }
    
    public final void setFrom(int p0) {
    }
    
    public final int getTo() {
        return 0;
    }
    
    public final void setTo(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean> p0) {
    }
    
    public ApiBtcTransactionListResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u000289B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001e\u0010\'\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011R\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR$\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\b\u0012\u0004\u0012\u0002050.8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00101\"\u0004\b7\u00103\u00a8\u0006:"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean;", "Ljava/io/Serializable;", "()V", "blockheight", "", "getBlockheight", "()I", "setBlockheight", "(I)V", "confirmations", "getConfirmations", "setConfirmations", "fees", "", "getFees", "()D", "setFees", "(D)V", "locktime", "getLocktime", "setLocktime", "size", "getSize", "setSize", "time", "", "getTime", "()J", "setTime", "(J)V", "txid", "", "getTxid", "()Ljava/lang/String;", "setTxid", "(Ljava/lang/String;)V", "valueIn", "getValueIn", "setValueIn", "valueOut", "getValueOut", "setValueOut", "version", "getVersion", "setVersion", "vin", "", "Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VinBean;", "getVin", "()Ljava/util/List;", "setVin", "(Ljava/util/List;)V", "vout", "Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VoutBean;", "getVout", "setVout", "VinBean", "VoutBean", "app_proPlayDebug"})
    public static final class ItemsBean implements java.io.Serializable {
        
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
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "txid")
        private java.lang.String txid;
        @com.google.gson.annotations.SerializedName(value = "version")
        private int version;
        @com.google.gson.annotations.SerializedName(value = "locktime")
        private int locktime;
        @com.google.gson.annotations.SerializedName(value = "blockheight")
        private int blockheight;
        @com.google.gson.annotations.SerializedName(value = "confirmations")
        private int confirmations;
        @com.google.gson.annotations.SerializedName(value = "time")
        private long time;
        @com.google.gson.annotations.SerializedName(value = "valueOut")
        private double valueOut;
        @com.google.gson.annotations.SerializedName(value = "size")
        private int size;
        @com.google.gson.annotations.SerializedName(value = "valueIn")
        private double valueIn;
        @com.google.gson.annotations.SerializedName(value = "fees")
        private double fees;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "vin")
        private java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VinBean> vin;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "vout")
        private java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VoutBean> vout;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTxid() {
            return null;
        }
        
        public final void setTxid(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getVersion() {
            return 0;
        }
        
        public final void setVersion(int p0) {
        }
        
        public final int getLocktime() {
            return 0;
        }
        
        public final void setLocktime(int p0) {
        }
        
        public final int getBlockheight() {
            return 0;
        }
        
        public final void setBlockheight(int p0) {
        }
        
        public final int getConfirmations() {
            return 0;
        }
        
        public final void setConfirmations(int p0) {
        }
        
        public final long getTime() {
            return 0L;
        }
        
        public final void setTime(long p0) {
        }
        
        public final double getValueOut() {
            return 0.0;
        }
        
        public final void setValueOut(double p0) {
        }
        
        public final int getSize() {
            return 0;
        }
        
        public final void setSize(int p0) {
        }
        
        public final double getValueIn() {
            return 0.0;
        }
        
        public final void setValueIn(double p0) {
        }
        
        public final double getFees() {
            return 0.0;
        }
        
        public final void setFees(double p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VinBean> getVin() {
            return null;
        }
        
        public final void setVin(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VinBean> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VoutBean> getVout() {
            return null;
        }
        
        public final void setVout(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VoutBean> p0) {
        }
        
        public ItemsBean() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u00002\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u00020%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\'\"\u0004\b,\u0010)R\u001e\u0010-\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014\u00a8\u00061"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VinBean;", "Ljava/io/Serializable;", "()V", "addr", "", "getAddr", "()Ljava/lang/String;", "setAddr", "(Ljava/lang/String;)V", "doubleSpentTxID", "", "getDoubleSpentTxID", "()Ljava/lang/Object;", "setDoubleSpentTxID", "(Ljava/lang/Object;)V", "n", "", "getN", "()I", "setN", "(I)V", "scriptSig", "Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VinBean$ScriptSigBean;", "getScriptSig", "()Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VinBean$ScriptSigBean;", "setScriptSig", "(Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VinBean$ScriptSigBean;)V", "sequence", "", "getSequence", "()J", "setSequence", "(J)V", "txid", "getTxid", "setTxid", "value", "", "getValue", "()D", "setValue", "(D)V", "valueSat", "getValueSat", "setValueSat", "vout", "getVout", "setVout", "ScriptSigBean", "app_proPlayDebug"})
        public static final class VinBean implements java.io.Serializable {
            
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
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "txid")
            private java.lang.String txid;
            @com.google.gson.annotations.SerializedName(value = "vout")
            private int vout;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.SerializedName(value = "scriptSig")
            private com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VinBean.ScriptSigBean scriptSig;
            @com.google.gson.annotations.SerializedName(value = "sequence")
            private long sequence;
            @com.google.gson.annotations.SerializedName(value = "n")
            private int n;
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "addr")
            private java.lang.String addr;
            @com.google.gson.annotations.SerializedName(value = "valueSat")
            private double valueSat;
            @com.google.gson.annotations.SerializedName(value = "value")
            private double value;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.SerializedName(value = "doubleSpentTxID")
            private java.lang.Object doubleSpentTxID;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getTxid() {
                return null;
            }
            
            public final void setTxid(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int getVout() {
                return 0;
            }
            
            public final void setVout(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VinBean.ScriptSigBean getScriptSig() {
                return null;
            }
            
            public final void setScriptSig(@org.jetbrains.annotations.Nullable()
            com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VinBean.ScriptSigBean p0) {
            }
            
            public final long getSequence() {
                return 0L;
            }
            
            public final void setSequence(long p0) {
            }
            
            public final int getN() {
                return 0;
            }
            
            public final void setN(int p0) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getAddr() {
                return null;
            }
            
            public final void setAddr(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final double getValueSat() {
                return 0.0;
            }
            
            public final void setValueSat(double p0) {
            }
            
            public final double getValue() {
                return 0.0;
            }
            
            public final void setValue(double p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getDoubleSpentTxID() {
                return null;
            }
            
            public final void setDoubleSpentTxID(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public VinBean() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VinBean$ScriptSigBean;", "Ljava/io/Serializable;", "()V", "asm", "", "getAsm", "()Ljava/lang/String;", "setAsm", "(Ljava/lang/String;)V", "hex", "getHex", "setHex", "app_proPlayDebug"})
            public static final class ScriptSigBean implements java.io.Serializable {
                
                /**
                 * asm : 30450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6[ALL] 04c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9
                 * hex : 4830450221009bc8de5b684c3b05542f6cab6f874b8a86bb4c96a621fb940a3e9a749f658d9c02207ab3025424a85cd7f62f45e0aab1af2ed8cc768774d748fe3757954b801beae6014104c9e00b442c6254f800e376734e24a146113e34a696ff10c1bf785da3d4a12630a667d91ef798e99b73a1cb279225f32b4ab681d2894a8c125d78fd1b4a049fb9
                 */
                @org.jetbrains.annotations.Nullable()
                @com.google.gson.annotations.SerializedName(value = "asm")
                private java.lang.String asm;
                @org.jetbrains.annotations.Nullable()
                @com.google.gson.annotations.SerializedName(value = "hex")
                private java.lang.String hex;
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getAsm() {
                    return null;
                }
                
                public final void setAsm(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.Nullable()
                public final java.lang.String getHex() {
                    return null;
                }
                
                public final void setHex(@org.jetbrains.annotations.Nullable()
                java.lang.String p0) {
                }
                
                public ScriptSigBean() {
                    super();
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R \u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006\""}, d2 = {"Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VoutBean;", "Ljava/io/Serializable;", "()V", "n", "", "getN", "()I", "setN", "(I)V", "scriptPubKey", "Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VoutBean$ScriptPubKeyBean;", "getScriptPubKey", "()Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VoutBean$ScriptPubKeyBean;", "setScriptPubKey", "(Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VoutBean$ScriptPubKeyBean;)V", "spentHeight", "", "getSpentHeight", "()Ljava/lang/Object;", "setSpentHeight", "(Ljava/lang/Object;)V", "spentIndex", "getSpentIndex", "setSpentIndex", "spentTxId", "getSpentTxId", "setSpentTxId", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "ScriptPubKeyBean", "app_proPlayDebug"})
        public static final class VoutBean implements java.io.Serializable {
            
            /**
             * value : 0.00001000
             * n : 0
             * scriptPubKey : {"hex":"76a9144daa5535243de20092a3b666322aefb75b590d9088ac","asm":"OP_DUP OP_HASH160 4daa5535243de20092a3b666322aefb75b590d90 OP_EQUALVERIFY OP_CHECKSIG","addresses":["185f5hrF85wa4bjYK2fJCoozi1qP6jhk9y"],"type":"pubkeyhash"}
             * spentTxId : null
             * spentIndex : null
             * spentHeight : null
             */
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "value")
            private java.lang.String value;
            @com.google.gson.annotations.SerializedName(value = "n")
            private int n;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.SerializedName(value = "scriptPubKey")
            private com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VoutBean.ScriptPubKeyBean scriptPubKey;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.SerializedName(value = "spentTxId")
            private java.lang.Object spentTxId;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.SerializedName(value = "spentIndex")
            private java.lang.Object spentIndex;
            @org.jetbrains.annotations.Nullable()
            @com.google.gson.annotations.SerializedName(value = "spentHeight")
            private java.lang.Object spentHeight;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getValue() {
                return null;
            }
            
            public final void setValue(@org.jetbrains.annotations.NotNull()
            java.lang.String p0) {
            }
            
            public final int getN() {
                return 0;
            }
            
            public final void setN(int p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VoutBean.ScriptPubKeyBean getScriptPubKey() {
                return null;
            }
            
            public final void setScriptPubKey(@org.jetbrains.annotations.Nullable()
            com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean.VoutBean.ScriptPubKeyBean p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSpentTxId() {
                return null;
            }
            
            public final void setSpentTxId(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSpentIndex() {
                return null;
            }
            
            public final void setSpentIndex(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.lang.Object getSpentHeight() {
                return null;
            }
            
            public final void setSpentHeight(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
            }
            
            public VoutBean() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean$VoutBean$ScriptPubKeyBean;", "Ljava/io/Serializable;", "()V", "addresses", "", "", "getAddresses", "()Ljava/util/List;", "setAddresses", "(Ljava/util/List;)V", "asm", "getAsm", "()Ljava/lang/String;", "setAsm", "(Ljava/lang/String;)V", "hex", "getHex", "setHex", "type", "getType", "setType", "app_proPlayDebug"})
            public static final class ScriptPubKeyBean implements java.io.Serializable {
                
                /**
                 * hex : 76a9144daa5535243de20092a3b666322aefb75b590d9088ac
                 * asm : OP_DUP OP_HASH160 4daa5535243de20092a3b666322aefb75b590d90 OP_EQUALVERIFY OP_CHECKSIG
                 * addresses : ["185f5hrF85wa4bjYK2fJCoozi1qP6jhk9y"]
                 * type : pubkeyhash
                 */
                @org.jetbrains.annotations.NotNull()
                @com.google.gson.annotations.SerializedName(value = "hex")
                private java.lang.String hex;
                @org.jetbrains.annotations.NotNull()
                @com.google.gson.annotations.SerializedName(value = "asm")
                private java.lang.String asm;
                @org.jetbrains.annotations.NotNull()
                @com.google.gson.annotations.SerializedName(value = "type")
                private java.lang.String type;
                @org.jetbrains.annotations.NotNull()
                @com.google.gson.annotations.SerializedName(value = "addresses")
                private java.util.List<java.lang.String> addresses;
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getHex() {
                    return null;
                }
                
                public final void setHex(@org.jetbrains.annotations.NotNull()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getAsm() {
                    return null;
                }
                
                public final void setAsm(@org.jetbrains.annotations.NotNull()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.lang.String getType() {
                    return null;
                }
                
                public final void setType(@org.jetbrains.annotations.NotNull()
                java.lang.String p0) {
                }
                
                @org.jetbrains.annotations.NotNull()
                public final java.util.List<java.lang.String> getAddresses() {
                    return null;
                }
                
                public final void setAddresses(@org.jetbrains.annotations.NotNull()
                java.util.List<java.lang.String> p0) {
                }
                
                public ScriptPubKeyBean() {
                    super();
                }
            }
        }
    }
}