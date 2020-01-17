package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ttchain/walletproject/repository/RestoreRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;)V", "createCoinSelectionDataList", "", "createRestoreWalletData", "", "bean", "Lcom/ttchain/walletproject/model/UserBean;", "createUser", "userBean", "createWalletData", "walletName", "", "deleteWalletData", "id", "getRestoreTitleByMainCoinType", "context", "Landroid/content/Context;", "mainCoinType", "initAssetDataList", "isExistWalletAddress", "", "setSelectedWalletID", "app_proPlayDebug"})
public final class RestoreRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestoreTitleByMainCoinType(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int mainCoinType) {
        return null;
    }
    
    public final boolean isExistWalletAddress(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserBean bean) {
        return false;
    }
    
    public final int createWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserBean bean) {
        return 0;
    }
    
    public final int createWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserBean bean, @org.jetbrains.annotations.NotNull()
    java.lang.String walletName) {
        return 0;
    }
    
    public final int deleteWalletData(int id) {
        return 0;
    }
    
    public final int createUser(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.UserBean userBean) {
        return 0;
    }
    
    public final int createRestoreWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserBean bean) {
        return 0;
    }
    
    public final void createCoinSelectionDataList() {
    }
    
    public final void initAssetDataList() {
    }
    
    public final boolean setSelectedWalletID() {
        return false;
    }
    
    public RestoreRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper) {
        super();
    }
}