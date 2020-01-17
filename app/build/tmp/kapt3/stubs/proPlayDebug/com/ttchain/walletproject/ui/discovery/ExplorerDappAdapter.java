package com.ttchain.walletproject.ui.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J)\u0010\u0017\u001a\u00020\r2!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bJ\u0014\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u0007\u001a\u001f\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/ttchain/walletproject/ui/discovery/ExplorerDappAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ttchain/walletproject/ui/discovery/ExplorerDappAdapter$ExplorerDappViewHolder;", "()V", "dataSet", "", "Lcom/ttchain/walletproject/model/ExplorerDappBean;", "onItemClick", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "url", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "updateData", "mData", "ExplorerDappViewHolder", "app_proPlayDebug"})
public final class ExplorerDappAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ttchain.walletproject.ui.discovery.ExplorerDappAdapter.ExplorerDappViewHolder> {
    private java.util.List<com.ttchain.walletproject.model.ExplorerDappBean> dataSet;
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick;
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClick) {
    }
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ExplorerDappBean> mData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ttchain.walletproject.ui.discovery.ExplorerDappAdapter.ExplorerDappViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.ui.discovery.ExplorerDappAdapter.ExplorerDappViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ExplorerDappAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/ui/discovery/ExplorerDappAdapter$ExplorerDappViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ttchain/walletproject/ui/discovery/ExplorerDappAdapter;Landroid/view/View;)V", "setData", "", "data", "Lcom/ttchain/walletproject/model/ExplorerDappBean;", "position", "", "app_proPlayDebug"})
    public final class ExplorerDappViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void setData(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.ExplorerDappBean data, int position) {
        }
        
        public ExplorerDappViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}