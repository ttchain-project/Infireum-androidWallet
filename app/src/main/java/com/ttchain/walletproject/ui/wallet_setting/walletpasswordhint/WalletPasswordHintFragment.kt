package com.ttchain.walletproject.ui.wallet_setting.walletpasswordhint

import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.view.View
import androidx.core.os.bundleOf
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.lazy
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_wallet_password_hint.*

class WalletPasswordHintFragment : BaseFragment() {

    companion object {
        fun newInstance(passwordHint: String) = WalletPasswordHintFragment().apply {
            arguments = bundleOf(WalletPasswordHintActivity.BUNDLE_PASSWORD_HINT to passwordHint)
        }
    }

    private val bundlePasswordHint: String by lazy(WalletPasswordHintActivity.BUNDLE_PASSWORD_HINT)

    override val layoutId: Int = R.layout.fragment_wallet_password_hint

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        requireActivity().title = getString(R.string.wallet_password_hint_title)
        editTextHint.setText(bundlePasswordHint)
        buttonDisplayHint.setDelayClickListener {
            if (editTextHint.transformationMethod == null) {
                editTextHint.transformationMethod = PasswordTransformationMethod.getInstance()
                buttonDisplayHint.setImageResource(R.mipmap.btn_hide)
            } else {
                editTextHint.transformationMethod = null
                buttonDisplayHint.setImageResource(R.mipmap.btn_show)
            }
        }
    }

    private fun initData() {

    }
}