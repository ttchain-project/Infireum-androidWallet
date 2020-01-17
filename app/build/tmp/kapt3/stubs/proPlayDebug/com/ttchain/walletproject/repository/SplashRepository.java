package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u0006\u0010\u000e\u001a\u00020\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0012\u001a\u00020\u0013J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\nJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\nJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u0014\u0010\u001e\u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010 \u001a\u00020\u000f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\nJ\u0014\u0010!\u001a\u00020\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\nJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/ttchain/walletproject/repository/SplashRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "mockHelper", "Lcom/ttchain/walletproject/helper/MockHelper;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/helper/MockHelper;)V", "createDefaultCoinDataList", "", "Lcom/ttchain/walletproject/database/data/CoinData;", "createDefaultFiatDataList", "Lcom/ttchain/walletproject/database/data/FiatData;", "createTransMockData", "", "getCoinDataList", "getCoinDataListByMainCoinId", "mainCoinId", "", "getCoinSelectionDataList", "Lcom/ttchain/walletproject/database/data/CoinSelectionData;", "getDefaultWalletDataList", "Lcom/ttchain/walletproject/database/data/WalletData;", "getWalletDataList", "hasUserIdentity", "", "isCoinDataEmpty", "isFiatDataEmpty", "isLanguageDataEmpty", "updateDefaultCoinDataList", "list", "updateDefaultFiatDataList", "updateFiatDataList", "apiDataList", "Lcom/ttchain/walletproject/model/ApiFiatData;", "updateWalletData", "", "walletData", "Companion", "app_proPlayDebug"})
public final class SplashRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.model.UserHelper userHelper = null;
    private final com.ttchain.walletproject.helper.MockHelper mockHelper = null;
    private static final double MIN_AMOUNT_UNIT = 1.0E-6;
    public static final com.ttchain.walletproject.repository.SplashRepository.Companion Companion = null;
    
    public final boolean isCoinDataEmpty() {
        return false;
    }
    
    public final boolean isFiatDataEmpty() {
        return false;
    }
    
    public final boolean isLanguageDataEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.CoinData> createDefaultCoinDataList() {
        return null;
    }
    
    public final void updateDefaultCoinDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.CoinData> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.FiatData> createDefaultFiatDataList() {
        return null;
    }
    
    public final void updateDefaultFiatDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.FiatData> list) {
    }
    
    public final boolean hasUserIdentity() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.WalletData> getWalletDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.WalletData> getDefaultWalletDataList() {
        return null;
    }
    
    public final int updateWalletData(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.WalletData walletData) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.CoinSelectionData> getCoinSelectionDataList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.database.data.CoinData> getCoinDataListByMainCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String mainCoinId) {
        return null;
    }
    
    public final void createTransMockData() {
    }
    
    public final void updateFiatDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ApiFiatData> apiDataList) {
    }
    
    public SplashRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.helper.MockHelper mockHelper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/ttchain/walletproject/repository/SplashRepository$Companion;", "", "()V", "MIN_AMOUNT_UNIT", "", "randomInt", "", "getRandomInt", "()I", "app_proPlayDebug"})
    public static final class Companion {
        
        private final int getRandomInt() {
            return 0;
        }
        
        private Companion() {
            super();
        }
    }
}