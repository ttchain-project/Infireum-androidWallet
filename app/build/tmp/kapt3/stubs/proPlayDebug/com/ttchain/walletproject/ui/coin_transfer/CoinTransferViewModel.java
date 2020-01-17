package com.ttchain.walletproject.ui.coin_transfer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010G\u001a\u00020HJ\u0006\u0010I\u001a\u00020HJ\u0006\u0010J\u001a\u00020HJ\u0006\u0010K\u001a\u00020HJ\u0006\u0010L\u001a\u00020MJ\u0006\u0010N\u001a\u00020MJ\b\u0010O\u001a\u00020MH\u0002J\u0006\u0010P\u001a\u00020MJ\u000e\u0010Q\u001a\u00020M2\u0006\u0010R\u001a\u00020\u0017J\u000e\u0010S\u001a\u00020M2\u0006\u0010T\u001a\u00020UJ\u000e\u0010V\u001a\u00020M2\u0006\u0010W\u001a\u00020\u0017J\u0006\u0010X\u001a\u00020MJ\u0016\u0010Y\u001a\u00020M2\u0006\u0010T\u001a\u00020U2\u0006\u0010Z\u001a\u00020\u0017R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u00170\u00170%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\'\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u00170\u00170%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u00170\u00170%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b+\u0010\u001bR\u001a\u0010,\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u0002020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001bR \u00105\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010>\u001a\b\u0012\u0004\u0012\u00020*0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0019\"\u0004\b@\u0010\u001bR\u001c\u0010A\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010B0B0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010C\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\u00170\u00170%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010D\u001a\b\u0012\u0004\u0012\u00020*0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0019\"\u0004\bF\u0010\u001b\u00a8\u0006["}, d2 = {"Lcom/ttchain/walletproject/ui/coin_transfer/CoinTransferViewModel;", "Lcom/ttchain/walletproject/base/BaseCoinTransferViewModel;", "context", "Landroid/content/Context;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "coinRepository", "Lcom/ttchain/walletproject/repository/CoinRepository;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepository;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "minerFeeRepository", "Lcom/ttchain/walletproject/repository/MinerFeeRepository;", "broadcastRepository", "Lcom/ttchain/walletproject/repository/BroadcastRepository;", "baseCoinTransferRepository", "Lcom/ttchain/walletproject/repository/BaseCoinTransferRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/CoinRepository;Lcom/ttchain/walletproject/repository/HelperRepository;Lcom/ttchain/walletproject/repository/VerifyRepository;Lcom/ttchain/walletproject/repository/MinerFeeRepository;Lcom/ttchain/walletproject/repository/BroadcastRepository;Lcom/ttchain/walletproject/repository/BaseCoinTransferRepository;)V", "amountItemContent", "Landroidx/lifecycle/MutableLiveData;", "", "getAmountItemContent", "()Landroidx/lifecycle/MutableLiveData;", "setAmountItemContent", "(Landroidx/lifecycle/MutableLiveData;)V", "coinTransferBean", "Lcom/ttchain/walletproject/model/CoinTransferBean;", "getCoinTransferBean", "setCoinTransferBean", "customMinerFeeHeaderToFiatString", "fiatEquals", "getFiatEquals", "setFiatEquals", "inputAmountSubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "inputCommentAddressSubject", "inputReceiptAddressSubject", "isLaunchCommonAddressActivity", "", "setLaunchCommonAddressActivity", "mReceiptAddress", "getMReceiptAddress", "()Ljava/lang/String;", "setMReceiptAddress", "(Ljava/lang/String;)V", "minerFeeGasItem", "Lcom/ttchain/walletproject/model/MinerFeeGasItemBean;", "getMinerFeeGasItem", "setMinerFeeGasItem", "minerFeeGasText", "getMinerFeeGasText", "setMinerFeeGasText", "seekMinerFeeHeaderToFiatString", "showMinerFeeItem", "getShowMinerFeeItem", "()Z", "setShowMinerFeeItem", "(Z)V", "showMinerFeeItemResult", "getShowMinerFeeItemResult", "setShowMinerFeeItemResult", "toPrefFiatRateSubject", "Ljava/math/BigDecimal;", "toPrefFiatSymbolSubject", "verifyUerPwdLiveData", "getVerifyUerPwdLiveData", "setVerifyUerPwdLiveData", "createAmountBean", "Lcom/ttchain/walletproject/model/TransCoinItemBean;", "createCommentBean", "createMinerFeeHeaderBean", "createReceiptAddressBean", "onClickNext", "", "onViewCreate", "performCreateCoinTransferBean", "performUpdateSelectedWalletData", "setReceiptAddress", "address", "setSelectedWalletId", "walletId", "", "setTransCoinId", "coinId", "transferAllCoin", "verifyUserPwdObservable", "password", "app_proPlayDebug"})
public final class CoinTransferViewModel extends com.ttchain.walletproject.base.BaseCoinTransferViewModel {
    
