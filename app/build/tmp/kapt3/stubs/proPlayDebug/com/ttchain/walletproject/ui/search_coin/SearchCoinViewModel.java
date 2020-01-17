package com.ttchain.walletproject.ui.search_coin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0011H\u0002J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/ttchain/walletproject/ui/search_coin/SearchCoinViewModel;", "Lcom/ttchain/walletproject/base/BaseRecyclerViewViewModel;", "Lcom/ttchain/walletproject/model/CoinEntity;", "context", "Landroid/content/Context;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "coinRepository", "Lcom/ttchain/walletproject/repository/CoinRepository;", "balanceRepository", "Lcom/ttchain/walletproject/repository/BalanceRepository;", "helperRepository", "Lcom/ttchain/walletproject/repository/HelperRepository;", "balanceApiRepository", "Lcom/ttchain/walletproject/repository/BalanceApiRepository;", "(Landroid/content/Context;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/CoinRepository;Lcom/ttchain/walletproject/repository/BalanceRepository;Lcom/ttchain/walletproject/repository/HelperRepository;Lcom/ttchain/walletproject/repository/BalanceApiRepository;)V", "queryWord", "", "onClickCoinAction", "", "coinId", "isAdded", "", "onMenuSearchSubmit", "query", "performApiSearchCoinByWordRequest", "word", "performGetCoinDataListByWord", "performUpdateBalanceByCoinApiRequest", "address", "performUpdateCoinAssetRequest", "app_proPlayDebug"})
public final class SearchCoinViewModel extends com.ttchain.walletproject.base.BaseRecyclerViewViewModel<com.ttchain.walletproject.model.CoinEntity> {
    private java.lang.String queryWord;
    private final android.content.Context context = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.CoinRepository coinRepository = null;
    private final com.ttchain.walletproject.repository.BalanceRepository balanceRepository = null;
    private final com.ttchain.walletproject.repository.HelperRepository helperRepository = null;
    private final com.ttchain.walletproject.repository.BalanceApiRepository balanceApiRepository = null;
    
    public final void onMenuSearchSubmit(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void performApiSearchCoinByWordRequest(java.lang.String word) {
    }
    
    private final void performGetCoinDataListByWord(java.lang.String word) {
    }
    
    public final void onClickCoinAction(@org.jetbrains.annotations.NotNull()
    java.lang.String coinId, boolean isAdded) {
    }
    
    private final void performUpdateCoinAssetRequest(java.lang.String coinId) {
    }
    
    private final void performUpdateBalanceByCoinApiRequest(java.lang.String address, java.lang.String coinId) {
    }
    
    public SearchCoinViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.CoinRepository coinRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BalanceRepository balanceRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepository helperRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BalanceApiRepository balanceApiRepository) {
        super();
    }
}