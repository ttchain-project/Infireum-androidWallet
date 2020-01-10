package com.ttchain.walletproject.ui.me.usinglocker

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import com.ttchain.walletproject.isBiometricEnrolled
import org.koin.androidx.viewmodel.ext.android.viewModel

class UsingLockerActivity : BaseActivity() {

    companion object {
        const val FINGERPRINT_REQUEST_CODE = 121
        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, UsingLockerActivity::class.java))
        }
    }

    private val viewModel by viewModel<UsingLockerViewModel>()

    override val layoutId = R.layout.activity_using_locker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, UsingLockerFragment.newInstance())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == FINGERPRINT_REQUEST_CODE) {
            viewModel.updateUserTouchId(isBiometricEnrolled())
        }
    }
}