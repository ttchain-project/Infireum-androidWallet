package com.ttchain.walletproject.ui.restorebymnemonics_new

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment

class RestoreByMnemonicsActivity : BaseActivity() {

    companion object {

        const val BUNDLE_PERSONAL_INFO_MODEL = "BUNDLE_PERSONAL_INFO_MODEL"
        const val BUNDLE_RESPONSE_USER_IDENTITY = "BUNDLE_RESPONSE_USER_IDENTITY"

        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, RestoreByMnemonicsActivity::class.java))
        }
    }

    override val layoutId: Int
        get() = R.layout.activity_restore_by_mnemonics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, RestoreByMnemonicsFragment.newInstance())
    }
}
