package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/ttchain/walletproject/model/ApiEtherscanResponse;", "Ljava/io/Serializable;", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "result", "", "Lcom/ttchain/walletproject/model/TransactionDataEth;", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "status", "getStatus", "setStatus", "app_proPlayDebug"})
public final class ApiEtherscanResponse implements java.io.Serializable {
    
    /**
     * status : 1
     * message : OK
     * result : [{"blockNumber":"6078057","timeStamp":"1533259422","hash":"0xd738f0a70c6bee34eefc61bfe6be4379f10540f0a73aad72c1d35dda99e8c9da","nonce":"1","blockHash":"0x626890442e4955a0296fdac5258f7fc850cfe4e06af990d7d2b651100980bd11","transactionIndex":"53","from":"0x4db346127cb8e65e6ab6fd611ce718eef38be995","to":"0xb5a5f22694352c15b00323844ad545abb2b11028","value":"0","gas":"55000","gasPrice":"21000000000","isError":"0","txreceipt_status":"1","input":"0xa9059cbb000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000014542ba12a337c00000","contractAddress":"","cumulativeGasUsed":"2676003","gasUsed":"21632","confirmations":"41626"}]
     */
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "message")
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "result")
    private java.util.List<com.ttchain.walletproject.model.TransactionDataEth> result;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.TransactionDataEth> getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.TransactionDataEth> p0) {
    }
    
    public ApiEtherscanResponse() {
        super();
    }
}