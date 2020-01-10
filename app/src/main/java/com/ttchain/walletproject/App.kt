package com.ttchain.walletproject

import androidx.multidex.MultiDexApplication
import com.ttchain.walletproject.cache.Preferences
import com.ttchain.walletproject.koin.appModule
import com.ttchain.walletproject.model.DecimalData
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import java.lang.ref.WeakReference

val preferenceHelper: Preferences by lazy {
    App.preferenceHelper
}

class App :MultiDexApplication() {

    companion object {

        // 虛擬貨幣的指定法幣行情列表
        var rateList = listOf<DecimalData>()

        // default amount
        const val DEFAULT_AMOUNT = "0.00"

        var isMainNet = true


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