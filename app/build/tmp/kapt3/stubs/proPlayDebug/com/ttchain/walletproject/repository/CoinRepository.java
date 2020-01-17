package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 M2\u00020\u0001:\u0001MB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0002J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u000e\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rJ\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001fJ&\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\rH\u0002J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150(2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\rH\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00182\u0006\u0010.\u001a\u00020\u001cJ\u000e\u0010/\u001a\u00020,2\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u001cJ\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001fJ\f\u00103\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010\'\u001a\u00020\rJ\u000e\u00105\u001a\u0002062\u0006\u00101\u001a\u00020\u001cJ\u0014\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u00101\u001a\u00020\u001cJ\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u00109\u001a\u00020\rJ\u0006\u0010:\u001a\u00020;J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f2\b\u0010=\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010>J\u0006\u0010?\u001a\u00020\rJ\u0006\u0010@\u001a\u00020\rJ\b\u0010A\u001a\u00020\u0010H\u0002J\u000e\u0010B\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010C\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0014\u0010D\u001a\u00020\u00102\f\u0010E\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00150\u001f2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00150\u001fH\u0002J\u0006\u0010G\u001a\u00020\u0010J\u0014\u0010H\u001a\u00020\u00102\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u001fJ\u0016\u0010K\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u001c2\u0006\u0010L\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lcom/ttchain/walletproject/repository/CoinRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "context", "Landroid/content/Context;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "systemHelper", "Lcom/ttchain/walletproject/model/SystemHelper;", "(Landroid/content/Context;Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/model/SystemHelper;)V", "lockCoinMap", "", "", "", "addCoinAssetData", "", "coinId", "mainCoinId", "addCoinSelectionData", "createCoinBean", "Lcom/ttchain/walletproject/model/CoinBean;", "data", "Lcom/ttchain/walletproject/database/data/CoinData;", "Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "createCoinEntity", "Lcom/ttchain/walletproject/model/CoinEntity;", "entityType", "", "bean", "createManageCoinBeanList", "", "Lcom/ttchain/walletproject/model/ManageCoinBean;", "deleteAssetData", "deleteCoinSelectionData", "coinSelectedId", "getAssetCoinEntityList", "getCoinBeanList", "isLockCoin", "identifier", "", "getCoinRecordBean", "Lcom/ttchain/walletproject/model/CoinRecordBean;", "rate", "Ljava/math/BigDecimal;", "getCoinSelectionData", "coinSelectionID", "getCoinToPrefFiatRate", "getCoinWalletType", "coinID", "getDeleteCoinEntityList", "getManageCoinBeanList", "getNormalCoinEntityList", "getPickCoinBean", "Lcom/ttchain/walletproject/model/PickCoinBean;", "getPickCoinEntityList", "getSearchCoinEntityList", "word", "getSelectedWalletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getTransToCoinBeanList", "fromCoinID", "(Ljava/lang/Integer;)Ljava/util/List;", "getUserPrefFiatName", "getUserPrefFiatSymbol", "initLockCoinMap", "isCoinAssetDataExist", "isCoinSelectionDataExist", "setManageCoinBeanList", "list", "sortCoinBeanList", "unSelectedZeroAmountCoinBeanData", "updateCoinDataList", "apiDataList", "Lcom/ttchain/walletproject/model/ApiCoinData;", "updateCoinSelectionSelected", "selected", "Companion", "app_proPlayDebug"})
public final class CoinRepository extends com.ttchain.walletproject.repository.BaseRepository {
    
    /**
     * lock coin map is verify coin can add to [CoinSelectionData] in [com.git4u.tt_wallet_android.activity.asset_new.searchcoin.SearchCoinActivity]
     * or change coin selection status with [CoinSelectionData].isSelected in [com.git4u.tt_wallet_android.activity.asset_new.AssetManageActivity]
     * Key String: coinId => coin identifier.
     * Value Boolean: always true because is lock list.
     */
    private java.util.Map<java.lang.String, java.lang.Boolean> lockCoinMap;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.model.SystemHelper systemHelper = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_CIC_IDENTIFIER = "0x29dc5ea777ff2bbfe14866f368b5ccc5e9fad99e";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_BTC_RELAY_IDENTIFIER = "Identifier_BTCRelay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_ETH_RELAY_IDENTIFIER = "Identifier_ETHRelay";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_CRY_IDENTIFIER = "Identifier_CRY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_GUC_IDENTIFIER = "0x43ccb7d0f229f96488b7f963d2cf25434efbe611b9e7c8ff28176e761c5f7944";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_RSC_IDENTIFIER = "Identifier_RSC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_AIRDROP_IDENTIFIER = "Identifier_AIRDROP";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_MAIN_CHAIN_IDENTIFIER = "Identifier_MAIN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_FIAT_IDENTIFIER = "Identifier_FIAT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COIN_STO_IDENTIFIER = "Identifier_STO";
    public static final com.ttchain.walletproject.repository.CoinRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.CoinBean createCoinBean(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinSelectionData data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.CoinBean createCoinBean(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.CoinData data) {
        return null;
    }
    
    public final void setManageCoinBeanList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ManageCoinBean> list) {
    }
    
    /**
     * Get manage coin bean list from [SystemHelper.manageCoinBeanListString]
     * If BeanListString is empty (means first time),
     * create a default ManageCoinBeanList from [.createManageCoinBeanList],
     * and then set the list data to [.setManageCoinBeanList]
     *
     * @return ManageCoinBean list data
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.ManageCoinBean> getManageCoinBeanList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.ManageCoinBean> createManageCoinBeanList() {
        return null;
    }
    
    public final void addCoinSelectionData(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
    }
    
    public final void addCoinSelectionData(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.lang.String mainCoinId) {
    }
    
    public final boolean isCoinSelectionDataExist(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return false;
    }
    
    public final boolean isCoinAssetDataExist(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return false;
    }
    
    public final void addCoinAssetData(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.WalletData getSelectedWalletData() {
        return null;
    }
    
    public final void addCoinAssetData(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.lang.String mainCoinId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.database.data.CoinSelectionData getCoinSelectionData(int coinSelectionID) {
        return null;
    }
    
    public final void updateCoinSelectionSelected(int coinSelectionID, boolean selected) {
    }
    
    public final void deleteCoinSelectionData(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
    }
    
    public final void deleteCoinSelectionData(int coinSelectedId) {
    }
    
    public final void deleteAssetData(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
    }
    
    public final void unSelectedZeroAmountCoinBeanData() {
    }
    
    private final java.util.List<com.ttchain.walletproject.model.CoinBean> sortCoinBeanList(java.util.List<com.ttchain.walletproject.model.CoinBean> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.PickCoinBean getPickCoinBean(int coinID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.CoinEntity> getNormalCoinEntityList(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.CoinEntity> getPickCoinEntityList(int coinID) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.CoinEntity> getAssetCoinEntityList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.CoinEntity> getSearchCoinEntityList(@org.jetbrains.annotations.NotNull()
    java.lang.String word) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.CoinEntity> getDeleteCoinEntityList() {
        return null;
    }
    
    private final com.ttchain.walletproject.model.CoinEntity createCoinEntity(@com.ttchain.walletproject.model.CoinEntity.Companion.CoinType()
    int entityType, com.ttchain.walletproject.model.CoinBean bean) {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.model.CoinBean> getCoinBeanList(@com.ttchain.walletproject.model.CoinEntity.Companion.CoinType()
    int entityType, boolean isLockCoin, java.lang.String identifier) {
        return null;
    }
    
    private final java.util.List<com.ttchain.walletproject.model.CoinBean> getCoinBeanList(@com.ttchain.walletproject.model.CoinEntity.Companion.CoinType()
    int entityType, java.lang.String identifier) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.CoinRecordBean getCoinRecordBean(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal rate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getCoinToPrefFiatRate(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPrefFiatName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPrefFiatSymbol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.CoinBean> getTransToCoinBeanList(@org.jetbrains.annotations.Nullable()
    java.lang.Integer fromCoinID) {
        return null;
    }
    
    public final int getCoinWalletType(int coinID) {
        return 0;
    }
    
    private final void initLockCoinMap() {
    }
    
    private final boolean isLockCoin(java.lang.String coinId) {
        return false;
    }
    
    public final void updateCoinDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ApiCoinData> apiDataList) {
    }
    
    public CoinRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.SystemHelper systemHelper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/ttchain/walletproject/repository/CoinRepository$Companion;", "", "()V", "COIN_AIRDROP_IDENTIFIER", "", "COIN_BTC_RELAY_IDENTIFIER", "COIN_CIC_IDENTIFIER", "COIN_CRY_IDENTIFIER", "COIN_ETH_RELAY_IDENTIFIER", "COIN_FIAT_IDENTIFIER", "COIN_GUC_IDENTIFIER", "COIN_MAIN_CHAIN_IDENTIFIER", "COIN_RSC_IDENTIFIER", "COIN_STO_IDENTIFIER", "app_proPlayDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}