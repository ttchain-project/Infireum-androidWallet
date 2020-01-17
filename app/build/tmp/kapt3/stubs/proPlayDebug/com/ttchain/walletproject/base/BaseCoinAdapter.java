package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0014J>\u0010\u0017\u001a\u00020\r26\u0010\u0005\u001a2\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0006J)\u0010\u0018\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u000fJ>\u0010\u0019\u001a\u00020\r26\u0010\u0010\u001a2\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\r0\u0006R@\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R@\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\u0011\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ttchain/walletproject/base/BaseCoinAdapter;", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/ttchain/walletproject/model/CoinEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "()V", "onCheckedCoinSelection", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "coinSelectedId", "", "selected", "", "onDeletedCoinSelection", "Lkotlin/Function1;", "onSearchCoin", "", "coinId", "isAdded", "convert", "helper", "iItem", "setOnCheckedCoinSelectionListener", "setOnDeletedCoinSelectionListener", "setOnSearchCoinListener", "app_proPlayDebug"})
public class BaseCoinAdapter extends com.chad.library.adapter.base.BaseMultiItemQuickAdapter<com.ttchain.walletproject.model.CoinEntity, com.chad.library.adapter.base.BaseViewHolder> {
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> onCheckedCoinSelection;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDeletedCoinSelection;
    private kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> onSearchCoin;
    
    public final void setOnCheckedCoinSelectionListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Boolean, kotlin.Unit> onCheckedCoinSelection) {
    }
    
    public final void setOnDeletedCoinSelectionListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDeletedCoinSelection) {
    }
    
    public final void setOnSearchCoinListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> onSearchCoin) {
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.NotNull()
    com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.CoinEntity iItem) {
    }
    
    public BaseCoinAdapter() {
        super(null);
    }
}