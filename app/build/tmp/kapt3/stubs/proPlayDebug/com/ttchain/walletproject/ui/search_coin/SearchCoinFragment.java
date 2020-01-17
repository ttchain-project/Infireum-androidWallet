package com.ttchain.walletproject.ui.search_coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0016J\u001a\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\tH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/ttchain/walletproject/ui/search_coin/SearchCoinFragment;", "Lcom/ttchain/walletproject/base/BaseRecyclerViewFragmentNew;", "Lcom/ttchain/walletproject/model/CoinEntity;", "()V", "layoutId", "", "getLayoutId", "()I", "mAdapter", "Lcom/ttchain/walletproject/ui/search_coin/SearchCoinAdapter;", "mBaseSwipeRefreshLayoutId", "getMBaseSwipeRefreshLayoutId", "recyclerViewId", "getRecyclerViewId", "searchView", "Landroidx/appcompat/widget/SearchView;", "viewModel", "Lcom/ttchain/walletproject/ui/search_coin/SearchCoinViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/search_coin/SearchCoinViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initData", "", "initView", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onDestroy", "onRefresh", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "Companion", "app_proPlayDebug"})
public final class SearchCoinFragment extends com.ttchain.walletproject.base.BaseRecyclerViewFragmentNew<com.ttchain.walletproject.model.CoinEntity> {
    private final kotlin.Lazy viewModel$delegate = null;
    private final com.ttchain.walletproject.ui.search_coin.SearchCoinAdapter mAdapter = null;
    private androidx.appcompat.widget.SearchView searchView;
    private final int recyclerViewId = com.ttchain.walletproject.R.id.recycler_view;
    private final int mBaseSwipeRefreshLayoutId = com.ttchain.walletproject.R.id.swipe_layout;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_search_coin;
    public static final com.ttchain.walletproject.ui.search_coin.SearchCoinFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.search_coin.SearchCoinViewModel getViewModel() {
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
    protected com.ttchain.walletproject.ui.search_coin.SearchCoinAdapter setAdapter() {
        return null;
    }
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    private final void initData() {
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    public SearchCoinFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ttchain/walletproject/ui/search_coin/SearchCoinFragment$Companion;", "", "()V", "newInstance", "Lcom/ttchain/walletproject/ui/search_coin/SearchCoinFragment;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.search_coin.SearchCoinFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}