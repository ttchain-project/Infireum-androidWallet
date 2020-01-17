package com.ttchain.walletproject.ui.wallet.wallet_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0002J\u001a\u0010F\u001a\u00020G2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010H\u001a\u0004\u0018\u00010IH\u0002J\u001e\u0010J\u001a\u00020C2\u0006\u0010K\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020\u001a2\u0006\u0010M\u001a\u00020\u001aJ\u0006\u0010N\u001a\u00020OJ\u0010\u0010P\u001a\u00020C2\u0006\u0010Q\u001a\u00020\u001aH\u0002J\f\u0010R\u001a\b\u0012\u0004\u0012\u00020G01J\u0010\u0010S\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020CH\u0002J\u0006\u0010U\u001a\u00020VJ\b\u0010W\u001a\u00020OH\u0002J\u0006\u0010X\u001a\u00020OJ\b\u0010Y\u001a\u00020OH\u0002J\b\u0010Z\u001a\u00020OH\u0002J\u0006\u0010[\u001a\u00020OJ\u000e\u0010[\u001a\u00020I2\u0006\u0010\\\u001a\u00020CJ\u000e\u0010]\u001a\b\u0012\u0004\u0012\u00020I01H\u0002J\u0016\u0010^\u001a\u00020O2\u0006\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u00020CJ\u0006\u0010a\u001a\u00020OJ\u0006\u0010b\u001a\u00020OR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0#\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0#\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020(0#\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0#\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0#\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0014010#\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u001a\u00103\u001a\u000204X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u001a0#\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u001a\u0010;\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0016\"\u0004\b=\u0010\u0018R\u001a\u0010>\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001eR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/wallet_list/WalletListViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "context", "Landroid/content/Context;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "coinRepository", "Lcom/ttchain/walletproject/repository/CoinRepository;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepositoryCo;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "ttnRepository", "Lcom/ttchain/walletproject/repository/TtnRepository;", "ttnServerApiRepository", "Lcom/ttchain/walletproject/repository/TtnServerApiRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/CoinRepository;Lcom/ttchain/walletproject/repository/HelperRepositoryCo;Lcom/ttchain/walletproject/repository/VerifyRepository;Lcom/ttchain/walletproject/repository/TtnRepository;Lcom/ttchain/walletproject/repository/TtnServerApiRepository;)V", "btc", "Lcom/ttchain/walletproject/ui/wallet/wallet_list/ExpandableListBean;", "getBtc", "()Lcom/ttchain/walletproject/ui/wallet/wallet_list/ExpandableListBean;", "setBtc", "(Lcom/ttchain/walletproject/ui/wallet/wallet_list/ExpandableListBean;)V", "category", "", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "eth", "getEth", "setEth", "fiatNameLiveData", "Landroidx/lifecycle/MutableLiveData;", "getFiatNameLiveData", "()Landroidx/lifecycle/MutableLiveData;", "fiatSymbol", "getRateAndWalletDataErrorLiveData", "", "getGetRateAndWalletDataErrorLiveData", "launchAssetListActivityLiveData", "getLaunchAssetListActivityLiveData", "launchCoinRecordLiveData", "getLaunchCoinRecordLiveData", "launchTtnCoinRecordLiveData", "getLaunchTtnCoinRecordLiveData", "mainDataLiveData", "", "getMainDataLiveData", "total", "Ljava/math/BigDecimal;", "getTotal", "()Ljava/math/BigDecimal;", "setTotal", "(Ljava/math/BigDecimal;)V", "totalAssetAmountLiveData", "getTotalAssetAmountLiveData", "ttn", "getTtn", "setTtn", "ttnAddress", "getTtnAddress", "setTtnAddress", "usdtChainName", "createRestoreWalletData", "", "bean", "Lcom/ttchain/walletproject/model/UserBean;", "createWalletBean", "Lcom/ttchain/walletproject/model/WalletBean;", "data", "Lcom/ttchain/walletproject/database/data/WalletData;", "createWalletData", "mnemonic", "privateKey", "address", "getBalance", "", "getCoinIDByCoinId", "coinId", "getDefaultWalletBeanList", "getIconPathByCoinId", "id", "getIdentityData", "Lcom/ttchain/walletproject/database/data/IdentityData;", "getMainData", "getRateAndWalletData", "getStableData", "getTotalAssetAmount", "getWalletData", "walletID", "getWalletDataList", "launchAssetListActivity", "expandableData", "childPosition", "onClickMainChain", "onClickStableCoin", "app_proPlayDebug"})
public final class WalletListViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String category;
    private java.lang.String fiatSymbol;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRateAndWalletDataErrorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> totalAssetAmountLiveData = null;
    private final java.lang.String usdtChainName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> fiatNameLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean>> mainDataLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean btc;
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean eth;
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean ttn;
    @org.jetbrains.annotations.NotNull()
    private java.math.BigDecimal total;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> launchCoinRecordLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> launchTtnCoinRecordLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchAssetListActivityLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ttnAddress;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.CoinRepository coinRepository = null;
    private final com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    private final com.ttchain.walletproject.repository.TtnRepository ttnRepository = null;
    private final com.ttchain.walletproject.repository.TtnServerApiRepository ttnServerApiRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getGetRateAndWalletDataErrorLiveData() {
        return null;
    }
    
    public final void getRateAndWalletData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.IdentityData getIdentityData() {
        return null;
    }
    
    public final void onClickMainChain() {
    }
    
    public final void onClickStableCoin() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTotalAssetAmountLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFiatNameLiveData() {
        return null;
    }
    
    public final void getWalletData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean>> getMainDataLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean getBtc() {
        return null;
    }
    
    public final void setBtc(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean getEth() {
        return null;
    }
    
    public final void setEth(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean getTtn() {
        return null;
    }
    
    public final void setTtn(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean p0) {
    }
    
    private final void getMainData() {
    }
    
    private final void getStableData() {
    }
    
    private final java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataList() {
        return null;
    }
    
    private final int getCoinIDByCoinId(java.lang.String coinId) {
        return 0;
    }
    
    private final java.lang.String getIconPathByCoinId(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getTotal() {
        return null;
    }
    
    public final void setTotal(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal p0) {
    }
    
    private final void getTotalAssetAmount() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLaunchCoinRecordLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLaunchTtnCoinRecordLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLaunchAssetListActivityLiveData() {
        return null;
    }
    
    public final void launchAssetListActivity(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.ui.wallet.wallet_list.ExpandableListBean expandableData, int childPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.WalletBean> getDefaultWalletBeanList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getWalletData(int walletID) {
        return null;
    }
    
    private final com.ttchain.walletproject.model.WalletBean createWalletBean(android.content.Context context, com.ttchain.walletproject.database.data.WalletData data) {
        return null;
    }
    
    public final int createWalletData(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic, @org.jetbrains.annotations.NotNull()
    java.lang.String privateKey, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return 0;
    }
    
    private final int createRestoreWalletData(com.ttchain.walletproject.model.UserBean bean) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTtnAddress() {
        return null;
    }
    
    public final void setTtnAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final void getBalance() {
    }
    
    public WalletListViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.CoinRepository coinRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.TtnRepository ttnRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.TtnServerApiRepository ttnServerApiRepository) {
        super();
    }
}