package com.ttchain.walletproject.ui.scanner_new

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.annotation.IntDef
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.changeFragment
import com.ttchain.walletproject.enums.QRCodeEnum

class ScannerActivity : BaseActivity() {

    @IntDef(BASIC, ADVANCED)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    annotation class ScanType

    override val layoutId = R.layout.activity_scanner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() {
        changeFragment(
            R.id.content_view, ScannerFragment.newInstance(
                intent.getIntExtra(_ID, -1),
                intent.getSerializableExtra(QRCODE_TYPE) as QRCodeEnum
            )
        )
    }

    companion object {

        const val REQUEST_CODE = 881

        const val EXTRA_CODE_ADDRESS = "EXTRA_CODE_ADDRESS"
        const val EXTRA_CODE_AMOUNT = "EXTRA_CODE_AMOUNT"

        const val BASIC = 0x01
        const val ADVANCED = 0x02
        const val _ID = "_ID"
        const val QRCODE_TYPE = "QRCODE_TYPE"

        fun launch(activity: Activity, @ScanType type: Int, qrCodeType: QRCodeEnum) {
            activity.startActivity(Intent(activity, ScannerActivity::class.java).apply {
                putExtra(_ID, type)
                putExtras(bundleOf(QRCODE_TYPE to qrCodeType))
            })
        }

        fun launchForResult(fragment: Fragment, @ScanType type: Int, qrCodeType: QRCodeEnum) {
            fragment.startActivityForResult(
                Intent(
                    fragment.requireActivity(),
                    ScannerActivity::class.java
                ).apply {
                    putExtra(_ID, type)
                    putExtras(bundleOf(QRCODE_TYPE to qrCodeType))
                }, REQUEST_CODE
            )
        }
    }
}
