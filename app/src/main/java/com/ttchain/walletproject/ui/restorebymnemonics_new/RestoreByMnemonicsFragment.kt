package com.ttchain.walletproject.ui.restorebymnemonics_new

import android.os.Bundle
import android.view.View
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.observe
import com.ttchain.walletproject.*
import com.ttchain.walletproject.ui.restorebymnemonics_new.restorenouserinfo.RestoreNoUserInfoFragment
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.model.ResponseUserIdentity
import kotlinx.android.synthetic.main.fragment_restore_by_mnemonics_new.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class RestoreByMnemonicsFragment : BaseFragment() {

    companion object {
        fun newInstance(): RestoreByMnemonicsFragment {
            return RestoreByMnemonicsFragment()
        }
    }

    private val activity: RestoreByMnemonicsActivity by lazy {
        requireContext() as RestoreByMnemonicsActivity
    }

    private val viewModel by viewModel<RestoreByMnemonicsViewModel>()

    override val layoutId: Int
        get() = R.layout.fragment_restore_by_mnemonics_new

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        editTextMnemonics.addTextChangedListener {
            checkInput()
        }
        previous.setDelayClickListener { finishActivity() }
        next.setOnClickListener {
            val mnemonics = editTextMnemonics.text.toString()
            viewModel.setMnemonics(mnemonics)
        }
        // debug mode data
        if (BuildConfig.DEBUG) {
            title_tv.setDelayClickListener {
                editTextMnemonics.setText(
//                    "患 烘 杭 有 六 污 星 吏 踏 师 业 材"
//                    "thrive visit task frown maze useful bench perfect comic fly pottery draw"
                    "step double despair sugar tongue kitchen plastic bar public elite cattle priority"
                )
            }
        }
    }

    private fun initData() {
        viewModel.apply {
            throwableMessage.observe(requireActivity()) {
                when {
                    viewModel.isPageFinish -> onShowMessageDialogFinish(it)
                    else -> onShowMessageDialog(it)
                }
            }
            isLoading.observe(requireActivity()) {
                if (it) onShowLoading() else onHideLoading()
            }
            systemWalletInitLiveData.observe(requireActivity()) {
                if (it) {
                    activity.addFragment(
                        R.id.content_view,
                        RestoreNoUserInfoFragment.newInstance(
                            responseUserIdentity ?: ResponseUserIdentity()
                        )
                    )
                } else {
                    onShowMessageDialog(getString(R.string.mnemonics_error_blank))
                }
            }
//            getUserInfoLiveData.observe(requireActivity()) { data ->
//                activity.addFragment(
//                    R.id.content_view,
//                    RestoreWithUserInfoFragment.newInstance(
//                        data,
//                        responseUserIdentity ?: ResponseUserIdentity()
//                    )
//                )
//            }
        }
    }

    private fun checkInput() {
        next.setEnable(
            editTextMnemonics.text.toString().isNotEmpty()
//            mnemonic_input_1.text.toString().isNotEmpty() &&
//                    mnemonic_input_1.text.toString().isNotEmpty() &&
//                    mnemonic_input_2.text.toString().isNotEmpty() &&
//                    mnemonic_input_3.text.toString().isNotEmpty() &&
//                    mnemonic_input_4.text.toString().isNotEmpty() &&
//                    mnemonic_input_5.text.toString().isNotEmpty() &&
//                    mnemonic_input_6.text.toString().isNotEmpty() &&
//                    mnemonic_input_7.text.toString().isNotEmpty() &&
//                    mnemonic_input_8.text.toString().isNotEmpty() &&
//                    mnemonic_input_9.text.toString().isNotEmpty() &&
//                    mnemonic_input_10.text.toString().isNotEmpty() &&
//                    mnemonic_input_11.text.toString().isNotEmpty() &&
//                    mnemonic_input_12.text.toString().isNotEmpty()
        )
    }
}