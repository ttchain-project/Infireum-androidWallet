package com.ttchain.walletproject.enums

import com.ttchain.walletproject.R
import java.io.Serializable

enum class CoinEnum(
    val coinName: String,
    val coinSubName: String,
    val inputName: String,
    val coinId: String,
    val icon: Int,
    val quantity: Double
) : Serializable {
    BNB(
        "BNB", "Binance Coin", "bnb",
        "0xB8c77482e45F1F44dE1745F52C74426C631bDD52", -1, 1.0
    ),
    SNT(
        "SNT", "Status Network", "snt",
        "0x744d70fdbe2ba4cf95131626614a1763df805b9e", -1, 1.0
    ),
    MKR(
        "MKR", "Maker", "mkr",
        "0x9f8f72aa9304c8b593d555f12ef6589cc3a579a2", -1, 1.0
    ),
    BTC(
        "BTC", "", "btc",
        "Identifier_BTC", R.mipmap.wallet_coin_btc_small, 0.0001
    ),
    USDT(
        "USDT", "-omni-", "usdt",
        "Identifier_USDT", R.mipmap.coin_usdt, 1.0
    ),
    ETH(
        "ETH", "", "eth",
        "0x0000000000000000000000000000000000000000", R.mipmap.wallet_coin_eth_small, 0.0001
    ),
    TETHER_USDT(
        "USDT", "Tether USD", "tether_usd",
        "0xdac17f958d2ee523a2206206994597c13d831ec7_FIAT", R.mipmap.coin_usdt, 1.0
    ),
    DAI(
        "DAI", "", "dai",
        "0x89d24a6b4ccb1b6faa2625fe562bdd9a23260359_FIAT", R.mipmap.icon_dai, 10.0
    ),
    TUSD(
        "TUSD", "TrueUSD", "tusd",
        "0x8dd5fbce2f6a956c3022ba3663759011dd51e73e_FIAT", R.mipmap.icon_tusd, 10.0
    ),
    PAX(
        "PAX", "", "pax",
        "0x8e870d67f660d95d5be530380d0ec0bd388289e1_FIAT", -1, 10.0
    ),
    BTCN(
        "BTC-N", "", "btcn",
        "Identifier_BTCN", R.mipmap.ct_icon_btc_normal, 0.0001
    ),
    ETHN(
        "ETH-N", "", "ethn",
        "Identifier_ETHN", R.mipmap.ct_icon_eth_normal, 0.0001
    ),
    USDTN(
        "USDT-N", "-omni-", "usdtn",
        "Identifier_USDTN", R.mipmap.coin_usdt, 1.0
    ),
    TTN(
        "IFRC", "", "ifrc",
        "Identifier_IFRC", R.mipmap.wallet_ttchain_logo, 10.0
    ),
    DAI1(
        "DAI1", "", "dai1",
        "Identifier_DAI1", R.mipmap.icon_dai, 10.0
    ),
    TUSD1(
        "TUSD1", "", "tusd1",
        "Identifier_TUSD1", R.mipmap.icon_tusd, 10.0
    ),
    MCC(
        "MCC", "", "mcc",
        "Identifier_MCC", R.mipmap.coin_mcc, 10.0
    ),
    EXR(
        "EXR", "", "exr",
        "Identifier_EXR", R.mipmap.exr, 10.0
    );

    companion object {
        fun mapping(coinName: String): CoinEnum {
            return values().find {
                it.coinName == coinName
            } ?: TTN
        }

        fun mappingByCoinId(coinId: String): CoinEnum {
            return values().find {
                it.coinId == coinId
            } ?: TTN
        }
    }
}