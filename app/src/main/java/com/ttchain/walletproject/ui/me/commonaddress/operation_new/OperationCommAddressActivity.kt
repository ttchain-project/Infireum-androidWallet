package com.ttchain.walletproject.ui.me.commonaddress.operation_new

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class OperationCommAddressActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_add_comm_address

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(
            R.id.content_view,
            OperationCommAddressFragment.newInstance(
                intent.getIntExtra(_ID, -1),
                intent.getStringExtra(_ADDRESS) ?: ""
            )
        )
    }

    companion object {

        val _ID = "_ID"
        val _ADDRESS = "_ADDRESS"

        fun launch(activity: Activity, addressID: Int?, address: String) {
            activity.startActivity(
                Intent(
                    activity,
                    OperationCommAddressActivity::class.java
                ).apply {
                    putExtra(_ID, addressID)
                    putExtra(_ADDRESS, address)
                })
        }
    }
}
