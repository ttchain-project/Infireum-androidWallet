package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010L\u001a\u00020\f2\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010N\u001a\u00020\u0006H\u00d6\u0001J\t\u0010O\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0004R\u001a\u0010$\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010\u0004R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\b\"\u0004\b5\u0010\nR\u001a\u00106\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\b\"\u0004\b8\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010\u0004R\u001a\u0010;\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\"\"\u0004\b=\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010D\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u000e\"\u0004\bF\u0010\u0010R\u001a\u0010G\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\b\"\u0004\bI\u0010\n\u00a8\u0006P"}, d2 = {"Lcom/ttchain/walletproject/model/TransCoinItemBean;", "", "name", "", "(Ljava/lang/String;)V", "focusedDrawableRes", "", "getFocusedDrawableRes", "()I", "setFocusedDrawableRes", "(I)V", "hasFiatEquals", "", "getHasFiatEquals", "()Z", "setHasFiatEquals", "(Z)V", "hasFocusedChecked", "getHasFocusedChecked", "setHasFocusedChecked", "hideInputText", "getHideInputText", "setHideInputText", "inputFocusChangedListener", "Landroid/view/View$OnFocusChangeListener;", "getInputFocusChangedListener", "()Landroid/view/View$OnFocusChangeListener;", "setInputFocusChangedListener", "(Landroid/view/View$OnFocusChangeListener;)V", "inputHideUnderLine", "getInputHideUnderLine", "setInputHideUnderLine", "inputHintText", "getInputHintText", "()Ljava/lang/String;", "setInputHintText", "inputText", "getInputText", "setInputText", "inputTextChangedListener", "Landroid/text/TextWatcher;", "getInputTextChangedListener", "()Landroid/text/TextWatcher;", "setInputTextChangedListener", "(Landroid/text/TextWatcher;)V", "inputTextSize", "", "getInputTextSize", "()F", "setInputTextSize", "(F)V", "layoutPaddingBottom", "getLayoutPaddingBottom", "setLayoutPaddingBottom", "layoutPaddingTop", "getLayoutPaddingTop", "setLayoutPaddingTop", "getName", "setName", "subName", "getSubName", "setSubName", "subNameCallListener", "Landroid/view/View$OnClickListener;", "getSubNameCallListener", "()Landroid/view/View$OnClickListener;", "setSubNameCallListener", "(Landroid/view/View$OnClickListener;)V", "subNameClickable", "getSubNameClickable", "setSubNameClickable", "subNameIcon", "getSubNameIcon", "setSubNameIcon", "component1", "copy", "equals", "other", "hashCode", "toString", "app_proPlayDebug"})
public final class TransCoinItemBean {
    private boolean hasFiatEquals;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String subName;
    private int subNameIcon;
    private boolean subNameClickable;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String inputText;
    private boolean hideInputText;
    private float inputTextSize;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String inputHintText;
    private boolean inputHideUnderLine;
    private int layoutPaddingTop;
    private int layoutPaddingBottom;
    @org.jetbrains.annotations.Nullable()
    private android.text.TextWatcher inputTextChangedListener;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnClickListener subNameCallListener;
    private boolean hasFocusedChecked;
    private int focusedDrawableRes;
    @org.jetbrains.annotations.Nullable()
    private android.view.View.OnFocusChangeListener inputFocusChangedListener;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    
    public final boolean getHasFiatEquals() {
        return false;
    }
    
    public final void setHasFiatEquals(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubName() {
        return null;
    }
    
    public final void setSubName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSubNameIcon() {
        return 0;
    }
    
    public final void setSubNameIcon(int p0) {
    }
    
    public final boolean getSubNameClickable() {
        return false;
    }
    
    public final void setSubNameClickable(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInputText() {
        return null;
    }
    
    public final void setInputText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getHideInputText() {
        return false;
    }
    
    public final void setHideInputText(boolean p0) {
    }
    
    public final float getInputTextSize() {
        return 0.0F;
    }
    
    public final void setInputTextSize(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInputHintText() {
        return null;
    }
    
    public final void setInputHintText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getInputHideUnderLine() {
        return false;
    }
    
    public final void setInputHideUnderLine(boolean p0) {
    }
    
    public final int getLayoutPaddingTop() {
        return 0;
    }
    
    public final void setLayoutPaddingTop(int p0) {
    }
    
    public final int getLayoutPaddingBottom() {
        return 0;
    }
    
    public final void setLayoutPaddingBottom(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.text.TextWatcher getInputTextChangedListener() {
        return null;
    }
    
    public final void setInputTextChangedListener(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnClickListener getSubNameCallListener() {
        return null;
    }
    
    public final void setSubNameCallListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnClickListener p0) {
    }
    
    public final boolean getHasFocusedChecked() {
        return false;
    }
    
    public final void setHasFocusedChecked(boolean p0) {
    }
    
    public final int getFocusedDrawableRes() {
        return 0;
    }
    
    public final void setFocusedDrawableRes(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View.OnFocusChangeListener getInputFocusChangedListener() {
        return null;
    }
    
    public final void setInputFocusChangedListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnFocusChangeListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public TransCoinItemBean(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    public TransCoinItemBean() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.TransCoinItemBean copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}