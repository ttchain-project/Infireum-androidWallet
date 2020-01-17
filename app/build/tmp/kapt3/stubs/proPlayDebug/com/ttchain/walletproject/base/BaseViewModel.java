package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JJ\u000e\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020MJ\u0016\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u001dJ)\u0010O\u001a\u00020\u00192!\u0010P\u001a\u001d\u0012\u0013\u0012\u00110M\u00a2\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020H0QJ\u0006\u0010T\u001a\u00020HJ\u0016\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u00132\u0006\u0010X\u001a\u00020VJ\u001e\u0010Y\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\u00132\u0006\u0010X\u001a\u00020V2\u0006\u0010Z\u001a\u00020\u0013J\u000e\u0010[\u001a\u00020V2\u0006\u0010W\u001a\u00020\u0013J\u001a\u0010\\\u001a\u000e\u0012\u0004\u0012\u0002H^\u0012\u0004\u0012\u0002H^0]\"\u0004\b\u0000\u0010^H\u0004J\"\u0010\\\u001a\u000e\u0012\u0004\u0012\u0002H^\u0012\u0004\u0012\u0002H^0]\"\u0004\b\u0000\u0010^2\u0006\u0010_\u001a\u00020\u001dH\u0004J*\u0010\\\u001a\u000e\u0012\u0004\u0012\u0002H^\u0012\u0004\u0012\u0002H^0]\"\u0004\b\u0000\u0010^2\u0006\u0010_\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020\u001dH\u0004J\b\u0010a\u001a\u00020HH\u0014J<\u0010b\u001a\u00020H2\u0006\u0010_\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020\u001d2\u001c\u0010P\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0c\u0012\u0006\u0012\u0004\u0018\u00010d0Q\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010eJ_\u0010b\u001a\u00020H2\u0006\u0010_\u001a\u00020\u001d2\u0006\u0010`\u001a\u00020\u001d2\u001c\u0010P\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0c\u0012\u0006\u0012\u0004\u0018\u00010d0Q2!\u0010f\u001a\u001d\u0012\u0013\u0012\u00110M\u00a2\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020H0Q\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010gJ4\u0010b\u001a\u00020H2\u0006\u0010_\u001a\u00020\u001d2\u001c\u0010P\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0c\u0012\u0006\u0012\u0004\u0018\u00010d0Q\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010hJW\u0010b\u001a\u00020H2\u0006\u0010_\u001a\u00020\u001d2\u001c\u0010P\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0c\u0012\u0006\u0012\u0004\u0018\u00010d0Q2!\u0010f\u001a\u001d\u0012\u0013\u0012\u00110M\u00a2\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020H0Q\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010iJ,\u0010b\u001a\u00020H2\u001c\u0010P\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0c\u0012\u0006\u0012\u0004\u0018\u00010d0Q\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010jJO\u0010b\u001a\u00020H2\u001c\u0010P\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0c\u0012\u0006\u0012\u0004\u0018\u00010d0Q2!\u0010f\u001a\u001d\u0012\u0013\u0012\u00110M\u00a2\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020H0Q\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010kR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\rR \u0010%\u001a\b\u0012\u0004\u0012\u00020&0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000b\"\u0004\b(\u0010\rR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010\rR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\rR \u00100\u001a\b\u0012\u0004\u0012\u00020&0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR\u001a\u00103\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u00105\"\u0004\b:\u00107R \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000b\"\u0004\b=\u0010\rR \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u000b\"\u0004\b@\u0010\rR \u0010A\u001a\b\u0012\u0004\u0012\u00020\u001d0BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006l"}, d2 = {"Lcom/ttchain/walletproject/base/BaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "()V", "RATE_DATA_CACHE_TIME_IN_SEC", "", "getRATE_DATA_CACHE_TIME_IN_SEC", "()I", "apiThrowableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ttchain/walletproject/net/ApiException;", "getApiThrowableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setApiThrowableLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "btcTransferExceptionLiveData", "Lcom/ttchain/walletproject/model/BtcTransferException;", "getBtcTransferExceptionLiveData", "setBtcTransferExceptionLiveData", "confirmView", "", "getConfirmView", "setConfirmView", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "isLoading", "", "setLoading", "isPageFinish", "()Z", "setPageFinish", "(Z)V", "isViewFinished", "setViewFinished", "minerFeeGasItemGasPriceRange", "Lcom/ttchain/walletproject/model/MinerFeeEditBean;", "getMinerFeeGasItemGasPriceRange", "setMinerFeeGasItemGasPriceRange", "minerFeeHeaderItemAmountText", "getMinerFeeHeaderItemAmountText", "setMinerFeeHeaderItemAmountText", "minerFeeSatItem", "Lcom/ttchain/walletproject/model/MinerFeeSatItemBean;", "getMinerFeeSatItem", "setMinerFeeSatItem", "minerFeeSatItemGas", "getMinerFeeSatItemGas", "setMinerFeeSatItemGas", "roomId", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", "roomType", "getRoomType", "setRoomType", "showToastText", "getShowToastText", "setShowToastText", "throwableMessage", "getThrowableMessage", "setThrowableMessage", "updateCoinBalanceSubject", "Lio/reactivex/subjects/Subject;", "getUpdateCoinBalanceSubject", "()Lio/reactivex/subjects/Subject;", "setUpdateCoinBalanceSubject", "(Lio/reactivex/subjects/Subject;)V", "add", "", "job", "Lio/reactivex/disposables/Disposable;", "consumerThrowable", "throwable", "", "showMessage", "customExceptionHandler", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forceClear", "getFiatRate", "Ljava/math/BigDecimal;", "coinId", "amount", "getFiatRateText", "symbol", "getRate", "loadingView", "Lio/reactivex/ObservableTransformer;", "T", "showLoading", "closeLoading", "onCleared", "viewModelLaunch", "Lkotlin/coroutines/Continuation;", "", "(ZZLkotlin/jvm/functions/Function1;)V", "errorAction", "(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(ZLkotlin/jvm/functions/Function1;)V", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;)V", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "app_proPlayDebug"})
public abstract class BaseViewModel extends androidx.lifecycle.AndroidViewModel {
    private final int RATE_DATA_CACHE_TIME_IN_SEC = 300;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> minerFeeHeaderItemAmountText;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeSatItemBean> minerFeeSatItem;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeEditBean> minerFeeSatItemGas;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeEditBean> minerFeeGasItemGasPriceRange;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> showToastText;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isViewFinished;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> confirmView;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.Subject<java.lang.Boolean> updateCoinBalanceSubject;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    private boolean isPageFinish;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> throwableMessage;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.net.ApiException> apiThrowableLiveData;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String roomId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String roomType;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler exceptionHandler = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.BtcTransferException> btcTransferExceptionLiveData;
    
