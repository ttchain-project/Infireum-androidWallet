package com.ttchain.walletproject.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000eJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0003\u00a8\u0006\u0013"}, d2 = {"Lcom/ttchain/walletproject/database/LightningTransRecordDao;", "Lcom/ttchain/walletproject/database/BaseDao;", "Lcom/ttchain/walletproject/database/data/LightningTransRecordData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAll", "", "page", "limit", "", "getLightningTransRecordDataByTxId", "txId", "", "getLightningTransRecordDataListByAddress", "address", "getLightningTransRecordDataListByCoinId", "coin_Id", "app_proPlayDebug"})
public final class LightningTransRecordDao extends com.ttchain.walletproject.database.BaseDao<com.ttchain.walletproject.database.data.LightningTransRecordData, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getLightningTransRecordDataListByCoinId(int coin_Id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.LightningTransRecordData getLightningTransRecordDataByTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getLightningTransRecordDataListByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.LightningTransRecordData> getAll(int page, long limit) {
        return null;
    }
    
    public LightningTransRecordDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
}