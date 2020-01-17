package com.ttchain.walletproject.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\rR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ttchain/walletproject/view/FormView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/ttchain/walletproject/view/FormView$Adapter;", "dataSetObserver", "Landroid/database/DataSetObserver;", "onItemClickListener", "Lcom/ttchain/walletproject/view/FormView$OnItemClickListener;", "onDetachedFromWindow", "", "reloadChildView", "setAdapter", "setOnItemClickListener", "listener", "Adapter", "ItemView", "OnItemClickListener", "app_proPlayDebug"})
public final class FormView extends android.widget.LinearLayout {
    private com.ttchain.walletproject.view.FormView.OnItemClickListener onItemClickListener;
    private com.ttchain.walletproject.view.FormView.Adapter adapter;
    private final android.database.DataSetObserver dataSetObserver = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onDetachedFromWindow() {
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.view.FormView.Adapter adapter) {
    }
    
    private final void reloadChildView() {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.view.FormView.OnItemClickListener listener) {
    }
    
    public FormView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public FormView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/ttchain/walletproject/view/FormView$OnItemClickListener;", "", "onItemClick", "", "var1", "Landroid/view/View;", "var2", "", "app_proPlayDebug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
        android.view.View var1, int var2);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/ttchain/walletproject/view/FormView$ItemView;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clickable", "", "getContext", "()Landroid/content/Context;", "setContext", "layoutId", "", "getLayoutId", "()I", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "getClickable", "setClickable", "", "flag", "app_proPlayDebug"})
    public static abstract class ItemView {
        @org.jetbrains.annotations.NotNull()
        private final android.view.View view = null;
        private boolean clickable;
        @org.jetbrains.annotations.NotNull()
        private android.content.Context context;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getView() {
            return null;
        }
        
        public abstract int getLayoutId();
        
        public final void setClickable(boolean flag) {
        }
        
        public final boolean getClickable() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        protected final android.content.Context getContext() {
            return null;
        }
        
        protected final void setContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        public ItemView(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ttchain/walletproject/view/FormView$Adapter;", "", "()V", "count", "", "getCount", "()I", "dataSetObservable", "Landroid/database/DataSetObservable;", "list", "Ljava/util/ArrayList;", "Lcom/ttchain/walletproject/view/FormView$ItemView;", "add", "itemView", "position", "getItemView", "getView", "Landroid/view/View;", "notifyDataSetChanged", "", "registerDataSetObserver", "observer", "Landroid/database/DataSetObserver;", "remove", "removeAll", "unregisterDataSetObserver", "app_proPlayDebug"})
    public static final class Adapter {
        private final android.database.DataSetObservable dataSetObservable = null;
        private final java.util.ArrayList<com.ttchain.walletproject.view.FormView.ItemView> list = null;
        
        public final int getCount() {
            return 0;
        }
        
        public final void registerDataSetObserver(@org.jetbrains.annotations.NotNull()
        android.database.DataSetObserver observer) {
        }
        
        public final void unregisterDataSetObserver(@org.jetbrains.annotations.NotNull()
        android.database.DataSetObserver observer) {
        }
        
        public final void notifyDataSetChanged() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.view.View getView(int position) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.ttchain.walletproject.view.FormView.ItemView getItemView(int position) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.view.FormView.Adapter add(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.view.FormView.ItemView itemView) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.view.FormView.Adapter add(int position, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.view.FormView.ItemView itemView) {
            return null;
        }
        
        public final void remove(int position) {
        }
        
        public final void removeAll() {
        }
        
        public Adapter() {
            super();
        }
    }
}