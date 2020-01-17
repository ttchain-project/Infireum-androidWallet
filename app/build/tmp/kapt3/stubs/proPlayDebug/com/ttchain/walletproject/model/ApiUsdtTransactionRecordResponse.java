package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/ttchain/walletproject/model/ApiUsdtTransactionRecordResponse;", "Ljava/io/Serializable;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "currentPage", "", "getCurrentPage", "()I", "items", "", "Lcom/ttchain/walletproject/model/ApiUsdtTransactionRecordResponse$ItemsBean;", "getItems", "()Ljava/util/List;", "pages", "getPages", "ItemsBean", "app_proPlayDebug"})
public final class ApiUsdtTransactionRecordResponse implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "address")
    private final java.lang.String address = "";
    @com.google.gson.annotations.SerializedName(value = "current_page")
    private final int currentPage = 0;
    @com.google.gson.annotations.SerializedName(value = "pages")
    private final int pages = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "transactions")
    private final java.util.List<com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse.ItemsBean> items = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final int getPages() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse.ItemsBean> getItems() {
        return null;
    }
    
    public ApiUsdtTransactionRecordResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0016\u0010\u0017\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/ttchain/walletproject/model/ApiUsdtTransactionRecordResponse$ItemsBean;", "Ljava/io/Serializable;", "()V", "amount", "", "getAmount", "()Ljava/lang/String;", "block", "", "getBlock", "()I", "blocktime", "", "getBlocktime", "()J", "confirmations", "getConfirmations", "fee", "getFee", "referenceaddress", "getReferenceaddress", "sendingaddress", "getSendingaddress", "txid", "getTxid", "app_proPlayDebug"})
    public static final class ItemsBean implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "amount")
        private final java.lang.String amount = "";
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "referenceaddress")
        private final java.lang.String referenceaddress = "";
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "sendingaddress")
        private final java.lang.String sendingaddress = "";
        @com.google.gson.annotations.SerializedName(value = "blocktime")
        private final long blocktime = 0L;
        @com.google.gson.annotations.SerializedName(value = "block")
        private final int block = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "txid")
        private final java.lang.String txid = "";
        @com.google.gson.annotations.SerializedName(value = "confirmations")
        private final int confirmations = 0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "fee")
        private final java.lang.String fee = "";
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReferenceaddress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSendingaddress() {
            return null;
        }
        
        public final long getBlocktime() {
            return 0L;
        }
        
        public final int getBlock() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTxid() {
            return null;
        }
        
        public final int getConfirmations() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFee() {
            return null;
        }
        
        public ItemsBean() {
            super();
        }
    }
}