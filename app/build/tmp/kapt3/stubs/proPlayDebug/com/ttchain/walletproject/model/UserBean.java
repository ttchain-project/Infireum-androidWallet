package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\tH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000b\"\u0004\b\"\u0010\rR\u001a\u0010#\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000b\"\u0004\b%\u0010\r\u00a8\u0006."}, d2 = {"Lcom/ttchain/walletproject/model/UserBean;", "Ljava/io/Serializable;", "_id", "", "(I)V", "get_id", "()I", "set_id", "importWalletAddress", "", "getImportWalletAddress", "()Ljava/lang/String;", "setImportWalletAddress", "(Ljava/lang/String;)V", "mainCoinType", "Lcom/ttchain/walletproject/enums/MainCoinType;", "getMainCoinType", "()Lcom/ttchain/walletproject/enums/MainCoinType;", "setMainCoinType", "(Lcom/ttchain/walletproject/enums/MainCoinType;)V", "mnemonic", "getMnemonic", "setMnemonic", "name", "getName", "setName", "note", "getNote", "setNote", "pwd", "getPwd", "setPwd", "pwdEncrypt", "getPwdEncrypt", "setPwdEncrypt", "walletEpKey", "getWalletEpKey", "setWalletEpKey", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "app_proPlayDebug"})
public final class UserBean implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mnemonic;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pwd;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String pwdEncrypt;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String note;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String walletEpKey;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String importWalletAddress;
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.enums.MainCoinType mainCoinType;
    private int _id;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMnemonic() {
        return null;
    }
    
    public final void setMnemonic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPwd() {
        return null;
    }
    
    public final void setPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPwdEncrypt() {
        return null;
    }
    
    public final void setPwdEncrypt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNote() {
        return null;
    }
    
    public final void setNote(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletEpKey() {
        return null;
    }
    
    public final void setWalletEpKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImportWalletAddress() {
        return null;
    }
    
    public final void setImportWalletAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.enums.MainCoinType getMainCoinType() {
        return null;
    }
    
    public final void setMainCoinType(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.MainCoinType p0) {
    }
    
    public final int get_id() {
        return 0;
    }
    
    public final void set_id(int p0) {
    }
    
    public UserBean(int _id) {
        super();
    }
    
    public UserBean() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.UserBean copy(int _id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}