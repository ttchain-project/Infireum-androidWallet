package com.ttchain.walletproject.ui.create_id;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fJ\b\u0010$\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000fH\u0002J\u000e\u0010\'\u001a\u00020 2\u0006\u0010(\u001a\u00020\u000bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/ttchain/walletproject/ui/create_id/CreateIdViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/VerifyRepository;)V", "buttonEnable", "Landroidx/lifecycle/MutableLiveData;", "", "getButtonEnable", "()Landroidx/lifecycle/MutableLiveData;", "confirmPwdErrorLiveData", "", "getConfirmPwdErrorLiveData", "mUserBean", "Lcom/ttchain/walletproject/model/UserBean;", "getMUserBean", "()Lcom/ttchain/walletproject/model/UserBean;", "setMUserBean", "(Lcom/ttchain/walletproject/model/UserBean;)V", "nameErrorLiveData", "getNameErrorLiveData", "noteErrorLiveData", "getNoteErrorLiveData", "performCreateAccountRequestLiveData", "getPerformCreateAccountRequestLiveData", "pwdErrorLiveData", "getPwdErrorLiveData", "onCreateClick", "", "pwd", "confirmPwd", "note", "performCreateAccountRequest", "putCreateAccountRequest", "response", "setButtonEnable", "b", "app_proPlayDebug"})
public final class CreateIdViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.model.UserBean mUserBean;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> buttonEnable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> nameErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> pwdErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> confirmPwdErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> noteErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> performCreateAccountRequestLiveData = null;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.UserBean getMUserBean() {
        return null;
    }
    
    public final void setMUserBean(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.UserBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getButtonEnable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNameErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPwdErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConfirmPwdErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNoteErrorLiveData() {
        return null;
    }
    
    public final void setButtonEnable(boolean b) {
    }
    
    public final void onCreateClick(@org.jetbrains.annotations.NotNull()
    java.lang.String pwd, @org.jetbrains.annotations.NotNull()
    java.lang.String confirmPwd, @org.jetbrains.annotations.NotNull()
    java.lang.String note) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPerformCreateAccountRequestLiveData() {
        return null;
    }
    
    private final void performCreateAccountRequest() {
    }
    
    private final void putCreateAccountRequest(java.lang.String response) {
    }
    
    public CreateIdViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository) {
        super();
    }
}