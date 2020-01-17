package com.ttchain.walletproject.ui.me.commonaddress.operation_new;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ(\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000eH\u0002J\u000e\u00107\u001a\u0002032\u0006\u00108\u001a\u00020\u000eJ&\u00109\u001a\b\u0012\u0004\u0012\u00020:0 2\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u0014H\u0002J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020\u0014H\u0002J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020?0 H\u0002J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000e0 H\u0002J\u0006\u0010A\u001a\u000203J\u001e\u0010B\u001a\u0002032\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010C\u001a\u0002032\u0006\u0010\u0013\u001a\u00020\u0014J(\u0010D\u001a\u0002032\u0006\u0010<\u001a\u00020\u00142\u0006\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001eR&\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0 0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001eR \u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0019\"\u0004\b(\u0010\u001eR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001eR \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001eR \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/ttchain/walletproject/ui/me/commonaddress/operation_new/OperationCommAddressNewViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/HelperRepository;)V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "addressID", "", "deleteAddressBookLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getDeleteAddressBookLiveData", "()Landroidx/lifecycle/MutableLiveData;", "getAddressDataLiveData", "Lcom/ttchain/walletproject/database/data/AddressData;", "getGetAddressDataLiveData", "setGetAddressDataLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "getWalletNameListLiveData", "", "getGetWalletNameListLiveData", "setGetWalletNameListLiveData", "nameErrorLiveData", "getNameErrorLiveData", "setNameErrorLiveData", "onShowMessageDialogLiveData", "getOnShowMessageDialogLiveData", "setOnShowMessageDialogLiveData", "performPostAddressBookDataListLiveData", "getPerformPostAddressBookDataListLiveData", "setPerformPostAddressBookDataListLiveData", "performPutAddressBookDataLiveData", "getPerformPutAddressBookDataLiveData", "setPerformPutAddressBookDataLiveData", "setAddressIDRxLiveData", "getSetAddressIDRxLiveData", "setSetAddressIDRxLiveData", "addAddressData", "", "name", "note", "uuId", "deleteAddressBook", "uuid", "getAddressBookModelList", "Lcom/ttchain/walletproject/model/AddressBookData;", "getAddressBookingModel", "_id", "getAddressData", "getWalletDataList", "Lcom/ttchain/walletproject/database/data/WalletData;", "getWalletNameList", "getWalletNameListRx", "onSaveClick", "setAddressIDRx", "updateAddressData", "app_proPlayDebug"})
public final class OperationCommAddressNewViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address;
    private int addressID;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> setAddressIDRxLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.AddressData> getAddressDataLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getWalletNameListLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> nameErrorLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> onShowMessageDialogLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> performPostAddressBookDataListLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> performPutAddressBookDataLiveData;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> deleteAddressBookLiveData = null;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.HelperRepository helperRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSetAddressIDRxLiveData() {
        return null;
    }
    
    public final void setSetAddressIDRxLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.AddressData> getGetAddressDataLiveData() {
        return null;
    }
    
    public final void setGetAddressDataLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.database.data.AddressData> p0) {
    }
    
    public final void setAddressIDRx(int addressID) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> getGetWalletNameListLiveData() {
        return null;
    }
    
    public final void setGetWalletNameListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> p0) {
    }
    
    public final void getWalletNameListRx() {
    }
    
    private final java.util.List<java.lang.String> getWalletNameList() {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getNameErrorLiveData() {
        return null;
    }
    
    public final void setNameErrorLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getOnShowMessageDialogLiveData() {
        return null;
    }
    
    public final void setOnShowMessageDialogLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPerformPostAddressBookDataListLiveData() {
        return null;
    }
    
    public final void setPerformPostAddressBookDataListLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPerformPutAddressBookDataLiveData() {
        return null;
    }
    
    public final void setPerformPutAddressBookDataLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void onSaveClick(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
    }
    
    private final java.util.List<com.ttchain.walletproject.model.AddressBookData> getAddressBookModelList(java.lang.String name, java.lang.String note, java.lang.String address) {
        return null;
    }
    
    private final void addAddressData(java.lang.String name, java.lang.String note, java.lang.String address, java.lang.String uuId) {
    }
    
    private final com.ttchain.walletproject.model.AddressBookData getAddressBookingModel(int _id) {
        return null;
    }
    
    private final void updateAddressData(int _id, java.lang.String name, java.lang.String note, java.lang.String address) {
    }
    
    private final com.ttchain.walletproject.database.data.AddressData getAddressData(int _id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDeleteAddressBookLiveData() {
        return null;
    }
    
    public final void deleteAddressBook(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
    }
    
    public OperationCommAddressNewViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepository helperRepository) {
        super();
    }
}