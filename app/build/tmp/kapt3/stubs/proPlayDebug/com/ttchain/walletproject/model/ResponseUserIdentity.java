package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR \u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR \u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR \u0010\u001b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR \u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b\u00a8\u0006!"}, d2 = {"Lcom/ttchain/walletproject/model/ResponseUserIdentity;", "Ljava/io/Serializable;", "()V", "HDkey", "", "getHDkey", "()Ljava/lang/String;", "setHDkey", "(Ljava/lang/String;)V", "bitcoin", "Lcom/ttchain/walletproject/model/ApiWalletData;", "getBitcoin", "()Lcom/ttchain/walletproject/model/ApiWalletData;", "setBitcoin", "(Lcom/ttchain/walletproject/model/ApiWalletData;)V", "cic", "getCic", "ethereum", "getEthereum", "setEthereum", "guc", "getGuc", "litecoin", "getLitecoin", "mnemonic", "getMnemonic", "setMnemonic", "noprefix", "getNoprefix", "setNoprefix", "version", "getVersion", "setVersion", "app_proPlayDebug"})
public final class ResponseUserIdentity implements java.io.Serializable {
    
    /**
     * version : 0.01
     * mnemonic : target wire town latin pool leader service sleep cube warfare brave remember
     * HDkey : xprv9s21ZrQH143K3ZK9G2jVjCDaJZnnbsWDmyxNbt9NTzaDpw3p5BjXW2muvhZmn9qQK4VrGAPPSzpwpXQ9AM4JWiaMncEi91354WRY7X8HK9A
     * litecoin : {"privateKey":"T9obYYEFyZnD4YzDu2YuSSchZt3yfB5EMgVVhwWdKUJQramQaSRd","address":"LY4dBLJSJQeGLeiB7M5n9ywFeftPmFWchQ"}
     * bitcoin : {"privateKey":"L3yL6nw5aBocHiMMMPc3E65Kd2Qfb64LYUbEr8t5kW8FLh9hRqCD","address":"1Dqfv7zcDkQD5r21wD6UsxsVSTX7cgtrKF"}
     * ethereum : {"privateKey":"c976b9a6bb7035501446daf338abcf3e85fc2510909697e12b39980d49959bfc","address":"0x0e9e42a145fa2b63ab032e790801f113f301689c"}
     * cic : {"privateKey":"c976b9a6bb7035501446daf338abcf3e85fc2510909697e12b39980d49959bfc","address":"cx6082ec828f37dfc31557941fea0148b9b6570369"}
     */
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "version")
    private java.lang.String version;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "mnemonic")
    private java.lang.String mnemonic;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "HDkey")
    private java.lang.String HDkey;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "litecoin")
    private final com.ttchain.walletproject.model.ApiWalletData litecoin = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "bitcoin")
    private com.ttchain.walletproject.model.ApiWalletData bitcoin;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ethereum")
    private com.ttchain.walletproject.model.ApiWalletData ethereum;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cic")
    private final com.ttchain.walletproject.model.ApiWalletData cic = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "guc")
    private final com.ttchain.walletproject.model.ApiWalletData guc = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "noprefix")
    private com.ttchain.walletproject.model.ApiWalletData noprefix;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final void setVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMnemonic() {
        return null;
    }
    
    public final void setMnemonic(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHDkey() {
        return null;
    }
    
    public final void setHDkey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ApiWalletData getLitecoin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ApiWalletData getBitcoin() {
        return null;
    }
    
    public final void setBitcoin(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.ApiWalletData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ApiWalletData getEthereum() {
        return null;
    }
    
    public final void setEthereum(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.ApiWalletData p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ApiWalletData getCic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ApiWalletData getGuc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.ApiWalletData getNoprefix() {
        return null;
    }
    
    public final void setNoprefix(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.ApiWalletData p0) {
    }
    
    public ResponseUserIdentity() {
        super();
    }
}