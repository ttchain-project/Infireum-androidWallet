package com.ttchain.walletproject.ui.receiptasset

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.view.menu.MenuPopupHelper
import androidx.appcompat.widget.PopupMenu
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.tbruyelle.rxpermissions2.RxPermissions
import com.ttchain.walletproject.rx.RxBusTag
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.performCopyString
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_receipt_asset.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class ReceiptAssetFragment : BaseFragment() {

    companion object {
        fun newInstance(coinID: Int) = ReceiptAssetFragment().apply {
            arguments = bundleOf(ReceiptAssetActivity._ID to coinID)
        }
    }

    private val viewModel by viewModel<ReceiptAssetViewModel>()

    private val bundleCoinID: Int by lazy {
        arguments?.getInt(ReceiptAssetActivity._ID, -1) ?: -1
    }

    override val layoutId = R.layout.fragment_receipt_asset

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getInstance().unregister(RxBusTag.SELECT_COIN_OK)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        RxBus.getInstance().register<Int>(RxBusTag.SELECT_COIN_OK)
            .subscribe({ s ->
                viewModel.coinId = s
                viewModel.performUpdateQrCodeBitmap()
            }, {
            })

        viewModel.apply {
            updateCoinID()
            performGetUserSelectedWallet()
            performUpdateQrCodeBitmap()
        }
    }

    override fun initView() {
        setHasOptionsMenu(true)
        viewModel.coinId = bundleCoinID
        requireActivity().title = getString(R.string.receipt)
        wallet_address.setDelayClickListener {
            wallet_address.text.toString().performCopyString(it.context)
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
            performGetQrCodeBitmapLiveData.observe(viewLifecycleOwner) { bitmap ->
                qrcode?.setImageBitmap(bitmap)
            }
            performDownloadQrCodeLiveData.observe(requireActivity()) { path ->
                showToast(getString(R.string.download_success) + path)
            }
            performDownloadQrCodeErrorLiveData.observe(requireActivity()) { throwable ->
                onHideLoading()
                showToast(getString(R.string.fail) + " " + throwable.toString())
            }
            performGetUserSelectedWalletLiveData.observe(requireActivity()) { data ->
                when (data.mainCoinId) {
                    CoinEnum.BTC.coinId -> setWalletName(
                        data.name,
                        ContextCompat.getDrawable(
                            requireContext(),
                            R.mipmap.wallet_coin_btc_small
                        )
                    )
                    CoinEnum.ETH.coinId -> setWalletName(
                        data.name,
                        ContextCompat.getDrawable(
                            requireContext(),
                            R.mipmap.wallet_coin_eth_small
                        )
                    )
                    else -> setWalletName(data.name, null)
                }
                setWalletAddress(data.address)
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

    private fun setWalletName(name: String, drawable: Drawable?) {
        wallet_name?.text = name
        wallet_name?.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null)
    }

    private fun setWalletAddress(address: String) {
        wallet_address?.text = address
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_more, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.more -> {
                val menuItemView = (context as Activity).findViewById<View>(item.itemId)
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
        val shareIntent = Intent()
        shareIntent.action = Intent.ACTION_SEND
        shareIntent.putExtra(Intent.EXTRA_STREAM, fileUri)
        shareIntent.type = "image/*"
        startActivity(Intent.createChooser(shareIntent, shareTitle))
    }

    private fun getSaveTmpFileUri(): Uri {
        return FileProvider.getUriForFile(
            requireContext(),
            requireContext().applicationContext.packageName + ".provider",
            requireContext().getExternalFilesDir(GlobalConstant.TMP_SCREENSHOT_IMAGE_NAME)!!
        )
    }
}