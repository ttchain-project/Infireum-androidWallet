package com.ttchain.walletproject.ui.coin_record;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020\'H\u0002J\u000e\u0010\u001a\u001a\u0002042\u0006\u00103\u001a\u00020\'J\u0006\u0010\u001e\u001a\u000204J\u0006\u0010&\u001a\u000204J\u0006\u00105\u001a\u000204J\b\u00106\u001a\u000204H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010\u001dR \u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001c\u0010*\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001b\"\u0004\b1\u0010\u001d\u00a8\u00067"}, d2 = {"Lcom/ttchain/walletproject/ui/coin_record/CoinRecordViewModel;", "Lcom/ttchain/walletproject/base/BaseCoinRecordViewModel;", "context", "Landroid/content/Context;", "etherscanApiRepository", "Lcom/ttchain/walletproject/repository/EtherscanApiRepository;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "broadcastRepository", "Lcom/ttchain/walletproject/repository/BroadcastRepository;", "omniExplorerRepository", "Lcom/ttchain/walletproject/repository/OmniExplorerRepository;", "blockExplorerRepository", "Lcom/ttchain/walletproject/repository/BlockExplorerRepository;", "baseCoinRecordRepository", "Lcom/ttchain/walletproject/repository/BaseCoinRecordRepository;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepositoryCo;", "coinRepository", "Lcom/ttchain/walletproject/repository/CoinRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/repository/EtherscanApiRepository;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/BroadcastRepository;Lcom/ttchain/walletproject/repository/OmniExplorerRepository;Lcom/ttchain/walletproject/repository/BlockExplorerRepository;Lcom/ttchain/walletproject/repository/BaseCoinRecordRepository;Lcom/ttchain/walletproject/repository/HelperRepositoryCo;Lcom/ttchain/walletproject/repository/CoinRepository;)V", "getBaseMainModel", "()Lcom/ttchain/walletproject/repository/BaseMainModel;", "coinRecordBean", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ttchain/walletproject/model/CoinRecordBean;", "getCoinRecordBean", "()Landroidx/lifecycle/MutableLiveData;", "setCoinRecordBean", "(Landroidx/lifecycle/MutableLiveData;)V", "launchCoinTransfer", "", "getLaunchCoinTransfer", "setLaunchCoinTransfer", "launchReceiptAsset", "", "getLaunchReceiptAsset", "setLaunchReceiptAsset", "launchTtnDeposit", "", "getLaunchTtnDeposit", "setLaunchTtnDeposit", "mCoinId", "getMCoinId", "()Ljava/lang/String;", "setMCoinId", "(Ljava/lang/String;)V", "showLightButton", "getShowLightButton", "setShowLightButton", "getCoinID", "coinId", "", "onClickReceipt", "performSyncTransferRecordDataList", "app_proPlayDebug"})
public final class CoinRecordViewModel extends com.ttchain.walletproject.base.BaseCoinRecordViewModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mCoinId;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.CoinRecordBean> coinRecordBean;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> showLightButton;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> launchReceiptAsset;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> launchCoinTransfer;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> launchTtnDeposit;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.repository.EtherscanApiRepository etherscanApiRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository = null;
    private final com.ttchain.walletproject.repository.OmniExplorerRepository omniExplorerRepository = null;
    private final com.ttchain.walletproject.repository.BlockExplorerRepository blockExplorerRepository = null;
    private final com.ttchain.walletproject.repository.BaseCoinRecordRepository baseCoinRecordRepository = null;
    private final com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository = null;
    private final com.ttchain.walletproject.repository.CoinRepository coinRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMCoinId() {
        return null;
    }
    
    public final void setMCoinId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.CoinRecordBean> getCoinRecordBean() {
        return null;
    }
    
    public final void setCoinRecordBean(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.ttchain.walletproject.model.CoinRecordBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowLightButton() {
        return null;
    }
    
    public final void setShowLightButton(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLaunchReceiptAsset() {
        return null;
    }
    
    public final void setLaunchReceiptAsset(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLaunchCoinTransfer() {
        return null;
    }
    
    public final void setLaunchCoinTransfer(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLaunchTtnDeposit() {
        return null;
    }
    
    public final void setLaunchTtnDeposit(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void getCoinRecordBean(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
    }
    
    private final void performSyncTransferRecordDataList() {
    }
    
    private final int getCoinID(java.lang.String coinId) {
        return 0;
    }
    
    public final void onClickReceipt() {
    }
    
    public final void launchCoinTransfer() {
    }
    
    public final void launchTtnDeposit() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.repository.BaseMainModel getBaseMainModel() {
        return null;
    }
    
    public CoinRecordViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.EtherscanApiRepository etherscanApiRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.OmniExplorerRepository omniExplorerRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BlockExplorerRepository blockExplorerRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseCoinRecordRepository baseCoinRecordRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepositoryCo helperRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.CoinRepository coinRepository) {
        super(null, null, null, null, null, null);
    }
}