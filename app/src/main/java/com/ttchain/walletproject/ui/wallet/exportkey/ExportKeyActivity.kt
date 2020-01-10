package com.ttchain.walletproject.ui.wallet.exportkey

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class ExportKeyActivity : BaseActivity() {


    val TAG = javaClass.simpleName

    companion object {
        val _ID = "_ID"

        fun launch(activity: Activity, id: Int) {
            activity.startActivity(Intent(activity, ExportKeyActivity::class.java).apply {
                putExtra(_ID, id)
            })
        }
    }

    private val viewModel by viewModel<ExportKeyViewModel>()

    override val layoutId: Int
        get() = R.layout.activity_export_key

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        viewModel.walletId = intent.getIntExtra(_ID, -1)
        changeFragment(
            R.id.content_view,
            ExportKeyFragment.newInstance()
        )
    }

}
