package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0006\b&\u0018\u0000 7*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u000278B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0013H\u0004J\b\u0010&\u001a\u00020\'H\u0015J \u0010(\u001a\u000e\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H*0)\"\u0004\b\u0001\u0010*2\u0006\u0010+\u001a\u00020\u0013J(\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H*0)\"\u0004\b\u0001\u0010*2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\fJ0\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H*\u0012\u0004\u0012\u0002H*0)\"\u0004\b\u0001\u0010*2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\fJ\b\u0010.\u001a\u00020\'H\u0016J\u0016\u0010/\u001a\u00020\'2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0004J\u0010\u00101\u001a\u00020\'2\u0006\u00102\u001a\u000203H\u0004J\b\u00104\u001a\u00020\'H\u0015J\u0010\u00105\u001a\u00020\'2\u0006\u00106\u001a\u00020\u0013H\u0004R&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\r\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\nR&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\b\"\u0004\b#\u0010\n\u00a8\u00069"}, d2 = {"Lcom/ttchain/walletproject/base/BaseRecyclerViewViewModel;", "L", "Lcom/ttchain/walletproject/base/BaseViewModel;", "()V", "addArrayListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getAddArrayListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setAddArrayListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "isLoadMoreComplete", "", "setLoadMoreComplete", "isLoadMoreEnd", "setLoadMoreEnd", "isRefreshLoading", "setRefreshLoading", "mPageNow", "", "getMPageNow", "()I", "setMPageNow", "(I)V", "mRequestStatus", "getMRequestStatus", "setMRequestStatus", "onShowMessageDialog", "", "getOnShowMessageDialog", "setEmptyMsg", "getSetEmptyMsg", "setSetEmptyMsg", "setListDataLiveData", "getSetListDataLiveData", "setSetListDataLiveData", "hasNextPage", "total", "loadMoreRequest", "", "loadingRecyclerView", "Lio/reactivex/ObservableTransformer;", "T", "status", "showLoading", "closeLoading", "normalRequest", "onSubscribeComplete", "list", "onSubscribeError", "throwable", "", "refreshRequest", "setNextPage", "next", "Companion", "RequestStatus", "app_proPlayDebug"})
public abstract class BaseRecyclerViewViewModel<L extends java.lang.Object> extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRefreshLoading;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadMoreEnd;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadMoreComplete;
    private int mPageNow;
    private int mRequestStatus;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<L>> addArrayListLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<L>> setListDataLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> setEmptyMsg;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> onShowMessageDialog = null;
    public static final int NORMAL_REQUEST = 9001;
    public static final int LOAD_MORE_REQUEST = 9002;
    public static final int REFRESH_REQUEST = 9003;
    public static final com.ttchain.walletproject.base.BaseRecyclerViewViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRefreshLoading() {
        return null;
    }
    
    public final void setRefreshLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadMoreEnd() {
        return null;
    }
    
    public final void setLoadMoreEnd(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoadMoreComplete() {
        return null;
    }
    
    public final void setLoadMoreComplete(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    protected final int getMPageNow() {
        return 0;
    }
    
    protected final void setMPageNow(int p0) {
    }
    
    public final int getMRequestStatus() {
        return 0;
    }
    
    public final void setMRequestStatus(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> loadingRecyclerView(@com.ttchain.walletproject.base.BaseRecyclerViewViewModel.RequestStatus()
    int status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> loadingRecyclerView(@com.ttchain.walletproject.base.BaseRecyclerViewViewModel.RequestStatus()
    int status, boolean showLoading) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.ObservableTransformer<T, T> loadingRecyclerView(@com.ttchain.walletproject.base.BaseRecyclerViewViewModel.RequestStatus()
    int status, boolean showLoading, boolean closeLoading) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<L>> getAddArrayListLiveData() {
        return null;
    }
    
    public final void setAddArrayListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<L>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<L>> getSetListDataLiveData() {
        return null;
    }
    
    public final void setSetListDataLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<L>> p0) {
    }
    
    protected final void onSubscribeComplete(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends L> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSetEmptyMsg() {
        return null;
    }
    
    public final void setSetEmptyMsg(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOnShowMessageDialog() {
        return null;
    }
    
    protected final void onSubscribeError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    protected final void setNextPage(int next) {
    }
    
    public void normalRequest() {
    }
    
    protected final boolean hasNextPage(int total) {
        return false;
    }
    
    @androidx.annotation.CallSuper()
    protected void loadMoreRequest() {
    }
    
    @androidx.annotation.CallSuper()
    protected void refreshRequest() {
    }
    
    public BaseRecyclerViewViewModel() {
        super();
    }
    
    @androidx.annotation.IntDef(value = {9001, 9002, 9003})
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/ttchain/walletproject/base/BaseRecyclerViewViewModel$RequestStatus;", "", "app_proPlayDebug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface RequestStatus {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/ttchain/walletproject/base/BaseRecyclerViewViewModel$Companion;", "", "()V", "LOAD_MORE_REQUEST", "", "NORMAL_REQUEST", "REFRESH_REQUEST", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}