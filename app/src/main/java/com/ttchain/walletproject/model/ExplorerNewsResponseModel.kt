package com.ttchain.walletproject.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ExplorerNewsResponseModel : Serializable {

    @SerializedName("banner")
    val banner: List<News>? = null
    @SerializedName("banner2")
    val banner2: List<News>? = null
    @SerializedName("blocknews")
    val blocknews: List<News>? = null
    @SerializedName("news")
    val news: List<News>? = null

    @SerializedName("gamea")
    val gameA: List<News>? = null
    @SerializedName("gameb")
    val gameB: List<News>? = null
    @SerializedName("gamec")
    val gameC: List<News>? = null
    @SerializedName("gamed")
    val gameD: List<News>? = null

    @SerializedName("classica")
    val classicA: List<News>? = null
    @SerializedName("classicb")
    val classicB: List<News>? = null
    @SerializedName("classicc")
    val classicC: List<News>? = null
    @SerializedName("classicd")
    val classicD: List<News>? = null

    @SerializedName("shop")
    val shop: List<News>? = null
    @SerializedName("coinmarket")
    val coinmarket: List<Trend>? = null

    @SerializedName("discovery")
    val discovery: List<News>? = null
    @SerializedName("finnews")
    val finnews: List<News>? = null
    @SerializedName("explorer")
    val explorer: List<News>? = null
    @SerializedName("group")
    val group: List<News>? = null

    //helper
    @SerializedName("explanation")
    val explanation: List<News>? = null
    @SerializedName("marketmsg")
    val marketmsg: List<News>? = null
    @SerializedName("dapp")
    val dapp: List<News>? = null
    @SerializedName("markettool")
    val markettool: List<News>? = null
    @SerializedName("ttcabout")
    val ttcabout: List<News>? = null

    //setting
    @SerializedName("setting_a")
    val settinga: List<News>? = null
    @SerializedName("setting_b")
    val settingb: List<News>? = null
    @SerializedName("setting_c")
    val settingc: List<News>? = null
    @SerializedName("setting_d")
    var settingd: List<News>? = null

    inner class News : Serializable {

        @SerializedName("title")
        var title: String? = null
        @SerializedName("content")
        var content: String? = null
        @SerializedName("url")
        var url: String? = null
        @SerializedName("img")
        var img: String? = null
    }

    inner class Trend : Serializable {

        @SerializedName("title")
        val title: String? = null
        @SerializedName("price")
        val price: String? = null
        @SerializedName("change")
        val change: String? = null
        @SerializedName("url")
        val url: String? = null
        @SerializedName("img")
        val img: String? = null
    }
}
