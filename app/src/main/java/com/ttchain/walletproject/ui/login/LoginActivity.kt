package com.ttchain.walletproject.ui.login

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import com.ttchain.walletproject.ui.agreement.AgreementActivity

class LoginActivity : BaseActivity() {

    override val layoutId: Int
        get() = R.layout.activity_login

    companion object {

        fun launch(activity: Activity) {
            activity.startActivity(Intent(activity, LoginActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            })
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(R.id.content_view, LoginFragment.newInstance())
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == AgreementActivity.REQUEST_CODE) {
//            if (data?.getBooleanExtra(AgreementActivity.RESULT_DATA, false) == true)
//                CreateIdActivity.launch(this)
        }
    }
}