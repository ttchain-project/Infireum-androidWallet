package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/model/AddressEntity;", "Lcom/ttchain/walletproject/model/BaseEntity;", "type", "", "data", "Lcom/ttchain/walletproject/model/AddressBean;", "(ILcom/ttchain/walletproject/model/AddressBean;)V", "getData", "()Lcom/ttchain/walletproject/model/AddressBean;", "getSpanSize", "Companion", "app_proPlayDebug"})
public final class AddressEntity extends com.ttchain.walletproject.model.BaseEntity {
    @org.jetbrains.annotations.NotNull()
    private final com.ttchain.walletproject.model.AddressBean data = null;
    public static final int NORMAL = 1;
    public static final int NORMAL_SPAN_SIZE = 1;
    public static final com.ttchain.walletproject.model.AddressEntity.Companion Companion = null;
    
    private final int getSpanSize(int type) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.AddressBean getData() {
        return null;
    }
    
    public AddressEntity(@com.ttchain.walletproject.model.AddressEntity.Companion.AddressType()
    int type, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.AddressBean data) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/ttchain/walletproject/model/AddressEntity$Companion;", "", "()V", "NORMAL", "", "NORMAL_SPAN_SIZE", "AddressType", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @androidx.annotation.IntDef(value = {1})
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/ttchain/walletproject/model/AddressEntity$Companion$AddressType;", "", "app_proPlayDebug"})
        @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
        public static abstract @interface AddressType {
        }
    }
}