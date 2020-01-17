package com.ttchain.walletproject.model;

import java.lang.System;

/**
 * SignETHOrSignETHContract data class
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J3\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/ttchain/walletproject/model/SignETHBodyRequest;", "", "contractAddress", "", "encry", "", "privateKey", "token", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getContractAddress", "()Ljava/lang/String;", "setContractAddress", "(Ljava/lang/String;)V", "getEncry", "()Z", "setEncry", "(Z)V", "getPrivateKey", "setPrivateKey", "getToken", "setToken", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_proPlayDebug"})
public final class SignETHBodyRequest {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "contractAddress")
    private java.lang.String contractAddress;
    @com.google.gson.annotations.SerializedName(value = "encry")
    private boolean encry;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "privateKey")
    private java.lang.String privateKey;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "token")
    private java.lang.String token;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getContractAddress() {
        return null;
    }
    
    public final void setContractAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getEncry() {
        return false;
    }
    
    public final void setEncry(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivateKey() {
        return null;
    }
    
    public final void setPrivateKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public SignETHBodyRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String contractAddress, boolean encry, @org.jetbrains.annotations.NotNull()
    java.lang.String privateKey, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        super();
    }
    
    public SignETHBodyRequest() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * SignETHOrSignETHContract data class
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.SignETHBodyRequest copy(@org.jetbrains.annotations.Nullable()
    java.lang.String contractAddress, boolean encry, @org.jetbrains.annotations.NotNull()
    java.lang.String privateKey, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    /**
     * SignETHOrSignETHContract data class
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * SignETHOrSignETHContract data class
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * SignETHOrSignETHContract data class
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}