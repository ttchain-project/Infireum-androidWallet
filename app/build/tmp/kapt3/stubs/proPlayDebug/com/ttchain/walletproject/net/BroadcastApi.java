package com.ttchain.walletproject.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\nH\'J$\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\tH\'J$\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0010H\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0012H\'J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0015H\'JZ\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00192\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\tH\'\u00a8\u0006\u001f"}, d2 = {"Lcom/ttchain/walletproject/net/BroadcastApi;", "", "broadcastAddCustomComments", "Lio/reactivex/Observable;", "Lcom/ttchain/walletproject/model/ApiResult;", "", "model", "Lcom/ttchain/walletproject/model/CustomCommentsData;", "broadcastBlockExplorer", "", "Lcom/ttchain/walletproject/model/BlockExplorerRequest;", "broadcastGetBtcTransaction", "", "Lcom/ttchain/walletproject/model/ResponseBTCTransactionData;", "address", "broadcastGetCustomComments", "Lcom/ttchain/walletproject/model/TransactionData;", "broadcastMainnetInfuraAsync", "Lcom/ttchain/walletproject/model/MainnetInfuraRequest;", "broadcastSignBTCOrSignBTCRelayAsync", "Lcom/ttchain/walletproject/model/ResponseSignBTCData;", "Lcom/ttchain/walletproject/model/SignBTCBodyData;", "broadcastSignETHOrSignETHContractAsync", "Lcom/ttchain/walletproject/model/ResponseSignETHData;", "body", "Lcom/ttchain/walletproject/model/SignETHBodyRequest;", "nonce", "gasLimit", "to", "value", "gasPrice", "app_proPlayDebug"})
public abstract interface BroadcastApi {
    
    /**
     * ETH廣播
     * result:txID
     * @param model 請求內容 (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "MainnetInfura")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.lang.String>> broadcastMainnetInfuraAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.MainnetInfuraRequest model);
    
    /**
     * BTC廣播
     * result:txID
     * @param model 請求內容 (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "BlockExplorer")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.lang.String>> broadcastBlockExplorer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.BlockExplorerRequest model);
    
    /**
     * SignETHOrSignETHContract
     *
     * @param body SignETHBodyModel (required)
     * @param nonce Nonce (optional)
     * @param gasLimit 計算礦工費用 (optional)
     * @param to 轉帳給 (optional)
     * @param value 金額 (optional)
     * @param gasPrice 計算礦工費用 (optional)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "SignETHContract")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<com.ttchain.walletproject.model.ResponseSignETHData>> broadcastSignETHOrSignETHContractAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.SignETHBodyRequest body, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "nonce")
    java.lang.String nonce, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "gasLimit")
    java.lang.String gasLimit, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "to")
    java.lang.String to, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "value")
    java.lang.String value, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "gasPrice")
    java.lang.String gasPrice);
    
    /**
     * 取得BTC Unspent
     *
     * @param address 地址 (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "BtcTransaction/{address}")
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.ResponseBTCTransactionData>>> broadcastGetBtcTransaction(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "address")
    java.lang.String address);
    
    /**
     * SignBTCOrSignBTCRelay
     *
     * @param model SignBTCBodyModel (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "SignBTCRelay")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<com.ttchain.walletproject.model.ResponseSignBTCData>> broadcastSignBTCOrSignBTCRelayAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.SignBTCBodyData model);
    
    /**
     * 取得客戶備註
     *
     * @param model 交易編號 (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "CustomComments")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.util.List<com.ttchain.walletproject.model.CustomCommentsData>>> broadcastGetCustomComments(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.TransactionData model);
    
    /**
     * 新增用戶備註
     *
     * @param model CustomCommentsModel (required)
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "CustomComment")
    @retrofit2.http.Headers(value = {"Content-Type:application/json"})
    public abstract io.reactivex.Observable<com.ttchain.walletproject.model.ApiResult<java.lang.Boolean>> broadcastAddCustomComments(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.ttchain.walletproject.model.CustomCommentsData model);
}