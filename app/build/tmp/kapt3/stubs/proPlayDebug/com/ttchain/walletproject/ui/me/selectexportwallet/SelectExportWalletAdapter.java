package com.ttchain.walletproject.ui.me.selectexportwallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005J)\u0010\u0019\u001a\u00020\u000e2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\nJ\u0014\u0010\u001a\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/ttchain/walletproject/ui/me/selectexportwallet/SelectExportWalletAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ttchain/walletproject/ui/me/selectexportwallet/SelectExportWalletAdapter$SelectExportWalletViewHolder;", "()V", "coinEnum", "Lcom/ttchain/walletproject/enums/CoinEnum;", "dataSet", "", "Lcom/ttchain/walletproject/database/data/WalletData;", "onSelectExportWalletClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCoinEnum", "setOnSelectExportWalletClickListener", "updateData", "SelectExportWalletViewHolder", "app_proPlayDebug"})
public final class SelectExportWalletAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ttchain.walletproject.ui.me.selectexportwallet.SelectExportWalletAdapter.SelectExportWalletViewHolder> {
    private java.util.List<com.ttchain.walletproject.database.data.WalletData> dataSet;
    private kotlin.jvm.functions.Function1<? super com.ttchain.walletproject.database.data.WalletData, kotlin.Unit> onSelectExportWalletClick;
    private com.ttchain.walletproject.enums.CoinEnum coinEnum;
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.WalletData> dataSet) {
    }
    
    public final void setOnSelectExportWalletClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ttchain.walletproject.database.data.WalletData, kotlin.Unit> onSelectExportWalletClick) {
    }
    
    public final void setCoinEnum(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.CoinEnum coinEnum) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.ui.me.selectexportwallet.SelectExportWalletAdapter.SelectExportWalletViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.ui.me.selectexportwallet.SelectExportWalletAdapter.SelectExportWalletViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public SelectExportWalletAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/ttchain/walletproject/ui/me/selectexportwallet/SelectExportWalletAdapter$SelectExportWalletViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ttchain/walletproject/ui/me/selectexportwallet/SelectExportWalletAdapter;Landroid/view/View;)V", "setData", "", "data", "Lcom/ttchain/walletproject/database/data/WalletData;", "app_proPlayDebug"})
    public final class SelectExportWalletViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.database.data.WalletData data) {
        }
        
        public SelectExportWalletViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}