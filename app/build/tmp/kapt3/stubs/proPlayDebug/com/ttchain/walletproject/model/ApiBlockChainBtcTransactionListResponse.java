package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse;", "Ljava/io/Serializable;", "()V", "items", "", "Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "totalItems", "", "getTotalItems", "()I", "setTotalItems", "(I)V", "ItemsBean", "app_proPlayDebug"})
public final class ApiBlockChainBtcTransactionListResponse implements java.io.Serializable {
    @com.google.gson.annotations.SerializedName(value = "n_tx")
    private int totalItems;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "txs")
    private java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean> items;
    
    public final int getTotalItems() {
        return 0;
    }
    
    public final void setTotalItems(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean> p0) {
    }
    
    public ApiBlockChainBtcTransactionListResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003234B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR$\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\b\u0012\u0004\u0012\u00020/0(8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-\u00a8\u00065"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean;", "Ljava/io/Serializable;", "()V", "blockheight", "", "getBlockheight", "()I", "setBlockheight", "(I)V", "locktime", "getLocktime", "setLocktime", "size", "getSize", "setSize", "time", "", "getTime", "()J", "setTime", "(J)V", "txid", "", "getTxid", "()Ljava/lang/String;", "setTxid", "(Ljava/lang/String;)V", "valueIn", "", "getValueIn", "()D", "setValueIn", "(D)V", "valueOut", "getValueOut", "setValueOut", "version", "getVersion", "setVersion", "vin", "", "Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean$VinBean;", "getVin", "()Ljava/util/List;", "setVin", "(Ljava/util/List;)V", "vout", "Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean$VoutBean;", "getVout", "setVout", "PrevOut", "VinBean", "VoutBean", "app_proPlayDebug"})
    public static final class ItemsBean implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "hash")
        private java.lang.String txid;
        @com.google.gson.annotations.SerializedName(value = "ver")
        private int version;
        @com.google.gson.annotations.SerializedName(value = "lock_time")
        private int locktime;
        @com.google.gson.annotations.SerializedName(value = "block_height")
        private int blockheight;
        @com.google.gson.annotations.SerializedName(value = "time")
        private long time;
        @com.google.gson.annotations.SerializedName(value = "vout_sz")
        private double valueOut;
        @com.google.gson.annotations.SerializedName(value = "size")
        private int size;
        @com.google.gson.annotations.SerializedName(value = "vin_sz")
        private double valueIn;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "inputs")
        private java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean.VinBean> vin;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "out")
        private java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean.VoutBean> vout;
        
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
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean.VinBean> getVin() {
            return null;
        }
        
        public final void setVin(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean.VinBean> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean.VoutBean> getVout() {
            return null;
        }
        
        public final void setVout(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean.VoutBean> p0) {
        }
        
        public ItemsBean() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean$PrevOut;", "Ljava/io/Serializable;", "()V", "addr", "", "getAddr", "()Ljava/lang/String;", "value", "", "getValue", "()D", "app_proPlayDebug"})
        public static final class PrevOut implements java.io.Serializable {
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "addr")
            private final java.lang.String addr = "";
            @com.google.gson.annotations.SerializedName(value = "value")
            private final double value = 0.0;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getAddr() {
                return null;
            }
            
            public final double getValue() {
                return 0.0;
            }
            
            public PrevOut() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean$VinBean;", "Ljava/io/Serializable;", "()V", "prevOut", "Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean$PrevOut;", "getPrevOut", "()Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean$PrevOut;", "app_proPlayDebug"})
        public static final class VinBean implements java.io.Serializable {
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "prev_out")
            private final com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean.PrevOut prevOut = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean.PrevOut getPrevOut() {
                return null;
            }
            
            public VinBean() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean$VoutBean;", "Ljava/io/Serializable;", "()V", "addr", "", "getAddr", "()Ljava/lang/String;", "value", "getValue", "app_proPlayDebug"})
        public static final class VoutBean implements java.io.Serializable {
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "value")
            private final java.lang.String value = "";
            @org.jetbrains.annotations.NotNull()
            @com.google.gson.annotations.SerializedName(value = "addr")
            private final java.lang.String addr = "";
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getValue() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getAddr() {
                return null;
            }
            
            public VoutBean() {
                super();
            }
        }
    }
}