package com.ttchain.walletproject.ui.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ttchain/walletproject/ui/discovery/ExplorerTrendAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ttchain/walletproject/ui/discovery/ExplorerTrendAdapter$ExplorerTrendViewHolder;", "()V", "dataSet", "", "Lcom/ttchain/walletproject/model/ExplorerListEntity;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateData", "data", "ExplorerTrendViewHolder", "app_proPlayDebug"})
public final class ExplorerTrendAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ttchain.walletproject.ui.discovery.ExplorerTrendAdapter.ExplorerTrendViewHolder> {
    private java.util.List<com.ttchain.walletproject.model.ExplorerListEntity> dataSet;
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ExplorerListEntity> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.ui.discovery.ExplorerTrendAdapter.ExplorerTrendViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.ui.discovery.ExplorerTrendAdapter.ExplorerTrendViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ExplorerTrendAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/ui/discovery/ExplorerTrendAdapter$ExplorerTrendViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ttchain/walletproject/ui/discovery/ExplorerTrendAdapter;Landroid/view/View;)V", "setData", "", "data", "Lcom/ttchain/walletproject/model/ExplorerListEntity;", "position", "", "app_proPlayDebug"})
    public final class ExplorerTrendViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void setData(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.ExplorerListEntity data, int position) {
        }
        
        public ExplorerTrendViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}