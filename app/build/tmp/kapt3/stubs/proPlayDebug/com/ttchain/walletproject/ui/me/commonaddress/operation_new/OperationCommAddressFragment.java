package com.ttchain.walletproject.ui.me.commonaddress.operation_new;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\"\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u0019H\u0002J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020\u0019H\u0002J\b\u00100\u001a\u00020\u0019H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\nH\u0002J\u0010\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020,H\u0003R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u0004X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016\u00a8\u00069"}, d2 = {"Lcom/ttchain/walletproject/ui/me/commonaddress/operation_new/OperationCommAddressFragment;", "Lcom/ttchain/walletproject/base/BaseFragment;", "()V", "bundleAddressIDValue", "", "getBundleAddressIDValue", "()I", "bundleAddressIDValue$delegate", "Lkotlin/Lazy;", "bundleAddressValue", "", "getBundleAddressValue", "()Ljava/lang/String;", "bundleAddressValue$delegate", "bundleUUID", "getBundleUUID", "bundleUUID$delegate", "layoutId", "getLayoutId", "viewModel", "Lcom/ttchain/walletproject/ui/me/commonaddress/operation_new/OperationCommAddressNewViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/me/commonaddress/operation_new/OperationCommAddressNewViewModel;", "viewModel$delegate", "initData", "", "initView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onShowTipDialog", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setDisable", "setEnable", "setInputAddress", "qrCode", "setView", "addressBean", "Lcom/ttchain/walletproject/database/data/AddressData;", "showPopupMenu", "menuItemView", "Companion", "app_proPlayDebug"})
public final class OperationCommAddressFragment extends com.ttchain.walletproject.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy bundleAddressIDValue$delegate = null;
    private final kotlin.Lazy bundleAddressValue$delegate = null;
    private final kotlin.Lazy bundleUUID$delegate = null;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_add_comm_address_new_new;
    public static final com.ttchain.walletproject.ui.me.commonaddress.operation_new.OperationCommAddressFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.me.commonaddress.operation_new.OperationCommAddressNewViewModel getViewModel() {
        return null;
    }
    
    private final int getBundleAddressIDValue() {
        return 0;
    }
    
    private final java.lang.String getBundleAddressValue() {
        return null;
    }
    
    private final java.lang.String getBundleUUID() {
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
    
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    private final void showPopupMenu(android.view.View menuItemView) {
    }
    
    private final void setInputAddress(java.lang.String qrCode) {
    }
    
    private final void setView(com.ttchain.walletproject.database.data.AddressData addressBean) {
    }
    
    private final void setEnable() {
    }
    
    private final void setDisable() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void onShowTipDialog() {
    }
    
    public OperationCommAddressFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/ui/me/commonaddress/operation_new/OperationCommAddressFragment$Companion;", "", "()V", "newInstance", "Lcom/ttchain/walletproject/ui/me/commonaddress/operation_new/OperationCommAddressFragment;", "addressID", "", "address", "", "uuid", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/ttchain/walletproject/ui/me/commonaddress/operation_new/OperationCommAddressFragment;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.me.commonaddress.operation_new.OperationCommAddressFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.Integer addressID, @org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        java.lang.String uuid) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}