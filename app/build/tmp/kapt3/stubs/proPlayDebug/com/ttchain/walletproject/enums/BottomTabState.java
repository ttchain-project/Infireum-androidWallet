package com.ttchain.walletproject.enums;

import java.lang.System;

/**
 * 底部導航欄狀態
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/ttchain/walletproject/enums/BottomTabState;", "", "position", "", "(Ljava/lang/String;II)V", "getPosition", "()I", "WALLET", "EXPLORER", "ME", "app_proPlayDebug"})
public enum BottomTabState {
    /*public static final*/ WALLET /* = new WALLET(0) */,
    /*public static final*/ EXPLORER /* = new EXPLORER(0) */,
    /*public static final*/ ME /* = new ME(0) */;
    private final int position = 0;
    
    public final int getPosition() {
        return 0;
    }
    
    BottomTabState(int position) {
    }
}