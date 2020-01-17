package com.ttchain.walletproject.ui.discovery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\u0006\u0010)\u001a\u00020*R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000e\"\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010\u00a8\u0006+"}, d2 = {"Lcom/ttchain/walletproject/ui/discovery/DiscoveryViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "helperRepositoryCo", "Lcom/ttchain/walletproject/repository/HelperRepositoryCo;", "coinRepository", "Lcom/ttchain/walletproject/repository/CoinRepository;", "infoRepositoryCo", "Lcom/ttchain/walletproject/repository/InfoRepositoryCo;", "(Lcom/ttchain/walletproject/repository/HelperRepositoryCo;Lcom/ttchain/walletproject/repository/CoinRepository;Lcom/ttchain/walletproject/repository/InfoRepositoryCo;)V", "bannerResult", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ttchain/walletproject/model/ExplorerBean;", "getBannerResult", "()Landroidx/lifecycle/MutableLiveData;", "setBannerResult", "(Landroidx/lifecycle/MutableLiveData;)V", "blockChainExplorerResult", "Lcom/ttchain/walletproject/model/ExplorerDappBean;", "getBlockChainExplorerResult", "setBlockChainExplorerResult", "dappResult", "getDappResult", "setDappResult", "marketMsgResult", "getMarketMsgResult", "setMarketMsgResult", "mediaResult", "getMediaResult", "setMediaResult", "newsResult", "", "getNewsResult", "setNewsResult", "quotesResult", "Lcom/ttchain/walletproject/model/ExplorerListEntity;", "getQuotesResult", "setQuotesResult", "getNews", "", "getQuotes", "getUserPrefFiatName", "", "app_proPlayDebug"})
public final class DiscoveryViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerListEntity>> quotesResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> newsResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerBean>> bannerResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> mediaResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> dappResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> blockChainExplorerResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> marketMsgResult;
    private final com.ttchain.walletproject.repository.HelperRepositoryCo helperRepositoryCo = null;
    private final com.ttchain.walletproject.repository.CoinRepository coinRepository = null;
    private final com.ttchain.walletproject.repository.InfoRepositoryCo infoRepositoryCo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerListEntity>> getQuotesResult() {
        return null;
    }
    
    public final void setQuotesResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerListEntity>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNewsResult() {
        return null;
    }
    
    public final void setNewsResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerBean>> getBannerResult() {
        return null;
    }
    
    public final void setBannerResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerBean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> getMediaResult() {
        return null;
    }
    
    public final void setMediaResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> getDappResult() {
        return null;
    }
    
    public final void setDappResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> getBlockChainExplorerResult() {
        return null;
    }
    
    public final void setBlockChainExplorerResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> getMarketMsgResult() {
        return null;
    }
    
    public final void setMarketMsgResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.ttchain.walletproject.model.ExplorerDappBean>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserPrefFiatName() {
        return null;
    }
    
    public final void getQuotes() {
    }
    
    public final void getNews() {
    }
    
    public DiscoveryViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.HelperRepositoryCo helperRepositoryCo, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.CoinRepository coinRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.InfoRepositoryCo infoRepositoryCo) {
        super();
    }
}