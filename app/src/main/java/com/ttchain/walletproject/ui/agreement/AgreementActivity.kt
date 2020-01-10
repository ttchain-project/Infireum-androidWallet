package com.ttchain.walletproject.ui.agreement

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class AgreementActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_agreement

    companion object {

        const val _ID = "_ID"
        const val REQUEST_CODE = 210
        const val RESULT_DATA = "RESULT_DATA"

        fun launchForResult(activity: Activity, id: Int) {
            activity.startActivityForResult(Intent(activity, AgreementActivity::class.java).apply {
                putExtra(_ID, id)
            }, REQUEST_CODE)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {

    }
}
