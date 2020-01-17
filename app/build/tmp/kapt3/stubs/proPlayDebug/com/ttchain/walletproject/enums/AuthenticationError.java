package com.ttchain.walletproject.enums;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/enums/AuthenticationError;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "AUTHENTICATION_ERROR_LOCKOUT", "AUTHENTICATION_ERROR_DISMISS", "AUTHENTICATION_ERROR_NOT_ENROLLED", "AUTHENTICATION_ERROR_CANCELED", "app_proPlayDebug"})
public enum AuthenticationError {
    /*public static final*/ AUTHENTICATION_ERROR_LOCKOUT /* = new AUTHENTICATION_ERROR_LOCKOUT(0) */,
    /*public static final*/ AUTHENTICATION_ERROR_DISMISS /* = new AUTHENTICATION_ERROR_DISMISS(0) */,
    /*public static final*/ AUTHENTICATION_ERROR_NOT_ENROLLED /* = new AUTHENTICATION_ERROR_NOT_ENROLLED(0) */,
    /*public static final*/ AUTHENTICATION_ERROR_CANCELED /* = new AUTHENTICATION_ERROR_CANCELED(0) */;
    private final int value = 0;
    
    public final int getValue() {
        return 0;
    }
    
    AuthenticationError(int value) {
    }
}