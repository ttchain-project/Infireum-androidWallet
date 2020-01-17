package com.ttchain.walletproject.base

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.afollestad.materialdialogs.MaterialDialog
import com.bigkoo.pickerview.builder.OptionsPickerBuilder
import com.git4u.tt_wallet_android.ui.dialog.ProgressTitleDialog
import com.tbruyelle.rxpermissions2.RxPermissions
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.dialog.InputDialog
import com.ttchain.walletproject.dialog.MessageDialog
import com.ttchain.walletproject.dialog.VerifyPwdDialog
import com.ttchain.walletproject.enums.AuthenticationError
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.goToBiometricEnrolledSetting
import com.ttchain.walletproject.hideKeyboard
import com.ttchain.walletproject.model.Transaction
import com.ttchain.walletproject.ui.splash.SplashActivity
import com.ttchain.walletproject.utils.NumberUtils
import com.yalantis.ucrop.UCrop
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber
import java.io.File
import java.math.BigDecimal
import java.util.*

abstract class BaseFragment : Fragment() {

    protected abstract val layoutId: Int
    protected abstract fun initView()

    companion object {
        private const val SELECT_FROM_GALLERY = 0
        private const val SELECT_FROM_CAMERA = 1
        private const val REQUEST_GET_SINGLE_IMAGE = 9001
        private const val REQUEST_IMAGE_CAPTURE = 9002
        private const val UPLOAD_PNG = "upload.png"
    }

    val configViewModel by viewModel<BaseConfigViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    fun getToolbar(): Toolbar? {
        var toolbar: Toolbar? = null
        activity?.let {
            toolbar = when (it) {
                is BaseActivity -> it.findViewById(R.id.toolbar)
                else -> null
            }
        }
        return toolbar
    }

    fun showToolbar(show: Boolean) {
        if (show) {
            getToolbar()?.visibility = View.VISIBLE
        } else {
            getToolbar()?.visibility = View.GONE
        }
    }

    fun showInputDialog(
        title: String,
        content: String,
        hint: String,
        inputCallBack: ((input: String) -> Unit)
    ) {
        val inputDialog = InputDialog()
            .setTitleText(title)
            .setMessageText(content)
            .setInputType(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)
            .setHintText(hint)
            .setOnConfirmClickListener(inputCallBack)
        childFragmentManager.addDialog(inputDialog, "inputDialog")
    }

    private var messageDialog: MessageDialog? = null

    fun onShowMessageDialog(msg: String, positiveListener: (() -> Unit)?) {
        messageDialog = MessageDialog()
            .setMessageText(msg)
            .setPositiveButtonText(getString(R.string.g_ok)).apply {
                if (positiveListener != null)
                    setPositiveButtonListener(positiveListener)
            }
        childFragmentManager.addDialog(messageDialog!!, "messageDialog")
    }


    fun onShowMessageDialog(
        titleText: String,
        negativeText: String,
        negativeListener: (() -> Unit)?,
        positiveText: String,
        positiveListener: (() -> Unit)?
    ) {
        messageDialog = MessageDialog()
            .setTitleText(titleText)
            .setPositiveButtonText(positiveText)
            .setNegationButtonText(negativeText)
            .apply {
                if (positiveListener != null)
                    setPositiveButtonListener(positiveListener)
                if (negativeListener != null)
                    setNegationButtonListener(negativeListener)
            }
        childFragmentManager.addDialog(messageDialog!!, "messageDialog")
    }

    fun onShowMessageDialog(
        title: String,
        msg: String,
        negativeText: String,
        negativeListener: (() -> Unit)?,
        positiveText: String,
        positiveListener: (() -> Unit)?
    ) {
        messageDialog = MessageDialog()
            .setTitleText(title)
            .setMessageText(msg)
            .setPositiveButtonText(positiveText)
            .setNegationButtonText(negativeText)
            .apply {
                if (positiveListener != null)
                    setPositiveButtonListener(positiveListener)
                if (negativeListener != null)
                    setNegationButtonListener(negativeListener)
            }
        childFragmentManager.addDialog(messageDialog!!, "messageDialog")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        if (messageDialog != null) {
            messageDialog?.dismissAllowingStateLoss()
            messageDialog = null
        }
    }

    fun finishActivity() {
        requireActivity().finish()
    }

    fun onShowMessageDialog(msg: String) {
        messageDialog = MessageDialog()
            .setMessageText(msg)
            .setPositiveButtonText(getString(R.string.g_ok))
        childFragmentManager.addDialog(messageDialog!!, "messageDialog")
    }

    fun onShowMessageDialogFinish(msg: String) {
        messageDialog = MessageDialog()
            .setMessageText(msg)
            .setPositiveButtonText(getString(R.string.g_ok))
            .setPositiveButtonListener {
                finishActivity()
            }.apply {
                isCancelable = false
            }
        childFragmentManager.addDialog(messageDialog!!, "messageDialog")
    }

