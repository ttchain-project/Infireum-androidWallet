package com.ttchain.walletproject.ui.dapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/ttchain/walletproject/ui/dapp/DappViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "infoRepository", "Lcom/ttchain/walletproject/repository/InfoRepositoryCo;", "(Landroid/content/Context;Lcom/ttchain/walletproject/repository/InfoRepositoryCo;)V", "getDataLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ttchain/walletproject/model/ExplorerDappBean;", "getGetDataLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getData", "", "app_proPlayDebug"})
public final class DappViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> getDataLiveData = null;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.repository.InfoRepositoryCo infoRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> getGetDataLiveData() {
        return null;
    }
    
    public final void getData() {
    }
    
    public DappViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.InfoRepositoryCo infoRepository) {
        super();
    }
}