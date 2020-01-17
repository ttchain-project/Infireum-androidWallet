package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\u0002\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/ttchain/walletproject/model/ExplorerListEntity;", "Lcom/ttchain/walletproject/model/BaseEntity;", "type", "", "data", "Lcom/ttchain/walletproject/model/ExplorerBean;", "(ILcom/ttchain/walletproject/model/ExplorerBean;)V", "list", "", "(ILjava/util/List;)V", "getData", "()Lcom/ttchain/walletproject/model/ExplorerBean;", "setData", "(Lcom/ttchain/walletproject/model/ExplorerBean;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "Companion", "app_proPlayDebug"})
public final class ExplorerListEntity extends com.ttchain.walletproject.model.BaseEntity {
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.model.ExplorerBean data;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.ttchain.walletproject.model.ExplorerBean> list;
    public static final int NORMAL = 1;
    public static final int BANNER = 2;
    public static final com.ttchain.walletproject.model.ExplorerListEntity.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ExplorerBean getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.ExplorerBean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerBean> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.ExplorerBean> p0) {
    }
    
    public ExplorerListEntity(@com.ttchain.walletproject.model.ExplorerListEntity.Companion.AddressType()
    int type, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.ExplorerBean data) {
        super();
    }
    
    public ExplorerListEntity(@com.ttchain.walletproject.model.ExplorerListEntity.Companion.AddressType()
    int type, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ExplorerBean> list) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/ttchain/walletproject/model/ExplorerListEntity$Companion;", "", "()V", "BANNER", "", "NORMAL", "AddressType", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.IntDef(value = {1, 2})
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/ttchain/walletproject/model/ExplorerListEntity$Companion$AddressType;", "", "app_proPlayDebug"})
        @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
        public static abstract @interface AddressType {
        }
    }
}