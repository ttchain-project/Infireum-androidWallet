package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\tH\u00c6\u0003JC\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006+"}, d2 = {"Lcom/ttchain/walletproject/model/MinerFeeGasItemBean;", "Ljava/io/Serializable;", "_Id", "", "advancedCheckedListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "seekBarChangeListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "inputCustomGasPriceWatcher", "Landroid/text/TextWatcher;", "inputCustomGasWatcher", "(ILandroid/widget/CompoundButton$OnCheckedChangeListener;Landroid/widget/SeekBar$OnSeekBarChangeListener;Landroid/text/TextWatcher;Landroid/text/TextWatcher;)V", "get_Id", "()I", "set_Id", "(I)V", "getAdvancedCheckedListener", "()Landroid/widget/CompoundButton$OnCheckedChangeListener;", "setAdvancedCheckedListener", "(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V", "getInputCustomGasPriceWatcher", "()Landroid/text/TextWatcher;", "setInputCustomGasPriceWatcher", "(Landroid/text/TextWatcher;)V", "getInputCustomGasWatcher", "setInputCustomGasWatcher", "getSeekBarChangeListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "setSeekBarChangeListener", "(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_proPlayDebug"})
public final class MinerFeeGasItemBean implements java.io.Serializable {
    private int _Id;
    @org.jetbrains.annotations.Nullable()
    private android.widget.CompoundButton.OnCheckedChangeListener advancedCheckedListener;
    @org.jetbrains.annotations.Nullable()
    private android.widget.SeekBar.OnSeekBarChangeListener seekBarChangeListener;
    @org.jetbrains.annotations.Nullable()
    private android.text.TextWatcher inputCustomGasPriceWatcher;
    @org.jetbrains.annotations.Nullable()
    private android.text.TextWatcher inputCustomGasWatcher;
    
    public final int get_Id() {
        return 0;
    }
    
    public final void set_Id(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.CompoundButton.OnCheckedChangeListener getAdvancedCheckedListener() {
        return null;
    }
    
    public final void setAdvancedCheckedListener(@org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton.OnCheckedChangeListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.SeekBar.OnSeekBarChangeListener getSeekBarChangeListener() {
        return null;
    }
    
    public final void setSeekBarChangeListener(@org.jetbrains.annotations.Nullable()
    android.widget.SeekBar.OnSeekBarChangeListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.text.TextWatcher getInputCustomGasPriceWatcher() {
        return null;
    }
    
    public final void setInputCustomGasPriceWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.text.TextWatcher getInputCustomGasWatcher() {
        return null;
    }
    
    public final void setInputCustomGasWatcher(@org.jetbrains.annotations.Nullable()
    android.text.TextWatcher p0) {
    }
    
    public MinerFeeGasItemBean(int _Id, @org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton.OnCheckedChangeListener advancedCheckedListener, @org.jetbrains.annotations.Nullable()
    android.widget.SeekBar.OnSeekBarChangeListener seekBarChangeListener, @org.jetbrains.annotations.Nullable()
    android.text.TextWatcher inputCustomGasPriceWatcher, @org.jetbrains.annotations.Nullable()
    android.text.TextWatcher inputCustomGasWatcher) {
        super();
    }
    
    public MinerFeeGasItemBean() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.CompoundButton.OnCheckedChangeListener component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.SeekBar.OnSeekBarChangeListener component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.text.TextWatcher component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.text.TextWatcher component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.MinerFeeGasItemBean copy(int _Id, @org.jetbrains.annotations.Nullable()
    android.widget.CompoundButton.OnCheckedChangeListener advancedCheckedListener, @org.jetbrains.annotations.Nullable()
    android.widget.SeekBar.OnSeekBarChangeListener seekBarChangeListener, @org.jetbrains.annotations.Nullable()
    android.text.TextWatcher inputCustomGasPriceWatcher, @org.jetbrains.annotations.Nullable()
    android.text.TextWatcher inputCustomGasWatcher) {
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