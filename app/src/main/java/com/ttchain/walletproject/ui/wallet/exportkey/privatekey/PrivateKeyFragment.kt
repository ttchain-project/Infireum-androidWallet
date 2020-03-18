package com.ttchain.walletproject.ui.wallet.exportkey.privatekey

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.performCopyString
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.wallet.exportkey.ExportKeyViewModel
import kotlinx.android.synthetic.main.fragment_private_key.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class PrivateKeyFragment : BaseFragment() {

    companion object {
        fun newInstance() = PrivateKeyFragment()
    }

    private val viewModel by sharedViewModel<ExportKeyViewModel>()

    override val layoutId: Int
        get() = R.layout.fragment_private_key

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    @SuppressLint("RestrictedApi")
    override fun initView() {
        viewModel.performGetWalletEpKey()
        copy_key.setDelayClickListener {
            private_key.text.toString().performCopyString(requireContext())
        }
        show_private_key.setDelayClickListener {
            show_private_key.visibility = View.GONE
            private_key.visibility = View.VISIBLE
            copy_key.visibility = View.VISIBLE
        }
    }

    private fun initData() {
        viewModel.apply {
            performGetWalletEpKeyLiveData.observe(viewLifecycleOwner) {
                private_key.text = it
            }
        }
    }
}