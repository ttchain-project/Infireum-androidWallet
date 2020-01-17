package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 a2\u00020\u0001:\u0001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'J\u001e\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020,J\u001e\u0010-\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020,J\u0018\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0015H\u0002J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0010J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u000207J\u0016\u00108\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00100\u001a\u00020\u0015J\u0006\u00109\u001a\u00020\nJ\u0018\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00152\b\b\u0002\u0010=\u001a\u00020\u0015J$\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010E\u001a\u00020,J$\u0010F\u001a\u00020G2\u0006\u0010@\u001a\u00020A2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020H0C2\u0006\u0010E\u001a\u00020,J\u0006\u0010I\u001a\u00020JJ\u0006\u0010K\u001a\u000205J\u0018\u0010K\u001a\u0002052\b\b\u0002\u0010L\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u0015J\u000e\u0010M\u001a\u00020N2\u0006\u00100\u001a\u00020\u0015J\u000e\u0010O\u001a\u00020P2\u0006\u0010@\u001a\u00020AJ\u000e\u0010Q\u001a\u00020\u00152\u0006\u0010E\u001a\u00020,J\u0010\u0010R\u001a\u00020S2\b\b\u0002\u0010/\u001a\u00020\u001eJ\u0006\u0010T\u001a\u000207J\u0006\u0010U\u001a\u00020\u0015J\u0006\u0010V\u001a\u00020\u001eJ\u000e\u0010W\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u001eJ\u000e\u0010X\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u001eJ\u0006\u0010Y\u001a\u00020\u0010J\u0006\u0010Z\u001a\u00020\u0010J\u0006\u0010[\u001a\u00020\u0010J\u0006\u0010\\\u001a\u00020\u0010J\u0006\u0010]\u001a\u00020\u0010J\u0006\u0010^\u001a\u00020\u0010J\u0006\u0010_\u001a\u00020\u0010J \u0010`\u001a\u00020%2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\nH\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006b"}, d2 = {"Lcom/ttchain/walletproject/repository/BaseCoinTransferRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "verifyRepository", "Lcom/ttchain/walletproject/repository/VerifyRepository;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/repository/VerifyRepository;)V", "coinTransferBean", "Lcom/ttchain/walletproject/model/CoinTransferBean;", "getCoinTransferBean", "()Lcom/ttchain/walletproject/model/CoinTransferBean;", "setCoinTransferBean", "(Lcom/ttchain/walletproject/model/CoinTransferBean;)V", "isSendAllBtcAmount", "", "()Z", "setSendAllBtcAmount", "(Z)V", "nonceResult", "", "getNonceResult", "()Ljava/lang/String;", "setNonceResult", "(Ljava/lang/String;)V", "transCoinId", "getTransCoinId", "setTransCoinId", "value", "", "walletSelectedId", "getWalletSelectedId", "()I", "setWalletSelectedId", "(I)V", "addLightningTransRecordData", "", "data", "Lcom/ttchain/walletproject/database/data/LightningTransRecordData;", "addTransferRecordData", "txId", "transferBean", "minerFeeEditBean", "Lcom/ttchain/walletproject/model/MinerFeeEditBean;", "addUsdtTransferRecordData", "createBaseCoinTransferBean", "walletID", "coinId", "createPickWalletBean", "Lcom/ttchain/walletproject/model/PickWalletBean;", "status", "getAssetData", "Lcom/ttchain/walletproject/database/data/AssetData;", "walletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getAssetDataByCoinId", "getBaseCoinTransferBean", "getBlockExplorerBroadcaseModel", "Lcom/ttchain/walletproject/model/BlockExplorerRequest;", "signText", "comment", "getBtcToBtrTransactionModel", "Lcom/ttchain/walletproject/model/BtcToBtrTransactionModel;", "context", "Landroid/content/Context;", "list", "", "Lcom/ttchain/walletproject/model/ApiBtcTransactionData;", "bean", "getBtcTransactionModel", "Lcom/ttchain/walletproject/model/BtcTransactionModel;", "Lcom/ttchain/walletproject/model/ResponseBTCTransactionData;", "getChainType", "Lcom/ttchain/walletproject/enums/ChainType;", "getCoinAssetInWallet", "walletId", "getCoinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getEthTransactionModel", "Lcom/ttchain/walletproject/model/EthTransactionModel;", "getNonceStruct", "getReceiptAddressBean", "Lcom/ttchain/walletproject/model/ReceiptAddressBean;", "getSelectedWalletData", "getTransWalletAddress", "getTransWalletChainType", "getWalletAddress", "getWalletEpKey", "isAssetDataExistInThunder", "isBtcMainCoinType", "isBtcTransType", "isEnough", "isEnoughInThunder", "isEthMainCoinType", "isEthTransType", "updateWalletID", "Companion", "app_proPlayDebug"})
public final class BaseCoinTransferRepository extends com.ttchain.walletproject.repository.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String transCoinId;
    private int walletSelectedId;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.model.CoinTransferBean coinTransferBean;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nonceResult;
    private boolean isSendAllBtcAmount;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.repository.VerifyRepository verifyRepository = null;
    public static final com.ttchain.walletproject.repository.BaseCoinTransferRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransCoinId() {
        return null;
    }
    
    public final void setTransCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getWalletSelectedId() {
        return 0;
    }
    
    public final void setWalletSelectedId(int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.model.CoinTransferBean getCoinTransferBean() {
        return null;
    }
    
    public final void setCoinTransferBean(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.model.CoinTransferBean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNonceResult() {
        return null;
    }
    
    public final void setNonceResult(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isSendAllBtcAmount() {
        return false;
    }
    
    public final void setSendAllBtcAmount(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getSelectedWalletData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTransWalletAddress() {
        return null;
    }
    
    public final int getTransWalletChainType() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.enums.ChainType getChainType() {
        return null;
    }
    
    public final boolean isEthTransType() {
        return false;
    }
    
    public final boolean isBtcTransType() {
        return false;
    }
    
    public final boolean isEthMainCoinType() {
        return false;
    }
    
    public final boolean isBtcMainCoinType() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.CoinTransferBean getBaseCoinTransferBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.ReceiptAddressBean getReceiptAddressBean(int walletID) {
        return null;
    }
    
    private final void updateWalletID(int walletID, java.lang.String coinId, com.ttchain.walletproject.model.CoinTransferBean bean) {
    }
    
    private final com.ttchain.walletproject.model.CoinTransferBean createBaseCoinTransferBean(int walletID, java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.PickWalletBean createPickWalletBean(boolean status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletAddress(int walletID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.AssetData getAssetData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.WalletData walletData) {
        return null;
    }
    
    public final boolean isEnough() {
        return false;
    }
    
    public final boolean isEnoughInThunder() {
        return false;
    }
    
    public final boolean isAssetDataExistInThunder() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.AssetData getCoinAssetInWallet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.AssetData getCoinAssetInWallet(int walletId, @org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.BtcTransactionModel getBtcTransactionModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData> list, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.MinerFeeEditBean bean) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.BtcToBtrTransactionModel getBtcToBtrTransactionModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ApiBtcTransactionData> list, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.MinerFeeEditBean bean) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.BlockExplorerRequest getBlockExplorerBroadcaseModel(@org.jetbrains.annotations.NotNull()
    java.lang.String signText, @org.jetbrains.annotations.NotNull()
    java.lang.String comment) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNonceStruct(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.MinerFeeEditBean bean) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.EthTransactionModel getEthTransactionModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void addLightningTransRecordData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LightningTransRecordData data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinData getCoinData(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    public final int addTransferRecordData(@org.jetbrains.annotations.NotNull()
    java.lang.String txId, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.CoinTransferBean transferBean, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.MinerFeeEditBean minerFeeEditBean) {
        return 0;
    }
    
    public final int addUsdtTransferRecordData(@org.jetbrains.annotations.NotNull()
    java.lang.String txId, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.CoinTransferBean transferBean, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.MinerFeeEditBean minerFeeEditBean) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.AssetData getAssetDataByCoinId(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.WalletData walletData, @org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWalletEpKey(int walletID) {
        return null;
    }
    
    public BaseCoinTransferRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.VerifyRepository verifyRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0004J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eJR\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001bJ\u001a\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u000e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000eJ&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J>\u0010%\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001bJ>\u0010&\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u001b\u00a8\u0006\'"}, d2 = {"Lcom/ttchain/walletproject/repository/BaseCoinTransferRepository$Companion;", "", "()V", "getCanUseUnSpendAmount", "Ljava/math/BigDecimal;", "sourceList", "", "Lcom/ttchain/walletproject/model/ResponseBTCTransactionData;", "totalOutAmount", "getCanUseUnSpendBeanList", "Lcom/ttchain/walletproject/model/UnspendData;", "getMainnetInfuraEthBroadcastModel", "Lcom/ttchain/walletproject/model/MainnetInfuraRequest;", "signText", "", "comment", "getMainnetInfuraEthNonceModel", "address", "getSignBtcBodyModel", "Lcom/ttchain/walletproject/model/SignBTCBodyData;", "encryptPrivateKey", "list", "bean", "Lcom/ttchain/walletproject/model/MinerFeeEditBean;", "transferBean", "Lcom/ttchain/walletproject/model/CoinTransferBean;", "isToBtcRelay", "", "isSendAllAmount", "isCompressed", "getSignEthBodyModel", "Lcom/ttchain/walletproject/model/SignETHBodyRequest;", "contractAddress", "getSignEthUrlModel", "Lcom/ttchain/walletproject/model/SignEthQueryModel;", "needPayload", "nonce", "getSignUSDTBodyModel", "getSignUsdtLightenBodyModel", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.model.MainnetInfuraRequest getMainnetInfuraEthBroadcastModel(@org.jetbrains.annotations.NotNull()
        java.lang.String signText, @org.jetbrains.annotations.NotNull()
        java.lang.String comment) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.model.MainnetInfuraRequest getMainnetInfuraEthNonceModel(@org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.model.SignETHBodyRequest getSignEthBodyModel(@org.jetbrains.annotations.NotNull()
        java.lang.String encryptPrivateKey, @org.jetbrains.annotations.Nullable()
        java.lang.String contractAddress) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.model.SignEthQueryModel getSignEthUrlModel(boolean needPayload, @org.jetbrains.annotations.NotNull()
        java.lang.String nonce, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.MinerFeeEditBean bean, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.CoinTransferBean transferBean) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getCanUseUnSpendAmount(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData> sourceList, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal totalOutAmount) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ttchain.walletproject.model.UnspendData> getCanUseUnSpendBeanList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData> sourceList, @org.jetbrains.annotations.NotNull()
        java.math.BigDecimal totalOutAmount) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.model.SignBTCBodyData getSignBtcBodyModel(@org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        java.lang.String encryptPrivateKey, @org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData> list, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.MinerFeeEditBean bean, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.CoinTransferBean transferBean, boolean isToBtcRelay, boolean isSendAllAmount, boolean isCompressed) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.model.SignBTCBodyData getSignUSDTBodyModel(@org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        java.lang.String encryptPrivateKey, @org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData> list, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.MinerFeeEditBean bean, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.CoinTransferBean transferBean, boolean isCompressed) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.model.SignBTCBodyData getSignUsdtLightenBodyModel(@org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        java.lang.String encryptPrivateKey, @org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData> list, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.MinerFeeEditBean bean, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.CoinTransferBean transferBean, boolean isCompressed) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}