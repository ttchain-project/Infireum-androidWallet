package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\u00020\u0001:\u0001>B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u0004J,\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u0004J4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'J\u0012\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u001a\u0010+\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0002J\u0010\u0010/\u001a\u0002002\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u00101\u001a\u0002002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00102\u001a\u00020,H\u0002J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u00105\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u00106\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:J\u0016\u0010;\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020,H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006?"}, d2 = {"Lcom/ttchain/walletproject/model/EthRecordModel;", "", "()V", "mContractAddress", "", "getMContractAddress", "()Ljava/lang/String;", "setMContractAddress", "(Ljava/lang/String;)V", "mTransCoinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getMTransCoinData", "()Lcom/ttchain/walletproject/database/data/CoinData;", "setMTransCoinData", "(Lcom/ttchain/walletproject/database/data/CoinData;)V", "mUserTransAddress", "getMUserTransAddress", "setMUserTransAddress", "getBlockNumber", "data", "Lcom/ttchain/walletproject/model/TransactionDataEth;", "getContractAddress", "userAddress", "getErc20ErrorTransactionRecordDataList", "", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "txlist", "latestTimeStamp", "getEthErc20TransRecordDataList", "isEth", "", "transactionDataList", "getEthSeriesTransactionRecordDataList", "userTransAddress", "latestDataTimeStamp", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "getFormatTimeInDefaultLocale", "time", "", "getPayFromAddress", "address", "getReceiptToAddress", "getStatus", "", "getTime", "timeStampString", "getTotalMinerFee", "Ljava/math/BigDecimal;", "getTransAmount", "digit", "getTransTime", "getTransTxId", "isError", "isEthTransaction", "setErc20ErrorTransactionRecordResponse", "", "response", "Lcom/ttchain/walletproject/model/ApiEtherscanResponse;", "setEthErc20TransactionRecordResponse", "transStatusToString", "status", "Companion", "app_proPlayDebug"})
public final class EthRecordModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mUserTransAddress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mContractAddress;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.database.data.CoinData mTransCoinData;
    private static final java.lang.String IS_ETH_INPUT = "0x";
    private static final java.lang.String IS_NOT_ETH_VALUE = "0";
    private static final java.lang.String IS_NON_ERROR = "0";
    private static final java.lang.String IS_ERROR = "1";
    public static final com.ttchain.walletproject.model.EthRecordModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMUserTransAddress() {
        return null;
    }
    
    public final void setMUserTransAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMContractAddress() {
        return null;
    }
    
    public final void setMContractAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.CoinData getMTransCoinData() {
        return null;
    }
    
    public final void setMTransCoinData(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.database.data.CoinData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getEthSeriesTransactionRecordDataList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.TransactionDataEth> transactionDataList, @org.jetbrains.annotations.NotNull()
    java.lang.String userTransAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String latestDataTimeStamp, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel) {
        return null;
    }
    
    public final void setEthErc20TransactionRecordResponse(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.ApiEtherscanResponse response, boolean isEth) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getEthErc20TransRecordDataList(boolean isEth, @org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.TransactionDataEth> transactionDataList, @org.jetbrains.annotations.NotNull()
    java.lang.String latestTimeStamp) {
        return null;
    }
    
    public final void setErc20ErrorTransactionRecordResponse(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.ApiEtherscanResponse response) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.TransRecordData> getErc20ErrorTransactionRecordDataList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.TransactionDataEth> txlist, @org.jetbrains.annotations.NotNull()
    java.lang.String latestTimeStamp) {
        return null;
    }
    
    private final boolean isEthTransaction(com.ttchain.walletproject.model.TransactionDataEth data) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    private final int getStatus(com.ttchain.walletproject.model.TransactionDataEth data) {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    private final int getStatus(java.lang.String address, com.ttchain.walletproject.model.TransactionDataEth data) {
        return 0;
    }
    
    private final boolean isError(com.ttchain.walletproject.model.TransactionDataEth data) {
        return false;
    }
    
    private final java.math.BigDecimal getTransAmount(com.ttchain.walletproject.model.TransactionDataEth data, int digit) {
        return null;
    }
    
    private final java.math.BigDecimal getTotalMinerFee(com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getContractAddress(com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getContractAddress(java.lang.String userAddress, com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getTransTxId(com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getTransTime(com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getReceiptToAddress(com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getReceiptToAddress(java.lang.String address, com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getPayFromAddress(com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getPayFromAddress(java.lang.String address, com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getBlockNumber(com.ttchain.walletproject.model.TransactionDataEth data) {
        return null;
    }
    
    private final java.lang.String getTime(java.lang.String timeStampString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormatTimeInDefaultLocale(long time) {
        return null;
    }
    
    private final java.lang.String transStatusToString(int status) {
        return null;
    }
    
    public EthRecordModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/ttchain/walletproject/model/EthRecordModel$Companion;", "", "()V", "IS_ERROR", "", "IS_ETH_INPUT", "IS_NON_ERROR", "IS_NOT_ETH_VALUE", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}