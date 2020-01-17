package com.ttchain.walletproject

import android.content.Context
import androidx.multidex.MultiDexApplication
import com.ttchain.walletproject.cache.Preferences
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.koin.appModule
import com.ttchain.walletproject.model.DecimalData
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import java.lang.ref.WeakReference

class App : MultiDexApplication() {

    companion object {

        val context: Context by lazy {
            app.applicationContext
        }

        // 虛擬貨幣的指定法幣行情列表
        var rateList = listOf<DecimalData>()

        // default amount
        const val DEFAULT_AMOUNT = "0.00"

        var isMainNet = true
        // 預設礦工費
        var ttnFee = "0.1"
        var usdtnFee = "5"
        var btcnFee = "0.00020546"
        var ethnFee = "0.005"
        var ttnFeeText = "$ttnFee ${CoinEnum.TTN.coinName}"
        var usdtnFeeText = "$usdtnFee ${CoinEnum.USDTN.coinName}"
        var btcnFeeText = "$btcnFee ${CoinEnum.BTCN.coinName}"
        var ethnFeeText = "$ethnFee ${CoinEnum.ETHN.coinName}"

        // 公司relay地址
        var btcRelayAddress = "16RmMmRGYoCugQAdfBRYoDPCU8CEpeUfqc"
        var ethRelayAddress = "0x3aa9e7dca3ab1ef343010c05dd4c323c0b0441e2"
        var ttnRelayAddress = "e658e4a47103b4578fd2ba6aa52af1b9fc67c129"
        // ttn鏈tx瀏覽器
        const val TTN_TX_RESULT_URL = "http://3.112.106.186/tables_txresult.html?tx="

        lateinit var INSTANCE: WeakReference<App>

        lateinit var preferenceHelper: Preferences

        const val FAST_CLICK_DELAY_TIME = 500
        var clickLastClickTime = 0L

        lateinit var app: App

    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = WeakReference(this)
        app = this
        preferenceHelper =
            Preferences(applicationContext.getSharedPreferences("setting", MODE_PRIVATE))

        // koin
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(appModule)
        }
    }
}