    fun onShowMessageDialog(
        msg: String,
        positive: String,
        positiveListener: (() -> Unit)?
    ) {
        messageDialog = MessageDialog()
            .setMessageText(msg)
            .setPositiveButtonText(positive).apply {
                if (positiveListener != null)
                    setPositiveButtonListener(positiveListener)
            }
        childFragmentManager.addDialog(messageDialog!!, "messageDialog")
    }

    fun onShowLoading() {
        activity?.let {
            if (it is BaseActivity) {
                it.onShowLoading()
            }
        }
    }

    fun onHideLoading() {
        activity?.let {
            if (it is BaseActivity) {
                it.onHideLoading()
            }
        }
    }

    private val mProgressDialog = ProgressTitleDialog()

    fun showProgressDialog(title: String, content: String?) {
        mProgressDialog
            .setTitleText(title)
            .setMessageText(content)
        childFragmentManager.addDialog(mProgressDialog, "showProgressDialog")
    }

    fun updateProgressDialog(progress: String, progressPercent: Int) {
        mProgressDialog.updateProgress(progressPercent)
        mProgressDialog.setMessageText(progress)
    }

    fun releaseProgressDialog() {
        mProgressDialog.dismissAllowingStateLoss()
    }

    fun showToast(message: String) {
        showToast(message, Toast.LENGTH_LONG)
    }

    fun showToast(message: String, lengthLong: Int) {
        activity?.let {
            Toast.makeText(it, message, lengthLong).show()
        }
    }


    fun showItemListDialog(
        title: String,
        items: List<String>,
        callback: MaterialDialog.ListCallback
    ) {
        activity?.let {
            MaterialDialog.Builder(it).items(items).title(title)
                .itemsCallback(callback)
                .show()
        }
    }


    fun showSelectAvatarDialog() {
        val selections = ArrayList<String>()
        selections.add(getString(R.string.select_from_gallery))
        selections.add(getString(R.string.select_from_camera))

        context?.let {
            val pvOptions = OptionsPickerBuilder(
                it
            ) { options1, _, _, v ->
                if (options1 == SELECT_FROM_GALLERY) {
                    getReadFilePermission(true)
                } else if (options1 == SELECT_FROM_CAMERA) {
                    getCameraPermission(true)
                }
            }.setSubmitText(getString(R.string.g_confirm))
                .setCancelText(getString(R.string.g_cancel))
                .build<Any>()
            pvOptions.setPicker(selections as List<Any>)
            pvOptions.setSelectOptions(0)
            pvOptions.show()
        }
    }

