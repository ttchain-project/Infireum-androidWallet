package com.ttchain.walletproject.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/ttchain/walletproject/utils/RuleUtils;", "", "()V", "Companion", "app_proPlayDebug"})
public final class RuleUtils {
    private static final int ZERO_STRING_LENGTH = 0;
    private static final int MIN_STRING_LENGTH = 1;
    private static final int NORMAL_STRING_LENGTH = 30;
    private static final int BIG_STRING_LENGTH = 256;
    private static final int MIN_MNEMONIC_WORD = 12;
    private static final java.lang.String USER_NAME_EXPRESSION = "\\w{1,30}$";
    private static final java.util.regex.Pattern USER_NAME_PATTERN = null;
    private static final java.lang.String PASSWORD_EXPRESSION = "[a-zA-Z0-9]{8,20}$";
    private static final java.util.regex.Pattern PASSWORD_PATTERN = null;
    private static final java.lang.String MNEMONIC_EXPRESSION = "[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}";
    private static final java.util.regex.Pattern MNEMONIC_PATTERN = null;
    private static final java.lang.String LOWER_CASE_WORD_EXPRESSION = "[a-z]+";
    private static final java.util.regex.Pattern LOWER_CASE_WORD_EXPRESSION_PATTERN = null;
    private static final java.lang.String ETH_ADDRESS_EXPRESSION = "0x[a-fA-F0-9]{40}";
    private static final java.util.regex.Pattern ETH_ADDRESS_PATTERN = null;
    private static final java.lang.String BTC_ADDRESS_EXPRESSION = "^[13][a-km-zA-HJ-NP-Z0-9]{26,33}$";
    private static final java.util.regex.Pattern BTC_ADDRESS_PATTERN = null;
    private static final java.lang.String CIC_ADDRESS_EXPRESSION = "cx[a-fA-F0-9]{40}";
    private static final java.util.regex.Pattern CIC_ADDRESS_PATTERN = null;
    private static final java.lang.String GUC_ADDRESS_EXPRESSION = "gx[a-fA-F0-9]{40}";
    private static final java.util.regex.Pattern GUC_ADDRESS_PATTERN = null;
    private static final java.lang.String UUID_EXPRESSION = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$";
    private static final java.util.regex.Pattern UUID_PATTERN = null;
    private static final java.lang.String URL_IMAGE_EXPRESSION = "(http(s?):)(.)*\\.(jpg|jpeg|png)";
    private static final java.util.regex.Pattern URL_IMAGE_PATTERN = null;
    private static final java.lang.String URL_FILE_EXPRESSION = "(http(s?):)(.)*\\.[a-zA-Z]{2,4}";
    private static final java.util.regex.Pattern URL_FILE_PATTERN = null;
    private static final java.lang.String URL_AUDIO_EXPRESSION = "(http(s?):)(.)*\\.(3gp|3gpp)";
    private static final java.util.regex.Pattern URL_AUDIO_PATTERN = null;
    private static final java.lang.String URL_EXPRESSION = "(https?:\\/\\/)?(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)";
    private static final java.util.regex.Pattern URL_PATTERN = null;
    private static final java.lang.String NON_PREFIX_ADDRESS_EXPRESSION = "[a-fA-F0-9]{40}";
    private static final java.util.regex.Pattern NON_PREFIX_ADDRESS_PATTERN = null;
    private static final java.lang.String TTN_TXID_EXPRESSION = "[a-f0-9]{64}";
    private static final java.util.regex.Pattern TTN_TXID_PATTERN = null;
    private static final java.lang.String BTC_PRIVATE_KEY_EXPRESS = "^[5KL][a-km-zA-HJ-NP-Z0-9]{50,51}$";
    private static final java.util.regex.Pattern BTC_PRIVATE_KEY_PATTERN = null;
    private static final java.lang.String ETH_PRIVATE_KEY_EXPRESS = "[a-f0-9]{64}";
    private static final java.util.regex.Pattern ETH_PRIVATE_KEY_PATTERN = null;
    public static final com.ttchain.walletproject.utils.RuleUtils.Companion Companion = null;
    
    public RuleUtils() {
        super();
    }
    
