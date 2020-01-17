package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000eJ\u0016\u00109\u001a\u00020\u000e2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u000eJ\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020*H\u0016J\u0010\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020\u000eH\u0016J\u000e\u0010?\u001a\u00020*2\u0006\u0010>\u001a\u00020\u000eJ\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u00106\u001a\u000207H\u0016J\u0016\u0010B\u001a\u00020\u000e2\u0006\u0010>\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000eJ\u000e\u0010D\u001a\u00020;2\u0006\u0010E\u001a\u00020\u000eJ\u000e\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u000207J\u0010\u0010H\u001a\u00020I2\u0006\u00106\u001a\u000207H\u0016J\u0016\u0010J\u001a\u00020\u000e2\u0006\u00106\u001a\u0002072\u0006\u0010K\u001a\u00020*J\u000e\u0010L\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000eJ\u0016\u0010M\u001a\u00020N2\u0006\u00106\u001a\u0002072\u0006\u0010O\u001a\u00020\u000eJ\u001e\u0010P\u001a\u00020N2\u0006\u00106\u001a\u0002072\u0006\u0010K\u001a\u00020*2\u0006\u0010O\u001a\u00020\u000eR\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010\u001f\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0011\u0010!\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0010R\u0014\u0010#\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u0010R\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u0011\u0010)\u001a\u00020*8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0010R\u0014\u0010/\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u0010(R\u0014\u00101\u001a\u00020*8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010,\u00a8\u0006Q"}, d2 = {"Lcom/ttchain/walletproject/repository/BaseMainModel;", "", "mApiHelper", "Lcom/ttchain/walletproject/model/ApiHelper;", "mUserHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "mDbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "(Lcom/ttchain/walletproject/model/ApiHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/model/DbHelper;)V", "identityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "getIdentityData", "()Lcom/ttchain/walletproject/database/data/IdentityData;", "identityId", "", "getIdentityId", "()Ljava/lang/String;", "jPushExtras", "getJPushExtras", "jPushRegistrationId", "getJPushRegistrationId", "lang", "getLang", "getMApiHelper", "()Lcom/ttchain/walletproject/model/ApiHelper;", "getMDbHelper", "()Lcom/ttchain/walletproject/model/DbHelper;", "getMUserHelper", "()Lcom/ttchain/walletproject/model/UserHelper;", "rocketChatAuthToken", "getRocketChatAuthToken", "rocketChatUid", "getRocketChatUid", "rocketChatUserId", "getRocketChatUserId", "saveTmpFileName", "getSaveTmpFileName", "selectedWalletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getSelectedWalletData", "()Lcom/ttchain/walletproject/database/data/WalletData;", "selectedWalletID", "", "getSelectedWalletID", "()I", "selectionWalletCategory", "getSelectionWalletCategory", "ttnWalletData", "getTtnWalletData", "ttnWalletID", "getTtnWalletID", "clearJPushExtras", "", "decryptString", "context", "Landroid/content/Context;", "string", "encryptString", "getCoinDataByCoinID", "Lcom/ttchain/walletproject/database/data/CoinData;", "coinID", "getCoinDataByCoinId", "coinId", "getCoinIDByCoinId", "getExternalFilesDir", "Ljava/io/File;", "getFiat", "amount", "getMainCoinDataByAddress", "address", "getRawPwd", "mContext", "getSaveTmpFileUri", "Landroid/net/Uri;", "getWalletEpKey", "walletID", "getWalletTitleNameByAddress", "verifyIdentityPwd", "", "pwd", "verifyWalletPwd", "app_proPlayDebug"})
public class BaseMainModel {
    @org.jetbrains.annotations.NotNull()
    private final com.ttchain.walletproject.model.ApiHelper mApiHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ttchain.walletproject.model.UserHelper mUserHelper = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ttchain.walletproject.model.DbHelper mDbHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLang() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getIdentityId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.IdentityData getIdentityData() {
        return null;
    }
    
    public final int getSelectedWalletID() {
        return 0;
    }
    
    public int getTtnWalletID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.ttchain.walletproject.database.data.WalletData getTtnWalletData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getSelectedWalletData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketChatUid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketChatUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRocketChatAuthToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectionWalletCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJPushRegistrationId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJPushExtras() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getSaveTmpFileName() {
        return null;
    }
    
    public final boolean verifyIdentityPwd(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return false;
    }
    
    public final boolean verifyWalletPwd(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int walletID, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String encryptString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String decryptString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRawPwd(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletEpKey(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int walletID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletTitleNameByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public final int getCoinIDByCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.ttchain.walletproject.database.data.CoinData getCoinDataByCoinID(int coinID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.ttchain.walletproject.database.data.CoinData getCoinDataByCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinData getMainCoinDataByAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public final void clearJPushExtras() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiat(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.lang.String amount) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.io.File getExternalFilesDir(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public android.net.Uri getSaveTmpFileUri(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.ttchain.walletproject.model.ApiHelper getMApiHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.ttchain.walletproject.model.UserHelper getMUserHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.DbHelper getMDbHelper() {
        return null;
    }
    
    public BaseMainModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.ApiHelper mApiHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper mUserHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper mDbHelper) {
        super();
    }
}