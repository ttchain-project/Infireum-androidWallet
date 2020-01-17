package com.ttchain.walletproject.ui.ttn.ttnrecord;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001aH\u0002J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-H\u0002J\"\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a000/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a00H\u0003J\u0006\u00102\u001a\u00020)J\u0014\u00103\u001a\u00020)2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f00J\u000e\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020-J\u0010\u00107\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000f\"\u0004\b\u001c\u0010\u0011R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020%0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b\'\u0010\u0011R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/ttchain/walletproject/ui/ttn/ttnrecord/TtnRecordViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "ttnClientApiRepository", "Lcom/ttchain/walletproject/repository/TtnClientApiRepository;", "broadcastRepository", "Lcom/ttchain/walletproject/repository/BroadcastRepository;", "(Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/repository/TtnClientApiRepository;Lcom/ttchain/walletproject/repository/BroadcastRepository;)V", "performGetApiTtnTransactionRecordDataErrorListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getPerformGetApiTtnTransactionRecordDataErrorListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setPerformGetApiTtnTransactionRecordDataErrorListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "performGetApiTtnTransactionRecordDataListLiveData", "Lcom/ttchain/walletproject/model/ApiTtnBalanceResponse;", "getPerformGetApiTtnTransactionRecordDataListLiveData", "setPerformGetApiTtnTransactionRecordDataListLiveData", "performSyncTtnTransRecordDataListErrorLiveData", "getPerformSyncTtnTransRecordDataListErrorLiveData", "setPerformSyncTtnTransRecordDataListErrorLiveData", "performSyncTtnTransRecordDataListLiveData", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "getPerformSyncTtnTransRecordDataListLiveData", "setPerformSyncTtnTransRecordDataListLiveData", "resultTtnResponseBeanList", "Ljava/util/ArrayList;", "Lcom/ttchain/walletproject/model/TtnTransactionData;", "getResultTtnResponseBeanList", "()Ljava/util/ArrayList;", "setResultTtnResponseBeanList", "(Ljava/util/ArrayList;)V", "setCoinIdDataLiveData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getSetCoinIdDataLiveData", "setSetCoinIdDataLiveData", "addTransRecordData", "", "data", "getTransRecordDataByTxId", "txId", "", "mergeTransRecordCommentsListObservable", "Lio/reactivex/Observable;", "", "recordList", "performGetApiTtnTransactionRecordDataList", "performSyncTtnTransRecordDataList", "list", "setCoinIdData", "bundleValue", "updateTransRecordData", "app_proPlayDebug"})
public final class TtnRecordViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.CoinData> setCoinIdDataLiveData;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.ttchain.walletproject.model.TtnTransactionData> resultTtnResponseBeanList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> performGetApiTtnTransactionRecordDataListLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Throwable> performGetApiTtnTransactionRecordDataErrorListLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.TransRecordData> performSyncTtnTransRecordDataListLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Throwable> performSyncTtnTransRecordDataListErrorLiveData;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.repository.TtnClientApiRepository ttnClientApiRepository = null;
    private final com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.CoinData> getSetCoinIdDataLiveData() {
        return null;
    }
    
    public final void setSetCoinIdDataLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.CoinData> p0) {
    }
    
    public final void setCoinIdData(@org.jetbrains.annotations.NotNull()
    java.lang.String bundleValue) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ttchain.walletproject.model.TtnTransactionData> getResultTtnResponseBeanList() {
        return null;
    }
    
    public final void setResultTtnResponseBeanList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ttchain.walletproject.model.TtnTransactionData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> getPerformGetApiTtnTransactionRecordDataListLiveData() {
        return null;
    }
    
    public final void setPerformGetApiTtnTransactionRecordDataListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.ApiTtnBalanceResponse> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getPerformGetApiTtnTransactionRecordDataErrorListLiveData() {
        return null;
    }
    
    public final void setPerformGetApiTtnTransactionRecordDataErrorListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Throwable> p0) {
    }
    
    public final void performGetApiTtnTransactionRecordDataList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.TransRecordData> getPerformSyncTtnTransRecordDataListLiveData() {
        return null;
    }
    
    public final void setPerformSyncTtnTransRecordDataListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.TransRecordData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Throwable> getPerformSyncTtnTransRecordDataListErrorLiveData() {
        return null;
    }
    
    public final void setPerformSyncTtnTransRecordDataListErrorLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Throwable> p0) {
    }
    
    public final void performSyncTtnTransRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.TtnTransactionData> list) {
    }
    
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    private final io.reactivex.Observable<java.util.List<com.ttchain.walletproject.database.data.TransRecordData>> mergeTransRecordCommentsListObservable(java.util.List<com.ttchain.walletproject.database.data.TransRecordData> recordList) {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.TransRecordData getTransRecordDataByTxId(java.lang.String txId) {
        return null;
    }
    
    private final void updateTransRecordData(com.ttchain.walletproject.database.data.TransRecordData data) {
    }
    
    private final void addTransRecordData(com.ttchain.walletproject.database.data.TransRecordData data) {
    }
    
    public TtnRecordViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.TtnClientApiRepository ttnClientApiRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository) {
        super();
    }
}