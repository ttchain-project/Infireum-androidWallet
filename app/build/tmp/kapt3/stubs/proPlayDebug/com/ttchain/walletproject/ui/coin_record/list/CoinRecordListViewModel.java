package com.ttchain.walletproject.ui.coin_record.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u001cJ\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/ttchain/walletproject/ui/coin_record/list/CoinRecordListViewModel;", "Lcom/ttchain/walletproject/base/BaseRecyclerViewViewModel;", "Lcom/ttchain/walletproject/model/RecordEntity;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "recordModel", "Lcom/ttchain/walletproject/model/RecordModel;", "(Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/model/RecordModel;)V", "clickUrlSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "entitySize", "", "launchUrlLivaData", "Landroidx/lifecycle/MutableLiveData;", "getLaunchUrlLivaData", "()Landroidx/lifecycle/MutableLiveData;", "setLaunchUrlLivaData", "(Landroidx/lifecycle/MutableLiveData;)V", "mCoinId", "mRecordState", "mRecordType", "queryBean", "Lcom/ttchain/walletproject/model/RecordQueryBean;", "hasNextPage", "", "loadMoreRequest", "", "normalRequest", "onClickDetail", "url", "onViewCreate", "performGetTransRecordEntityList", "performGetUsdtTransRecordEntityList", "setBean", "bean", "Lcom/ttchain/walletproject/model/CoinRecordListBean;", "app_proPlayDebug"})
public final class CoinRecordListViewModel extends com.ttchain.walletproject.base.BaseRecyclerViewViewModel<com.ttchain.walletproject.model.RecordEntity> {
    private java.lang.String mCoinId;
    private int mRecordType;
    private int mRecordState;
    private com.ttchain.walletproject.model.RecordQueryBean queryBean;
    private int entitySize;
    private final io.reactivex.subjects.PublishSubject<java.lang.String> clickUrlSubject = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> launchUrlLivaData;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.model.RecordModel recordModel = null;
    
    public final void setBean(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.CoinRecordListBean bean) {
    }
    
    public final void onClickDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLaunchUrlLivaData() {
        return null;
    }
    
    public final void setLaunchUrlLivaData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void onViewCreate() {
    }
    
    @java.lang.Override()
    public void normalRequest() {
    }
    
    private final void performGetTransRecordEntityList() {
    }
    
    private final void performGetUsdtTransRecordEntityList() {
    }
    
    @java.lang.Override()
    public void loadMoreRequest() {
    }
    
    public final boolean hasNextPage() {
        return false;
    }
    
    public CoinRecordListViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.RecordModel recordModel) {
        super();
    }
}