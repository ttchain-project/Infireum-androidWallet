package com.ttchain.walletproject.net.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004JE\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u0012J7\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/ttchain/walletproject/net/client/GsonCustomConverterFactory;", "Lretrofit2/Converter$Factory;", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "gsonConverterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "requestBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/RequestBody;", "type", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "", "methodAnnotations", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "responseBodyConverter", "Lokhttp3/ResponseBody;", "annotations", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "Companion", "app_proPlayDebug"})
public final class GsonCustomConverterFactory extends retrofit2.Converter.Factory {
    private final com.google.gson.Gson gson = null;
    private final retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory = null;
    public static final com.ttchain.walletproject.net.client.GsonCustomConverterFactory.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type, @org.jetbrains.annotations.NotNull()
    java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Type type, @org.jetbrains.annotations.NotNull()
    java.lang.annotation.Annotation[] parameterAnnotations, @org.jetbrains.annotations.NotNull()
    java.lang.annotation.Annotation[] methodAnnotations, @org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    private GsonCustomConverterFactory(com.google.gson.Gson gson) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/ttchain/walletproject/net/client/GsonCustomConverterFactory$Companion;", "", "()V", "create", "Lcom/ttchain/walletproject/net/client/GsonCustomConverterFactory;", "gson", "Lcom/google/gson/Gson;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.net.client.GsonCustomConverterFactory create(@org.jetbrains.annotations.Nullable()
        com.google.gson.Gson gson) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}