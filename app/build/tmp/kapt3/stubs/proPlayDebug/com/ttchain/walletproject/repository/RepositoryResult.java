package com.ttchain.walletproject.repository;

import java.lang.System;

/**
 * Repository處理結果
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0010\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/ttchain/walletproject/repository/RepositoryResult;", "T", "", "status", "Lcom/ttchain/walletproject/repository/RepositoryResult$Status;", "data", "exception", "", "(Lcom/ttchain/walletproject/repository/RepositoryResult$Status;Ljava/lang/Object;Ljava/lang/Throwable;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getException", "()Ljava/lang/Throwable;", "getStatus", "()Lcom/ttchain/walletproject/repository/RepositoryResult$Status;", "Companion", "Status", "app_proPlayDebug"})
public final class RepositoryResult<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.ttchain.walletproject.repository.RepositoryResult.Status status = null;
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Throwable exception = null;
    public static final com.ttchain.walletproject.repository.RepositoryResult.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.repository.RepositoryResult.Status getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getException() {
        return null;
    }
    
    public RepositoryResult(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.RepositoryResult.Status status, @org.jetbrains.annotations.Nullable()
    T data, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable exception) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/ttchain/walletproject/repository/RepositoryResult$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "app_proPlayDebug"})
    public static enum Status {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ ERROR /* = new ERROR() */;
        
        Status() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\b\u0010\t\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/repository/RepositoryResult$Companion;", "", "()V", "error", "Lcom/ttchain/walletproject/repository/RepositoryResult;", "T", "exception", "", "success", "data", "(Ljava/lang/Object;)Lcom/ttchain/walletproject/repository/RepositoryResult;", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.ttchain.walletproject.repository.RepositoryResult<T> success(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.ttchain.walletproject.repository.RepositoryResult<T> error(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable exception) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}