package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0013H\u0002J\u0010\u00100\u001a\u0002012\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00104\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u00105\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002J\u001a\u00106\u001a\b\u0012\u0004\u0012\u000208072\f\u00109\u001a\b\u0012\u0004\u0012\u00020&07J\u0012\u0010:\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020-H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b\u00a8\u0006="}, d2 = {"Lcom/ttchain/walletproject/model/TtnTransRecordModel;", "", "()V", "btcnCoinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getBtcnCoinData", "()Lcom/ttchain/walletproject/database/data/CoinData;", "setBtcnCoinData", "(Lcom/ttchain/walletproject/database/data/CoinData;)V", "dai1CoinData", "getDai1CoinData", "setDai1CoinData", "ethnCoinData", "getEthnCoinData", "setEthnCoinData", "exrCoinData", "getExrCoinData", "setExrCoinData", "mUserTransAddress", "", "getMUserTransAddress", "()Ljava/lang/String;", "setMUserTransAddress", "(Ljava/lang/String;)V", "mccCoinData", "getMccCoinData", "setMccCoinData", "ttnCoinData", "getTtnCoinData", "setTtnCoinData", "tusd1CoinData", "getTusd1CoinData", "setTusd1CoinData", "usdtnCoinData", "getUsdtnCoinData", "setUsdtnCoinData", "getBlockNumber", "data", "Lcom/ttchain/walletproject/model/TtnTransactionData;", "getFormatTimeInDefaultLocale", "time", "", "getPayFromAddress", "getReceiptToAddress", "getStatus", "", "getTime", "timeStampString", "getTotalMinerFee", "Ljava/math/BigDecimal;", "getTransAmount", "mCoinData", "getTransTime", "getTransTxId", "getTtnTransactionRecordDataList", "", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "dataList", "getTxCoinData", "transStatusToString", "status", "app_proPlayDebug"})
public final class TtnTransRecordModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mUserTransAddress;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData ttnCoinData;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData btcnCoinData;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData usdtnCoinData;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData ethnCoinData;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData exrCoinData;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData mccCoinData;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData dai1CoinData;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData tusd1CoinData;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMUserTransAddress() {
        return null;
    }
    
    public final void setMUserTransAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getTtnCoinData() {
        return null;
    }
    
    public final void setTtnCoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getBtcnCoinData() {
        return null;
    }
    
    public final void setBtcnCoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getUsdtnCoinData() {
        return null;
    }
    
    public final void setUsdtnCoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getEthnCoinData() {
        return null;
    }
    
    public final void setEthnCoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getExrCoinData() {
        return null;
    }
    
    public final void setExrCoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getMccCoinData() {
        return null;
    }
    
    public final void setMccCoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getDai1CoinData() {
        return null;
    }
    
    public final void setDai1CoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getTusd1CoinData() {
        return null;
    }
    
    public final void setTusd1CoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTtnTransactionRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.TtnTransactionData> dataList) {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getTxCoinData(com.ttchain.walletproject.model.TtnTransactionData data) {
        return null;
    }
    
    private final java.lang.String getTransTxId(com.ttchain.walletproject.model.TtnTransactionData data) {
        return null;
    }
    
    private final int getStatus(com.ttchain.walletproject.model.TtnTransactionData data) {
        return 0;
    }
    
    private final java.lang.String getReceiptToAddress(com.ttchain.walletproject.model.TtnTransactionData data) {
        return null;
    }
    
    private final java.lang.String getPayFromAddress(com.ttchain.walletproject.model.TtnTransactionData data) {
        return null;
    }
    
    private final java.math.BigDecimal getTransAmount(com.ttchain.walletproject.database.data.CoinData mCoinData, com.ttchain.walletproject.model.TtnTransactionData data) {
        return null;
    }
    
    private final java.math.BigDecimal getTotalMinerFee(com.ttchain.walletproject.model.TtnTransactionData data) {
        return null;
    }
    
    private final java.lang.String getTransTime(com.ttchain.walletproject.model.TtnTransactionData data) {
        return null;
    }
    
    private final java.lang.String getBlockNumber(com.ttchain.walletproject.model.TtnTransactionData data) {
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
    
    public TtnTransRecordModel() {
        super();
    }
}