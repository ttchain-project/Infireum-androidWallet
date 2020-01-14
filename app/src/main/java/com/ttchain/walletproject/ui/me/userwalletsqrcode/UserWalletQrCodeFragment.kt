package com.ttchain.walletproject.ui.me.userwalletsqrcode

import android.Manifest
import android.graphics.Bitmap
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.rx.RxBusTag
import com.tbruyelle.rxpermissions2.RxPermissions
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.model.UserWalletQrCodeInputBean
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_user_wallet_qr_code.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserWalletQrCodeFragment : BaseFragment() {
    companion object {

        fun newInstance(bean: UserWalletQrCodeInputBean) = UserWalletQrCodeFragment().apply {
            arguments = bundleOf(UserWalletQrCodeActivity._ID to bean)
        }
    }

    private val bundleValue: UserWalletQrCodeInputBean? by lazy {
        arguments?.getParcelable(UserWalletQrCodeActivity._ID) as UserWalletQrCodeInputBean
    }

    private val viewModel by viewModel<UserWalletQrCodeViewModel>()
    private var menu: Menu? = null

    override val layoutId = R.layout.fragment_user_wallet_qr_code

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun initView() {
        activity?.title = getString(R.string.setting_backup_account)
        bundleValue?.let { bean ->
            create.setDelayClickListener {
                viewModel.generatedQrCode(bean, bean.pwd)
            }
        } ?: run {
            finishActivity()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_download, menu)
        super.onCreateOptionsMenu(menu, inflater)
        this.menu = menu
        menu.findItem(R.id.download)?.isVisible = false
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.download -> {
                RxPermissions(activity!!)
                    .request(
                        Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE
                    )
                    .subscribe { granted ->
                        if (granted) {
                            viewModel.storeQrCode()
                        }
                    }

                return true
            }
        }
        return false
    }

    private fun initData() {
        viewModel.apply {
            performGetQrCodeBitmapLiveData.observe(requireActivity()) {
                setQrCodeBitmap(it)
            }
            storeQrCodeLiveData.observe(requireActivity()) { path ->
                showToast(getString(R.string.qr_code_backup_success) + path)
            }
            storeQrCodeErrorLiveData.observe(requireActivity()) { throwable ->
                onHideLoading()
                showToast(getString(R.string.qr_code_backup_fail) + " " + throwable.toString())
            }
            isLoading.observe(requireActivity()) {
                if (it) onShowLoading() else onHideLoading()
            }
        }
    }

    private fun setQrCodeBitmap(bitmap: Bitmap) {
        qrcode?.setImageBitmap(bitmap)
        qrcode?.visibility = View.VISIBLE
        display_qrcode_ly?.visibility = View.INVISIBLE
        menu?.findItem(R.id.download)?.isVisible = true
        getToolbar()?.setNavigationIcon(R.mipmap.btn_refuse)
        getToolbar()?.setNavigationOnClickListener {
            RxBus.getInstance().post(RxBusTag.FINISH_SELECT_BACKUP_METHOD_ACTIVITY, true)
            finishActivity()
        }
    }
}