package com.ttchain.walletproject.ui.ttn.ttntransfer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010D\u001a\u00020EJ\u000e\u0010F\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0010H\u0002J\u0006\u0010J\u001a\u00020KJ\u000e\u0010L\u001a\u00020E2\u0006\u0010M\u001a\u00020\u0010J\u000e\u0010N\u001a\u00020\u00102\u0006\u0010O\u001a\u00020PJ\u0006\u00102\u001a\u00020EJ\u0006\u0010Q\u001a\u00020EJ\u0010\u0010R\u001a\u00020E2\u0006\u0010S\u001a\u00020HH\u0002J\u000e\u0010T\u001a\u00020E2\u0006\u0010U\u001a\u00020\u0010J\u000e\u0010V\u001a\u00020E2\u0006\u0010W\u001a\u00020\u0010J\u001e\u0010X\u001a\u00020E2\u0006\u0010Y\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00102\u0006\u0010[\u001a\u00020\u0010J\u0018\u0010\\\u001a\u00020E2\u0006\u0010]\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u0010H\u0002J\u0006\u0010^\u001a\u00020ER\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001a\u0010!\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R \u0010*\u001a\b\u0012\u0004\u0012\u00020+0%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\'\"\u0004\b-\u0010)R \u0010.\u001a\b\u0012\u0004\u0012\u00020/0%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\'\"\u0004\b1\u0010)R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u00102\u001a\b\u0012\u0004\u0012\u0002030%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\'\"\u0004\b4\u0010)R \u00105\u001a\b\u0012\u0004\u0012\u00020\u00100%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\'\"\u0004\b7\u0010)R \u00108\u001a\b\u0012\u0004\u0012\u00020/0%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\'\"\u0004\b:\u0010)R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020<0%\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\'R \u0010>\u001a\b\u0012\u0004\u0012\u0002030%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\'\"\u0004\b@\u0010)R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\'\"\u0004\bC\u0010)R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006_"}, d2 = {"Lcom/ttchain/walletproject/ui/ttn/ttntransfer/TtnTransferViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "ttnServerApiRepository", "Lcom/ttchain/walletproject/repository/TtnServerApiRepository;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "ttnRepository", "Lcom/ttchain/walletproject/repository/TtnRepository;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepositoryCo;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "broadcastRepository", "Lcom/ttchain/walletproject/repository/BroadcastRepository;", "(Lcom/ttchain/walletproject/repository/TtnServerApiRepository;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/TtnRepository;Lcom/ttchain/walletproject/repository/HelperRepositoryCo;Lcom/ttchain/walletproject/repository/VerifyRepository;Lcom/ttchain/walletproject/repository/BroadcastRepository;)V", "balanceAmount", "", "getBalanceAmount", "()Ljava/lang/String;", "setBalanceAmount", "(Ljava/lang/String;)V", "coinId", "getCoinId", "setCoinId", "coinTransferBeanViewModel", "Lcom/ttchain/walletproject/model/CoinTransferBean;", "getCoinTransferBeanViewModel", "()Lcom/ttchain/walletproject/model/CoinTransferBean;", "setCoinTransferBeanViewModel", "(Lcom/ttchain/walletproject/model/CoinTransferBean;)V", "comment", "getComment", "setComment", "fiatSymbol", "getFiatSymbol", "setFiatSymbol", "fiatTextLiveData", "Landroidx/lifecycle/MutableLiveData;", "getFiatTextLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setFiatTextLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getBalanceLiveData", "Lcom/ttchain/walletproject/model/ApiTtnBalanceResponse;", "getGetBalanceLiveData", "setGetBalanceLiveData", "getVerifyIdentityPwdObservableLiveData", "", "getGetVerifyIdentityPwdObservableLiveData", "setGetVerifyIdentityPwdObservableLiveData", "isValidTransactionInputThenShowDialog", "Ljava/math/BigDecimal;", "setValidTransactionInputThenShowDialog", "performPostTtnBroadcastLiveData", "getPerformPostTtnBroadcastLiveData", "setPerformPostTtnBroadcastLiveData", "performTransactionSucceedLiveData", "getPerformTransactionSucceedLiveData", "setPerformTransactionSucceedLiveData", "setCoinIdDataLiveData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getSetCoinIdDataLiveData", "transferAllAmountLiveData", "getTransferAllAmountLiveData", "setTransferAllAmountLiveData", "ttnAddressLiveData", "getTtnAddressLiveData", "setTtnAddressLiveData", "getBalance", "", "getDisplayNameByCoinId", "getTtnTransModel", "Lcom/ttchain/walletproject/model/SignTtnTransResultData;", "nonce", "getTtnWalletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getVerifyIdentityPwdObservable", "pwd", "getWalletEpKey", "walletID", "", "performGetTtnNonce", "performPostTtnBroadcast", "broadcastData", "performTransactionSucceed", "txId", "setCoinIdData", "bundleValue", "setValue", "amount", "address", "note", "signTtnTransaction", "privateKey", "transferAllAmount", "app_proPlayDebug"})
public final class TtnTransferViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String balanceAmount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String comment;
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.model.CoinTransferBean coinTransferBeanViewModel;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String coinId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fiatSymbol;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> fiatTextLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> ttnAddressLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.CoinData> setCoinIdDataLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> getBalanceLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.math.BigDecimal> isValidTransactionInputThenShowDialog;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> getVerifyIdentityPwdObservableLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> performPostTtnBroadcastLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> performTransactionSucceedLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.math.BigDecimal> transferAllAmountLiveData;
    private final com.ttchain.walletproject.repository.TtnServerApiRepository ttnServerApiRepository = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.TtnRepository ttnRepository = null;
    private final com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    private final com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBalanceAmount() {
        return null;
    }
    
    public final void setBalanceAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.CoinTransferBean getCoinTransferBeanViewModel() {
        return null;
    }
    
    public final void setCoinTransferBeanViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.CoinTransferBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoinId() {
        return null;
    }
    
    public final void setCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiatSymbol() {
        return null;
    }
    
    public final void setFiatSymbol(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFiatTextLiveData() {
        return null;
    }
    
    public final void setFiatTextLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTtnAddressLiveData() {
        return null;
    }
    
    public final void setTtnAddressLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.CoinData> getSetCoinIdDataLiveData() {
        return null;
    }
    
    public final void setCoinIdData(@org.jetbrains.annotations.NotNull()
    java.lang.String bundleValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getTtnWalletData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayNameByCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> getGetBalanceLiveData() {
        return null;
    }
    
    public final void setGetBalanceLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> p0) {
    }
    
    public final void getBalance() {
    }
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String amount, @org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    java.lang.String note) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.math.BigDecimal> isValidTransactionInputThenShowDialog() {
        return null;
    }
    
    public final void setValidTransactionInputThenShowDialog(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.math.BigDecimal> p0) {
    }
    
    public final void isValidTransactionInputThenShowDialog() {
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
    
    public final void performGetTtnNonce() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletEpKey(int walletID) {
        return null;
    }
    
    private final com.ttchain.walletproject.model.SignTtnTransResultData getTtnTransModel(java.lang.String nonce) {
        return null;
    }
    
    private final void signTtnTransaction(java.lang.String privateKey, java.lang.String nonce) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPerformPostTtnBroadcastLiveData() {
        return null;
    }
    
    public final void setPerformPostTtnBroadcastLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    private final void performPostTtnBroadcast(com.ttchain.walletproject.model.SignTtnTransResultData broadcastData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPerformTransactionSucceedLiveData() {
        return null;
    }
    
    public final void setPerformTransactionSucceedLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void performTransactionSucceed(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.math.BigDecimal> getTransferAllAmountLiveData() {
        return null;
    }
    
    public final void setTransferAllAmountLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.math.BigDecimal> p0) {
    }
    
    public final void transferAllAmount() {
    }
    
    public TtnTransferViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.TtnServerApiRepository ttnServerApiRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.TtnRepository ttnRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository) {
        super();
    }
}