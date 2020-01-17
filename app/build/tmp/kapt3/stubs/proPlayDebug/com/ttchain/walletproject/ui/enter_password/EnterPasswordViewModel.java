package com.ttchain.walletproject.ui.enter_password;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001c"}, d2 = {"Lcom/ttchain/walletproject/ui/enter_password/EnterPasswordViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "()V", "qrCodeImageBean", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;", "getQrCodeImageBean", "()Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;", "setQrCodeImageBean", "(Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;)V", "qrCodeImageBeanError", "Landroidx/lifecycle/MutableLiveData;", "", "getQrCodeImageBeanError", "()Landroidx/lifecycle/MutableLiveData;", "setQrCodeImageBeanError", "(Landroidx/lifecycle/MutableLiveData;)V", "qrCodeImageBeanLiveData", "getQrCodeImageBeanLiveData", "setQrCodeImageBeanLiveData", "qrCodeImagePwd", "", "getQrCodeImagePwd", "()Ljava/lang/String;", "setQrCodeImagePwd", "(Ljava/lang/String;)V", "getInput", "", "password", "app_proPlayDebug"})
public final class EnterPasswordViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.model.UserWalletQrCodeImageBean qrCodeImageBean;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String qrCodeImagePwd;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.UserWalletQrCodeImageBean> qrCodeImageBeanLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Throwable> qrCodeImageBeanError;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.UserWalletQrCodeImageBean getQrCodeImageBean() {
        return null;
    }
    
    public final void setQrCodeImageBean(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.UserWalletQrCodeImageBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQrCodeImagePwd() {
        return null;
    }
    
    public final void setQrCodeImagePwd(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
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
    java.lang.String password) {
    }
    
    public EnterPasswordViewModel() {
        super();
    }
}