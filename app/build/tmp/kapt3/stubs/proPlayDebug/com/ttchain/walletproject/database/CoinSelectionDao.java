package com.ttchain.walletproject.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lcom/ttchain/walletproject/database/CoinSelectionDao;", "Lcom/ttchain/walletproject/database/BaseDao;", "Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCoinSelectionDataListByWalletID", "", "_id", "getIsSelectedCoinSelectionDataListByWalletID", "walletId", "status", "", "app_proPlayDebug"})
public final class CoinSelectionDao extends com.ttchain.walletproject.database.BaseDao<com.ttchain.walletproject.database.data.CoinSelectionData, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getCoinSelectionDataListByWalletID(int _id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getIsSelectedCoinSelectionDataListByWalletID(int walletId, boolean status) {
        return null;
    }
    
    public CoinSelectionDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
}