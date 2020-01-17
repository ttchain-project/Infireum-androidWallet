package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J1\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n0\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0002J \u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\nJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011\"\u0004\b\u0000\u0010\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/ttchain/walletproject/repository/BaseRepository;", "", "()V", "apiSchedulers", "Lio/reactivex/Scheduler;", "checkDeferred", "Lcom/ttchain/walletproject/repository/RepositoryResult;", "T", "deferred", "Lkotlinx/coroutines/Deferred;", "Lcom/ttchain/walletproject/model/ApiResult;", "(Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkError", "", "result", "checkResultRepository", "getApi", "Lio/reactivex/Observable;", "observable", "app_proPlayDebug"})
public class BaseRepository {
    private final io.reactivex.Scheduler apiSchedulers = null;
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>io.reactivex.Observable<T> getApi(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> observable) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Throwable checkError(com.ttchain.walletproject.model.ApiResult<T> result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.ttchain.walletproject.repository.RepositoryResult<T> checkResultRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.ApiResult<T> result) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object checkDeferred(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Deferred<com.ttchain.walletproject.model.ApiResult<T>> deferred, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.ttchain.walletproject.repository.RepositoryResult<T>> p1) {
        return null;
    }
    
    public BaseRepository() {
        super();
    }
}