package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/ttchain/walletproject/repository/BalanceRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "(Lcom/ttchain/walletproject/model/DbHelper;)V", "createBalanceBean", "Lcom/ttchain/walletproject/model/BalanceBean;", "address", "", "coinId", "balance", "getAssetDataList", "", "response", "getBalanceQueryMap", "", "updateAssetData", "", "balanceBean", "app_proPlayDebug"})
public final class BalanceRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public final java.util.Map<java.lang.String, java.lang.String> getBalanceQueryMap(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public final java.util.List<com.ttchain.walletproject.model.BalanceBean> getAssetDataList(@org.jetbrains.annotations.NotNull()
    java.lang.String response, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    public final boolean updateAssetData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.BalanceBean balanceBean) {
        return false;
    }
    
    private final com.ttchain.walletproject.model.BalanceBean createBalanceBean(java.lang.String address, java.lang.String coinId, java.lang.String balance) {
        return null;
    }
    
    public BalanceRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper) {
        super();
    }
}