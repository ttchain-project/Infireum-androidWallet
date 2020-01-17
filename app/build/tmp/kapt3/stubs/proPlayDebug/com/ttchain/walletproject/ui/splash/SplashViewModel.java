package com.ttchain.walletproject.ui.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\u0006\u0010 \u001a\u00020\u001eJ\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0006\u0010#\u001a\u00020\u001eJ\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010\'\u001a\u00020\u001eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/ttchain/walletproject/ui/splash/SplashViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "infoRepositoryCo", "Lcom/ttchain/walletproject/repository/InfoRepositoryCo;", "helperRepositoryCo", "Lcom/ttchain/walletproject/repository/HelperRepositoryCo;", "splashRepository", "Lcom/ttchain/walletproject/repository/SplashRepository;", "coinRepository", "Lcom/ttchain/walletproject/repository/CoinRepository;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "(Lcom/ttchain/walletproject/repository/InfoRepositoryCo;Lcom/ttchain/walletproject/repository/HelperRepositoryCo;Lcom/ttchain/walletproject/repository/SplashRepository;Lcom/ttchain/walletproject/repository/CoinRepository;Lcom/ttchain/walletproject/model/UserHelper;)V", "firstTaskResult", "Landroidx/lifecycle/MutableLiveData;", "", "getFirstTaskResult", "()Landroidx/lifecycle/MutableLiveData;", "setFirstTaskResult", "(Landroidx/lifecycle/MutableLiveData;)V", "launchLoginResult", "getLaunchLoginResult", "setLaunchLoginResult", "launchMainResult", "getLaunchMainResult", "setLaunchMainResult", "touchIdResult", "getTouchIdResult", "setTouchIdResult", "launchResult", "", "performCheckCoinDataAndFiatData", "performFirstSectionTask", "performGetCoinListAndFiatList", "performGetRateListAndUpdateWalletData", "performSecondSectionTask", "syncCoinDataAndCoinSelectionData", "mainCoinId", "", "updateWalletDataDbMainCoinIdAndChainType", "app_proPlayDebug"})
public final class SplashViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> firstTaskResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> touchIdResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchMainResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchLoginResult;
    private final com.ttchain.walletproject.repository.InfoRepositoryCo infoRepositoryCo = null;
    private final com.ttchain.walletproject.repository.HelperRepositoryCo helperRepositoryCo = null;
    private final com.ttchain.walletproject.repository.SplashRepository splashRepository = null;
    private final com.ttchain.walletproject.repository.CoinRepository coinRepository = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFirstTaskResult() {
        return null;
    }
    
    public final void setFirstTaskResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTouchIdResult() {
        return null;
    }
    
    public final void setTouchIdResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLaunchMainResult() {
        return null;
    }
    
    public final void setLaunchMainResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLaunchLoginResult() {
        return null;
    }
    
    public final void setLaunchLoginResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void performFirstSectionTask() {
    }
    
    public final void performSecondSectionTask() {
    }
    
    private final void performGetCoinListAndFiatList() {
    }
    
    private final void performCheckCoinDataAndFiatData() {
    }
    
    private final void performGetRateListAndUpdateWalletData() {
    }
    
    private final void launchResult() {
    }
    
    private final void syncCoinDataAndCoinSelectionData(java.lang.String mainCoinId) {
    }
    
    private final void updateWalletDataDbMainCoinIdAndChainType() {
    }
    
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.InfoRepositoryCo infoRepositoryCo, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepositoryCo helperRepositoryCo, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.SplashRepository splashRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.CoinRepository coinRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper) {
        super();
    }
}