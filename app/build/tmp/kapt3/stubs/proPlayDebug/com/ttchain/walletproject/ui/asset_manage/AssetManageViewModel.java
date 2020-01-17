package com.ttchain.walletproject.ui.asset_manage;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\u0006\u0010\u0017\u001a\u00020\u0012J\u0016\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/ttchain/walletproject/ui/asset_manage/AssetManageViewModel;", "Lcom/ttchain/walletproject/base/BaseRecyclerViewViewModel;", "Lcom/ttchain/walletproject/model/CoinEntity;", "coinRepository", "Lcom/ttchain/walletproject/repository/CoinRepository;", "(Lcom/ttchain/walletproject/repository/CoinRepository;)V", "setMenuTypeIdLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getSetMenuTypeIdLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setSetMenuTypeIdLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "updateMenuItemLiveData", "", "getUpdateMenuItemLiveData", "setUpdateMenuItemLiveData", "deleteCoinSelectionData", "", "coinSelectedID", "onClickMenuDeleteFinish", "performGetAssetCoinBeanList", "performGetDeleteCoinBeanList", "requestData", "updateCoinSelectionSelected", "coinSelectionId", "selected", "app_proPlayDebug"})
public final class AssetManageViewModel extends com.ttchain.walletproject.base.BaseRecyclerViewViewModel<com.ttchain.walletproject.model.CoinEntity> {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> setMenuTypeIdLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> updateMenuItemLiveData;
    private final com.ttchain.walletproject.repository.CoinRepository coinRepository = null;
    
    public final void requestData() {
    }
    
    private final void performGetAssetCoinBeanList() {
    }
    
    public final void updateCoinSelectionSelected(int coinSelectionId, boolean selected) {
    }
    
    public final void deleteCoinSelectionData(int coinSelectedID) {
    }
    
    private final void performGetDeleteCoinBeanList() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSetMenuTypeIdLiveData() {
        return null;
    }
    
    public final void setSetMenuTypeIdLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUpdateMenuItemLiveData() {
        return null;
    }
    
    public final void setUpdateMenuItemLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void onClickMenuDeleteFinish() {
    }
    
    public AssetManageViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.CoinRepository coinRepository) {
        super();
    }
}