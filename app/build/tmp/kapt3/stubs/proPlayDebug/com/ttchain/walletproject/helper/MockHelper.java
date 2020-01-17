package com.ttchain.walletproject.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010)\u001a\u00020*H&J\b\u0010+\u001a\u00020,H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0006R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u0012\u0010\u0016\u001a\u00020\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0006R\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0006R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u0006R\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b(\u0010\u0006\u00a8\u0006-"}, d2 = {"Lcom/ttchain/walletproject/helper/MockHelper;", "", "mockAddressDataList", "", "Lcom/ttchain/walletproject/database/data/AddressData;", "getMockAddressDataList", "()Ljava/util/List;", "mockAssetDataList", "Lcom/ttchain/walletproject/database/data/AssetData;", "getMockAssetDataList", "mockCoinDataList", "Lcom/ttchain/walletproject/database/data/CoinData;", "getMockCoinDataList", "mockCoinSelectionDataList", "Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "getMockCoinSelectionDataList", "mockCoinToCoinRateDataList", "Lcom/ttchain/walletproject/database/data/CoinToCoinRateData;", "getMockCoinToCoinRateDataList", "mockCoinToFiatRateDataList", "Lcom/ttchain/walletproject/database/data/CoinToFiatRateData;", "getMockCoinToFiatRateDataList", "mockDataTag", "", "getMockDataTag", "()Ljava/lang/String;", "mockFiatDataList", "Lcom/ttchain/walletproject/database/data/FiatData;", "getMockFiatDataList", "mockFiatToFiatRateDataList", "Lcom/ttchain/walletproject/database/data/FiatToFiatRateData;", "getMockFiatToFiatRateDataList", "mockIdentityDataList", "Lcom/ttchain/walletproject/database/data/IdentityData;", "getMockIdentityDataList", "mockLanguageDataList", "Lcom/ttchain/walletproject/database/data/LanguageData;", "getMockLanguageDataList", "mockWalletDataList", "Lcom/ttchain/walletproject/database/data/WalletData;", "getMockWalletDataList", "needUpdateMockData", "", "updateMockDataTag", "", "app_proPlayDebug"})
public abstract interface MockHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getMockDataTag();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinData> getMockCoinDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.WalletData> getMockWalletDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getMockCoinSelectionDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.AssetData> getMockAssetDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.IdentityData> getMockIdentityDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.AddressData> getMockAddressDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.LanguageData> getMockLanguageDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.FiatData> getMockFiatDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinToCoinRateData> getMockCoinToCoinRateDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.CoinToFiatRateData> getMockCoinToFiatRateDataList();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.ttchain.walletproject.database.data.FiatToFiatRateData> getMockFiatToFiatRateDataList();
    
    public abstract boolean needUpdateMockData();
    
    public abstract void updateMockDataTag();
}