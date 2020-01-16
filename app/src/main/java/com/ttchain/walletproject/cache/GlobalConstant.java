package com.ttchain.walletproject.cache;


import androidx.annotation.IntDef;
import androidx.annotation.StringDef;


import com.ttchain.walletproject.enums.ChainType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class GlobalConstant {
    public static final int NORMAL_SPAN_COUNT = 1;
    public static final int PRODUCT_SPAN_COUNT_NORMAL = 2;
    public static final int MAIN_CATEGORY_SPAN_SIZE = 3;
    public static final int SUB_CATEGORY_SPAN_SIZE = 4;
    public static final int PWD_MAX_LENGTH = 20;

    public final static int GAP_TIME_SHORT = 250;
    public final static int GAP_TIME_NORMAL = 500;
    public final static int GAP_TIME_LONG = 1000;

    public final static int THROTTLE_FIRST_BUTTON_CLICK = 500;

    public static final int WALLET_TYPE_ALL = 9;
    public static final int WALLET_TYPE_BTC = 0;
    public static final int WALLET_TYPE_ETH = 1;
    public static final int WALLET_TYPE_CIC = 2;
    public static final int WALLET_TYPE_GUC = 3;

    public static final int TRANSACTION_STATE_ERROR = -1;
    public static final int TRANSACTION_STATE_ALL = 9;
    public static final int TRANSACTION_STATE_THUNDER = 8;
    public static final int TRANSACTION_STATE_OUTCOME = 0;
    public static final int TRANSACTION_STATE_INCOME = 1;
    public static final int TRANSACTION_STATE_FAIL = 2;
    public static final int TRANSACTION_STATE_UN_CONFIRM = 3;

    public static final String DEFAULT_WALLET_TITLE_ETH = "ETH";
    public static final String DEFAULT_WALLET_TITLE_BTC = "BTC";
    public static final String DEFAULT_WALLET_TITLE_CIC = "CIC";
    public static final String DEFAULT_WALLET_TITLE_GUC = "GUC";

    public static final String DEFAULT_WALLET_NAME_ETH = "ETH Wallet";
    public static final String DEFAULT_WALLET_NAME_BTC = "BTC Wallet";
    public static final String DEFAULT_WALLET_NAME_CIC = "CIC Wallet";
    public static final String DEFAULT_WALLET_NAME_GUC = "GUC Wallet";
    public static final String DEFAULT_WALLET_NAME_TTN = "IFRC Wallet";

    public static final String DEFAULT_USD_FIAT_NAME = "USD";


    @IntDef({WALLET_TYPE_ALL, WALLET_TYPE_ETH, WALLET_TYPE_BTC, WALLET_TYPE_CIC, WALLET_TYPE_GUC})
    @Retention(RetentionPolicy.SOURCE)
    public @interface WalletType {
    }

    @IntDef({TRANSACTION_STATE_ALL, TRANSACTION_STATE_OUTCOME, TRANSACTION_STATE_INCOME, TRANSACTION_STATE_FAIL})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionType {
    }

    public static final String BALANCE_TOKEN_ETH = "ETH";
    public static final String BALANCE_TOKEN_BTC = "BTC";
    public static final String BALANCE_TOKEN_CIC = "CIC";
    public static final String BALANCE_TOKEN_GUC = "GUC";
    public static final String BALANCE_TOKEN_TTN = "TTN";

    @StringDef({BALANCE_TOKEN_ETH, BALANCE_TOKEN_BTC, BALANCE_TOKEN_CIC, BALANCE_TOKEN_GUC})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ApiBalanceToken {
    }

    public static final int DEFAULT_WALLET_CHAIN_TYPE = ChainType.ETH.getValue();
    public static final String DEFAULT_WALLET_NAME = "ETH";

    /**
     * For sharing image that screenshot
     */
    public final static String TMP_SCREENSHOT_IMAGE_NAME = "tmp_screenshot.jpg";

    /**
     * for annotations
     */

    public static final int NORMAL_REQUEST = 9001;
    public static final int LOAD_MORE_REQUEST = 9002;
    public static final int REFRESH_REQUEST = 9003;

    @IntDef({NORMAL_REQUEST, LOAD_MORE_REQUEST, REFRESH_REQUEST})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RequestStatus {
    }

    public static final int RECORD_RECHARGE = 0x901;
    public static final int RECORD_YEN = 0x902;
    public static final int RECORD_POINT = 0x903;

    @IntDef({RECORD_RECHARGE, RECORD_YEN, RECORD_POINT})
    @Retention(RetentionPolicy.SOURCE)
    public @interface RecordType {
    }

    public static final int FAB_SHOW = 0x101;
    public static final int FAB_HIDE = 0x102;
    public static final int FAB_RESHOW = 0x103;

    @IntDef({FAB_SHOW, FAB_HIDE, FAB_RESHOW})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FabStatus {
    }


    /**
     * for api
     **/

    public static String NATION_ID = "EC";
    public static final String DEVICE_TYPE = "MOBILE";

    //auth login
    public enum GRAND_TYPE {
        PASSWORD("password"),
        REFRESH_TOKEN("refresh_token");

        private String stringValue;

        private GRAND_TYPE(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public String toString() {
            return stringValue;
        }
    }

    public enum FORGET_PWD_TYPE {
        MOBILE("mobile"),
        EMAIL("email");

        private String stringValue;

        private FORGET_PWD_TYPE(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public String toString() {
            return stringValue;
        }
    }


    /**
     * for app
     **/
    public static final int AD_CYCLING_SECOND = 5;

    public static final int MOBILE_COUNT_SEC = 120;

    public static final int PAGE_LIMIT_NORMAL = 20;
    public static final int PAGE_LIMIT_LARGE = 300;

    //loadmore
    public static final int INIT_REQUEST_STATUS = 111;
    public static final int LOAD_MORE_STATUS = 112;
    public static final int REFRESH_REQUEST_STATUS = 113;

    /**
     * CATEGORY(0):商品目錄
     * FEATURE_CATEGORY(1):獨家推薦
     * POPULAR(2):熱門商品
     */
    public enum HOME_LIST_TYPE {
        CATEGORY(0),
        FEATURE_CATEGORY(1),
        POPULAR(2);

        private int intValue;

        HOME_LIST_TYPE(int intValue) {
            this.intValue = intValue;
        }

        public Integer getValue() {
            return intValue;
        }
    }

    public enum PRODUCT_CONTENT_TYPE {
        NORMAL(0),
        DETAIL(1);

        private int intValue;

        PRODUCT_CONTENT_TYPE(int intValue) {
            this.intValue = intValue;
        }

        public Integer getValue() {
            return intValue;
        }
    }

    public enum BANNER_TYPE {
        BANNER("banner"),
        SLIDER("slider");

        private String stringValue;

        private BANNER_TYPE(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public String toString() {
            return stringValue;
        }

        public String getValue() {
            return stringValue;
        }
    }

    public enum WEBVIEW_TYPE {
        HTML("html"),
        URL("url"),
        DOC("doc");

        private String stringValue;

        private WEBVIEW_TYPE(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public String toString() {
            return stringValue;
        }

        public String getValue() {
            return stringValue;
        }
    }

    public enum SUBMENU_TYPE {
        MEMBER_CENTER("member center"),
        ABOUT_US("about us"),
        MEMBER_SERVICE("member service");

        private String stringValue;

        private SUBMENU_TYPE(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public String toString() {
            return stringValue;
        }

        public String getValue() {
            return stringValue;
        }
    }

    public enum ADDRESS_TYPE {
        ADD("add"),
        UPDATE("update");

        private String stringValue;

        private ADDRESS_TYPE(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public String toString() {
            return stringValue;
        }

        public String getValue() {
            return stringValue;
        }
    }

    /**
     * 1.批發商(有GP，PEC+GP= VIP的價格)
     * 2.零售商(Gamll不會有)
     * 3.VIP(不會有GP)
     */
    public enum MEMBER_LEVEL_TYPE {
        PEFA("1"),
        RETAIL("2"),
        VIP("3");

        private String stringValue;

        private MEMBER_LEVEL_TYPE(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public String toString() {
            return stringValue;
        }

        public String getValue() {
            return stringValue;
        }
    }

    public enum MEMBER_TYPE {
        VIP("vip"),
        RETAILER("retailer"),
        PEFA("pefa");

        private String stringValue;

        private MEMBER_TYPE(String stringValue) {
            this.stringValue = stringValue;
        }

        @Override
        public String toString() {
            return stringValue;
        }

        public String getValue() {
            return stringValue;
        }
    }

    /**
     * TypeID
     * 1:第三方充值PEC
     * 2:CRM充值PEC
     * 3:CRM充值PSUN(GP)
     * 4:全部
     **/
    public enum RECORD_RECHARGE_TYPE {
        THIRD(1),
        CRM_PEC(2),
        CRM_POINT(3),
        ALL(4);

        private int value;

        RECORD_RECHARGE_TYPE(int value) {
            this.value = value;
        }

        public Integer getValue() {
            return value;
        }
    }

    public class RedEnvelope {
        public final static String SORT_TIME = "time";
        public final static String SORT_AMOUNT = "amount";
        public final static String SORT_CHAIN_NAME = "chain-name";

        public final static int RECEIVE_WAIT = 1;
        public final static int RECEIVE_GET_COMPLETE = 2;

        public final static int SEND_WAIT_GET = 1;
        public final static int SEND_WAIT_RECEIVE = 2;
        public final static int SEND_GET_COMPLETE = 3;

        public final static String SENDER = "sender";
        public final static String RECEIVE = "receive";
        public final static String USER = "user";
    }

    public class ShoppingCartPriceType {
        public final static int USER_REMAIN = 1;
        public final static int ORDER_TOTAL = 2;
        public final static int SHIPPING_FEE = 3;

        public final static int PAY_PRICE = 4;
        public final static int PAY_REMAIN = 5;
    }

    public class OrderStatusType {
        public final static int PADDING_PAY = 11;
        public final static int PADDING_CONFIRM = 12;

        public final static int NO_SHIPPING = 21;
        public final static int SHIPPING = 22;

        public final static int TRADE_DONE = 31;

        public final static int CANCEL = 41;

        public final static int DESTROY = 51;
    }

    public class HomeSortType {
        public final static String CATEGORY = "category";
        public final static String FEATURE_CATEGORY = "featureCategory";
        public final static String POPULAR = "popular";
    }
}