    public final int getRATE_DATA_CACHE_TIME_IN_SEC() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMinerFeeHeaderItemAmountText() {
        return null;
    }
    
    public final void setMinerFeeHeaderItemAmountText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeSatItemBean> getMinerFeeSatItem() {
        return null;
    }
    
    public final void setMinerFeeSatItem(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeSatItemBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeEditBean> getMinerFeeSatItemGas() {
        return null;
    }
    
    public final void setMinerFeeSatItemGas(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeEditBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeEditBean> getMinerFeeGasItemGasPriceRange() {
        return null;
    }
    
    public final void setMinerFeeGasItemGasPriceRange(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.MinerFeeEditBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getShowToastText() {
        return null;
    }
    
    public final void setShowToastText(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isViewFinished() {
        return null;
    }
    
    public final void setViewFinished(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConfirmView() {
        return null;
    }
    
    public final void setConfirmView(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.Subject<java.lang.Boolean> getUpdateCoinBalanceSubject() {
        return null;
    }
    
    public final void setUpdateCoinBalanceSubject(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.Subject<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final boolean isPageFinish() {
        return false;
    }
    
    public final void setPageFinish(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getThrowableMessage() {
        return null;
    }
    
    public final void setThrowableMessage(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.net.ApiException> getApiThrowableLiveData() {
        return null;
    }
    
    public final void setApiThrowableLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.net.ApiException> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomId() {
        return null;
    }
    
    public final void setRoomId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoomType() {
        return null;
    }
    
    public final void setRoomType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.Disposable job) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void forceClear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> loadingView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> loadingView(boolean showLoading) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> loadingView(boolean showLoading, boolean closeLoading) {
        return null;
    }
    
    public final void viewModelLaunch(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
    }
    
    public final void viewModelLaunch(boolean showLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
    }
    
    public final void viewModelLaunch(boolean showLoading, boolean closeLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action) {
    }
    
    public final void viewModelLaunch(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errorAction) {
    }
    
    public final void viewModelLaunch(boolean showLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errorAction) {
    }
    
    public final void viewModelLaunch(boolean showLoading, boolean closeLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> errorAction) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineExceptionHandler getExceptionHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineExceptionHandler customExceptionHandler(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> action) {
        return null;
    }
    
    public final void consumerThrowable(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.BtcTransferException> getBtcTransferExceptionLiveData() {
        return null;
    }
    
    public final void setBtcTransferExceptionLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.BtcTransferException> p0) {
    }
    
    public final void consumerThrowable(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable, boolean showMessage) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getFiatRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiatRateText(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal amount, @org.jetbrains.annotations.NotNull()
    java.lang.String symbol) {
        return null;
    }
    
    public BaseViewModel() {
        super(null);
    }
}