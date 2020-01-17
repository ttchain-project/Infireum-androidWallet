package com.ttchain.walletproject.ui.coin_transfer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 O2\u00020\u0001:\u0001OB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020\u001dH\u0014J\b\u0010*\u001a\u00020\u001dH\u0002J\u0018\u0010+\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u001dH\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u00020\u001dH\u0016J\b\u00104\u001a\u00020\u001dH\u0016J\u001a\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0004H\u0002J\u0010\u0010<\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u0004H\u0002J\u0010\u0010?\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020@H\u0002J\u0010\u0010A\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020@H\u0002J\u0010\u0010B\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u0004H\u0002J\u0010\u0010D\u001a\u00020\u001d2\u0006\u0010C\u001a\u00020\u0004H\u0002J\u0010\u0010E\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020@H\u0003J\u0010\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u0004H\u0002J\u0010\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u0004H\u0003J\u0010\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u000200H\u0002J\b\u0010L\u001a\u00020\u001dH\u0002J\u0010\u0010M\u001a\u00020\u001d2\u0006\u0010K\u001a\u000200H\u0002J\u0010\u0010N\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u0010H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0010X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006P"}, d2 = {"Lcom/ttchain/walletproject/ui/coin_transfer/CoinTransferFragment;", "Lcom/ttchain/walletproject/base/BaseFragment;", "()V", "bundleAmountValue", "", "getBundleAmountValue", "()Ljava/lang/String;", "bundleAmountValue$delegate", "Lkotlin/Lazy;", "bundleCoinId", "getBundleCoinId", "bundleCoinId$delegate", "bundleReceiptAddressValue", "getBundleReceiptAddressValue", "bundleReceiptAddressValue$delegate", "layoutId", "", "getLayoutId", "()I", "menu", "Landroid/view/Menu;", "onMinerFeeSatItemGasItemListener", "Lcom/ttchain/walletproject/model/MinerFeeSatItem$OnMinerFeeSatItemGasItemListener;", "viewModel", "Lcom/ttchain/walletproject/ui/coin_transfer/CoinTransferViewModel;", "getViewModel", "()Lcom/ttchain/walletproject/ui/coin_transfer/CoinTransferViewModel;", "viewModel$delegate", "backToModifyView", "", "bean", "Lcom/ttchain/walletproject/model/CoinTransferBean;", "initAmountItem", "Lcom/ttchain/walletproject/model/TransCoinItemBean;", "initCommentItem", "initMinerFeeGasItem", "Lcom/ttchain/walletproject/model/MinerFeeGasItemBean;", "initMinerFeeHeaderItem", "initMinerFeeSatItem", "Lcom/ttchain/walletproject/model/MinerFeeSatItemBean;", "initReceiptAddressItem", "initView", "launchCommonAddressActivity", "onCreateOptionsMenu", "inflater", "Landroid/view/MenuInflater;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAmountItemContent", "content", "setCoinTransferBean", "setComment", "comment", "setMinerFeeGasItemBean", "Lcom/ttchain/walletproject/model/MinerFeeEditBean;", "setMinerFeeGasItemGasPriceRange", "setMinerFeeGasText", "text", "setMinerFeeHeaderItemAmountText", "setMinerFeeSatItemGas", "setReceiptAddress", "address", "showConfirmView", "coinName", "showMinerFeeItem", "show", "showVerifyPwdDialog", "switchMinerFeeHeaderIcon", "updateCheckedDrawableView", "Companion", "app_proPlayDebug"})
public final class CoinTransferFragment extends com.ttchain.walletproject.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private android.view.Menu menu;
    private final kotlin.Lazy bundleCoinId$delegate = null;
    private final kotlin.Lazy bundleReceiptAddressValue$delegate = null;
    private final kotlin.Lazy bundleAmountValue$delegate = null;
    private com.ttchain.walletproject.model.MinerFeeSatItem.OnMinerFeeSatItemGasItemListener onMinerFeeSatItemGasItemListener;
    private final int layoutId = com.ttchain.walletproject.R.layout.fragment_coin_transfer;
    public static final com.ttchain.walletproject.ui.coin_transfer.CoinTransferFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.ttchain.walletproject.ui.coin_transfer.CoinTransferViewModel getViewModel() {
        return null;
    }
    
    private final java.lang.String getBundleCoinId() {
        return null;
    }
    
    private final java.lang.String getBundleReceiptAddressValue() {
        return null;
    }
    
    private final java.lang.String getBundleAmountValue() {
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void initAmountItem(com.ttchain.walletproject.model.TransCoinItemBean bean) {
    }
    
    private final void setAmountItemContent(java.lang.String content) {
    }
    
    private final void initReceiptAddressItem(com.ttchain.walletproject.model.TransCoinItemBean bean) {
    }
    
    private final void initMinerFeeHeaderItem(com.ttchain.walletproject.model.TransCoinItemBean bean) {
    }
    
    private final void initMinerFeeGasItem(com.ttchain.walletproject.model.MinerFeeGasItemBean bean) {
    }
    
    private final void initMinerFeeSatItem(com.ttchain.walletproject.model.MinerFeeSatItemBean bean) {
    }
    
    private final void updateCheckedDrawableView(int view) {
    }
    
    private final void initCommentItem(com.ttchain.walletproject.model.TransCoinItemBean bean) {
    }
    
    private final void setMinerFeeHeaderItemAmountText(java.lang.String text) {
    }
    
    private final void setCoinTransferBean(com.ttchain.walletproject.model.CoinTransferBean bean) {
    }
    
    private final void setMinerFeeGasItemGasPriceRange(com.ttchain.walletproject.model.MinerFeeEditBean bean) {
    }
    
    private final void setMinerFeeGasItemBean(com.ttchain.walletproject.model.MinerFeeEditBean bean) {
    }
    
    private final void setMinerFeeGasText(java.lang.String text) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setMinerFeeSatItemGas(com.ttchain.walletproject.model.MinerFeeEditBean bean) {
    }
    
    private final void showMinerFeeItem(boolean show) {
    }
    
    private final void switchMinerFeeHeaderIcon(boolean show) {
    }
    
    private final void launchCommonAddressActivity() {
    }
    
    private final void setReceiptAddress(java.lang.String address) {
    }
    
    private final void setComment(java.lang.String comment) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void showConfirmView(java.lang.String coinName) {
    }
    
    private final void backToModifyView(com.ttchain.walletproject.model.CoinTransferBean bean) {
    }
    
    private final void showVerifyPwdDialog() {
    }
    
    public CoinTransferFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006\u00a8\u0006\t"}, d2 = {"Lcom/ttchain/walletproject/ui/coin_transfer/CoinTransferFragment$Companion;", "", "()V", "newInstance", "Lcom/ttchain/walletproject/ui/coin_transfer/CoinTransferFragment;", "coinId", "", "receiptAddress", "amount", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.ui.coin_transfer.CoinTransferFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String coinId, @org.jetbrains.annotations.NotNull()
        java.lang.String receiptAddress, @org.jetbrains.annotations.NotNull()
        java.lang.String amount) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}