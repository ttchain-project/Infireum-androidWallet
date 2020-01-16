package com.ttchain.walletproject.ui.create_id.mnemonics

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.tbruyelle.rxpermissions2.RxPermissions
import com.ttchain.walletproject.*
import com.ttchain.walletproject.base.BaseActivity
import com.ttchain.walletproject.dialog.TwoInputDialog
import com.ttchain.walletproject.dialog.WarningDialog
import com.ttchain.walletproject.model.UserBean
import com.ttchain.walletproject.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_mnemonics_start.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MnemonicsStartActivity : BaseActivity() {

    companion object {

        fun launch(activity: Activity) {
            val intent = Intent(activity, MnemonicsStartActivity::class.java)
            activity.startActivity(intent)
        }

        const val _ID = "_ID"

        fun launch(activity: Activity, userBean: UserBean) {
            val intent = Intent(activity, MnemonicsStartActivity::class.java)
            intent.putExtra(_ID, userBean)
            activity.startActivity(intent)
        }
    }

    private val viewModel by viewModel<MnemonicsStartViewModel>()


    private val bundleValue: UserBean by lazy {
        intent.getSerializableExtra(_ID) as UserBean
    }

    override val layoutId = R.layout.activity_mnemonics_start

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initData()
    }

    private fun initViews() {
        viewModel.userBean = bundleValue
        viewModel.createUserAndWallet()
        skip_btn.setDelayClickListener {
            showWarningDialog()
        }
        finish_btn.setDelayClickListener {
            finishActivity()
            MainActivity.launch(this)
        }
        create.setDelayClickListener {
            onBackUp()
        }
    }

    private fun initData() {
        viewModel.apply {
            createUserAndWalletLiveData.observe(this@MnemonicsStartActivity) { status ->
                if (status) {

                } else {
                    showToast(getString(R.string.fail_create))
                }
            }
            performGetQrCodeBitMapLiveData.observe(this@MnemonicsStartActivity) { bitmap ->
                qrcode.setImageBitmap(bitmap)
                qrcode.visibility = View.VISIBLE
                display_qrcode_ly.visibility = View.INVISIBLE
                finish_btn.visibility = View.VISIBLE
                skip_btn.visibility = View.GONE
            }
            storeQrCodeLiveData.observe(this@MnemonicsStartActivity) { path ->
                showToast(getString(R.string.qr_code_backup_success) + path)
            }
            storeQrCodeErrorLiveData.observe(this@MnemonicsStartActivity) { throwable ->
                onHideLoading()
                showToast(getString(R.string.qr_code_backup_fail) + " " + throwable.toString())
            }
        }
    }

    private fun onBackUp() {
        RxPermissions(this)
            .request(
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
            )
            .subscribe { granted ->
                if (granted) {
//                        showTwoInputDialog()
                    viewModel.getTwoInput(bundleValue.pwd, bundleValue.note)
                } else {
                    //showPermissionDenied(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE, getString(R.string.g_pick_photo_permission_request));
                }
            }
    }

    private fun showWarningDialog() {
        val warningDialog = WarningDialog()
            .setTitle(getString(R.string.mnemonic_start_warring_title))
            .setContent(getString(R.string.mnemonic_start_warring_message))
            .setBtnText(getString(R.string.g_confirm), getString(R.string.setting_backup_account))
            .setLeftBtnRedBg()
            .setOnLeftClickListener {
                onBackUp()
            }
            .setOnRightClickListener {
                finishActivity()
                MainActivity.launch(this)
            }
        supportFragmentManager.addDialog(warningDialog, WarningDialog::class.java.simpleName)
    }


//    private fun showTwoInputDialog() {
//        val twoInputDialog = TwoInputDialog()
//            .setTitle("請輸入錢包密碼")
//            .setInputOne("密碼", "請輸入您的錢包密碼")
//            .setInputTwo("顯示密碼提示訊息", "")
//            .setOnConfirmClickListener { inputOne, inputTwo ->
//                viewModel.getTwoInput(inputOne, inputTwo)
//            }
//        supportFragmentManager.addDialog(twoInputDialog, TwoInputDialog::class.java.simpleName)
//    }
}