    public static final boolean isValidUserNameLength(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public static final boolean isValidWalletNameLength(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public static final boolean isValidNoteLength(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    public static final boolean isValidCommentLength(@org.jetbrains.annotations.NotNull()
    java.lang.String comment) {
        return false;
    }
    
    public static final boolean isValidPwd(@org.jetbrains.annotations.NotNull()
    java.lang.String pwd) {
        return false;
    }
    
    public static final boolean isValidMnemonic(@org.jetbrains.annotations.NotNull()
    java.lang.String mnemonic) {
        return false;
    }
    
    public static final boolean isValidStringLength(@org.jetbrains.annotations.NotNull()
    java.lang.String string, int min, int max) {
        return false;
    }
    
    public static final boolean isLowerCaseWord(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    public static final boolean isMainCoinType(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.MainCoinType type) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.ttchain.walletproject.enums.MainCoinType getMainCoinType(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public static final boolean isChainType(int chainType, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.ChainType type) {
        return false;
    }
    
    public static final boolean isChainType(@org.jetbrains.annotations.NotNull()
    java.lang.String address, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.enums.ChainType type) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.ttchain.walletproject.enums.ChainType getChainType(int chainType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.ttchain.walletproject.enums.ChainType getChainType(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getMainCoinId(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDefaultWalletName(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String addressToWalletType(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDefaultWalletTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return null;
    }
    
    public static final boolean isUUIDType(@org.jetbrains.annotations.NotNull()
    java.lang.String uuid) {
        return false;
    }
    
    public static final boolean hasSpaceInStartOrEndOfString(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    public static final boolean hasSpaceInString(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    public static final boolean isUrlImage(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    public static final boolean isUrlFile(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    public static final boolean isUrlAudio(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    public static final boolean isUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    public static final boolean isTtnTxId(@org.jetbrains.annotations.NotNull()
    java.lang.String txId) {
        return false;
    }
    
    public static final boolean isBtcPrivateKey(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    public static final boolean isEthPrivateKey(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0007J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0004H\u0007J\u0010\u00100\u001a\u0002012\u0006\u0010/\u001a\u00020\u0006H\u0007J\u0010\u00103\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0007J\u0010\u00104\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0007J\u0010\u00105\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0007J\u0010\u00106\u001a\u0002072\u0006\u0010/\u001a\u00020\u0006H\u0007J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0007J\u0010\u0010;\u001a\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0007J\u0010\u0010<\u001a\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0007J\u0018\u0010=\u001a\u0002092\u0006\u00102\u001a\u00020\u00042\u0006\u0010>\u001a\u000201H\u0007J\u0018\u0010=\u001a\u0002092\u0006\u0010/\u001a\u00020\u00062\u0006\u0010>\u001a\u000201H\u0007J\u0010\u0010?\u001a\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0007J\u0010\u0010@\u001a\u0002092\u0006\u0010:\u001a\u00020\u0006H\u0007J\u0018\u0010A\u001a\u0002092\u0006\u0010/\u001a\u00020\u00062\u0006\u0010>\u001a\u000207H\u0007J\u0010\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020\u0006H\u0007J\u0010\u0010D\u001a\u0002092\u0006\u0010E\u001a\u00020\u0006H\u0007J\u0010\u0010F\u001a\u0002092\u0006\u0010G\u001a\u00020\u0006H\u0007J\u0010\u0010H\u001a\u0002092\u0006\u0010G\u001a\u00020\u0006H\u0007J\u0010\u0010I\u001a\u0002092\u0006\u0010G\u001a\u00020\u0006H\u0007J\u0010\u0010J\u001a\u0002092\u0006\u0010G\u001a\u00020\u0006H\u0007J\u0010\u0010K\u001a\u0002092\u0006\u0010L\u001a\u00020\u0006H\u0007J\u0010\u0010M\u001a\u0002092\u0006\u0010N\u001a\u00020\u0006H\u0007J\u0010\u0010O\u001a\u0002092\u0006\u0010P\u001a\u00020\u0006H\u0007J\u0018\u0010Q\u001a\u0002092\u0006\u0010R\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0010\u0010S\u001a\u0002092\u0006\u0010T\u001a\u00020\u0006H\u0007J \u0010U\u001a\u0002092\u0006\u0010:\u001a\u00020\u00062\u0006\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u0004H\u0007J\u0010\u0010X\u001a\u0002092\u0006\u0010P\u001a\u00020\u0006H\u0007J\u0010\u0010Y\u001a\u0002092\u0006\u0010P\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\'\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006Z"}, d2 = {"Lcom/ttchain/walletproject/utils/RuleUtils$Companion;", "", "()V", "BIG_STRING_LENGTH", "", "BTC_ADDRESS_EXPRESSION", "", "BTC_ADDRESS_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "BTC_PRIVATE_KEY_EXPRESS", "BTC_PRIVATE_KEY_PATTERN", "CIC_ADDRESS_EXPRESSION", "CIC_ADDRESS_PATTERN", "ETH_ADDRESS_EXPRESSION", "ETH_ADDRESS_PATTERN", "ETH_PRIVATE_KEY_EXPRESS", "ETH_PRIVATE_KEY_PATTERN", "GUC_ADDRESS_EXPRESSION", "GUC_ADDRESS_PATTERN", "LOWER_CASE_WORD_EXPRESSION", "LOWER_CASE_WORD_EXPRESSION_PATTERN", "MIN_MNEMONIC_WORD", "MIN_STRING_LENGTH", "MNEMONIC_EXPRESSION", "MNEMONIC_PATTERN", "NON_PREFIX_ADDRESS_EXPRESSION", "NON_PREFIX_ADDRESS_PATTERN", "NORMAL_STRING_LENGTH", "PASSWORD_EXPRESSION", "PASSWORD_PATTERN", "TTN_TXID_EXPRESSION", "TTN_TXID_PATTERN", "URL_AUDIO_EXPRESSION", "URL_AUDIO_PATTERN", "URL_EXPRESSION", "URL_FILE_EXPRESSION", "URL_FILE_PATTERN", "URL_IMAGE_EXPRESSION", "URL_IMAGE_PATTERN", "URL_PATTERN", "USER_NAME_EXPRESSION", "USER_NAME_PATTERN", "UUID_EXPRESSION", "UUID_PATTERN", "ZERO_STRING_LENGTH", "addressToWalletType", "address", "getChainType", "Lcom/ttchain/walletproject/enums/ChainType;", "chainType", "getDefaultWalletName", "getDefaultWalletTitle", "getMainCoinId", "getMainCoinType", "Lcom/ttchain/walletproject/enums/MainCoinType;", "hasSpaceInStartOrEndOfString", "", "string", "hasSpaceInString", "isBtcPrivateKey", "isChainType", "type", "isEthPrivateKey", "isLowerCaseWord", "isMainCoinType", "isTtnTxId", "txId", "isUUIDType", "uuid", "isUrl", "url", "isUrlAudio", "isUrlFile", "isUrlImage", "isValidCommentLength", "comment", "isValidMnemonic", "mnemonic", "isValidNoteLength", "name", "isValidPattern", "pattern", "isValidPwd", "pwd", "isValidStringLength", "min", "max", "isValidUserNameLength", "isValidWalletNameLength", "app_proPlayDebug"})
    public static final class Companion {
        
        public final boolean isValidUserNameLength(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return false;
        }
        
        public final boolean isValidWalletNameLength(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return false;
        }
        
        public final boolean isValidNoteLength(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            return false;
        }
        
        public final boolean isValidCommentLength(@org.jetbrains.annotations.NotNull()
        java.lang.String comment) {
            return false;
        }
        
        public final boolean isValidPwd(@org.jetbrains.annotations.NotNull()
        java.lang.String pwd) {
            return false;
        }
        
        public final boolean isValidMnemonic(@org.jetbrains.annotations.NotNull()
        java.lang.String mnemonic) {
            return false;
        }
        
        public final boolean isValidStringLength(@org.jetbrains.annotations.NotNull()
        java.lang.String string, int min, int max) {
            return false;
        }
        
        public final boolean isLowerCaseWord(@org.jetbrains.annotations.NotNull()
        java.lang.String string) {
            return false;
        }
        
        public final boolean isMainCoinType(@org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.enums.MainCoinType type) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.enums.MainCoinType getMainCoinType(@org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            return null;
        }
        
        public final boolean isChainType(int chainType, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.enums.ChainType type) {
            return false;
        }
        
        public final boolean isChainType(@org.jetbrains.annotations.NotNull()
        java.lang.String address, @org.jetbrains.annotations.NotNull()
        com.ttchain.walletproject.enums.ChainType type) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.enums.ChainType getChainType(int chainType) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.ttchain.walletproject.enums.ChainType getChainType(@org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMainCoinId(@org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDefaultWalletName(@org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String addressToWalletType(@org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDefaultWalletTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String address) {
            return null;
        }
        
        public final boolean isUUIDType(@org.jetbrains.annotations.NotNull()
        java.lang.String uuid) {
            return false;
        }
        
        public final boolean hasSpaceInStartOrEndOfString(@org.jetbrains.annotations.NotNull()
        java.lang.String string) {
            return false;
        }
        
        public final boolean hasSpaceInString(@org.jetbrains.annotations.NotNull()
        java.lang.String string) {
            return false;
        }
        
        public final boolean isUrlImage(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return false;
        }
        
        public final boolean isUrlFile(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return false;
        }
        
        public final boolean isUrlAudio(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return false;
        }
        
        public final boolean isUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return false;
        }
        
        public final boolean isTtnTxId(@org.jetbrains.annotations.NotNull()
        java.lang.String txId) {
            return false;
        }
        
        public final boolean isBtcPrivateKey(@org.jetbrains.annotations.NotNull()
        java.lang.String string) {
            return false;
        }
        
        public final boolean isEthPrivateKey(@org.jetbrains.annotations.NotNull()
        java.lang.String string) {
            return false;
        }
        
        private final boolean isValidPattern(java.util.regex.Pattern pattern, java.lang.String string) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}