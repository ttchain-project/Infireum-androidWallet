package com.ttchain.walletproject.blockchain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J;\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J;\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J)\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J)\u0010&\u001a\u00020\u00042\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J!\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J)\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u0010$\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J!\u00102\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J)\u00103\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u00104\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J1\u00103\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u00104\u001a\u0002052\u0006\u0010\u0010\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0011\u00108\u001a\u000209H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J\u0019\u00108\u001a\u0002092\u0006\u0010;\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J\u0018\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020@H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lcom/ttchain/walletproject/blockchain/BitcoinjNew;", "", "()V", "ADDRESS", "", "ERROR", "KEY", "LOG", "", "msg", "buildOutput", "", "address", "checkBtcAddressIsCompress", "", "pky", "btcAddress", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBtcAddressByMnemonic", "Ljava/util/HashMap;", "mnemonic", "addressList", "", "isDecompress", "(Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDecompressBtcAddressByMnemonic", "isSpecific", "(ZLjava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createEthAddressByMnemonic", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "keyToAddress", "mainCoinId", "signBtcTransaction", "model", "Lcom/ttchain/walletproject/model/SignBTCBodyData;", "(Lcom/ttchain/walletproject/model/SignBTCBodyData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ttnAddress", "(Lcom/ttchain/walletproject/model/SignBTCBodyData;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signEthRawTransaction", "transaction", "Lcom/ttchain/walletproject/model/Transaction;", "nonce", "(Lcom/ttchain/walletproject/model/Transaction;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signEthTransaction", "signModel", "Lcom/ttchain/walletproject/model/SignETHBodyRequest;", "queryModel", "Lcom/ttchain/walletproject/model/SignEthQueryModel;", "(Lcom/ttchain/walletproject/model/SignETHBodyRequest;Lcom/ttchain/walletproject/model/SignEthQueryModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/ttchain/walletproject/model/SignETHBodyRequest;Lcom/ttchain/walletproject/model/SignEthQueryModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signPersonaMessage", "signUsdtTransaction", "usdtAmount", "Ljava/math/BigDecimal;", "(Lcom/ttchain/walletproject/model/SignBTCBodyData;Ljava/math/BigDecimal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/ttchain/walletproject/model/SignBTCBodyData;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "systemWalletInit", "Lcom/ttchain/walletproject/model/ResponseUserIdentity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mnemonicsRaw", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeBytes", "data", "baos", "Ljava/io/ByteArrayOutputStream;", "app_proPlayDebug"})
public final class BitcoinjNew {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADDRESS = "ADDRESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY = "KEY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR = "ERROR";
    public static final com.ttchain.walletproject.blockchain.BitcoinjNew INSTANCE = null;
    
    private final void LOG(java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createBtcAddressByMnemonic(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addressList, boolean isDecompress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, java.lang.String>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createDecompressBtcAddressByMnemonic(boolean isSpecific, @org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addressList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, java.lang.String>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public final java.lang.Object createEthAddressByMnemonic(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> addressList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, java.lang.String>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signBtcTransaction(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignBTCBodyData model, @org.jetbrains.annotations.NotNull()
    java.lang.String ttnAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String btcAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signBtcTransaction(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignBTCBodyData model, @org.jetbrains.annotations.NotNull()
    java.lang.String btcAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signUsdtTransaction(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignBTCBodyData model, @org.jetbrains.annotations.NotNull()
    java.lang.String ttnAddress, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal usdtAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String btcAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signUsdtTransaction(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignBTCBodyData model, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal usdtAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String btcAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signEthTransaction(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignETHBodyRequest signModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignEthQueryModel queryModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signEthTransaction(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignETHBodyRequest signModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignEthQueryModel queryModel, @org.jetbrains.annotations.NotNull()
    java.lang.String ttnAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signEthRawTransaction(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.Transaction transaction, @org.jetbrains.annotations.NotNull()
    java.lang.String pky, @org.jetbrains.annotations.NotNull()
    java.lang.String nonce, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signPersonaMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, @org.jetbrains.annotations.NotNull()
    java.lang.String pky, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkBtcAddressIsCompress(@org.jetbrains.annotations.NotNull()
    java.lang.String pky, @org.jetbrains.annotations.NotNull()
    java.lang.String btcAddress, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public final java.lang.Object keyToAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String pky, @org.jetbrains.annotations.NotNull()
    java.lang.String mainCoinId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2) {
        return null;
    }
    
    private final byte[] buildOutput(java.lang.String address) throws com.quincysx.crypto.bitcoin.BitcoinException {
        return null;
    }
    
    private final void writeBytes(byte[] data, java.io.ByteArrayOutputStream baos) throws java.io.IOException {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object systemWalletInit(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ttchain.walletproject.model.ResponseUserIdentity> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object systemWalletInit(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonicsRaw, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ttchain.walletproject.model.ResponseUserIdentity> p1) {
        return null;
    }
    
    private BitcoinjNew() {
        super();
    }
}