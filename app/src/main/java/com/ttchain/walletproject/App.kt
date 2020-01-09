package com.ttchain.walletproject

import androidx.multidex.MultiDexApplication
import java.lang.ref.WeakReference

class App :MultiDexApplication() {

    companion object {
        lateinit var INSTANCE: WeakReference<App>

        const val FAST_CLICK_DELAY_TIME = 500
        var clickLastClickTime = 0L
    }

    override fun onCreate() {
        super.onCreate()
        INSTANCE = WeakReference(this)
    }
}