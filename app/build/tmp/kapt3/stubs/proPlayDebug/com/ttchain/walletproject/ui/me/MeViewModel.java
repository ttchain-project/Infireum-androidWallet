package com.ttchain.walletproject.ui.me;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015J\u0006\u0010!\u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u001fJ\b\u0010#\u001a\u00020\u001fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/ttchain/walletproject/ui/me/MeViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "userHelp", "Lcom/ttchain/walletproject/model/UserHelper;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "systemHelper", "Lcom/ttchain/walletproject/model/SystemHelper;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "infoRepositoryCo", "Lcom/ttchain/walletproject/repository/InfoRepositoryCo;", "(Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/SystemHelper;Lcom/ttchain/walletproject/repository/VerifyRepository;Lcom/ttchain/walletproject/repository/InfoRepositoryCo;)V", "getVerifyIdentityPwdObservableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getGetVerifyIdentityPwdObservableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetVerifyIdentityPwdObservableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "onClickExitIdentityConfirmLiveData", "", "getOnClickExitIdentityConfirmLiveData", "setOnClickExitIdentityConfirmLiveData", "performGetVersionLiveData", "Lcom/ttchain/walletproject/model/ApiVersionData;", "getPerformGetVersionLiveData", "setPerformGetVersionLiveData", "getIdentityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "getVerifyIdentityPwdObservable", "", "pwd", "onClickExitIdentityConfirm", "performGetVersion", "removeUserIdentityData", "app_proPlayDebug"})
public final class MeViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiVersionData> performGetVersionLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> onClickExitIdentityConfirmLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> getVerifyIdentityPwdObservableLiveData;
    private final com.ttchain.walletproject.model.UserHelper userHelp = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.SystemHelper systemHelper = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    private final com.ttchain.walletproject.repository.InfoRepositoryCo infoRepositoryCo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiVersionData> getPerformGetVersionLiveData() {
        return null;
    }
    
    public final void setPerformGetVersionLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiVersionData> p0) {
    }
    
    public final void performGetVersion() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.IdentityData getIdentityData() {
        return null;
    }
    
    private final void removeUserIdentityData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOnClickExitIdentityConfirmLiveData() {
        return null;
    }
    
    public final void setOnClickExitIdentityConfirmLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void onClickExitIdentityConfirm() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGetVerifyIdentityPwdObservableLiveData() {
        return null;
    }
    
    public final void setGetVerifyIdentityPwdObservableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void getVerifyIdentityPwdObservable(@org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
    }
    
    public MeViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelp, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SystemHelper systemHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.InfoRepositoryCo infoRepositoryCo) {
        super();
    }
}