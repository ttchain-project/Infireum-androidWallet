package com.ttchain.walletproject.ui.ttn.ttnreceipt

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.view.menu.MenuPopupHelper
import androidx.appcompat.widget.PopupMenu
import androidx.core.content.FileProvider
import androidx.lifecycle.observe
import com.tbruyelle.rxpermissions2.RxPermissions
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.performCopyString
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_ttn_receipt_asset.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TtnReceiptAssetFragment : BaseFragment() {

    companion object {
        fun newInstance() = TtnReceiptAssetFragment()
    }

    private val viewModel by viewModel<TtnReceiptAssetViewModel>()

    override val layoutId = R.layout.fragment_ttn_receipt_asset

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun initView() {
        viewModel.getTtnWalletData()
        wallet_title.text = GlobalConstant.DEFAULT_WALLET_NAME_TTN
        wallet_address.setDelayClickListener {
            wallet_address.text.toString().performCopyString(requireContext())
        }
        save_btn.setDelayClickListener {
            RxPermissions(requireActivity())
                .request(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE
                )
                .subscribe { granted ->
                    if (granted) {
                        val rootView =
                            requireActivity().window.decorView.findViewById<View>(android.R.id.content)
                        viewModel.performDownloadQrCode(rootView)
                    }
                }

        }
    }

    private fun initData() {
        viewModel.apply {
            getTtnWalletDataLiveData.observe(requireActivity()) {
                val address = it.address
                wallet_address.text = address
                viewModel.performGetQrCodeBitmap(address)
            }
            performDownloadQrCodeLiveData.observe(requireActivity()) { path ->
                showToast(getString(R.string.download_success) + path)
            }
            performDownloadQrCodeErrorLiveData.observe(requireActivity()) { throwable ->
                onHideLoading()
                showToast(getString(R.string.fail) + " " + throwable.toString())
            }
            performGetQrCodeBitmapLiveData.observe(requireActivity()) { bitmap ->
                qrcode.setImageBitmap(bitmap)
            }
            performCaptureViewLiveData.observe(requireActivity()) { status ->
                if (status) {
                    shareImageIntent(
                        getSaveTmpFileUri(),
                        getString(R.string.share_wallet_address_to)
                    )
                } else {
                    showToast(getString(R.string.fail_capture_view_and_retry_p))
                }
            }
        }
    }

    private fun getSaveTmpFileUri(): Uri {
        return FileProvider.getUriForFile(
            requireContext(),
            requireContext().applicationContext.packageName + ".provider",
            requireContext().getExternalFilesDir(GlobalConstant.TMP_SCREENSHOT_IMAGE_NAME)!!
        )
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.more -> {
                val menuItemView = requireActivity().findViewById<View>(item.itemId)
                showPopupMenu(menuItemView)
                return true
            }
        }
        return false
    }

    @SuppressLint("RestrictedApi")
    private fun showPopupMenu(menuItemView: View) {
        val popupMenu = PopupMenu(requireContext(), menuItemView)
        popupMenu.menuInflater.inflate(R.menu.menu_share_popup, popupMenu.menu)
        popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
            // 控件每一个item的点击事件
            when (item.itemId) {
                R.id.share -> {
                    if (requireActivity().window != null) {
                        val rootView =
                            requireActivity().window.decorView.findViewById<View>(android.R.id.content)
                        viewModel.performCaptureView(rootView)
                    }
                    return@OnMenuItemClickListener true
                }
            }
            true
        })
        popupMenu.show()
        try {
            val field = popupMenu.javaClass.getDeclaredField("mPopup")
            field.isAccessible = true
            val helper = field.get(popupMenu) as MenuPopupHelper
            helper.setForceShowIcon(true)
        } catch (e: NoSuchFieldException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }
    }

    private fun shareImageIntent(fileUri: Uri, shareTitle: String) {
        if (requireContext().contentResolver == null) {
            return
        }
        startActivity(Intent.createChooser(Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_STREAM, fileUri)
            type = "image/*"
        }, shareTitle))
    }


}