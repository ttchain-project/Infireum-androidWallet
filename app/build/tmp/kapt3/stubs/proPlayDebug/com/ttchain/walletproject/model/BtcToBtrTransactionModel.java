package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR&\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f\u00a8\u0006$"}, d2 = {"Lcom/ttchain/walletproject/model/BtcToBtrTransactionModel;", "Ljava/io/Serializable;", "()V", "cicAddress", "", "getCicAddress", "()Ljava/lang/String;", "setCicAddress", "(Ljava/lang/String;)V", "compressed", "", "getCompressed", "()Ljava/lang/Boolean;", "setCompressed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "encry", "getEncry", "setEncry", "privatekey", "getPrivatekey", "setPrivatekey", "token", "getToken", "setToken", "tx", "", "Lcom/ttchain/walletproject/model/BtcTxBean;", "getTx", "()Ljava/util/List;", "setTx", "(Ljava/util/List;)V", "unspend", "Lcom/ttchain/walletproject/model/BtcUnSpendBean;", "getUnspend", "setUnspend", "app_proPlayDebug"})
public final class BtcToBtrTransactionModel implements java.io.Serializable {
    
    /**
     * token : btc
     * privatekey : L1uyy5qTuGrVXrmrsvHWHgVzW9kKdrp27wBC7Vs6nZDTF2BRUVwy
     * tx : [{"address":"1138DmfNXq44erShdVnfTgRJuNsdkLhcj1","value":7430},{"address":"1qQZ8X1waotobH7yHzyE41pMtxBYb9Ykg","value":5460}]
     * unspend : [{"txid":"6c215b731831dceed69f2a36312ef1b305df8ad3af57df37609b571b9727e42d","value":1110},{"txid":"6c215b731831dceed69f2a36312ef1b305df8ad3af57df37609b571b9727e421","value":111000}]
     */
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "token")
    private java.lang.String token;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "privatekey")
    private java.lang.String privatekey;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "tx")
    private java.util.List<com.ttchain.walletproject.model.BtcTxBean> tx;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "unspend")
    private java.util.List<com.ttchain.walletproject.model.BtcUnSpendBean> unspend;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "cicAddress")
    private java.lang.String cicAddress;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "compressed")
    private java.lang.Boolean compressed;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "encry")
    private java.lang.Boolean encry;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPrivatekey() {
        return null;
    }
    
    public final void setPrivatekey(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.BtcTxBean> getTx() {
        return null;
    }
    
    public final void setTx(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.BtcTxBean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.BtcUnSpendBean> getUnspend() {
        return null;
    }
    
    public final void setUnspend(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.BtcUnSpendBean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCicAddress() {
        return null;
    }
    
    public final void setCicAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCompressed() {
        return null;
    }
    
    public final void setCompressed(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getEncry() {
        return null;
    }
    
    public final void setEncry(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    public BtcToBtrTransactionModel() {
        super();
    }
}