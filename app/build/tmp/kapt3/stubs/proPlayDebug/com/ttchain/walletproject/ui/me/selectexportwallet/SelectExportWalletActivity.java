package com.ttchain.walletproject.ui.me.selectexportwallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/ttchain/walletproject/ui/me/selectexportwallet/SelectExportWalletActivity;", "Lcom/ttchain/walletproject/base/BaseActivity;", "()V", "layoutId", "", "getLayoutId", "()I", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_proPlayDebug"})
public final class SelectExportWalletActivity extends com.ttchain.walletproject.base.BaseActivity {
    private final int layoutId = com.ttchain.walletproject.R.layout.activity_select_export_wallet;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BUNDLE_COIN_TYPE = "BUNDLE_COIN_TYPE";
    public static final com.ttchain.walletproject.ui.me.selectexportwallet.SelectExportWalletActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    public SelectExportWalletActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/ui/me/selectexportwallet/SelectExportWalletActivity$Companion;", "", "()V", "BUNDLE_COIN_TYPE", "", "launch", "", "activity", "Landroid/app/Activity;", "coinType", "Lcom/ttchain/walletproject/enums/CoinEnum;", "app_proPlayDebug"})
    public static final class Companion {
        
        public final void launch(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.enums.CoinEnum coinType) {
        }
        
        private Companion() {
            super();
        }
    }
}