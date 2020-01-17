package com.ttchain.walletproject.model;

import java.lang.System;

/**
 * SignBTCOrSignBTCRelay data class
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000eJ\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\nH\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J_\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\nH\u00c6\u0001J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020.H\u00d6\u0001J\t\u0010/\u001a\u00020\nH\u00d6\u0001R\u001e\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 \u00a8\u00060"}, d2 = {"Lcom/ttchain/walletproject/model/SignBTCBodyData;", "", "compressed", "", "tx", "", "Lcom/ttchain/walletproject/model/TxData;", "unspend", "Lcom/ttchain/walletproject/model/UnspendData;", "privatekey", "", "token", "encry", "cicAddress", "(ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCicAddress", "()Ljava/lang/String;", "setCicAddress", "(Ljava/lang/String;)V", "getCompressed", "()Z", "setCompressed", "(Z)V", "getEncry", "setEncry", "getPrivatekey", "setPrivatekey", "getToken", "setToken", "getTx", "()Ljava/util/List;", "setTx", "(Ljava/util/List;)V", "getUnspend", "setUnspend", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_proPlayDebug"})
public final class SignBTCBodyData {
    @com.google.gson.annotations.SerializedName(value = "compressed")
    private boolean compressed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tx")
    private java.util.List<com.ttchain.walletproject.model.TxData> tx;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "unspend")
    private java.util.List<com.ttchain.walletproject.model.UnspendData> unspend;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "privatekey")
    private java.lang.String privatekey;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "token")
    private java.lang.String token;
    @com.google.gson.annotations.SerializedName(value = "encry")
    private boolean encry;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cicAddress")
    private java.lang.String cicAddress;
    
    public final boolean getCompressed() {
        return false;
    }
    
    public final void setCompressed(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.TxData> getTx() {
        return null;
    }
    
    public final void setTx(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.TxData> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.UnspendData> getUnspend() {
        return null;
    }
    
    public final void setUnspend(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.UnspendData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivatekey() {
        return null;
    }
    
    public final void setPrivatekey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getEncry() {
        return false;
    }
    
    public final void setEncry(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCicAddress() {
        return null;
    }
    
    public final void setCicAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public SignBTCBodyData(boolean compressed, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.TxData> tx, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.UnspendData> unspend, @org.jetbrains.annotations.NotNull()
    java.lang.String privatekey, @org.jetbrains.annotations.NotNull()
    java.lang.String token, boolean encry, @org.jetbrains.annotations.NotNull()
    java.lang.String cicAddress) {
        super();
    }
    
    public SignBTCBodyData() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.TxData> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.UnspendData> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    /**
     * SignBTCOrSignBTCRelay data class
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.SignBTCBodyData copy(boolean compressed, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.TxData> tx, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.UnspendData> unspend, @org.jetbrains.annotations.NotNull()
    java.lang.String privatekey, @org.jetbrains.annotations.NotNull()
    java.lang.String token, boolean encry, @org.jetbrains.annotations.NotNull()
    java.lang.String cicAddress) {
        return null;
    }
    
    /**
     * SignBTCOrSignBTCRelay data class
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * SignBTCOrSignBTCRelay data class
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * SignBTCOrSignBTCRelay data class
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}