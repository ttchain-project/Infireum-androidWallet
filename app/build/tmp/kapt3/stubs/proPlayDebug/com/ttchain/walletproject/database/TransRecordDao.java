package com.ttchain.walletproject.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0003J<\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/ttchain/walletproject/database/TransRecordDao;", "Lcom/ttchain/walletproject/database/BaseDao;", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getLatestTransRecordDataByAddress", "address", "", "getTransRecordDataByTxId", "txId", "getTransRecordDataListByAddress", "", "getTransRecordDataListByCoinID", "coinID", "getTransRecordDataListByCondition", "walletAddress", "state", "page", "limit", "", "app_proPlayDebug"})
public final class TransRecordDao extends com.ttchain.walletproject.database.BaseDao<com.ttchain.walletproject.database.data.TransRecordData, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByCoinID(int coinID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getTransRecordDataListByCondition(@org.jetbrains.annotations.NotNull()
    java.lang.String walletAddress, int coinID, int state, int page, long limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.TransRecordData getTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
        return null;
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
    
    public TransRecordDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
}