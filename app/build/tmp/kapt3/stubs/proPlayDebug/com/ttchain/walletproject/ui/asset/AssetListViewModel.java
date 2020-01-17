package com.ttchain.walletproject.ui.asset;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0011J\u0006\u00107\u001a\u000208J\u0014\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020;0:H\u0002J\u0006\u0010<\u001a\u000208J\u0006\u0010=\u001a\u000208J\u0006\u0010>\u001a\u00020\u001dJ\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0014H\u0002J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020@0:H\u0002J \u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001dH\u0002J\u0018\u0010G\u001a\u0002082\u0006\u0010H\u001a\u00020\u00142\u0006\u0010I\u001a\u00020\u0014H\u0002J\u0012\u0010J\u001a\u0002082\b\u0010K\u001a\u0004\u0018\u00010$H\u0002J\b\u0010L\u001a\u000208H\u0002J\b\u0010M\u001a\u000208H\u0016J\u0006\u0010N\u001a\u000208J\u0006\u0010O\u001a\u000208R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R \u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R \u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010+\u001a\u0010\u0012\f\u0012\n .*\u0004\u0018\u00010-0-0,\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0016\"\u0004\b6\u0010\u0018\u00a8\u0006P"}, d2 = {"Lcom/ttchain/walletproject/ui/asset/AssetListViewModel;", "Lcom/ttchain/walletproject/base/BaseRecyclerViewViewModel;", "Lcom/ttchain/walletproject/model/CoinEntity;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "coinRepository", "Lcom/ttchain/walletproject/repository/CoinRepository;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepositoryCo;", "balanceApiRepository", "Lcom/ttchain/walletproject/repository/BalanceApiRepository;", "balanceRepository", "Lcom/ttchain/walletproject/repository/BalanceRepository;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/CoinRepository;Lcom/ttchain/walletproject/repository/HelperRepositoryCo;Lcom/ttchain/walletproject/repository/BalanceApiRepository;Lcom/ttchain/walletproject/repository/BalanceRepository;)V", "chainNameLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getChainNameLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setChainNameLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "currencySymbolLiveData", "getCurrencySymbolLiveData", "setCurrencySymbolLiveData", "enableAssetButtonLiveData", "", "getEnableAssetButtonLiveData", "setEnableAssetButtonLiveData", "fiatAmountLiveData", "getFiatAmountLiveData", "setFiatAmountLiveData", "getSelectedWalletDataRxLiveData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getGetSelectedWalletDataRxLiveData", "setGetSelectedWalletDataRxLiveData", "getSelectedWalletIDLiveData", "", "getGetSelectedWalletIDLiveData", "setGetSelectedWalletIDLiveData", "performRefreshUiDataSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/ttchain/walletproject/model/RefreshUiDataBean;", "kotlin.jvm.PlatformType", "getPerformRefreshUiDataSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "setTitleLiveData", "getSetTitleLiveData", "setSetTitleLiveData", "walletNameLiveData", "getWalletNameLiveData", "setWalletNameLiveData", "addSubscribe", "", "getCoinEntityListObservable", "Lio/reactivex/Observable;", "", "getSelectedWalletDataRx", "getSelectedWalletIDRx", "getSettingChanged", "getWalletBeanWithTotalFiatAmount", "Lcom/ttchain/walletproject/model/WalletBean;", "identifier", "getWalletBeanWithTotalFiatAmountObservable", "performRefreshUiData", "showLoading", "showRefresh", "runUpdateRateAndBalanceDataTask", "performUpdateBalanceByCoinApiRequest", "address", "coinId", "performUpdateBalanceByWallet", "walletData", "performUpdateRateAndBalanceDataTask", "refreshRequest", "setSettingChangedPerformTaskFinish", "setTitle", "app_proPlayDebug"})
public final class AssetListViewModel extends com.ttchain.walletproject.base.BaseRecyclerViewViewModel<com.ttchain.walletproject.model.CoinEntity> {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<com.ttchain.walletproject.model.RefreshUiDataBean> performRefreshUiDataSubject = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> getSelectedWalletIDLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.WalletData> getSelectedWalletDataRxLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> setTitleLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> chainNameLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> walletNameLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> fiatAmountLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> currencySymbolLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> enableAssetButtonLiveData;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.CoinRepository coinRepository = null;
    private final com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository = null;
    private final com.ttchain.walletproject.repository.BalanceApiRepository balanceApiRepository = null;
    private final com.ttchain.walletproject.repository.BalanceRepository balanceRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<com.ttchain.walletproject.model.RefreshUiDataBean> getPerformRefreshUiDataSubject() {
        return null;
    }
    
    public final void addSubscribe() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getGetSelectedWalletIDLiveData() {
        return null;
    }
    
    public final void setGetSelectedWalletIDLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    public final void getSelectedWalletIDRx() {
    }
    
    public final boolean getSettingChanged() {
        return false;
    }
    
    public final void setSettingChangedPerformTaskFinish() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.WalletData> getGetSelectedWalletDataRxLiveData() {
        return null;
    }
    
    public final void setGetSelectedWalletDataRxLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.WalletData> p0) {
    }
    
    public final void getSelectedWalletDataRx() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSetTitleLiveData() {
        return null;
    }
    
    public final void setSetTitleLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void setTitle() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getChainNameLiveData() {
        return null;
    }
    
    public final void setChainNameLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getWalletNameLiveData() {
        return null;
    }
    
    public final void setWalletNameLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFiatAmountLiveData() {
        return null;
    }
    
    public final void setFiatAmountLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCurrencySymbolLiveData() {
        return null;
    }
    
    public final void setCurrencySymbolLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEnableAssetButtonLiveData() {
        return null;
    }
    
    public final void setEnableAssetButtonLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    private final void performRefreshUiData(boolean showLoading, boolean showRefresh, boolean runUpdateRateAndBalanceDataTask) {
    }
    
    private final io.reactivex.Observable<com.ttchain.walletproject.model.WalletBean> getWalletBeanWithTotalFiatAmountObservable() {
        return null;
    }
    
    private final com.ttchain.walletproject.model.WalletBean getWalletBeanWithTotalFiatAmount(java.lang.String identifier) {
        return null;
    }
    
    private final io.reactivex.Observable<java.util.List<com.ttchain.walletproject.model.CoinEntity>> getCoinEntityListObservable() {
        return null;
    }
    
    private final void performUpdateRateAndBalanceDataTask() {
    }
    
    private final void performUpdateBalanceByWallet(com.ttchain.walletproject.database.data.WalletData walletData) {
    }
    
    private final void performUpdateBalanceByCoinApiRequest(java.lang.String address, java.lang.String coinId) {
    }
    
    @java.lang.Override()
    public void refreshRequest() {
    }
    
    public AssetListViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.CoinRepository coinRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BalanceApiRepository balanceApiRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BalanceRepository balanceRepository) {
        super();
    }
}