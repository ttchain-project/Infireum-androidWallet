package com.ttchain.walletproject.ui.wallet.exportkey.qrcodekey

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.wallet.exportkey.ExportKeyViewModel
import kotlinx.android.synthetic.main.fragment_qrcode_key.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class QrcodeKeyFragment : BaseFragment() {

    companion object {
        fun newInstance() = QrcodeKeyFragment()
    }

    private val viewModel by sharedViewModel<ExportKeyViewModel>()

    override val layoutId: Int
        get() = R.layout.fragment_qrcode_key

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        qrcode.visibility = View.GONE
        viewModel.performGetQrCodeBitmap()
        show_qrcode.setDelayClickListener {
            if (qrcode != null) {
                qrcode.visibility = View.VISIBLE
            }
            show_qrcode.visibility = View.GONE
        }
    }

    private fun initData() {
        viewModel.apply {
            performGetQrCodeBitmapLiveData.observe(requireActivity()) { bitmap ->
                qrcode.setImageBitmap(bitmap)
            }
        }
    }
}