package com.ttchain.walletproject.ui.me

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.lifecycle.observe
import com.downloader.OnDownloadListener
import com.downloader.PRDownloader
import com.downloader.Error
import com.tbruyelle.rxpermissions2.RxPermissions
import com.ttchain.walletproject.*
import com.ttchain.walletproject.App.Companion.isMainNet
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.dialog.StatusDialog
import com.ttchain.walletproject.dialog.UpdateVersionDialogFragment
import com.ttchain.walletproject.dialog.WarningDialog
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.ui.login.LoginActivity
import com.ttchain.walletproject.ui.me.commonaddress.CommonAddressActivity
import com.ttchain.walletproject.ui.me.currency.CurrencyActivity
import com.ttchain.walletproject.ui.me.languagesetting.LanguageSettingActivity
import com.ttchain.walletproject.ui.me.selectbackupmethod.SelectBackupMethodActivity
import com.ttchain.walletproject.ui.me.usinglocker.UsingLockerActivity
import com.ttchain.walletproject.ui.me.selectexportwallet.SelectExportWalletActivity
import com.ttchain.walletproject.utils.FeatureUtils
import com.ttchain.walletproject.utils.Utility
import com.ttchain.walletproject.utils.Utils
import kotlinx.android.synthetic.main.fragment_setting.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.File

class MeFragment : BaseFragment() {

    companion object {
        fun newInstance() = MeFragment()
    }

    private val viewModel by viewModel<MeViewModel>()
    private var position = -1

