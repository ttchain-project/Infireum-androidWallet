package com.ttchain.walletproject.ui.me.selectexportwallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/ttchain/walletproject/ui/me/selectexportwallet/SelectExportWalletViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/VerifyRepository;)V", "btcWalletList", "", "Lcom/ttchain/walletproject/database/data/WalletData;", "getBtcWalletList", "()Ljava/util/List;", "ethWalletList", "getEthWalletList", "getVerifyIdentityPwdObservableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getGetVerifyIdentityPwdObservableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetVerifyIdentityPwdObservableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getWalletDataLivaData", "getGetWalletDataLivaData", "setGetWalletDataLivaData", "getIdentityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "getVerifyIdentityPwdObservable", "", "pwd", "", "getWalletData", "coinEnum", "Lcom/ttchain/walletproject/enums/CoinEnum;", "app_proPlayDebug"})
public final class SelectExportWalletViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.database.data.WalletData>> getWalletDataLivaData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> getVerifyIdentityPwdObservableLiveData;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    
    private final java.util.List<com.ttchain.walletproject.database.data.WalletData> getBtcWalletList() {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.database.data.WalletData> getEthWalletList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.database.data.WalletData>> getGetWalletDataLivaData() {
        return null;
    }
    
    public final void setGetWalletDataLivaData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.database.data.WalletData>> p0) {
    }
    
    public final void getWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.CoinEnum coinEnum) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.IdentityData getIdentityData() {
        return null;
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
    
    public SelectExportWalletViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository) {
        super();
    }
}