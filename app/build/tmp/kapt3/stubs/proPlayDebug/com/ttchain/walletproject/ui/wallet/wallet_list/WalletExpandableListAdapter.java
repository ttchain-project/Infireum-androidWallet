package com.ttchain.walletproject.ui.wallet.wallet_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001:\u0003./0B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J2\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J*\u0010#\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0017J\b\u0010%\u001a\u00020\u001bH\u0016J\u0018\u0010&\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u001bJS\u0010*\u001a\u00020\u00132K\u0010\u000b\u001aG\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\fJ\u000e\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\nJ\u0014\u0010-\u001a\u00020\u00132\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000RU\u0010\u000b\u001aI\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletExpandableListAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "()V", "dataSet", "", "Lcom/ttchain/walletproject/ui/wallet/wallet_list/ExpandableListBean;", "mIndicators", "Landroid/util/SparseArray;", "Landroid/widget/ImageView;", "mOnGroupExpandedListener", "Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletExpandableListAdapter$OnGroupExpandedListener;", "onChildClick", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "groupData", "", "groupPosition", "childPosition", "", "getChild", "", "getChildId", "", "getChildView", "Landroid/view/View;", "isLastChild", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "onGroupCollapsed", "onGroupExpanded", "setIndicatorState", "setOnClickListener", "setOnGroupExpandedListener", "onGroupExpandedListener", "updateData", "ChildViewHolder", "GroupViewHolder", "OnGroupExpandedListener", "app_proPlayDebug"})
public final class WalletExpandableListAdapter extends android.widget.BaseExpandableListAdapter {
    private final android.util.SparseArray<android.widget.ImageView> mIndicators = null;
    private java.util.List<com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean> dataSet;
    private kotlin.jvm.functions.Function3<? super com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onChildClick;
    private com.ttchain.walletproject.ui.wallet.wallet_list.WalletExpandableListAdapter.OnGroupExpandedListener mOnGroupExpandedListener;
    
    public final void updateData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean> dataSet) {
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onChildClick) {
    }
    
    public final void setOnGroupExpandedListener(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.ui.wallet.wallet_list.WalletExpandableListAdapter.OnGroupExpandedListener onGroupExpandedListener) {
    }
    
    public final void setIndicatorState(int groupPosition, boolean isExpanded) {
    }
    
    @java.lang.Override()
    public int getGroupCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object getGroup(int groupPosition) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Object getChild(int groupPosition, int childPosition) {
        return null;
    }
    
    @java.lang.Override()
    public long getGroupId(int groupPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public long getChildId(int groupPosition, int childPosition) {
        return 0L;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public android.view.View getGroupView(int groupPosition, boolean isExpanded, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    
    @java.lang.Override()
    public void onGroupExpanded(int groupPosition) {
    }
    
    @java.lang.Override()
    public void onGroupCollapsed(int groupPosition) {
    }
    
    public WalletExpandableListAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletExpandableListAdapter$OnGroupExpandedListener;", "", "onGroupExpanded", "", "groupPosition", "", "app_proPlayDebug"})
    public static abstract interface OnGroupExpandedListener {
        
        public abstract void onGroupExpanded(int groupPosition);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletExpandableListAdapter$GroupViewHolder;", "", "()V", "arrowBtn", "Landroid/widget/ImageView;", "getArrowBtn$app_proPlayDebug", "()Landroid/widget/ImageView;", "setArrowBtn$app_proPlayDebug", "(Landroid/widget/ImageView;)V", "coinAmountTV", "Landroid/widget/TextView;", "getCoinAmountTV$app_proPlayDebug", "()Landroid/widget/TextView;", "setCoinAmountTV$app_proPlayDebug", "(Landroid/widget/TextView;)V", "coinFiatTV", "getCoinFiatTV$app_proPlayDebug", "setCoinFiatTV$app_proPlayDebug", "coinIV", "getCoinIV$app_proPlayDebug", "setCoinIV$app_proPlayDebug", "coinNameTV", "getCoinNameTV$app_proPlayDebug", "setCoinNameTV$app_proPlayDebug", "app_proPlayDebug"})
    static final class GroupViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView coinIV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView coinNameTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView coinAmountTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView coinFiatTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView arrowBtn;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getCoinIV$app_proPlayDebug() {
            return null;
        }
        
        public final void setCoinIV$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getCoinNameTV$app_proPlayDebug() {
            return null;
        }
        
        public final void setCoinNameTV$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getCoinAmountTV$app_proPlayDebug() {
            return null;
        }
        
        public final void setCoinAmountTV$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getCoinFiatTV$app_proPlayDebug() {
            return null;
        }
        
        public final void setCoinFiatTV$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getArrowBtn$app_proPlayDebug() {
            return null;
        }
        
        public final void setArrowBtn$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        public GroupViewHolder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletExpandableListAdapter$ChildViewHolder;", "", "()V", "arrowBtn", "Landroid/widget/ImageView;", "getArrowBtn$app_proPlayDebug", "()Landroid/widget/ImageView;", "setArrowBtn$app_proPlayDebug", "(Landroid/widget/ImageView;)V", "walletAmountTV", "Landroid/widget/TextView;", "getWalletAmountTV$app_proPlayDebug", "()Landroid/widget/TextView;", "setWalletAmountTV$app_proPlayDebug", "(Landroid/widget/TextView;)V", "walletFiatTV", "getWalletFiatTV$app_proPlayDebug", "setWalletFiatTV$app_proPlayDebug", "walletNameTV", "getWalletNameTV$app_proPlayDebug", "setWalletNameTV$app_proPlayDebug", "app_proPlayDebug"})
    static final class ChildViewHolder {
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView walletNameTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView walletAmountTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView walletFiatTV;
        @org.jetbrains.annotations.Nullable()
        private android.widget.ImageView arrowBtn;
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getWalletNameTV$app_proPlayDebug() {
            return null;
        }
        
        public final void setWalletNameTV$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getWalletAmountTV$app_proPlayDebug() {
            return null;
        }
        
        public final void setWalletAmountTV$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getWalletFiatTV$app_proPlayDebug() {
            return null;
        }
        
        public final void setWalletFiatTV$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.ImageView getArrowBtn$app_proPlayDebug() {
            return null;
        }
        
        public final void setArrowBtn$app_proPlayDebug(@org.jetbrains.annotations.Nullable()
        android.widget.ImageView p0) {
        }
        
        public ChildViewHolder() {
            super();
        }
    }
}