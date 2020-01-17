package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/ttchain/walletproject/base/BaseRecordAdapter;", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/ttchain/walletproject/model/RecordEntity;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "()V", "onClickDetailListener", "Lcom/ttchain/walletproject/base/BaseRecordAdapter$OnClickDetailListener;", "getOnClickDetailListener", "()Lcom/ttchain/walletproject/base/BaseRecordAdapter$OnClickDetailListener;", "setOnClickDetailListener", "(Lcom/ttchain/walletproject/base/BaseRecordAdapter$OnClickDetailListener;)V", "convert", "", "helper", "item", "OnClickDetailListener", "app_proPlayDebug"})
public class BaseRecordAdapter extends com.chad.library.adapter.base.BaseMultiItemQuickAdapter<com.ttchain.walletproject.model.RecordEntity, com.chad.library.adapter.base.BaseViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.base.BaseRecordAdapter.OnClickDetailListener onClickDetailListener;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.base.BaseRecordAdapter.OnClickDetailListener getOnClickDetailListener() {
        return null;
    }
    
    public final void setOnClickDetailListener(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.base.BaseRecordAdapter.OnClickDetailListener p0) {
    }
    
    @java.lang.Override()
    protected void convert(@org.jetbrains.annotations.Nullable()
    com.chad.library.adapter.base.BaseViewHolder helper, @org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.RecordEntity item) {
    }
    
    public BaseRecordAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ttchain/walletproject/base/BaseRecordAdapter$OnClickDetailListener;", "", "onClickDetail", "", "superLink", "", "app_proPlayDebug"})
    public static abstract interface OnClickDetailListener {
        
        public abstract void onClickDetail(@org.jetbrains.annotations.NotNull()
        java.lang.String superLink);
    }
}