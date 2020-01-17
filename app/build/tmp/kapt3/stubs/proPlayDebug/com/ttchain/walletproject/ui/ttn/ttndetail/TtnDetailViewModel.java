package com.ttchain.walletproject.ui.ttn.ttndetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\u001bJ\b\u0010!\u001a\u00020\"H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/ttchain/walletproject/ui/ttn/ttndetail/TtnDetailViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "ttnRepository", "Lcom/ttchain/walletproject/repository/TtnRepository;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepositoryCo;", "ttnServerApiRepository", "Lcom/ttchain/walletproject/repository/TtnServerApiRepository;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/repository/TtnRepository;Lcom/ttchain/walletproject/repository/HelperRepositoryCo;Lcom/ttchain/walletproject/repository/TtnServerApiRepository;)V", "coinId", "", "getCoinId", "()Ljava/lang/String;", "setCoinId", "(Ljava/lang/String;)V", "fiatIcon", "getFiatIcon", "getBalanceLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ttchain/walletproject/model/ApiTtnBalanceResponse;", "getGetBalanceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setGetBalanceLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getBalance", "", "getCoinDataByCoinId", "Lcom/ttchain/walletproject/database/data/CoinData;", "getFiat", "amount", "getRateAndBalance", "getTtnWalletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "app_proPlayDebug"})
public final class TtnDetailViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String coinId;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String fiatIcon = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> getBalanceLiveData;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.repository.TtnRepository ttnRepository = null;
    private final com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository = null;
    private final com.ttchain.walletproject.repository.TtnServerApiRepository ttnServerApiRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinId() {
        return null;
    }
    
    public final void setCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiatIcon() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.WalletData getTtnWalletData() {
        return null;
    }
    
    public final void getRateAndBalance() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> getGetBalanceLiveData() {
        return null;
    }
    
    public final void setGetBalanceLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> p0) {
    }
    
    private final void getBalance() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiat(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.lang.String amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinData getCoinDataByCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    public TtnDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.TtnRepository ttnRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.TtnServerApiRepository ttnServerApiRepository) {
        super();
    }
}