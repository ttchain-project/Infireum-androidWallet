package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/*****
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

class UserWalletQrCodeImageBean(
    @SerializedName("hint")
    val hint: String,
    @SerializedName("timestamp")
    val timestamp: Long,
    @SerializedName("content")
    val content: Content
) : Serializable {

    class Content(
        @SerializedName("system")
        val system: System,
        @SerializedName("imported")
        var imported: List<WalletContent>
    ) : Serializable

    class System(
        @SerializedName("mnemonic")
        var mnemonic: String = "",
        @SerializedName("wallets")
        var wallets: List<WalletContent>
    ) : Serializable

    class WalletContent(
        @SerializedName("mainCoinID")
        val mainCoinID: String = "",
        @SerializedName("name")
        val name: String = "",
        @SerializedName("privateKey")
        var privateKey: String = "",
        @SerializedName("address")
        var address: String = ""
    ) : Serializable {
        @SerializedName("isExist")
        var isExist = false
    }
}
