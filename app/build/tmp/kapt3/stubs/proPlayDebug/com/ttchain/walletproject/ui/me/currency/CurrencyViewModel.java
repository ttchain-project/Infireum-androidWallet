package com.ttchain.walletproject.ui.me.currency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/ttchain/walletproject/ui/me/currency/CurrencyViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;)V", "getCurrencySelectLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getGetCurrencySelectLiveData", "()Landroidx/lifecycle/MutableLiveData;", "onSaveClickLiveData", "", "getOnSaveClickLiveData", "getCurrencySelect", "", "getFiatList", "", "Lcom/ttchain/walletproject/database/data/FiatData;", "getIdentityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "onSaveClick", "currency", "updatePersonalFiatData", "identityData", "app_proPlayDebug"})
public final class CurrencyViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getCurrencySelectLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> onSaveClickLiveData = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getGetCurrencySelectLiveData() {
        return null;
    }
    
    public final void getCurrencySelect() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOnSaveClickLiveData() {
        return null;
    }
    
    public final void onSaveClick(@org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
    }
    
    private final com.ttchain.walletproject.database.data.IdentityData getIdentityData() {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.database.data.FiatData> getFiatList() {
        return null;
    }
    
    private final void updatePersonalFiatData(com.ttchain.walletproject.database.data.IdentityData identityData) {
    }
    
    public CurrencyViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper) {
        super();
    }
}