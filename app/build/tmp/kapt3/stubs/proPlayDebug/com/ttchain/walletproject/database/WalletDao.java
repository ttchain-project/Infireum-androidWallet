package com.ttchain.walletproject.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0003J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003\u00a8\u0006\u0016"}, d2 = {"Lcom/ttchain/walletproject/database/WalletDao;", "Lcom/ttchain/walletproject/database/BaseDao;", "Lcom/ttchain/walletproject/database/data/WalletData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getDefaultSelectedWalletDataByIdentityID", "identityID", "getDefaultWalletTypeWalletData", "getIsFromSystemWalletListData", "", "status", "", "getWalletByName", "string", "", "getWalletDataByAddress", "address", "getWalletDataListByWalletType", "walletType", "getWalletDataListCountByWalletType", "app_proPlayDebug"})
public final class WalletDao extends com.ttchain.walletproject.database.BaseDao<com.ttchain.walletproject.database.data.WalletData, java.lang.Integer> {
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.WalletData> getIsFromSystemWalletListData(boolean status) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.WalletData getDefaultSelectedWalletDataByIdentityID(int identityID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getDefaultWalletTypeWalletData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getWalletByName(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataListByWalletType(int walletType) {
        return null;
    }
    
    public final int getWalletDataListCountByWalletType(int walletType) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getWalletDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public WalletDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null, null);
    }
}