    private var isAvatar = true
    fun getReadFilePermission(isAvatar: Boolean) {
        this.isAvatar = isAvatar
        activity?.let {
            RxPermissions(it)
                .request(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
                .subscribe { granted ->
                    if (granted) {
                        startPickImageAction()
                    } else {
                        //showPermissionDenied(getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE, getString(R.string.g_pick_photo_permission_request));
                    }
                }
        }
    }

    private fun startPickImageAction() {
        context?.let {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.addCategory(Intent.CATEGORY_OPENABLE)
            intent.type = "image/*"
            startActivityForResult(
                Intent.createChooser(
                    intent,
                    getString(R.string.g_select_photo)
                ), REQUEST_GET_SINGLE_IMAGE
            )
        }
    }

    fun getCameraPermission(isAvatar: Boolean) {
        this.isAvatar = isAvatar
        activity?.let {
            RxPermissions(it)
                .request(
                    Manifest.permission.CAMERA,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                )
                .subscribe { granted ->
                    if (granted) {
                        setCameraIntent()
                    } else {
                        //showPermissionDenied(getActivity(), Manifest.permission.CAMERA, getString(R.string.g_camera_permission_request));
                    }
                }
        }
    }

    private fun setCameraIntent() {
        val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

        val folder = File(
            (Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)).toString() +
                    File.separator + "TTChain"
        )
        val fileName = "camera.png"

        val f = File((folder.toString() + File.separator) + fileName)

        context?.let {
            val imageUri: Uri = when {
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.N ->
                    FileProvider.getUriForFile(
                        it, it.applicationContext.packageName + ".provider", f
                    )
                else -> Uri.fromFile(f)
            }

            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri)

            if (takePictureIntent.resolveActivity(it.packageManager) != null) {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
            }
        }
    }

    fun restartApplication() {
        activity?.let {
            val currentActivity = it
            currentActivity.finishAndRemoveTask()
            startActivity(Intent(currentActivity, SplashActivity::class.java))
        }
    }

    private var dappConfirmDialog: MaterialDialog? = null

    @SuppressLint("SetTextI18n")
    fun showDappConfirmDialog(
        transaction: Transaction,
        onCancelClick: ((transaction: Transaction) -> Unit),
        onConfirmClick: ((transaction: Transaction) -> Unit)
    ) {
        if (dappConfirmDialog == null) {
            activity?.let {
                dappConfirmDialog = MaterialDialog.Builder(it)
                    .cancelable(true)
                    .autoDismiss(false)
                    .customView(R.layout.dialog_confirm_dapp, true)
                    .build()

                val amountTV = dappConfirmDialog?.findViewById(R.id.amount_tv) as TextView
                if (transaction.value == null || transaction.value.isEmpty()) {
                    amountTV.text = "0 ${CoinEnum.ETH.coinName}"
                } else {
                    val amountB = BigDecimal.valueOf(NumberUtils.hexToLong(transaction.value)!!)
                    amountTV.text =
                        "${NumberUtils.show(
                            NumberUtils.valueOf(amountB, 18)
                        )} ${CoinEnum.ETH.coinName}"
                }

                val receiptAddressTV =
                    dappConfirmDialog?.findViewById(R.id.receipt_address_tv) as TextView
                receiptAddressTV.text = transaction.to
                val payAddressTV = dappConfirmDialog?.findViewById(R.id.pay_address_tv) as TextView
                payAddressTV.text = transaction.from

                val minerFeeTV = dappConfirmDialog?.findViewById(R.id.miner_fee_tv) as TextView

                if (transaction.gasPrice == null || transaction.gasLimit == null) {
                    minerFeeTV.text = "0 ${CoinEnum.ETH.coinName}"
                } else {
                    val gasPriceB =
                        BigDecimal.valueOf(NumberUtils.hexToLong(transaction.gasPrice)!!)
                    val gasLimitB =
                        BigDecimal.valueOf(NumberUtils.hexToLong(transaction.gasLimit)!!)
                    val minerFee = gasPriceB.multiply(gasLimitB)

                    minerFeeTV.text =
                        "${NumberUtils.show(
                            NumberUtils.valueOf(minerFee, 18)
                        )} ${CoinEnum.ETH.coinName}"
                }

                val confirm = dappConfirmDialog?.findViewById(R.id.confirm) as Button
                val cancel = dappConfirmDialog?.findViewById(R.id.cancel) as Button
                cancel.setOnClickListener {
                    onCancelClick.invoke(transaction)
                    releaseDappConfirmDialog()
                }
                confirm.setOnClickListener {
                    onConfirmClick.invoke(transaction)
                    releaseDappConfirmDialog()

                }
            }
        }
        dappConfirmDialog?.show()
    }

    private fun releaseDappConfirmDialog() {
        dappConfirmDialog?.dismiss()
        dappConfirmDialog = null
        activity?.hideKeyboard()
    }

    fun showAuthenticationDialog(
        hint: String,
        pwdListener: (password: String) -> Unit,
        bioListener: (password: String) -> Unit
    ) {
        if (configViewModel.isEnableTouchId()) {
            activity?.let {
                val executor = ContextCompat.getMainExecutor(it)
                val callback = object : BiometricPrompt.AuthenticationCallback() {
                    override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                        Timber.d("onAuthenticationError: errorCode: $errorCode, errString: $errString")
                        when (errorCode) {
                            //點選取消按鈕 and 嘗試次數過多，請稍後再試
                            AuthenticationError.AUTHENTICATION_ERROR_CANCELED.value,
                            AuthenticationError.AUTHENTICATION_ERROR_LOCKOUT.value -> {
                                showVerifyPwdDialog(hint, pwdListener)
                            }
                            //未登錄任何指紋
                            AuthenticationError.AUTHENTICATION_ERROR_NOT_ENROLLED.value -> {
                                it.goToBiometricEnrolledSetting()
                            }
                            //使用者已取消指紋驗證作業
                            AuthenticationError.AUTHENTICATION_ERROR_DISMISS.value -> {
                            }
                            else -> {
                                Timber.e("Authentication failed for an unknown reason")
                            }
                        }
                    }

                    override fun onAuthenticationFailed() {
                        super.onAuthenticationFailed()
                        Timber.d("onAuthenticationFailed")
                    }

                    override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                        Timber.d("onAuthenticationSucceeded")
                        val password = configViewModel.getRawPwd()
                        bioListener.invoke(password)
                    }
                }

                val biometricPrompt = BiometricPrompt(it, executor, callback)

                val promptInfo = BiometricPrompt.PromptInfo.Builder()
                    .setTitle(it.getString(R.string.authentication_title))
                    .setSubtitle("")
                    .setDescription(it.getString(R.string.authentication_description))
                    .setNegativeButtonText(it.getString(R.string.g_cancel))
                    .build()

                biometricPrompt.authenticate(promptInfo)
            }
        } else {
            showVerifyPwdDialog(hint, pwdListener)
        }
    }

    fun showVerifyPwdDialog(hint: String, listener: (password: String) -> Unit) {
        val verifyPwdDialog = VerifyPwdDialog()
            .setHintEdText(hint)
            .setOnConfirmClickListener(listener)
        childFragmentManager.addDialog(verifyPwdDialog, "showVerifyPwdDialog")
    }
}