    /**
     * Keep miner fee item showing tag.
     */
    private boolean showMinerFeeItem;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showMinerFeeItemResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeGasItemBean> minerFeeGasItem;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> minerFeeGasText;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.CoinTransferBean> coinTransferBean;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> fiatEquals;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLaunchCommonAddressActivity;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> amountItemContent;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> inputAmountSubject = null;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> inputReceiptAddressSubject = null;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> inputCommentAddressSubject = null;
    private final io.reactivex.subjects.BehaviorSubject<java.math.BigDecimal> toPrefFiatRateSubject = null;
    private final io.reactivex.subjects.BehaviorSubject<java.lang.String> toPrefFiatSymbolSubject = null;
    private java.lang.String seekMinerFeeHeaderToFiatString;
    private java.lang.String customMinerFeeHeaderToFiatString;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mReceiptAddress;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> verifyUerPwdLiveData;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.CoinRepository coinRepository = null;
    private final com.ttchain.walletproject.repository.HelperRepository helperRepository = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    private final com.ttchain.walletproject.repository.MinerFeeRepository minerFeeRepository = null;
    private final com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository = null;
    private final com.ttchain.walletproject.repository.BaseCoinTransferRepository baseCoinTransferRepository = null;
    
    public final boolean getShowMinerFeeItem() {
        return false;
    }
    
    public final void setShowMinerFeeItem(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowMinerFeeItemResult() {
        return null;
    }
    
    public final void setShowMinerFeeItemResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeGasItemBean> getMinerFeeGasItem() {
        return null;
    }
    
    public final void setMinerFeeGasItem(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeGasItemBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMinerFeeGasText() {
        return null;
    }
    
    public final void setMinerFeeGasText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.CoinTransferBean> getCoinTransferBean() {
        return null;
    }
    
    public final void setCoinTransferBean(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.CoinTransferBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFiatEquals() {
        return null;
    }
    
    public final void setFiatEquals(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLaunchCommonAddressActivity() {
        return null;
    }
    
    public final void setLaunchCommonAddressActivity(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAmountItemContent() {
        return null;
    }
    
    public final void setAmountItemContent(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMReceiptAddress() {
        return null;
    }
    
    public final void setMReceiptAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void onViewCreate() {
    }
    
    public final void setTransCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
    }
    
    public final void setReceiptAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    public final void setSelectedWalletId(int walletId) {
    }
    
    private final void performCreateCoinTransferBean() {
    }
    
    public final void performUpdateSelectedWalletData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.TransCoinItemBean createAmountBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.TransCoinItemBean createReceiptAddressBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.TransCoinItemBean createMinerFeeHeaderBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.TransCoinItemBean createCommentBean() {
        return null;
    }
    
    public final void onClickNext() {
    }
    
    public final void transferAllCoin() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getVerifyUerPwdLiveData() {
        return null;
    }
    
    public final void setVerifyUerPwdLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void verifyUserPwdObservable(int walletId, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public CoinTransferViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.CoinRepository coinRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepository helperRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.MinerFeeRepository minerFeeRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseCoinTransferRepository baseCoinTransferRepository) {
        super(null, null, null, null, null, null);
    }
}