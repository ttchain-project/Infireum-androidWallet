package com.ttchain.walletproject.ui.me;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/ttchain/walletproject/ui/me/MeFragment;", "Lcom/ttchain/walletproject/base/BaseFragment;", "()V", "fileName", "", "layoutId", "", "getLayoutId", "()I", "position", "viewModel", "Lcom/ttchain/walletproject/ui/me/MeViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/me/MeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "checkPwd", "", "it", "hint", "downloadApk", "initData", "initView", "install", "launchHockeyAppDownloadPage", "launchInstall", "intent", "Landroid/content/Intent;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showDeleteAccountWarnDialog", "showVerifyDialog", "Companion", "app_proPlayDebug"})
public final class MeFragment extends com.ttchain.walletproject.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private int position;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_setting;
    private final java.lang.String fileName = "TtnProBeta.apk";
    public static final com.ttchain.walletproject.ui.me.MeFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.me.MeViewModel getViewModel() {
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
    
    private final void showVerifyDialog() {
    }
    
    private final void checkPwd(java.lang.String it, java.lang.String hint) {
    }
    
    private final void showDeleteAccountWarnDialog() {
    }
    
    private final void downloadApk() {
    }
    
    private final void install() {
    }
    
    public final void launchHockeyAppDownloadPage() {
    }
    
    private final void launchInstall(android.content.Intent intent) {
    }
    
    public MeFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ttchain/walletproject/ui/me/MeFragment$Companion;", "", "()V", "newInstance", "Lcom/ttchain/walletproject/ui/me/MeFragment;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.me.MeFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}