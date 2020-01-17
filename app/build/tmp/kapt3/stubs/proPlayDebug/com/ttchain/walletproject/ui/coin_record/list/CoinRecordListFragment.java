package com.ttchain.walletproject.ui.coin_record.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020#H\u0014R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000bX\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Lcom/ttchain/walletproject/ui/coin_record/list/CoinRecordListFragment;", "Lcom/ttchain/walletproject/base/BaseRecyclerViewFragmentNew;", "Lcom/ttchain/walletproject/model/RecordEntity;", "()V", "bundleValueBean", "Lcom/ttchain/walletproject/model/CoinRecordListBean;", "getBundleValueBean", "()Lcom/ttchain/walletproject/model/CoinRecordListBean;", "bundleValueBean$delegate", "Lkotlin/Lazy;", "layoutId", "", "getLayoutId", "()I", "mBaseSwipeRefreshLayoutId", "getMBaseSwipeRefreshLayoutId", "recyclerViewId", "getRecyclerViewId", "viewModel", "Lcom/ttchain/walletproject/ui/coin_record/list/CoinRecordListViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/coin_record/list/CoinRecordListViewModel;", "viewModel$delegate", "initData", "", "initView", "isEnableRefresh", "", "onRefresh", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "Lcom/ttchain/walletproject/ui/coin_record/list/CoinRecordListAdapter;", "Companion", "app_proPlayDebug"})
public final class CoinRecordListFragment extends com.ttchain.walletproject.base.BaseRecyclerViewFragmentNew<com.ttchain.walletproject.model.RecordEntity> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy bundleValueBean$delegate = null;
    private final int recyclerViewId = com.ttchain.walletproject.R.id.recycler_view;
    private final int mBaseSwipeRefreshLayoutId = com.ttchain.walletproject.R.id.swipe_layout;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_coin_record_list;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String _ID = "_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String _BEAN = "_BEAN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String _TYPE = "_TYPE";
    public static final com.ttchain.walletproject.ui.coin_record.list.CoinRecordListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.coin_record.list.CoinRecordListViewModel getViewModel() {
        return null;
    }
    
    private final com.ttchain.walletproject.model.CoinRecordListBean getBundleValueBean() {
        return null;
    }
    
    @java.lang.Override()
    protected int getRecyclerViewId() {
        return 0;
    }
    
    @java.lang.Override()
    protected int getMBaseSwipeRefreshLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.ttchain.walletproject.ui.coin_record.list.CoinRecordListAdapter setAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected boolean isEnableRefresh() {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    public CoinRecordListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/ui/coin_record/list/CoinRecordListFragment$Companion;", "", "()V", "_BEAN", "", "_ID", "_TYPE", "newInstance", "Lcom/ttchain/walletproject/ui/coin_record/list/CoinRecordListFragment;", "bean", "Lcom/ttchain/walletproject/model/CoinRecordListBean;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.coin_record.list.CoinRecordListFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.CoinRecordListBean bean) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}