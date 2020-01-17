package com.ttchain.walletproject.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001fJ\u000e\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\t\u00a8\u0006%"}, d2 = {"Lcom/ttchain/walletproject/ui/login/LoginViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hintErrorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getHintErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "languageLiveData", "", "getLanguageLiveData", "setLanguageLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "qrCodeImageBean", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;", "qrCodeImageBeanError", "getQrCodeImageBeanError", "setQrCodeImageBeanError", "qrCodeImageBeanLiveData", "getQrCodeImageBeanLiveData", "setQrCodeImageBeanLiveData", "qrCodeImagePwd", "getQrCodeImagePwd", "()Ljava/lang/String;", "setQrCodeImagePwd", "(Ljava/lang/String;)V", "qrCodeParseLiveData", "getQrCodeParseLiveData", "getInput", "", "input", "", "getLanguageText", "parseUserWalletQrCode", "qrCodeString", "app_proPlayDebug"})
public final class LoginViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    private com.ttchain.walletproject.model.UserWalletQrCodeImageBean qrCodeImageBean;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String qrCodeImagePwd;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> hintErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.UserWalletQrCodeImageBean> qrCodeParseLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.UserWalletQrCodeImageBean> qrCodeImageBeanLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Throwable> qrCodeImageBeanError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> languageLiveData;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQrCodeImagePwd() {
        return null;
    }
    
    public final void setQrCodeImagePwd(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getHintErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.UserWalletQrCodeImageBean> getQrCodeParseLiveData() {
        return null;
    }
    
    public final void parseUserWalletQrCode(@org.jetbrains.annotations.NotNull()
    java.lang.String qrCodeString) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.UserWalletQrCodeImageBean> getQrCodeImageBeanLiveData() {
        return null;
    }
    
    public final void setQrCodeImageBeanLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.UserWalletQrCodeImageBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getQrCodeImageBeanError() {
        return null;
    }
    
    public final void setQrCodeImageBeanError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Throwable> p0) {
    }
    
    public final void getInput(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence input) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLanguageLiveData() {
        return null;
    }
    
    public final void setLanguageLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void getLanguageText() {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}