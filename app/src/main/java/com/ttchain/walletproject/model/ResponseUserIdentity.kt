package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName

import java.io.Serializable

class ResponseUserIdentity : Serializable {

    /**
     * version : 0.01
     * mnemonic : target wire town latin pool leader service sleep cube warfare brave remember
     * HDkey : xprv9s21ZrQH143K3ZK9G2jVjCDaJZnnbsWDmyxNbt9NTzaDpw3p5BjXW2muvhZmn9qQK4VrGAPPSzpwpXQ9AM4JWiaMncEi91354WRY7X8HK9A
     * litecoin : {"privateKey":"T9obYYEFyZnD4YzDu2YuSSchZt3yfB5EMgVVhwWdKUJQramQaSRd","address":"LY4dBLJSJQeGLeiB7M5n9ywFeftPmFWchQ"}
     * bitcoin : {"privateKey":"L3yL6nw5aBocHiMMMPc3E65Kd2Qfb64LYUbEr8t5kW8FLh9hRqCD","address":"1Dqfv7zcDkQD5r21wD6UsxsVSTX7cgtrKF"}
     * ethereum : {"privateKey":"c976b9a6bb7035501446daf338abcf3e85fc2510909697e12b39980d49959bfc","address":"0x0e9e42a145fa2b63ab032e790801f113f301689c"}
     * cic : {"privateKey":"c976b9a6bb7035501446daf338abcf3e85fc2510909697e12b39980d49959bfc","address":"cx6082ec828f37dfc31557941fea0148b9b6570369"}
     */
    @SerializedName("version")
    var version: String? = null
    @SerializedName("mnemonic")
    var mnemonic: String? = null
    @SerializedName("HDkey")
    var HDkey: String? = null
    @SerializedName("litecoin")
    val litecoin: ApiWalletData? = null
    @SerializedName("bitcoin")
    var bitcoin: ApiWalletData? = null
    @SerializedName("ethereum")
    var ethereum: ApiWalletData? = null
    @SerializedName("cic")
    val cic: ApiWalletData? = null
    @SerializedName("guc")
    val guc: ApiWalletData? = null
    @SerializedName("noprefix")
    var noprefix: ApiWalletData? = null
}
