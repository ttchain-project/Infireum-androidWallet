package com.ttchain.walletproject.model;

import java.lang.System;

/**
 * ETH廣播 data class
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JA\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\bH\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006("}, d2 = {"Lcom/ttchain/walletproject/model/MainnetInfuraRequest;", "", "jsonrpc", "", "method", "params", "", "id", "", "comments", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;)V", "getComments", "()Ljava/lang/String;", "setComments", "(Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getJsonrpc", "setJsonrpc", "getMethod", "setMethod", "getParams", "()Ljava/util/List;", "setParams", "(Ljava/util/List;)V", "addParamsItem", "paramsItem", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_proPlayDebug"})
public final class MainnetInfuraRequest {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "jsonrpc")
    private java.lang.String jsonrpc;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "method")
    private java.lang.String method;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "params")
    private java.util.List<java.lang.Object> params;
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "comments")
    private java.lang.String comments;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.MainnetInfuraRequest addParamsItem(@org.jetbrains.annotations.NotNull()
    java.lang.Object paramsItem) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJsonrpc() {
        return null;
    }
    
    public final void setJsonrpc(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMethod() {
        return null;
    }
    
    public final void setMethod(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getParams() {
        return null;
    }
    
    public final void setParams(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getComments() {
        return null;
    }
    
    public final void setComments(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public MainnetInfuraRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonrpc, @org.jetbrains.annotations.NotNull()
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> params, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String comments) {
        super();
    }
    
    public MainnetInfuraRequest() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * ETH廣播 data class
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.MainnetInfuraRequest copy(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonrpc, @org.jetbrains.annotations.NotNull()
    java.lang.String method, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> params, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String comments) {
        return null;
    }
    
    /**
     * ETH廣播 data class
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * ETH廣播 data class
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * ETH廣播 data class
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}