package com.ttchain.walletproject.ui.me.currency

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class CurrencyActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_currency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.setting_currency)
        changeFragment(R.id.content_view, CurrencyFragment.newInstance())
    }

    companion object {
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, CurrencyActivity::class.java))
        }
    }
}
