package com.ttchain.walletproject.ui.coin_record

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class CoinRecordActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_coin_record


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        title = ""
        changeFragment(
            R.id.content_view,
            CoinRecordFragment.newInstance(
                intent.getStringExtra(_ID),
                intent.getIntExtra(WALLET_ID, 0)
            )
        )
    }

    companion object {
        const val _ID = "_ID"
        const val WALLET_ID = "WALLET_ID"

        fun launch(activity: Activity, coinId: String, walletId: Int) {
            activity.startActivity(Intent(activity, CoinRecordActivity::class.java).apply {
                putExtra(_ID, coinId)
                putExtra(WALLET_ID, walletId)
            })
        }

        fun launch(activity: Activity, coinId: String) {
            activity.startActivity(Intent(activity, CoinRecordActivity::class.java).apply {
                putExtra(_ID, coinId)
            })
        }
    }
}
