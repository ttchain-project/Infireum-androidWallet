package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b,\u0018\u00002\u00020\u0001:\u0002?@B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\"\u0010\n\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\"\u0010\f\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\"\u0010\u000e\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\"\u0010\u0010\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\"\u0010\u0012\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\"\u0010\u0014\u001a\u000e\u0012\b\u0012\u00060\u0015R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\"\u0010\u0017\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\"\u0010\u0019\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\"\u0010\u001b\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\"\u0010\u001d\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\"\u0010\u001f\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\"\u0010!\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\"\u0010#\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\"\u0010%\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007R\"\u0010\'\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007R\"\u0010)\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0007R\"\u0010+\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0007R\"\u0010-\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0007R\"\u0010/\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0007R\"\u00101\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0007R\"\u00103\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0007R\"\u00105\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R*\u00107\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010:R\"\u0010;\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0007R\"\u0010=\u001a\u000e\u0012\b\u0012\u00060\u0005R\u00020\u0000\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0007\u00a8\u0006A"}, d2 = {"Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel;", "Ljava/io/Serializable;", "()V", "banner", "", "Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel$News;", "getBanner", "()Ljava/util/List;", "banner2", "getBanner2", "blocknews", "getBlocknews", "classicA", "getClassicA", "classicB", "getClassicB", "classicC", "getClassicC", "classicD", "getClassicD", "coinmarket", "Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel$Trend;", "getCoinmarket", "dapp", "getDapp", "discovery", "getDiscovery", "explanation", "getExplanation", "explorer", "getExplorer", "finnews", "getFinnews", "gameA", "getGameA", "gameB", "getGameB", "gameC", "getGameC", "gameD", "getGameD", "group", "getGroup", "marketmsg", "getMarketmsg", "markettool", "getMarkettool", "news", "getNews", "settinga", "getSettinga", "settingb", "getSettingb", "settingc", "getSettingc", "settingd", "getSettingd", "setSettingd", "(Ljava/util/List;)V", "shop", "getShop", "ttcabout", "getTtcabout", "News", "Trend", "app_proPlayDebug"})
public final class ExplorerNewsResponseModel implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "banner")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> banner = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "banner2")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> banner2 = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "blocknews")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> blocknews = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "news")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> news = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gamea")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> gameA = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gameb")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> gameB = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gamec")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> gameC = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "gamed")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> gameD = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "classica")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> classicA = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "classicb")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> classicB = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "classicc")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> classicC = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "classicd")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> classicD = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "shop")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> shop = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "coinmarket")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.Trend> coinmarket = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "discovery")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> discovery = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "finnews")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> finnews = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "explorer")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> explorer = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "group")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> group = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "explanation")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> explanation = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "marketmsg")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> marketmsg = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "dapp")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> dapp = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "markettool")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> markettool = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ttcabout")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> ttcabout = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "setting_a")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> settinga = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "setting_b")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> settingb = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "setting_c")
    private final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> settingc = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "setting_d")
    private java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> settingd;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getBanner() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getBanner2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getBlocknews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getNews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getGameA() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getGameB() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getGameC() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getGameD() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getClassicA() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getClassicB() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getClassicC() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getClassicD() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getShop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.Trend> getCoinmarket() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getDiscovery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getFinnews() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getExplorer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getExplanation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getMarketmsg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getDapp() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getMarkettool() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getTtcabout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getSettinga() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getSettingb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getSettingc() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> getSettingd() {
        return null;
    }
    
    public final void setSettingd(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ttchain.walletproject.model.ExplorerNewsResponseModel.News> p0) {
    }
    
    public ExplorerNewsResponseModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b\u00a8\u0006\u0012"}, d2 = {"Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel$News;", "Ljava/io/Serializable;", "(Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel;)V", "content", "", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "img", "getImg", "setImg", "title", "getTitle", "setTitle", "url", "getUrl", "setUrl", "app_proPlayDebug"})
    public final class News implements java.io.Serializable {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "title")
        private java.lang.String title;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "content")
        private java.lang.String content;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "url")
        private java.lang.String url;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "img")
        private java.lang.String img;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getContent() {
            return null;
        }
        
        public final void setContent(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final void setUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImg() {
            return null;
        }
        
        public final void setImg(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public News() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel$Trend;", "Ljava/io/Serializable;", "(Lcom/ttchain/walletproject/model/ExplorerNewsResponseModel;)V", "change", "", "getChange", "()Ljava/lang/String;", "img", "getImg", "price", "getPrice", "title", "getTitle", "url", "getUrl", "app_proPlayDebug"})
    public final class Trend implements java.io.Serializable {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "title")
        private final java.lang.String title = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "price")
        private final java.lang.String price = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "change")
        private final java.lang.String change = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "url")
        private final java.lang.String url = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "img")
        private final java.lang.String img = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getChange() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getImg() {
            return null;
        }
        
        public Trend() {
            super();
        }
    }
}