package com.ttchain.walletproject.ui.me.commonaddress

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class CommonAddressActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_common_address

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(
            R.id.content_view,
            CommonAddressFragment.newInstance(intent.getBooleanExtra(_ID, false))
        )
    }

    companion object {

        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, CommonAddressActivity::class.java))
        }

        val _ID = "_ID"

        fun launch(activity: Activity, isPicker: Boolean) {
            activity.startActivity(Intent(activity, CommonAddressActivity::class.java).apply {
                putExtra(_ID, isPicker)
            })
        }
    }
}
