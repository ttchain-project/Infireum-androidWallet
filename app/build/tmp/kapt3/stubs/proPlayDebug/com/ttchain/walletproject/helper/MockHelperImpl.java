package com.ttchain.walletproject.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 Z2\u00020\u0001:\u0001ZB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010V\u001a\u00020WH\u0016J\b\u0010X\u001a\u00020YH\u0016R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\fR\u0014\u0010\u001b\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0014\u0010\u001f\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\fR\u0014\u0010#\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\fR\u001a\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010+R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u0010+R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u0010+R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002030(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u0010+R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b7\u0010+R\u0014\u00108\u001a\u0002098VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020=0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b>\u0010+R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020@0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bA\u0010+R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020C0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bD\u0010+R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020F0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bG\u0010+R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u000e0(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bI\u0010+R\u0014\u0010J\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bK\u0010\fR\u0014\u0010L\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bM\u0010\fR\u0014\u0010N\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bO\u0010\fR\u0014\u0010P\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bQ\u0010\fR\u0014\u0010R\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bS\u0010\fR\u0014\u0010T\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bU\u0010\b\u00a8\u0006["}, d2 = {"Lcom/ttchain/walletproject/helper/MockHelperImpl;", "Lcom/ttchain/walletproject/helper/MockHelper;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "assetData", "Lcom/ttchain/walletproject/database/data/AssetData;", "getAssetData", "()Lcom/ttchain/walletproject/database/data/AssetData;", "btcCoinData", "Lcom/ttchain/walletproject/database/data/CoinData;", "getBtcCoinData", "()Lcom/ttchain/walletproject/database/data/CoinData;", "btcWalletData", "Lcom/ttchain/walletproject/database/data/WalletData;", "getBtcWalletData", "()Lcom/ttchain/walletproject/database/data/WalletData;", "btcnCoinData", "getBtcnCoinData", "cicWalletData", "getCicWalletData", "coinSelectionSelectedData", "Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "getCoinSelectionSelectedData", "()Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "dai1CoinData", "getDai1CoinData", "eosCoinData", "getEosCoinData", "ethCoinData", "getEthCoinData", "ethWalletData", "getEthWalletData", "ethnCoinData", "getEthnCoinData", "exrCoinData", "getExrCoinData", "mccCoinData", "getMccCoinData", "mockAddressDataList", "", "Lcom/ttchain/walletproject/database/data/AddressData;", "getMockAddressDataList", "()Ljava/util/List;", "mockAssetDataList", "getMockAssetDataList", "mockCoinDataList", "getMockCoinDataList", "mockCoinSelectionDataList", "getMockCoinSelectionDataList", "mockCoinToCoinRateDataList", "Lcom/ttchain/walletproject/database/data/CoinToCoinRateData;", "getMockCoinToCoinRateDataList", "mockCoinToFiatRateDataList", "Lcom/ttchain/walletproject/database/data/CoinToFiatRateData;", "getMockCoinToFiatRateDataList", "mockDataTag", "", "getMockDataTag", "()Ljava/lang/String;", "mockFiatDataList", "Lcom/ttchain/walletproject/database/data/FiatData;", "getMockFiatDataList", "mockFiatToFiatRateDataList", "Lcom/ttchain/walletproject/database/data/FiatToFiatRateData;", "getMockFiatToFiatRateDataList", "mockIdentityDataList", "Lcom/ttchain/walletproject/database/data/IdentityData;", "getMockIdentityDataList", "mockLanguageDataList", "Lcom/ttchain/walletproject/database/data/LanguageData;", "getMockLanguageDataList", "mockWalletDataList", "getMockWalletDataList", "ttnCoinData", "getTtnCoinData", "tusd1CoinData", "getTusd1CoinData", "usdtCoinData", "getUsdtCoinData", "usdtTetherCoinData", "getUsdtTetherCoinData", "usdtnCoinData", "getUsdtnCoinData", "zeroAssetData", "getZeroAssetData", "needUpdateMockData", "", "updateMockDataTag", "", "Companion", "app_proPlayDebug"})
public final class MockHelperImpl implements com.ttchain.walletproject.helper.MockHelper {
    private final android.content.Context mContext = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOCK_PREFS = "mock_prefs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATA = "data";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOCK_TAG = "wethqwaeuh";
    public static final double MIN_AMOUNT_UNIT = 1.0E-6;
    public static final com.ttchain.walletproject.helper.MockHelperImpl.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getMockDataTag() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinData> getMockCoinDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.WalletData> getMockWalletDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getMockCoinSelectionDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.AssetData> getMockAssetDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.IdentityData> getMockIdentityDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.AddressData> getMockAddressDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.LanguageData> getMockLanguageDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.FiatData> getMockFiatDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinToCoinRateData> getMockCoinToCoinRateDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.CoinToFiatRateData> getMockCoinToFiatRateDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.ttchain.walletproject.database.data.FiatToFiatRateData> getMockFiatToFiatRateDataList() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.AssetData getZeroAssetData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.AssetData getAssetData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinSelectionData getCoinSelectionSelectedData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.WalletData getEthWalletData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.WalletData getBtcWalletData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.WalletData getCicWalletData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getBtcCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getUsdtCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getEthCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getUsdtTetherCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getTtnCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getBtcnCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getUsdtnCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getEthnCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getExrCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getMccCoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getDai1CoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getTusd1CoinData() {
        return null;
    }
    
    private final com.ttchain.walletproject.database.data.CoinData getEosCoinData() {
        return null;
    }
    
    @java.lang.Override()
    public void updateMockDataTag() {
    }
    
    @java.lang.Override()
    public boolean needUpdateMockData() {
        return false;
    }
    
    public MockHelperImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/ttchain/walletproject/helper/MockHelperImpl$Companion;", "", "()V", "DATA", "", "MIN_AMOUNT_UNIT", "", "MOCK_PREFS", "MOCK_TAG", "randomInt", "", "getRandomInt", "()I", "app_proPlayDebug"})
    public static final class Companion {
        
        public final int getRandomInt() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}