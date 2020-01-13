package com.ttchain.walletproject.ui.ttn.ttnreceipt

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import kotlinx.android.synthetic.main.view_toolbar.*

class TtnReceiptAssetActivity : BaseActivity() {

    override val layoutId = R.layout.activity_ttn_receipt_asset

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(R.string.receipt)
        toolbar?.setBackgroundColor(ContextCompat.getColor(this, R.color._2C3C4E))
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, TtnReceiptAssetFragment.newInstance())
    }

    companion object {

        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, TtnReceiptAssetActivity::class.java))
        }
    }
}
