package com.ttchain.walletproject.ui.asset;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0014J\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\u001a\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010&\u001a\u00020\'H\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006)"}, d2 = {"Lcom/ttchain/walletproject/ui/asset/AssetListFragment;", "Lcom/ttchain/walletproject/base/BaseRecyclerViewFragmentNew;", "Lcom/ttchain/walletproject/model/CoinEntity;", "()V", "layoutId", "", "getLayoutId", "()I", "mBaseSwipeRefreshLayoutId", "getMBaseSwipeRefreshLayoutId", "recyclerViewId", "getRecyclerViewId", "viewModel", "Lcom/ttchain/walletproject/ui/asset/AssetListViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/asset/AssetListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initData", "", "initView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onRefresh", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setAdapter", "Lcom/ttchain/walletproject/ui/asset/AssetListAdapter;", "Companion", "app_proPlayDebug"})
public final class AssetListFragment extends com.ttchain.walletproject.base.BaseRecyclerViewFragmentNew<com.ttchain.walletproject.model.CoinEntity> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_asset_list;
    private final int recyclerViewId = com.ttchain.walletproject.R.id.recycler_view;
    private final int mBaseSwipeRefreshLayoutId = com.ttchain.walletproject.R.id.swipe_layout;
    public static final com.ttchain.walletproject.ui.asset.AssetListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.asset.AssetListViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
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
    protected com.ttchain.walletproject.ui.asset.AssetListAdapter setAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    public AssetListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ttchain/walletproject/ui/asset/AssetListFragment$Companion;", "", "()V", "newInstance", "Lcom/ttchain/walletproject/ui/asset/AssetListFragment;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.asset.AssetListFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}