package com.ttchain.walletproject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/ttchain/walletproject/App;", "Landroidx/multidex/MultiDexApplication;", "()V", "onCreate", "", "Companion", "app_proPlayDebug"})
public final class App extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.Lazy context$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<com.ttchain.walletproject.model.DecimalData> rateList;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEFAULT_AMOUNT = "0.00";
    private static boolean isMainNet;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ttnFee;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String usdtnFee;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String btcnFee;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ethnFee;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ttnFeeText;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String usdtnFeeText;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String btcnFeeText;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ethnFeeText;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String btcRelayAddress;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ethRelayAddress;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ttnRelayAddress;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TTN_TX_RESULT_URL = "http://3.112.106.186/tables_txresult.html?tx=";
    @org.jetbrains.annotations.NotNull()
    public static java.lang.ref.WeakReference<com.ttchain.walletproject.App> INSTANCE;
    public static final int FAST_CLICK_DELAY_TIME = 500;
    private static long clickLastClickTime;
    @org.jetbrains.annotations.NotNull()
    public static com.ttchain.walletproject.App app;
    public static final com.ttchain.walletproject.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public App() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\'\u0010(R\u001a\u0010+\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R\u001a\u0010.\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\u001a\u00101\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00106\"\u0004\b7\u00108R \u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0016\"\u0004\bB\u0010\u0018R\u001a\u0010C\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0016\"\u0004\bE\u0010\u0018R\u001a\u0010F\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0016\"\u0004\bH\u0010\u0018R\u001a\u0010I\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0016\"\u0004\bK\u0010\u0018R\u001a\u0010L\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0016\"\u0004\bN\u0010\u0018\u00a8\u0006O"}, d2 = {"Lcom/ttchain/walletproject/App$Companion;", "", "()V", "DEFAULT_AMOUNT", "", "FAST_CLICK_DELAY_TIME", "", "INSTANCE", "Ljava/lang/ref/WeakReference;", "Lcom/ttchain/walletproject/App;", "getINSTANCE", "()Ljava/lang/ref/WeakReference;", "setINSTANCE", "(Ljava/lang/ref/WeakReference;)V", "TTN_TX_RESULT_URL", "app", "getApp", "()Lcom/ttchain/walletproject/App;", "setApp", "(Lcom/ttchain/walletproject/App;)V", "btcRelayAddress", "getBtcRelayAddress", "()Ljava/lang/String;", "setBtcRelayAddress", "(Ljava/lang/String;)V", "btcnFee", "getBtcnFee", "setBtcnFee", "btcnFeeText", "getBtcnFeeText", "setBtcnFeeText", "clickLastClickTime", "", "getClickLastClickTime", "()J", "setClickLastClickTime", "(J)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context$delegate", "Lkotlin/Lazy;", "ethRelayAddress", "getEthRelayAddress", "setEthRelayAddress", "ethnFee", "getEthnFee", "setEthnFee", "ethnFeeText", "getEthnFeeText", "setEthnFeeText", "isMainNet", "", "()Z", "setMainNet", "(Z)V", "rateList", "", "Lcom/ttchain/walletproject/model/DecimalData;", "getRateList", "()Ljava/util/List;", "setRateList", "(Ljava/util/List;)V", "ttnFee", "getTtnFee", "setTtnFee", "ttnFeeText", "getTtnFeeText", "setTtnFeeText", "ttnRelayAddress", "getTtnRelayAddress", "setTtnRelayAddress", "usdtnFee", "getUsdtnFee", "setUsdtnFee", "usdtnFeeText", "getUsdtnFeeText", "setUsdtnFeeText", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ttchain.walletproject.model.DecimalData> getRateList() {
            return null;
        }
        
        public final void setRateList(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.DecimalData> p0) {
        }
        
        public final boolean isMainNet() {
            return false;
        }
        
        public final void setMainNet(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTtnFee() {
            return null;
        }
        
        public final void setTtnFee(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUsdtnFee() {
            return null;
        }
        
        public final void setUsdtnFee(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBtcnFee() {
            return null;
        }
        
        public final void setBtcnFee(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEthnFee() {
            return null;
        }
        
        public final void setEthnFee(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTtnFeeText() {
            return null;
        }
        
        public final void setTtnFeeText(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUsdtnFeeText() {
            return null;
        }
        
        public final void setUsdtnFeeText(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBtcnFeeText() {
            return null;
        }
        
        public final void setBtcnFeeText(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEthnFeeText() {
            return null;
        }
        
        public final void setEthnFeeText(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBtcRelayAddress() {
            return null;
        }
        
        public final void setBtcRelayAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEthRelayAddress() {
            return null;
        }
        
        public final void setEthRelayAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTtnRelayAddress() {
            return null;
        }
        
        public final void setTtnRelayAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.ref.WeakReference<com.ttchain.walletproject.App> getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.NotNull()
        java.lang.ref.WeakReference<com.ttchain.walletproject.App> p0) {
        }
        
        public final long getClickLastClickTime() {
            return 0L;
        }
        
        public final void setClickLastClickTime(long p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.App getApp() {
            return null;
        }
        
        public final void setApp(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.App p0) {
        }
        
        private Companion() {
            super();
        }
    }
}