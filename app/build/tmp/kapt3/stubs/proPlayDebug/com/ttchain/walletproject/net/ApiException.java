package com.ttchain.walletproject.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/net/ApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "msg", "", "(Ljava/lang/String;)V", "status", "(Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "app_proPlayDebug"})
public final class ApiException extends java.lang.Exception {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ApiException(@org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
        super();
    }
    
    public ApiException(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        super();
    }
}