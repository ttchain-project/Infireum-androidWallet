package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R&\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c\u00a8\u0006!"}, d2 = {"Lcom/ttchain/walletproject/model/BtcTransactionModel;", "Ljava/io/Serializable;", "()V", "compressed", "", "getCompressed", "()Ljava/lang/Boolean;", "setCompressed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "encry", "getEncry", "setEncry", "privatekey", "", "getPrivatekey", "()Ljava/lang/String;", "setPrivatekey", "(Ljava/lang/String;)V", "token", "getToken", "setToken", "tx", "", "Lcom/ttchain/walletproject/model/BtcTxBean;", "getTx", "()Ljava/util/List;", "setTx", "(Ljava/util/List;)V", "unspend", "Lcom/ttchain/walletproject/model/BtcUnSpendBean;", "getUnspend", "setUnspend", "app_proPlayDebug"})
public final class BtcTransactionModel implements java.io.Serializable {
    
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
    
    public BtcTransactionModel() {
        super();
    }
}