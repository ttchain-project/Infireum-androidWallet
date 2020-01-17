package com.ttchain.walletproject.ui.restorebymnemonics_new.restorenouserinfo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000bJ\b\u0010\"\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/ttchain/walletproject/ui/restorebymnemonics_new/restorenouserinfo/RestoreNoUserInfoViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "restoreRepository", "Lcom/ttchain/walletproject/repository/RestoreRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/RestoreRepository;)V", "confirmPasswordErrorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getConfirmPasswordErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "hintPasswordErrorLiveData", "getHintPasswordErrorLiveData", "performRestoreIdentityLiveData", "", "getPerformRestoreIdentityLiveData", "pwdErrorLiveData", "getPwdErrorLiveData", "responseUserIdentity", "Lcom/ttchain/walletproject/model/ResponseUserIdentity;", "getResponseUserIdentity", "()Lcom/ttchain/walletproject/model/ResponseUserIdentity;", "setResponseUserIdentity", "(Lcom/ttchain/walletproject/model/ResponseUserIdentity;)V", "userBean", "Lcom/ttchain/walletproject/model/UserBean;", "onRestoreClick", "", "pwd", "confirmPassword", "note", "performRestoreIdentity", "app_proPlayDebug"})
public final class RestoreNoUserInfoViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.model.ResponseUserIdentity responseUserIdentity;
    private com.ttchain.walletproject.model.UserBean userBean;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> pwdErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> confirmPasswordErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> hintPasswordErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> performRestoreIdentityLiveData = null;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.RestoreRepository restoreRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ResponseUserIdentity getResponseUserIdentity() {
        return null;
    }
    
    public final void setResponseUserIdentity(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.ResponseUserIdentity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPwdErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConfirmPasswordErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getHintPasswordErrorLiveData() {
        return null;
    }
    
    public final void onRestoreClick(@org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPassword, @org.jetbrains.annotations.NotNull()
    java.lang.String note) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPerformRestoreIdentityLiveData() {
        return null;
    }
    
    private final void performRestoreIdentity() {
    }
    
    public RestoreNoUserInfoViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.RestoreRepository restoreRepository) {
        super();
    }
}