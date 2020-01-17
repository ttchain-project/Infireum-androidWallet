package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010F\u001a\u00020>2\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000HJ\b\u0010I\u001a\u00020JH\u0004J\b\u0010K\u001a\u00020JH\u0004J\b\u0010L\u001a\u0004\u0018\u00010MJ\u0006\u0010N\u001a\u00020>J\b\u0010O\u001a\u00020JH\u0004J\b\u0010P\u001a\u00020JH\u0004J\b\u0010Q\u001a\u00020JH\u0014J\u0006\u0010R\u001a\u00020>J\u000e\u0010S\u001a\u00020>2\u0006\u0010T\u001a\u00020JJ\u0006\u0010U\u001a\u00020>J(\u00109\u001a\u00020>2\u000e\u0010V\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010W\u001a\u00020\u001b2\u0006\u0010A\u001a\u000206H\u0016J\b\u0010B\u001a\u00020>H\u0016J\u0006\u0010X\u001a\u00020>J\u001a\u0010Y\u001a\u00020>2\u0006\u0010W\u001a\u00020\u001b2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0016J\u0014\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\bH$J\u000e\u0010]\u001a\u00020>2\u0006\u0010^\u001a\u00020_J\u000e\u0010`\u001a\u00020>2\u0006\u0010a\u001a\u000206J\b\u0010b\u001a\u00020cH\u0004J\u0014\u0010d\u001a\u00020>2\f\u0010e\u001a\b\u0012\u0004\u0012\u00028\u00000fJ\b\u0010g\u001a\u00020hH\u0004J)\u0010i\u001a\u00020>2!\u00109\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020>0:J>\u0010j\u001a\u00020>26\u0010?\u001a2\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0013\u0012\u001106\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020>0@J\u0014\u0010k\u001a\u00020>2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020>0CJ\b\u0010l\u001a\u000206H\u0004J\n\u0010m\u001a\u0004\u0018\u00010nH\u0004J\u0006\u0010o\u001a\u00020>R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0015X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0012\u00105\u001a\u000206X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u00108R+\u00109\u001a\u001f\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020>\u0018\u00010:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R@\u0010?\u001a4\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0013\u0012\u001106\u00a2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020>\u0018\u00010@X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010B\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010D\u001a\u000206X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\bE\u00108\u00a8\u0006p"}, d2 = {"Lcom/ttchain/walletproject/base/BaseRecyclerViewFragmentNew;", "L", "Lcom/ttchain/walletproject/base/BaseFragment;", "Lcom/chad/library/adapter/base/BaseQuickAdapter$RequestLoadMoreListener;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;", "()V", "mBaseAdapter", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "getMBaseAdapter", "()Lcom/chad/library/adapter/base/BaseQuickAdapter;", "setMBaseAdapter", "(Lcom/chad/library/adapter/base/BaseQuickAdapter;)V", "mBaseEmptyImageView", "Landroid/widget/ImageView;", "getMBaseEmptyImageView", "()Landroid/widget/ImageView;", "setMBaseEmptyImageView", "(Landroid/widget/ImageView;)V", "mBaseEmptyMsg", "Landroid/widget/TextView;", "getMBaseEmptyMsg", "()Landroid/widget/TextView;", "setMBaseEmptyMsg", "(Landroid/widget/TextView;)V", "mBaseEmptyView", "Landroid/view/View;", "getMBaseEmptyView", "()Landroid/view/View;", "setMBaseEmptyView", "(Landroid/view/View;)V", "mBaseLargeEmptyMsg", "getMBaseLargeEmptyMsg", "setMBaseLargeEmptyMsg", "mBaseNewAdapter", "Lcom/ttchain/walletproject/base/BaseRecyclerViewAdapter;", "getMBaseNewAdapter", "()Lcom/ttchain/walletproject/base/BaseRecyclerViewAdapter;", "setMBaseNewAdapter", "(Lcom/ttchain/walletproject/base/BaseRecyclerViewAdapter;)V", "mBaseRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMBaseRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMBaseRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "mBaseSwipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getMBaseSwipeRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setMBaseSwipeRefreshLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "mBaseSwipeRefreshLayoutId", "", "getMBaseSwipeRefreshLayoutId", "()I", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "", "onItemClickWithPosition", "Lkotlin/Function2;", "position", "onLoadMoreRequested", "Lkotlin/Function0;", "recyclerViewId", "getRecyclerViewId", "addArrayListData", "data", "", "canScrollHorizontal", "", "canScrollVertical", "getLinearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "hideRefreshLoading", "isEnableItemClick", "isEnableItemDecoration", "isEnableRefresh", "loadMoreComplete", "loadMoreEnd", "status", "onHideRecyclerViewLoading", "adapter", "view", "onShowRecyclerViewLoading", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setEmptyMsg", "msg", "", "setEmptyViewVisibility", "visibility", "setLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setListData", "list", "", "setLoadMoreView", "Lcom/chad/library/adapter/base/loadmore/LoadMoreView;", "setOnItemClickListener", "setOnItemClickWithPositionListener", "setOnLoadMoreRequestedListener", "setOpenLoadAnimation", "setSpanSizeLookup", "Lcom/chad/library/adapter/base/BaseQuickAdapter$SpanSizeLookup;", "showRefreshLoading", "app_proPlayDebug"})
public abstract class BaseRecyclerViewFragmentNew<L extends java.lang.Object> extends com.ttchain.walletproject.base.BaseFragment implements com.chad.library.adapter.base.BaseQuickAdapter.RequestLoadMoreListener, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener, com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener {
    private kotlin.jvm.functions.Function1<? super L, kotlin.Unit> onItemClick;
    private kotlin.jvm.functions.Function2<? super L, ? super java.lang.Integer, kotlin.Unit> onItemClickWithPosition;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMoreRequested;
    @org.jetbrains.annotations.Nullable()
    private com.chad.library.adapter.base.BaseQuickAdapter<L, com.chad.library.adapter.base.BaseViewHolder> mBaseAdapter;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.base.BaseRecyclerViewAdapter<L> mBaseNewAdapter;
    @org.jetbrains.annotations.Nullable()
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout mBaseSwipeRefreshLayout;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView mBaseRecyclerView;
    @org.jetbrains.annotations.Nullable()
    private android.view.View mBaseEmptyView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView mBaseEmptyImageView;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView mBaseLargeEmptyMsg;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView mBaseEmptyMsg;
    private java.util.HashMap _$_findViewCache;
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super L, kotlin.Unit> onItemClick) {
    }
    
    public final void setOnItemClickWithPositionListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super L, ? super java.lang.Integer, kotlin.Unit> onItemClickWithPosition) {
    }
    
    public final void setOnLoadMoreRequestedListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoadMoreRequested) {
    }
    
    protected abstract int getRecyclerViewId();
    
    protected abstract int getMBaseSwipeRefreshLayoutId();
    
    @org.jetbrains.annotations.Nullable()
    protected final com.chad.library.adapter.base.BaseQuickAdapter<L, com.chad.library.adapter.base.BaseViewHolder> getMBaseAdapter() {
        return null;
    }
    
    protected final void setMBaseAdapter(@org.jetbrains.annotations.Nullable()
    com.chad.library.adapter.base.BaseQuickAdapter<L, com.chad.library.adapter.base.BaseViewHolder> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.ttchain.walletproject.base.BaseRecyclerViewAdapter<L> getMBaseNewAdapter() {
        return null;
    }
    
    protected final void setMBaseNewAdapter(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.base.BaseRecyclerViewAdapter<L> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final androidx.swiperefreshlayout.widget.SwipeRefreshLayout getMBaseSwipeRefreshLayout() {
        return null;
    }
    
    protected final void setMBaseSwipeRefreshLayout(@org.jetbrains.annotations.Nullable()
    androidx.swiperefreshlayout.widget.SwipeRefreshLayout p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final androidx.recyclerview.widget.RecyclerView getMBaseRecyclerView() {
        return null;
    }
    
    protected final void setMBaseRecyclerView(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.view.View getMBaseEmptyView() {
        return null;
    }
    
    protected final void setMBaseEmptyView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.widget.ImageView getMBaseEmptyImageView() {
        return null;
    }
    
    protected final void setMBaseEmptyImageView(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.widget.TextView getMBaseLargeEmptyMsg() {
        return null;
    }
    
    protected final void setMBaseLargeEmptyMsg(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.widget.TextView getMBaseEmptyMsg() {
        return null;
    }
    
    protected final void setMBaseEmptyMsg(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    protected final boolean canScrollVertical() {
        return false;
    }
    
    protected final boolean canScrollHorizontal() {
        return false;
    }
    
    protected final boolean isEnableItemDecoration() {
        return false;
    }
    
    protected final boolean isEnableItemClick() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract com.chad.library.adapter.base.BaseQuickAdapter<L, com.chad.library.adapter.base.BaseViewHolder> setAdapter();
    
    /**
     * Override when you want to use others LoadMoreView.
     *
     * @return [NormalLoadMoreView]
     */
    @org.jetbrains.annotations.NotNull()
    protected final com.chad.library.adapter.base.loadmore.LoadMoreView setLoadMoreView() {
        return null;
    }
    
    /**
     * Override parameters into one of those: ALPHAIN, SCALEIN, SLIDEIN_BOTTOM, SLIDEIN_LEFT, SLIDEIN_RIGHT.
     *
     * @return -1 in default to disable.
     */
    protected final int setOpenLoadAnimation() {
        return 0;
    }
    
    /**
     * Override when you want to change the default LayoutManager type.
     *
     * @return LinearLayoutManager in default.
     */
    @org.jetbrains.annotations.NotNull()
    protected final androidx.recyclerview.widget.RecyclerView.LayoutManager setLayoutManager() {
        return null;
    }
    
    /**
     * Override when you use the BaseMultiItemQuickAdapter.
     *
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    protected final com.chad.library.adapter.base.BaseQuickAdapter.SpanSizeLookup setSpanSizeLookup() {
        return null;
    }
    
    protected boolean isEnableRefresh() {
        return false;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.BaseQuickAdapter<?, ?> adapter, @org.jetbrains.annotations.NotNull()
    android.view.View view, int position) {
    }
    
    public final void setListData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends L> list) {
    }
    
    public final void addArrayListData(@org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends L> data) {
    }
    
    public final void loadMoreComplete() {
    }
    
    public final void loadMoreEnd(boolean status) {
    }
    
    public final void showRefreshLoading() {
    }
    
    public final void hideRefreshLoading() {
    }
    
    public final void onShowRecyclerViewLoading() {
    }
    
    public final void onHideRecyclerViewLoading() {
    }
    
    public final void setEmptyViewVisibility(int visibility) {
    }
    
    public final void setEmptyMsg(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager() {
        return null;
    }
    
    @java.lang.Override()
    public void onLoadMoreRequested() {
    }
    
    public BaseRecyclerViewFragmentNew() {
        super();
    }
}