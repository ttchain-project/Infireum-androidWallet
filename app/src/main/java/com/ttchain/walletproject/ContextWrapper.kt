package com.ttchain.walletproject

import android.content.Context
import android.os.Build
import android.os.LocaleList

import java.util.Locale

class ContextWrapper(base: Context) : android.content.ContextWrapper(base) {
    companion object {

        fun wrap(context: Context, newLocale: Locale): Context {
            var myContext = context

            val res = myContext.resources
            val configuration = res.configuration

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                val localeList = LocaleList(newLocale)
                LocaleList.setDefault(localeList)
                configuration.setLocales(localeList)
                myContext = myContext.createConfigurationContext(configuration)
            } else {
                configuration.locale = newLocale
                res.updateConfiguration(configuration, res.displayMetrics)
            }

            return myContext
        }
    }
}
