package com.ttchain.walletproject.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 ~2\u00020\u0001:\u0002~\u007fB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u0012\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0^0]J\u0012\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0^0]J\u0016\u0010a\u001a\u0004\u0018\u00010_2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020_0^J\u0016\u0010c\u001a\u0004\u0018\u00010_2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020_0^J\u0016\u0010d\u001a\u0004\u0018\u00010_2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020_0^J\u0014\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100fH\u0002J\u001c\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100f2\u0006\u0010g\u001a\u00020\u0015H\u0002J\u0014\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100fH\u0002J\u001c\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100f2\u0006\u0010g\u001a\u00020\u0015H\u0002J\u0010\u0010i\u001a\u00020\"2\u0006\u0010j\u001a\u00020_H\u0002J\"\u0010k\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0^0]2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020_0^H\u0007J\"\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0^0]2\f\u0010l\u001a\b\u0012\u0004\u0012\u00020n0^H\u0007J\u0006\u0010o\u001a\u00020pJ\u001a\u0010q\u001a\u00020p2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100fJ\u001a\u0010s\u001a\u00020p2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100fJ\u001a\u0010t\u001a\u00020p2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100fJ\u0006\u0010u\u001a\u00020pJ\u0006\u0010v\u001a\u00020pJ\u0006\u0010w\u001a\u00020pJ\u0006\u0010x\u001a\u00020pJ\u0006\u0010y\u001a\u00020pJ\u0014\u0010z\u001a\u00020p2\f\u0010b\u001a\b\u0012\u0004\u0012\u0002040^J\u001c\u0010{\u001a\u00020p2\u0006\u0010|\u001a\u00020\"2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020:0^J\u0014\u0010}\u001a\u00020p2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020A0^R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0012\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u001cX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010,\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R\u001a\u0010/\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010 R\"\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u00109\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\"\u0010=\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u00106\"\u0004\b?\u00108R\"\u0010@\u001a\n\u0012\u0004\u0012\u00020A\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u00106\"\u0004\bC\u00108R\u001a\u0010D\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0012\"\u0004\bF\u0010)R \u0010G\u001a\b\u0012\u0004\u0012\u00020\"0HX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u001e\"\u0004\bO\u0010 R\u001a\u0010P\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0012\"\u0004\bR\u0010)R\u001a\u0010S\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\u0012\"\u0004\bU\u0010)R\u001a\u0010V\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0012\"\u0004\bX\u0010)R\u001a\u0010Y\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u0012\"\u0004\b[\u0010)\u00a8\u0006\u0080\u0001"}, d2 = {"Lcom/ttchain/walletproject/base/BaseCoinRecordViewModel;", "Lcom/ttchain/walletproject/base/BaseViewModel;", "etherscanApiRepository", "Lcom/ttchain/walletproject/repository/EtherscanApiRepository;", "baseMainModel", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "broadcastRepository", "Lcom/ttchain/walletproject/repository/BroadcastRepository;", "omniExplorerRepository", "Lcom/ttchain/walletproject/repository/OmniExplorerRepository;", "blockExplorerRepository", "Lcom/ttchain/walletproject/repository/BlockExplorerRepository;", "baseCoinRecordRepository", "Lcom/ttchain/walletproject/repository/BaseCoinRecordRepository;", "(Lcom/ttchain/walletproject/repository/EtherscanApiRepository;Lcom/ttchain/walletproject/repository/BaseMainModel;Lcom/ttchain/walletproject/repository/BroadcastRepository;Lcom/ttchain/walletproject/repository/OmniExplorerRepository;Lcom/ttchain/walletproject/repository/BlockExplorerRepository;Lcom/ttchain/walletproject/repository/BaseCoinRecordRepository;)V", "endBlock", "", "getEndBlock", "()Ljava/lang/String;", "erc20RecordRequestSubject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/ttchain/walletproject/base/BaseCoinRecordViewModel$QueryMapBean;", "kotlin.jvm.PlatformType", "getErc20RecordRequestSubject", "()Lio/reactivex/subjects/BehaviorSubject;", "ethRecordRequestSubject", "getEthRecordRequestSubject", "index", "", "getIndex", "()I", "setIndex", "(I)V", "isEthRecord", "", "()Z", "setEthRecord", "(Z)V", "latestTimeStamp", "getLatestTimeStamp", "setLatestTimeStamp", "(Ljava/lang/String;)V", "offset", "getOffset", "pageNow", "getPageNow", "setPageNow", "pageNowToken", "getPageNowToken", "setPageNowToken", "resultBtcResponseBeanList", "Ljava/util/ArrayList;", "Lcom/ttchain/walletproject/model/ApiBlockChainBtcTransactionListResponse$ItemsBean;", "getResultBtcResponseBeanList", "()Ljava/util/ArrayList;", "setResultBtcResponseBeanList", "(Ljava/util/ArrayList;)V", "resultErrorTransactionDataList", "Lcom/ttchain/walletproject/model/TransactionDataEth;", "getResultErrorTransactionDataList", "setResultErrorTransactionDataList", "resultTransactionDataList", "getResultTransactionDataList", "setResultTransactionDataList", "resultUsdtResponseBeanList", "Lcom/ttchain/walletproject/model/ApiUsdtTransactionRecordResponse$ItemsBean;", "getResultUsdtResponseBeanList", "setResultUsdtResponseBeanList", "startBlock", "getStartBlock", "setStartBlock", "syncTransRecordDataListFinish", "Landroidx/lifecycle/MutableLiveData;", "getSyncTransRecordDataListFinish", "()Landroidx/lifecycle/MutableLiveData;", "setSyncTransRecordDataListFinish", "(Landroidx/lifecycle/MutableLiveData;)V", "usdtPage", "getUsdtPage", "setUsdtPage", "userBtcAddress", "getUserBtcAddress", "setUserBtcAddress", "userErc20ContractAddress", "getUserErc20ContractAddress", "setUserErc20ContractAddress", "userEthAddress", "getUserEthAddress", "setUserEthAddress", "userTransCoinId", "getUserTransCoinId", "setUserTransCoinId", "getFilterErcRecordDataObservable", "Lio/reactivex/Observable;", "", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "getFilterEthRecordDataObservable", "getLatestBtcRecordData", "list", "getLatestErc20RecordData", "getLatestEthRecordData", "getQueryMap", "", "queryMapBean", "getTokenQueryMap", "isErc20RecordData", "data", "mergeTransRecordCommentsListObservable", "recordList", "mergeUsdtTransRecordCommentsListObservable", "Lcom/ttchain/walletproject/database/data/UsdtTransRecordData;", "performGetApiBtcTransactionRecordDataList", "", "performGetApiErc20ErrorTransactionRecordDataList", "queryMap", "performGetApiErc20TransactionRecordDataList", "performGetApiEthTransactionRecordDataList", "performGetApiUsdtTransactionRecordDataList", "performGetBtcTransactionRecordDataList", "performGetErc20TransactionRecordDataList", "performGetEthTransactionRecordDataList", "performGetUsdtTransactionRecordDataList", "performSyncBtcTransRecordDataList", "performSyncTransRecordDataList", "isErc20Error", "performSyncUsdtTransRecordDataList", "Companion", "QueryMapBean", "app_proPlayDebug"})
public class BaseCoinRecordViewModel extends com.ttchain.walletproject.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> syncTransRecordDataListFinish;
    private boolean isEthRecord;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userEthAddress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userErc20ContractAddress;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userTransCoinId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String startBlock;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String endBlock = "99999999";
    private int pageNow;
    private int pageNowToken;
    private final int offset = 25;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String latestTimeStamp;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> resultTransactionDataList;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> resultErrorTransactionDataList;
    private int index;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String userBtcAddress;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean> resultBtcResponseBeanList;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<com.ttchain.walletproject.base.BaseCoinRecordViewModel.QueryMapBean> ethRecordRequestSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.subjects.BehaviorSubject<com.ttchain.walletproject.base.BaseCoinRecordViewModel.QueryMapBean> erc20RecordRequestSubject = null;
    private int usdtPage;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse.ItemsBean> resultUsdtResponseBeanList;
    private final com.ttchain.walletproject.repository.EtherscanApiRepository etherscanApiRepository = null;
    private final com.ttchain.walletproject.repository.BaseMainModel baseMainModel = null;
    private final com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository = null;
    private final com.ttchain.walletproject.repository.OmniExplorerRepository omniExplorerRepository = null;
    private final com.ttchain.walletproject.repository.BlockExplorerRepository blockExplorerRepository = null;
    private final com.ttchain.walletproject.repository.BaseCoinRecordRepository baseCoinRecordRepository = null;
    public static final com.ttchain.walletproject.base.BaseCoinRecordViewModel.Companion Companion = null;
    
    private final boolean isErc20RecordData(com.ttchain.walletproject.database.data.TransRecordData data) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSyncTransRecordDataListFinish() {
        return null;
    }
    
    public final void setSyncTransRecordDataListFinish(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final boolean isEthRecord() {
        return false;
    }
    
    public final void setEthRecord(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserEthAddress() {
        return null;
    }
    
    public final void setUserEthAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserErc20ContractAddress() {
        return null;
    }
    
    public final void setUserErc20ContractAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserTransCoinId() {
        return null;
    }
    
    public final void setUserTransCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartBlock() {
        return null;
    }
    
    public final void setStartBlock(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndBlock() {
        return null;
    }
    
    public final int getPageNow() {
        return 0;
    }
    
    public final void setPageNow(int p0) {
    }
    
    public final int getPageNowToken() {
        return 0;
    }
    
    public final void setPageNowToken(int p0) {
    }
    
    public final int getOffset() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLatestTimeStamp() {
        return null;
    }
    
    public final void setLatestTimeStamp(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> getResultTransactionDataList() {
        return null;
    }
    
    public final void setResultTransactionDataList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> getResultErrorTransactionDataList() {
        return null;
    }
    
    public final void setResultErrorTransactionDataList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> p0) {
    }
    
    public final int getIndex() {
        return 0;
    }
    
    public final void setIndex(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserBtcAddress() {
        return null;
    }
    
    public final void setUserBtcAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean> getResultBtcResponseBeanList() {
        return null;
    }
    
    public final void setResultBtcResponseBeanList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<com.ttchain.walletproject.base.BaseCoinRecordViewModel.QueryMapBean> getEthRecordRequestSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.BehaviorSubject<com.ttchain.walletproject.base.BaseCoinRecordViewModel.QueryMapBean> getErc20RecordRequestSubject() {
        return null;
    }
    
    public final int getUsdtPage() {
        return 0;
    }
    
    public final void setUsdtPage(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse.ItemsBean> getResultUsdtResponseBeanList() {
        return null;
    }
    
    public final void setResultUsdtResponseBeanList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse.ItemsBean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.ttchain.walletproject.database.data.TransRecordData>> getFilterEthRecordDataObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.ttchain.walletproject.database.data.TransRecordData>> getFilterErcRecordDataObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public final io.reactivex.Observable<java.util.List<com.ttchain.walletproject.database.data.TransRecordData>> mergeTransRecordCommentsListObservable(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.TransRecordData> recordList) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> getQueryMap(com.ttchain.walletproject.base.BaseCoinRecordViewModel.QueryMapBean queryMapBean) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> getTokenQueryMap(com.ttchain.walletproject.base.BaseCoinRecordViewModel.QueryMapBean queryMapBean) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> getQueryMap() {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> getTokenQueryMap() {
        return null;
    }
    
    public final void performGetErc20TransactionRecordDataList() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.TransRecordData getLatestBtcRecordData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.TransRecordData> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.TransRecordData getLatestEthRecordData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.TransRecordData> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.database.data.TransRecordData getLatestErc20RecordData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.TransRecordData> list) {
        return null;
    }
    
    public final void performGetEthTransactionRecordDataList() {
    }
    
    public final void performGetApiEthTransactionRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> queryMap) {
    }
    
    public final void performGetBtcTransactionRecordDataList() {
    }
    
    public final void performGetApiBtcTransactionRecordDataList() {
    }
    
    public final void performSyncBtcTransRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ApiBlockChainBtcTransactionListResponse.ItemsBean> list) {
    }
    
    public final void performGetUsdtTransactionRecordDataList() {
    }
    
    public final void performGetApiUsdtTransactionRecordDataList() {
    }
    
    public final void performSyncUsdtTransRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse.ItemsBean> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"DefaultLocale"})
    public final io.reactivex.Observable<java.util.List<com.ttchain.walletproject.database.data.UsdtTransRecordData>> mergeUsdtTransRecordCommentsListObservable(@org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.database.data.UsdtTransRecordData> recordList) {
        return null;
    }
    
    public final void performGetApiErc20TransactionRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> queryMap) {
    }
    
    public final void performSyncTransRecordDataList(boolean isErc20Error, @org.jetbrains.annotations.NotNull()
    java.util.List<com.ttchain.walletproject.model.TransactionDataEth> list) {
    }
    
    public final void performGetApiErc20ErrorTransactionRecordDataList(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> queryMap) {
    }
    
    public BaseCoinRecordViewModel(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.EtherscanApiRepository etherscanApiRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseMainModel baseMainModel, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BroadcastRepository broadcastRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.OmniExplorerRepository omniExplorerRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BlockExplorerRepository blockExplorerRepository, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.repository.BaseCoinRecordRepository baseCoinRecordRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020\u00112\b\u0010*\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\tH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u0003X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\u0004R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\r\u00a8\u0006."}, d2 = {"Lcom/ttchain/walletproject/base/BaseCoinRecordViewModel$QueryMapBean;", "Ljava/io/Serializable;", "_id", "", "(I)V", "get_id", "()I", "set_id", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "endBlock", "getEndBlock", "isEth", "", "()Z", "setEth", "(Z)V", "latestTimeStamp", "getLatestTimeStamp", "setLatestTimeStamp", "offset", "getOffset", "pageNow", "getPageNow", "setPageNow", "resultTransactionDataList", "Ljava/util/ArrayList;", "Lcom/ttchain/walletproject/model/TransactionDataEth;", "getResultTransactionDataList", "()Ljava/util/ArrayList;", "setResultTransactionDataList", "(Ljava/util/ArrayList;)V", "startBlock", "getStartBlock", "setStartBlock", "component1", "copy", "equals", "other", "", "hashCode", "toString", "app_proPlayDebug"})
    public static final class QueryMapBean implements java.io.Serializable {
        private boolean isEth;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String address;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String startBlock;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String endBlock = "99999999";
        private int pageNow;
        private final int offset = 25;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String latestTimeStamp;
        @org.jetbrains.annotations.NotNull()
        private java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> resultTransactionDataList;
        private int _id;
        
        public final boolean isEth() {
            return false;
        }
        
        public final void setEth(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStartBlock() {
            return null;
        }
        
        public final void setStartBlock(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEndBlock() {
            return null;
        }
        
        public final int getPageNow() {
            return 0;
        }
        
        public final void setPageNow(int p0) {
        }
        
        public final int getOffset() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLatestTimeStamp() {
            return null;
        }
        
        public final void setLatestTimeStamp(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> getResultTransactionDataList() {
            return null;
        }
        
        public final void setResultTransactionDataList(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<com.ttchain.walletproject.model.TransactionDataEth> p0) {
        }
        
        public final int get_id() {
            return 0;
        }
        
        public final void set_id(int p0) {
        }
        
        public QueryMapBean(int _id) {
            super();
        }
        
        public QueryMapBean() {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.base.BaseCoinRecordViewModel.QueryMapBean copy(int _id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lcom/ttchain/walletproject/base/BaseCoinRecordViewModel$Companion;", "", "()V", "isBtcRecordData", "", "data", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "isEthRecordData", "app_proPlayDebug"})
    public static final class Companion {
        
        public final boolean isEthRecordData(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.database.data.TransRecordData data) {
            return false;
        }
        
        public final boolean isBtcRecordData(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.database.data.TransRecordData data) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}