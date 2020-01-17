package com.ttchain.walletproject.net.client;

import java.lang.System;

/**
 * This wrapper is to take care of this case:
 * when the deserialization fails due to JsonParseException and the
 * expected type is String, then just return the body string.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/ttchain/walletproject/net/client/GsonResponseBodyConverterToString;", "T", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "gson", "Lcom/google/gson/Gson;", "type", "Ljava/lang/reflect/Type;", "(Lcom/google/gson/Gson;Ljava/lang/reflect/Type;)V", "convert", "value", "(Lokhttp3/ResponseBody;)Ljava/lang/Object;", "app_proPlayDebug"})
public final class GsonResponseBodyConverterToString<T extends java.lang.Object> implements retrofit2.Converter<okhttp3.ResponseBody, T> {
    private final com.google.gson.Gson gson = null;
    private final java.lang.reflect.Type type = null;
    
    @java.lang.Override()
    public T convert(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody value) {
        return null;
    }
    
    public GsonResponseBodyConverterToString(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type) {
        super();
    }
}