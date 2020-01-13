package com.ttchain.walletproject.ui.receiptasset

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class ReceiptAssetActivity : BaseActivity() {

    companion object {
        val _ID = "_ID"

        fun launch(activity: Activity, coinID: Int?) {
            activity.startActivity(Intent(activity, ReceiptAssetActivity::class.java).apply {
                putExtra(_ID, coinID)
            })
        }
    }

    override val layoutId: Int
        get() = R.layout.activity_receipt_asset

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(
            R.id.content_view,
            ReceiptAssetFragment.newInstance(intent.getIntExtra(_ID, -1))
        )
    }

}
