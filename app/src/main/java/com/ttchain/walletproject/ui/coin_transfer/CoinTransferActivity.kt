package com.ttchain.walletproject.ui.coin_transfer

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class CoinTransferActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_coin_transfer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        title = ""
        changeFragment(
            R.id.content_view,
            CoinTransferFragment.newInstance(
                intent.getStringExtra(_ID) ?: "",
                intent.getStringExtra(_ADDRESS) ?: "",
                intent.getStringExtra(_AMOUNT) ?: ""
            )
        )
    }

    companion object {
        const val _ID = "_ID"
        const val _ADDRESS = "_ADDRESS"
        const val _AMOUNT = "_AMOUNT"

        fun launch(activity: Activity, coinId: String, address: String) {
            activity.startActivity(Intent(activity, CoinTransferActivity::class.java).apply {
                putExtra(_ID, coinId)
                putExtra(_ADDRESS, address)
                putExtra(_AMOUNT, "")
            })
        }

        fun launch(activity: Activity, coinId: String, address: String, amount: String) {
            activity.startActivity(Intent(activity, CoinTransferActivity::class.java).apply {
                putExtra(_ID, coinId)
                putExtra(_ADDRESS, address)
                putExtra(_AMOUNT, amount)
            })
        }
    }
}
