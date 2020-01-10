package com.ttchain.walletproject.ui.me.userwalletsqrcode

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.core.os.bundleOf
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import com.ttchain.walletproject.model.UserWalletQrCodeInputBean

class UserWalletQrCodeActivity : BaseActivity() {


    val TAG = javaClass.simpleName

    companion object {
        val _ID = "_ID"

        fun launch(activity: Activity, bean: UserWalletQrCodeInputBean) {
            activity.startActivity(Intent(activity, UserWalletQrCodeActivity::class.java).apply {
                putExtras(bundleOf(_ID to bean))
            })
        }
    }

    override val layoutId: Int
        get() = R.layout.activity_user_wallet_qr_code

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        changeFragment(
            R.id.content_view,
            UserWalletQrCodeFragment.newInstance(intent.getParcelableExtra(_ID))
        )
    }

}