    override val layoutId = R.layout.fragment_setting

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        textViewLanguage?.setDelayClickListener {
            LanguageSettingActivity.launch(requireActivity())
        }
        textViewCheckUpdate?.setDelayClickListener {
            viewModel.performGetVersion()
        }
        textViewCommonAddress?.setDelayClickListener {
            CommonAddressActivity.launch(requireActivity())
        }
        textViewCurrency?.setDelayClickListener {
            CurrencyActivity.launch(requireActivity())
        }
        export_btc_container?.setDelayClickListener {
            SelectExportWalletActivity.launch(requireActivity(), CoinEnum.BTC)
        }
        export_eth_container?.setDelayClickListener {
            SelectExportWalletActivity.launch(requireActivity(), CoinEnum.ETH)
        }
        textViewBackupWallet?.setDelayClickListener {
            position = 2
            showVerifyDialog()
        }
        textViewDelete?.setDelayClickListener {
            showDeleteAccountWarnDialog()
        }
        textViewBackup?.setDelayClickListener {
            val drawableStart =
                ContextCompat.getDrawable(requireContext(), R.mipmap.setting_icon_export)
            drawableStart?.setBounds(
                0,
                0,
                drawableStart.minimumWidth,
                drawableStart.minimumHeight
            )
            if (export_btc_container.visibility == View.VISIBLE && export_eth_container.visibility == View.VISIBLE) {
                export_btc_container.visibility = View.GONE
                export_eth_container.visibility = View.GONE
                val drawableEnd = ContextCompat.getDrawable(requireContext(), R.mipmap.btn_open)
                drawableEnd?.setBounds(
                    0,
                    0,
                    drawableEnd.minimumWidth,
                    drawableEnd.minimumHeight
                )
                textViewBackup?.setCompoundDrawables(drawableStart, null, drawableEnd, null)
            } else {
                export_btc_container.visibility = View.VISIBLE
                export_eth_container.visibility = View.VISIBLE
                val drawableEnd = ContextCompat.getDrawable(requireContext(), R.mipmap.btn_close)
                drawableEnd?.setBounds(
                    0,
                    0,
                    drawableEnd.minimumWidth,
                    drawableEnd.minimumHeight
                )
                textViewBackup?.setCompoundDrawables(drawableStart, null, drawableEnd, null)
            }
        }
        // 使用密碼鎖
        textViewUsingLocker?.setDelayClickListener {
            UsingLockerActivity.launch(requireActivity())
        }
        //工程師模式
        if (BuildConfig.DEBUG) {
            wallet_setting_tv?.setOnLongClickListener {
                isMainNet = !isMainNet
                showToast("isMainNet: $isMainNet")
                return@setOnLongClickListener false
            }
        }
    }

    private fun initData() {
        val owner = this@MeFragment
        viewModel.apply {
            throwableMessage.observe(owner) {
                when {
                    viewModel.isPageFinish -> onShowMessageDialogFinish(it)
                    else -> onShowMessageDialog(it)
                }
            }
            performGetVersionLiveData.observe(owner) { result ->
                val sb = StringBuffer().apply {
                    append(getString(R.string.version_is_latest))
                    append("\n")
                    append(getString(R.string.now_version_comma))
                    append(BuildConfig.VERSION_NAME)
                    append("\n")
                    append(getString(R.string.latest_version_comma))
                    append(result.android.googlePlay)
                }
                if (Utils.isAppVersionDeprecated(
                        result.android.googlePlay,
                        BuildConfig.VERSION_NAME
                    )
                ) {
                    val updateVersionDialog = UpdateVersionDialogFragment()
                        .setMessagetext(sb.toString())
                        .setOnUpdateClickListener {
                            if (FeatureUtils.isPlayPlatform) {
                                try {
                                    val appPackageName = "com.ttchain.walletproject.beta"
                                    startActivity(
                                        Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse("market://details?id=$appPackageName")
                                        )
                                    )
                                } catch (anfe: android.content.ActivityNotFoundException) {
                                    startActivity(
                                        Intent(
                                            Intent.ACTION_VIEW,
                                            Uri.parse(BuildConfig.OFFICIAL_WEBSITE)
                                        )
                                    )
                                }
                                return@setOnUpdateClickListener
                            }
                            if (FeatureUtils.isHockeyPlatform) {
                                RxPermissions(requireActivity())
                                    .request(
                                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                        Manifest.permission.READ_EXTERNAL_STORAGE
                                    )
                                    .toMain()
                                    .subscribe { granted ->
                                        if (granted) {
                                            downloadApk()
                                        } else {
                                            launchHockeyAppDownloadPage()
                                        }
                                    }
                            }
                        }
                    childFragmentManager.addDialog(updateVersionDialog, "updateVersion")
                } else {
                    val statusDialog = StatusDialog()
                        .setTitle(getString(R.string.version_is_latest))
                        .setContentString(getString(R.string.now_version_comma) + BuildConfig.VERSION_NAME)
                        .setBtnText(null, getString(R.string.g_confirm))
                        .setOnLeftClickListener {

                        }
                    childFragmentManager.addDialog(statusDialog, "statusDialog")
                }
            }
            onClickExitIdentityConfirmLiveData.observe(owner) {
                if (it) {
                    finishActivity()
                    LoginActivity.launch(requireActivity())
                }
            }
            getVerifyIdentityPwdObservableLiveData.observe(owner) {
                if (it) {
                    // if success
                    when (position) {
                        1 -> viewModel.onClickExitIdentityConfirm()
                        else -> {
                            SelectBackupMethodActivity.launch(requireActivity())
                        }
                    }
                    position = -1
                } else {
                    // if error
                    onShowMessageDialog(
                        getString(R.string.fail_verify_pwd_and_reinput_p),
                        getString(R.string.g_ok)
                    ) {
                        showVerifyDialog()
                    }
                }
            }
        }
    }

    private fun showVerifyDialog() {
        val hint = viewModel.getIdentityData().pwdHint
        showAuthenticationDialog(hint,
            pwdListener = {
                checkPwd(it, hint)
            },
            bioListener = {
                checkPwd(it, hint)
            })
    }

    private fun checkPwd(it: String, hint: String) {
        if (it.isEmpty()) {
            showToast(getString(R.string.set_password_and_hint_empty))
            return
        }
        if (it == hint) {
            showToast(getString(R.string.set_password_and_hint_error))
            return
        }
        viewModel.getVerifyIdentityPwdObservable(it)
    }

    private fun showDeleteAccountWarnDialog() {
        val warningDialog = WarningDialog()
            .setTitle(getString(R.string.delete_account_title))
            .setContent(getString(R.string.delete_account_message))
            .setBtnText(getString(R.string.g_confirm), getString(R.string.g_cancel))
            .setOnRightClickListener {
                position = 1
                showVerifyDialog()
            }
            .setOnLeftClickListener { }
        childFragmentManager.addDialog(warningDialog, "deleteAccountWarning")
    }

    private val fileName = "${GlobalConstant.APP_NAME}ProBeta.apk"

    private fun downloadApk() {

        val url = BuildConfig.HOCKEY_APP_DOWNLOAD_URL
        val file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)

        val dirPath = file.path

        PRDownloader.download(url, dirPath, fileName)
            .build()
            .setOnStartOrResumeListener { showProgressDialog(getString(R.string.downloading), "") }
            .setOnPauseListener { }
            .setOnCancelListener { }
            .setOnProgressListener { progress ->
                val progressString =
                    Utility.getProgressDisplayLine(progress.currentBytes, progress.totalBytes)
                val progressPercent = progress.currentBytes * 100 / progress.totalBytes
                updateProgressDialog(progressString, progressPercent.toInt())
            }
            .start(object : OnDownloadListener {
                override fun onDownloadComplete() {
                    releaseProgressDialog()
                    install()
                }

                override fun onError(error: Error) {
                    releaseProgressDialog()
                    onShowMessageDialog(error.toString()) {
                        launchHockeyAppDownloadPage()
                    }
                }
            })
    }

    private fun install() {
        val file = File(
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
            fileName
        )
        val intent = Intent(Intent.ACTION_VIEW)

        try {
            if (Build.VERSION.SDK_INT >= 24) {  //7.0
                //provider authorities
                val authority = BuildConfig.APPLICATION_ID + ".provider"
                val apkUri = FileProvider.getUriForFile(requireContext(), authority, file)
                //Granting Temporary Permissions to a URI
                intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                intent.setDataAndType(apkUri, "application/vnd.android.package-archive")
            } else {
                intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive")
            }
            launchInstall(intent)
        } catch (error: Exception) {
            onShowMessageDialog(error.toString()) {
                launchHockeyAppDownloadPage()
            }
        }
    }

    fun launchHockeyAppDownloadPage() {
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(BuildConfig.OFFICIAL_WEBSITE)))
    }

    private fun launchInstall(intent: Intent) {
        startActivity(intent)
    }
}