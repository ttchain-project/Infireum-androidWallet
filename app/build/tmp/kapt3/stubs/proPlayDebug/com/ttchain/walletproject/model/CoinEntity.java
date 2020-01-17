package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lcom/ttchain/walletproject/model/CoinEntity;", "Lcom/ttchain/walletproject/model/BaseEntity;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "type", "", "data", "Lcom/ttchain/walletproject/model/CoinBean;", "(ILcom/ttchain/walletproject/model/CoinBean;)V", "getData", "()Lcom/ttchain/walletproject/model/CoinBean;", "getSpanSize", "Companion", "app_proPlayDebug"})
public final class CoinEntity extends com.ttchain.walletproject.model.BaseEntity implements com.chad.library.adapter.base.entity.MultiItemEntity {
    @org.jetbrains.annotations.NotNull()
    private final com.ttchain.walletproject.model.CoinBean data = null;
    public static final int NORMAL = 1;
    public static final int PICK = 2;
    public static final int ASSET = 3;
    public static final int DELETE = 4;
    public static final int SEARCH = 5;
    public static final int NORMAL_SPAN_SIZE = 1;
    public static final com.ttchain.walletproject.model.CoinEntity.Companion Companion = null;
    
    private final int getSpanSize(int type) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.CoinBean getData() {
        return null;
    }
    
    public CoinEntity(@com.ttchain.walletproject.model.CoinEntity.Companion.CoinType()
    int type, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.CoinBean data) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/model/CoinEntity$Companion;", "", "()V", "ASSET", "", "DELETE", "NORMAL", "NORMAL_SPAN_SIZE", "PICK", "SEARCH", "CoinType", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.IntDef(value = {1, 2, 3, 4, 5})
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/ttchain/walletproject/model/CoinEntity$Companion$CoinType;", "", "app_proPlayDebug"})
        @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
        public static abstract @interface CoinType {
        }
    }
}