package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u0006\u0010\u0015\u001a\u00020\nJ\u0016\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ttchain/walletproject/repository/VerifyRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "context", "Landroid/content/Context;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Landroid/content/Context;)V", "decryptString", "", "string", "encryptString", "getIdentityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "getWalletEpKey", "walletID", "", "verifyIdentityPwd", "", "pwd", "verifyIdentityPwdHint", "verifyWalletPwd", "app_proPlayDebug"})
public final class VerifyRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.IdentityData getIdentityData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String verifyIdentityPwdHint() {
        return null;
    }
    
    public final boolean verifyIdentityPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return false;
    }
    
    public final boolean verifyWalletPwd(int walletID, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String encryptString(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletEpKey(int walletID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String decryptString(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    public VerifyRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}