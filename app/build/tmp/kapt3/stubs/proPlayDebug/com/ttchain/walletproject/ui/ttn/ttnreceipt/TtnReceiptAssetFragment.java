package com.ttchain.walletproject.ui.ttn.ttnreceipt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0018H\u0003R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\""}, d2 = {"Lcom/ttchain/walletproject/ui/ttn/ttnreceipt/TtnReceiptAssetFragment;", "Lcom/ttchain/walletproject/base/BaseFragment;", "()V", "layoutId", "", "getLayoutId", "()I", "viewModel", "Lcom/ttchain/walletproject/ui/ttn/ttnreceipt/TtnReceiptAssetViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/ttn/ttnreceipt/TtnReceiptAssetViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getSaveTmpFileUri", "Landroid/net/Uri;", "initData", "", "initView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "shareImageIntent", "fileUri", "shareTitle", "", "showPopupMenu", "menuItemView", "Companion", "app_proPlayDebug"})
public final class TtnReceiptAssetFragment extends com.ttchain.walletproject.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_ttn_receipt_asset;
    public static final com.ttchain.walletproject.ui.ttn.ttnreceipt.TtnReceiptAssetFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.ttn.ttnreceipt.TtnReceiptAssetViewModel getViewModel() {
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
    protected void initView() {
    }
    
    private final void initData() {
    }
    
    private final android.net.Uri getSaveTmpFileUri() {
        return null;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void showPopupMenu(android.view.View menuItemView) {
    }
    
    private final void shareImageIntent(android.net.Uri fileUri, java.lang.String shareTitle) {
    }
    
    public TtnReceiptAssetFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ttchain/walletproject/ui/ttn/ttnreceipt/TtnReceiptAssetFragment$Companion;", "", "()V", "newInstance", "Lcom/ttchain/walletproject/ui/ttn/ttnreceipt/TtnReceiptAssetFragment;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.ttn.ttnreceipt.TtnReceiptAssetFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}