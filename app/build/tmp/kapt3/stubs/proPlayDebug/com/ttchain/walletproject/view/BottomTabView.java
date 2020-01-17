package com.ttchain.walletproject.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fJ)\u0010\u0017\u001a\u00020\u00122!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u000eJ\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R+\u0010\r\u001a\u001f\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ttchain/walletproject/view/BottomTabView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "currentPosition", "Lcom/ttchain/walletproject/enums/BottomTabState;", "onItemClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "status", "", "tabButtonClickListener", "Lcom/ttchain/walletproject/utils/DelayOnClickListener;", "init", "setItemClick", "setOnItemClickListener", "l", "setTabPosition", "app_proPlayDebug"})
public final class BottomTabView extends androidx.constraintlayout.widget.ConstraintLayout {
    private kotlin.jvm.functions.Function1<? super com.ttchain.walletproject.enums.BottomTabState, kotlin.Unit> onItemClickListener;
    private com.ttchain.walletproject.enums.BottomTabState currentPosition;
    private final com.ttchain.walletproject.utils.DelayOnClickListener tabButtonClickListener = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.ttchain.walletproject.enums.BottomTabState, kotlin.Unit> l) {
    }
    
    public final void setItemClick(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.BottomTabState status) {
    }
    
    private final void init(android.content.Context context) {
    }
    
    public final void setTabPosition(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.BottomTabState status) {
    }
    
    public BottomTabView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public BottomTabView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public BottomTabView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
}