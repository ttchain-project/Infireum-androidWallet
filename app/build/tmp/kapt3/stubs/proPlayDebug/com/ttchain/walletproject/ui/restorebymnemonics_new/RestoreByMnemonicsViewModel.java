package com.ttchain.walletproject.ui.restorebymnemonics_new;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0014"}, d2 = {"Lcom/ttchain/walletproject/ui/restorebymnemonics_new/RestoreByMnemonicsViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "()V", "responseUserIdentity", "Lcom/ttchain/walletproject/model/ResponseUserIdentity;", "getResponseUserIdentity", "()Lcom/ttchain/walletproject/model/ResponseUserIdentity;", "setResponseUserIdentity", "(Lcom/ttchain/walletproject/model/ResponseUserIdentity;)V", "systemWalletInitLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getSystemWalletInitLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setSystemWalletInitLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "setMnemonics", "", "mnemonics", "", "app_proPlayDebug"})
public final class RestoreByMnemonicsViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.model.ResponseUserIdentity responseUserIdentity;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> systemWalletInitLiveData;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ResponseUserIdentity getResponseUserIdentity() {
        return null;
    }
    
    public final void setResponseUserIdentity(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.ResponseUserIdentity p0) {
    }
    
    public final void setMnemonics(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonics) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSystemWalletInitLiveData() {
        return null;
    }
    
    public final void setSystemWalletInitLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public RestoreByMnemonicsViewModel() {
        super();
    }
}