package com.ttchain.walletproject.model;

import java.lang.System;

/**
 * 統一 Api Result
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\u000e\u0010\u0012\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00028\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/ttchain/walletproject/model/ApiResult;", "T", "", "code", "Lcom/ttchain/walletproject/enums/ApiCodeEnum;", "message", "", "data", "(Lcom/ttchain/walletproject/enums/ApiCodeEnum;Ljava/lang/String;Ljava/lang/Object;)V", "getCode", "()Lcom/ttchain/walletproject/enums/ApiCodeEnum;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Lcom/ttchain/walletproject/enums/ApiCodeEnum;Ljava/lang/String;Ljava/lang/Object;)Lcom/ttchain/walletproject/model/ApiResult;", "equals", "", "other", "hashCode", "", "toString", "app_proPlayDebug"})
public final class ApiResult<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "code")
    private final com.ttchain.walletproject.enums.ApiCodeEnum code = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    private final T data = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.enums.ApiCodeEnum getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final T getData() {
        return null;
    }
    
    public ApiResult(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.ApiCodeEnum code, @org.jetbrains.annotations.NotNull()
    java.lang.String message, T data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.enums.ApiCodeEnum component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final T component3() {
        return null;
    }
    
    /**
     * 統一 Api Result
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.ApiResult<T> copy(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.ApiCodeEnum code, @org.jetbrains.annotations.NotNull()
    java.lang.String message, T data) {
        return null;
    }
    
    /**
     * 統一 Api Result
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * 統一 Api Result
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * 統一 Api Result
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}