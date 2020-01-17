package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\rJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/ttchain/walletproject/repository/BaseCoinRecordRepository;", "", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "(Lcom/ttchain/walletproject/model/DbHelper;)V", "addTransRecordData", "", "data", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "addUsdtTransRecordData", "Lcom/ttchain/walletproject/database/data/UsdtTransRecordData;", "getLatestTransRecordDataByAddress", "address", "", "getLatestUsdtTransRecordDataByAddress", "getTransRecordDataByTxId", "txId", "getTransRecordDataListByAddress", "", "getUsdtTransRecordDataByTxId", "updateTransRecordData", "updateUsdtTransRecordData", "app_proPlayDebug"})
public final class BaseCoinRecordRepository {
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.TransRecordData getTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
        return null;
    }
    
    public final void addTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.TransRecordData data) {
    }
    
    public final void updateTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.TransRecordData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.TransRecordData getLatestTransRecordDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.UsdtTransRecordData getUsdtTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
        return null;
    }
    
    public final void addUsdtTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.UsdtTransRecordData data) {
    }
    
    public final void updateUsdtTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.UsdtTransRecordData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.UsdtTransRecordData getLatestUsdtTransRecordDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public BaseCoinRecordRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper) {
        super();
    }
}