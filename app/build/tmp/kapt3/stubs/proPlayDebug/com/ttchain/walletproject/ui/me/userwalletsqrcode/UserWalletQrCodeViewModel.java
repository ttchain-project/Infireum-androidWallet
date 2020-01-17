package com.ttchain.walletproject.ui.me.userwalletsqrcode;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0&H\u0002J\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\'0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0&H\u0002J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0014\u001a\u00020\nJ\b\u0010/\u001a\u00020\nH\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\'0&H\u0002J\b\u00101\u001a\u00020\nH\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\'0&H\u0002J\u0006\u00103\u001a\u00020,J\b\u0010\u001b\u001a\u00020,H\u0002J\u0006\u00104\u001a\u00020,R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/ttchain/walletproject/ui/me/userwalletsqrcode/UserWalletQrCodeViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/repository/VerifyRepository;)V", "imageBeanJsonString", "", "getImageBeanJsonString", "()Ljava/lang/String;", "setImageBeanJsonString", "(Ljava/lang/String;)V", "performGetQrCodeBitmapLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "getPerformGetQrCodeBitmapLiveData", "()Landroidx/lifecycle/MutableLiveData;", "pwd", "getPwd", "setPwd", "qrCodeGeneratedTimeStamp", "", "getQrCodeGeneratedTimeStamp", "()J", "setQrCodeGeneratedTimeStamp", "(J)V", "storeQrCodeErrorLiveData", "", "getStoreQrCodeErrorLiveData", "setStoreQrCodeErrorLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "storeQrCodeLiveData", "getStoreQrCodeLiveData", "setStoreQrCodeLiveData", "convertSystemWalletDataToWalletContent", "", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$WalletContent;", "walletDataList", "Lcom/ttchain/walletproject/database/data/WalletData;", "convertWalletDataToWalletContent", "generatedQrCode", "", "bean", "Lcom/ttchain/walletproject/model/UserWalletQrCodeInputBean;", "getImageBeanJsonStringCompress", "getImportedWalletContent", "getMnemonic", "getSystemWalletContent", "performGetQrCodeBitmap", "storeQrCode", "app_proPlayDebug"})
public final class UserWalletQrCodeViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pwd;
    private long qrCodeGeneratedTimeStamp;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imageBeanJsonString;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> performGetQrCodeBitmapLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> storeQrCodeLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Throwable> storeQrCodeErrorLiveData;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPwd() {
        return null;
    }
    
    public final void setPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getQrCodeGeneratedTimeStamp() {
        return 0L;
    }
    
    public final void setQrCodeGeneratedTimeStamp(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageBeanJsonString() {
        return null;
    }
    
    public final void setImageBeanJsonString(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void setQrCodeGeneratedTimeStamp() {
    }
    
    private final java.lang.String getMnemonic() {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> getSystemWalletContent() {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> convertSystemWalletDataToWalletContent(java.util.List<com.ttchain.walletproject.database.data.WalletData> walletDataList) {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> getImportedWalletContent() {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> convertWalletDataToWalletContent(java.util.List<com.ttchain.walletproject.database.data.WalletData> walletDataList) {
        return null;
    }
    
    public final void generatedQrCode(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserWalletQrCodeInputBean bean, @org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
    }
    
    private final java.lang.String getImageBeanJsonStringCompress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> getPerformGetQrCodeBitmapLiveData() {
        return null;
    }
    
    public final void performGetQrCodeBitmap() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStoreQrCodeLiveData() {
        return null;
    }
    
    public final void setStoreQrCodeLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getStoreQrCodeErrorLiveData() {
        return null;
    }
    
    public final void setStoreQrCodeErrorLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Throwable> p0) {
    }
    
    public final void storeQrCode() {
    }
    
    public UserWalletQrCodeViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository) {
        super();
    }
}