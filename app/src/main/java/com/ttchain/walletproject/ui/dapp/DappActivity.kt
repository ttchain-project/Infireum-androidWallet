package com.ttchain.walletproject.ui.dapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class DappActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_dapp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, DappFragment.newInstance())
    }

    companion object {

        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, DappActivity::class.java))
        }
    }
}
