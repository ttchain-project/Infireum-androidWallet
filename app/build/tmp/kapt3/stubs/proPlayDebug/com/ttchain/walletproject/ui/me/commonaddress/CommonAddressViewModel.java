package com.ttchain.walletproject.ui.me.commonaddress;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0016\u0010\u001b\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0014H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/ttchain/walletproject/ui/me/commonaddress/CommonAddressViewModel;", "Lcom/ttchain/walletproject/base/BaseRecyclerViewViewModel;", "Lcom/ttchain/walletproject/model/AddressEntity;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelp", "Lcom/ttchain/walletproject/model/UserHelper;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepository;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/HelperRepository;)V", "isPicker", "", "()Z", "setPicker", "(Z)V", "getAddressList", "", "getAddressListEntity", "", "getIdentityId", "", "getWalletIconByAddress", "", "address", "refreshRequest", "updateDbAddressDataList", "apiList", "Lcom/ttchain/walletproject/model/AddressBookData;", "app_proPlayDebug"})
public final class CommonAddressViewModel extends com.ttchain.walletproject.base.BaseRecyclerViewViewModel<com.ttchain.walletproject.model.AddressEntity> {
    private boolean isPicker;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelp = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.HelperRepository helperRepository = null;
    
    public final boolean isPicker() {
        return false;
    }
    
    public final void setPicker(boolean p0) {
    }
    
    public final void getAddressList() {
    }
    
    private final java.lang.String getIdentityId() {
        return null;
    }
    
    private final void updateDbAddressDataList(java.util.List<com.ttchain.walletproject.model.AddressBookData> apiList) {
    }
    
    private final java.util.List<com.ttchain.walletproject.model.AddressEntity> getAddressListEntity() {
        return null;
    }
    
    private final int getWalletIconByAddress(java.lang.String address) {
        return 0;
    }
    
    @java.lang.Override()
    public void refreshRequest() {
    }
    
    public CommonAddressViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelp, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepository helperRepository) {
        super();
    }
}