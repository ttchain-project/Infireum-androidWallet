package com.ttchain.walletproject.model;

import java.lang.System;

/**
 * ***
 * {
 * "hint": "My hint",
 * "timestamp": 12343285729348580,
 * "content": {
 * "system": {
 * "mnemonic": "scene slot labor raven bind sun render glimpse life cabin resemble fee",
 * "wallets": [
 * {
 * "mainCoinID": "Identifier_BTC",
 * "name": "BTC Wallet 1",
 * "privateKey": "L3ccM6DzJ2HREQz85QzC6xugM7HNT8oVEbRE4hKe6WVLXU8Vtbuq",
 * "address": "1DSXH1zyn9WYWW1mCMMjLzmE1E1WLyfhuF"
 * },
 * {
 * "mainCoinID": "Identifier_CIC",
 * "name": "CIC Wallet 1",
 * "privateKey": "becdff3568b6b7870c0882c4bb67272ace972f1c678fb07c112e9eb5f8f6d09c",
 * "address": "cxa69d56209d67b4eeb631c7b7a9a13b5b3b4fdbff"
 * }
 * ]
 * },
 * "imported": [
 * {
 * "mainCoinID": "Identifier_BTC",
 * "name": "BTC Wallet 1",
 * "privateKey": "L3ccM6DzJ2HREQz85QzC6xugM7HNT8oVEbRE4hKe6WVLXU8Vtbuq",
 * "address": "1DSXH1zyn9WYWW1mCMMjLzmE1E1WLyfhuF"
 * }
 * ]
 * }
 * }
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean;", "Ljava/io/Serializable;", "hint", "", "timestamp", "", "content", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$Content;", "(Ljava/lang/String;JLcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$Content;)V", "getContent", "()Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$Content;", "getHint", "()Ljava/lang/String;", "getTimestamp", "()J", "Content", "System", "WalletContent", "app_proPlayDebug"})
public final class UserWalletQrCodeImageBean implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hint")
    private final java.lang.String hint = null;
    @com.google.gson.annotations.SerializedName(value = "timestamp")
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "content")
    private final com.ttchain.walletproject.model.UserWalletQrCodeImageBean.Content content = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHint() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.UserWalletQrCodeImageBean.Content getContent() {
        return null;
    }
    
    public UserWalletQrCodeImageBean(@org.jetbrains.annotations.NotNull()
    java.lang.String hint, long timestamp, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserWalletQrCodeImageBean.Content content) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$Content;", "Ljava/io/Serializable;", "system", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$System;", "imported", "", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$WalletContent;", "(Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$System;Ljava/util/List;)V", "getImported", "()Ljava/util/List;", "setImported", "(Ljava/util/List;)V", "getSystem", "()Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$System;", "app_proPlayDebug"})
    public static final class Content implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "system")
        private final com.ttchain.walletproject.model.UserWalletQrCodeImageBean.System system = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "imported")
        private java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> imported;
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.model.UserWalletQrCodeImageBean.System getSystem() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> getImported() {
            return null;
        }
        
        public final void setImported(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> p0) {
        }
        
        public Content(@org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.model.UserWalletQrCodeImageBean.System system, @org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> imported) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$System;", "Ljava/io/Serializable;", "mnemonic", "", "wallets", "", "Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$WalletContent;", "(Ljava/lang/String;Ljava/util/List;)V", "getMnemonic", "()Ljava/lang/String;", "setMnemonic", "(Ljava/lang/String;)V", "getWallets", "()Ljava/util/List;", "setWallets", "(Ljava/util/List;)V", "app_proPlayDebug"})
    public static final class System implements java.io.Serializable {
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "mnemonic")
        private java.lang.String mnemonic;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "wallets")
        private java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> wallets;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMnemonic() {
            return null;
        }
        
        public final void setMnemonic(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> getWallets() {
            return null;
        }
        
        public final void setWallets(@org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> p0) {
        }
        
        public System(@org.jetbrains.annotations.NotNull()
        java.lang.String mnemonic, @org.jetbrains.annotations.NotNull()
        java.util.List<com.ttchain.walletproject.model.UserWalletQrCodeImageBean.WalletContent> wallets) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\tR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/ttchain/walletproject/model/UserWalletQrCodeImageBean$WalletContent;", "Ljava/io/Serializable;", "mainCoinID", "", "name", "privateKey", "address", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "isExist", "", "()Z", "setExist", "(Z)V", "getMainCoinID", "getName", "getPrivateKey", "setPrivateKey", "app_proPlayDebug"})
    public static final class WalletContent implements java.io.Serializable {
        @com.google.gson.annotations.SerializedName(value = "isExist")
        private boolean isExist;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "mainCoinID")
        private final java.lang.String mainCoinID = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "name")
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "privateKey")
        private java.lang.String privateKey;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "address")
        private java.lang.String address;
        
        public final boolean isExist() {
            return false;
        }
        
        public final void setExist(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMainCoinID() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPrivateKey() {
            return null;
        }
        
        public final void setPrivateKey(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAddress() {
            return null;
        }
        
        public final void setAddress(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public WalletContent(@org.jetbrains.annotations.NotNull()
        java.lang.String mainCoinID, @org.jetbrains.annotations.NotNull()
        java.lang.String name, @org.jetbrains.annotations.NotNull()
        java.lang.String privateKey, @org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            super();
        }
        
        public WalletContent() {
            super();
        }
    }
}