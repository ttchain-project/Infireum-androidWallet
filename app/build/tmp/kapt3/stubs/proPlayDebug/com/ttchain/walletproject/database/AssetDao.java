package com.ttchain.walletproject.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u00a8\u0006\u000e"}, d2 = {"Lcom/ttchain/walletproject/database/AssetDao;", "Lcom/ttchain/walletproject/database/BaseDao;", "Lcom/ttchain/walletproject/database/data/AssetData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAssetDataListByCoinIDs", "", "coinIds", "getAssetDataListByWalletID", "walletID", "getAssetDataListByWalletIDAndCoinID", "coinID", "app_proPlayDebug"})
public final class AssetDao extends com.ttchain.walletproject.database.BaseDao<com.ttchain.walletproject.database.data.AssetData, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByWalletID(int walletID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByWalletIDAndCoinID(int walletID, int coinID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.AssetData> getAssetDataListByCoinIDs(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> coinIds) {
        return null;
    }
    
    public AssetDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
}