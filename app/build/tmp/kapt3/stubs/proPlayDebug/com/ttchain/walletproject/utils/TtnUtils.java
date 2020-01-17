package com.ttchain.walletproject.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J6\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/ttchain/walletproject/utils/TtnUtils;", "", "()V", "radix", "", "encodeForSign", "", "trans", "Lcom/ttchain/walletproject/model/SignTtnTransResultData;", "getPublicKey", "pri", "getTtnTransModel", "toAddress", "ttnNonce", "type", "input", "coinId", "transCoinAmount", "Ljava/math/BigDecimal;", "paddingLeftZero", "text", "digits", "secpSign", "", "encodeTrans", "ecKeyPair", "Lorg/web3j/crypto/ECKeyPair;", "sha256", "signTransaction", "app_proPlayDebug"})
public final class TtnUtils {
    private static final int radix = 16;
    public static final com.ttchain.walletproject.utils.TtnUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.SignTtnTransResultData getTtnTransModel(@org.jetbrains.annotations.NotNull()
    java.lang.String toAddress, @org.jetbrains.annotations.NotNull()
    java.lang.String ttnNonce, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String input, @org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal transCoinAmount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublicKey(@org.jetbrains.annotations.NotNull()
    java.lang.String pri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.SignTtnTransResultData signTransaction(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignTtnTransResultData trans, @org.jetbrains.annotations.NotNull()
    java.lang.String pri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String encodeForSign(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SignTtnTransResultData trans) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] sha256(@org.jetbrains.annotations.NotNull()
    java.lang.String encodeTrans) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final byte[] secpSign(@org.jetbrains.annotations.NotNull()
    java.lang.String encodeTrans, @org.jetbrains.annotations.NotNull()
    org.web3j.crypto.ECKeyPair ecKeyPair) {
        return null;
    }
    
    private final java.lang.String paddingLeftZero(java.lang.String text, int digits) {
        return null;
    }
    
    private TtnUtils() {
        super();
    }
}