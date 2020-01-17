package com.ttchain.walletproject.ui.wallet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0006\u0010\u0016\u001a\u00020\u0014J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J\u0006\u0010\u001b\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/ttchain/walletproject/ui/wallet/WalletMainViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "balanceApiRepository", "Lcom/ttchain/walletproject/repository/BalanceApiRepository;", "balanceRepository", "Lcom/ttchain/walletproject/repository/BalanceRepository;", "(Lcom/ttchain/walletproject/model/DbHelper;Lcom/ttchain/walletproject/repository/BalanceApiRepository;Lcom/ttchain/walletproject/repository/BalanceRepository;)V", "hasQueriedTotal", "", "mainChinWalletDataList", "", "Lcom/ttchain/walletproject/database/data/WalletData;", "getMainChinWalletDataList", "()Ljava/util/List;", "queryApiTotal", "getQueryApiTotal", "()I", "addHasQueriedTotal", "", "clearHasQueriedTotal", "initSubject", "performUpdateBalanceByCoinApiRequest", "address", "", "coinId", "updateAssetDataByApi", "app_proPlayDebug"})
public final class WalletMainViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    private int hasQueriedTotal;
    private final com.ttchain.walletproject.model.DbHelper dbHelper = null;
    private final com.ttchain.walletproject.repository.BalanceApiRepository balanceApiRepository = null;
    private final com.ttchain.walletproject.repository.BalanceRepository balanceRepository = null;
    
    private final java.util.List<com.ttchain.walletproject.database.data.WalletData> getMainChinWalletDataList() {
        return null;
    }
    
    private final int getQueryApiTotal() {
        return 0;
    }
    
    private final void addHasQueriedTotal() {
    }
    
    private final void clearHasQueriedTotal() {
    }
    
    public final void updateAssetDataByApi() {
    }
    
    private final void performUpdateBalanceByCoinApiRequest(java.lang.String address, java.lang.String coinId) {
    }
    
    public final void initSubject() {
    }
    
    public WalletMainViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BalanceApiRepository balanceApiRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BalanceRepository balanceRepository) {
        super();
    }
}