package com.ttchain.walletproject.ui.wallet.wallet_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletListFragment;", "Lcom/ttchain/walletproject/base/BaseFragment;", "()V", "layoutId", "", "getLayoutId", "()I", "mAdapter", "Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletExpandableListAdapter;", "viewModel", "Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletListViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "walletId", "initData", "", "initView", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_proPlayDebug"})
public final class WalletListFragment extends com.ttchain.walletproject.base.BaseFragment {
    private int walletId;
    private final com.ttchain.walletproject.ui.wallet.wallet_list.WalletExpandableListAdapter mAdapter = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_wallet_list;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String _ID = "_ID";
    public static final int MAIN_COIN = 0;
    public static final int STABLE_COIN = 1;
    public static final com.ttchain.walletproject.ui.wallet.wallet_list.WalletListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.wallet.wallet_list.WalletListViewModel getViewModel() {
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
    protected void initView() {
    }
    
    private final void initData() {
    }
    
    public WalletListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletListFragment$Companion;", "", "()V", "MAIN_COIN", "", "STABLE_COIN", "_ID", "", "newInstance", "Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletListFragment;", "id", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.wallet.wallet_list.WalletListFragment newInstance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.wallet.wallet_list.WalletListFragment newInstance(int id) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}