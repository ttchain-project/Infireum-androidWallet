package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/base/BaseConfigViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "(Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/VerifyRepository;)V", "getRawPwd", "", "isEnableTouchId", "", "app_proPlayDebug"})
public class BaseConfigViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    
    public final boolean isEnableTouchId() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRawPwd() {
        return null;
    }
    
    public BaseConfigViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository) {
        super();
    }
}