package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010#\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020&H\u0002J\u0010\u0010\'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u001cH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006)"}, d2 = {"Lcom/ttchain/walletproject/model/BtcRecordModel;", "", "()V", "mCoinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getMCoinData", "()Lcom/ttchain/walletproject/database/data/CoinData;", "setMCoinData", "(Lcom/ttchain/walletproject/database/data/CoinData;)V", "mUserTransAddress", "", "getMUserTransAddress", "()Ljava/lang/String;", "setMUserTransAddress", "(Ljava/lang/String;)V", "getBlockNumber", "data", "Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean;", "getBtcTransactionRecordDataList", "", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "dataList", "getFormatTimeInDefaultLocale", "time", "", "getPayFromAddress", "getReceiptToAddress", "getStatus", "", "getTime", "timeStampString", "getTotalMinerFee", "Ljava/math/BigDecimal;", "getTransAmount", "getTransTime", "getTransTxId", "isConfirmations", "", "Lcom/ttchain/walletproject/model/ApiBtcTransactionListResponse$ItemsBean;", "transStatusToString", "status", "app_proPlayDebug"})
public final class BtcRecordModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mUserTransAddress;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData mCoinData;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMUserTransAddress() {
        return null;
    }
    
    public final void setMUserTransAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getMCoinData() {
        return null;
    }
    
    public final void setMCoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getBtcTransactionRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean> dataList) {
        return null;
    }
    
    private final java.lang.String getTransTxId(com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean data) {
        return null;
    }
    
    private final boolean isConfirmations(com.ttchain.walletproject.model.ApiBtcTransactionListResponse.ItemsBean data) {
        return false;
    }
    
    private final int getStatus(com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean data) {
        return 0;
    }
    
    private final java.lang.String getReceiptToAddress(com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean data) {
        return null;
    }
    
    private final java.lang.String getPayFromAddress(com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean data) {
        return null;
    }
    
    private final java.math.BigDecimal getTransAmount(com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean data) {
        return null;
    }
    
    private final java.math.BigDecimal getTotalMinerFee(com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean data) {
        return null;
    }
    
    private final java.lang.String getTransTime(com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean data) {
        return null;
    }
    
    private final java.lang.String getBlockNumber(com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean data) {
        return null;
    }
    
    private final java.lang.String getTime(java.lang.String timeStampString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormatTimeInDefaultLocale(long time) {
        return null;
    }
    
    private final java.lang.String transStatusToString(int status) {
        return null;
    }
    
    public BtcRecordModel() {
        super();
    }
}