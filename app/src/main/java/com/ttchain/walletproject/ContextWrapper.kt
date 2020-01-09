package com.ttchain.walletproject

import android.content.Context
import android.os.Build
import android.os.LocaleList

import java.util.Locale

class ContextWrapper(base: Context) : android.content.ContextWrapper(base) {
    companion object {

        fun wrap(context: Context, newLocale: Locale): Context {

            val res = context.resources
            val configuration = res.configuration
            Locale.setDefault(newLocale)

            return when {
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.N -> {
                    configuration.setLocale(newLocale)
                    configuration.locales = LocaleList(newLocale)
                    context.createConfigurationContext(configuration)
                }
                else -> {
                    configuration.setLocale(newLocale)
                    res.updateConfiguration(configuration, res.displayMetrics)
                    context
                }
            }
        }
    }
}
