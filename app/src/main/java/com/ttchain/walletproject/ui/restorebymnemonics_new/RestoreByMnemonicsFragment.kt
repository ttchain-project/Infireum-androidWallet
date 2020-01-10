package com.ttchain.walletproject.ui.restorebymnemonics_new

import android.os.Bundle
import android.view.View
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.observe
import com.ttchain.walletproject.*
import com.ttchain.walletproject.ui.restorebymnemonics_new.restorenouserinfo.RestoreNoUserInfoFragment
import com.ttchain.walletproject.ui.restorebymnemonics_new.restorewithuserinfo.RestoreWithUserInfoFragment
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
        mnemonic_input_1.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_2.requestFocus()
                mnemonic_input_2.setSelection(mnemonic_input_2.text.toString().length)
            }
        }
        mnemonic_input_2.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_3.requestFocus()
                mnemonic_input_3.setSelection(mnemonic_input_3.text.toString().length)
            }
        }
        mnemonic_input_3.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_4.requestFocus()
                mnemonic_input_4.setSelection(mnemonic_input_4.text.toString().length)
            }
        }
        mnemonic_input_4.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_5.requestFocus()
                mnemonic_input_5.setSelection(mnemonic_input_5.text.toString().length)
            }
        }
        mnemonic_input_5.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_6.requestFocus()
                mnemonic_input_6.setSelection(mnemonic_input_6.text.toString().length)
            }
        }
        mnemonic_input_6.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_7.requestFocus()
                mnemonic_input_7.setSelection(mnemonic_input_7.text.toString().length)
            }
        }
        mnemonic_input_7.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_8.requestFocus()
                mnemonic_input_8.setSelection(mnemonic_input_8.text.toString().length)
            }
        }
        mnemonic_input_8.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_9.requestFocus()
                mnemonic_input_9.setSelection(mnemonic_input_9.text.toString().length)
            }
        }
        mnemonic_input_9.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_10.requestFocus()
                mnemonic_input_10.setSelection(mnemonic_input_10.text.toString().length)
            }
        }
        mnemonic_input_10.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_11.requestFocus()
                mnemonic_input_11.setSelection(mnemonic_input_11.text.toString().length)
            }
        }
        mnemonic_input_11.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                mnemonic_input_12.requestFocus()
                mnemonic_input_12.setSelection(mnemonic_input_12.text.toString().length)
            }
        }
        mnemonic_input_12.addTextChangedListener {
            checkInput()
            if (it.toString().isNotEmpty()) {
                requireActivity().hideKeyboard()
            }
        }
        previous.setDelayClickListener { finishActivity() }
        next.setOnClickListener {
            val mnemonics = StringBuilder().apply {
                append(mnemonic_input_1.text.toString()).append(" ")
                append(mnemonic_input_2.text.toString()).append(" ")
                append(mnemonic_input_3.text.toString()).append(" ")
                append(mnemonic_input_4.text.toString()).append(" ")
                append(mnemonic_input_5.text.toString()).append(" ")
                append(mnemonic_input_6.text.toString()).append(" ")
                append(mnemonic_input_7.text.toString()).append(" ")
                append(mnemonic_input_8.text.toString()).append(" ")
                append(mnemonic_input_9.text.toString()).append(" ")
                append(mnemonic_input_10.text.toString()).append(" ")
                append(mnemonic_input_11.text.toString()).append(" ")
                append(mnemonic_input_12.text.toString())
            }
            viewModel.setMnemonics(mnemonics.toString())
        }
        // debug mode data
        if (BuildConfig.DEBUG) {
            title_tv.setDelayClickListener {
                mnemonic_input_1.setText("患")
                mnemonic_input_2.setText("烘")
                mnemonic_input_3.setText("杭")
                mnemonic_input_4.setText("有")
                mnemonic_input_5.setText("六")
                mnemonic_input_6.setText("污")
                mnemonic_input_7.setText("星")
                mnemonic_input_8.setText("吏")
                mnemonic_input_9.setText("踏")
                mnemonic_input_10.setText("师")
                mnemonic_input_11.setText("业")
                mnemonic_input_12.setText("材")
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
            preLoginLiveData.observe(requireActivity()) {
                activity.addFragment(
                    R.id.content_view,
                    RestoreNoUserInfoFragment.newInstance(
                        responseUserIdentity ?: ResponseUserIdentity()
                    )
                )
            }
            getUserInfoLiveData.observe(requireActivity()) { data ->
                activity.addFragment(
                    R.id.content_view,
                    RestoreWithUserInfoFragment.newInstance(
                        data,
                        responseUserIdentity ?: ResponseUserIdentity()
                    )
                )
            }
        }
    }

    private fun checkInput() {
        next.setEnable(
            mnemonic_input_1.text.toString().isNotEmpty() &&
                    mnemonic_input_1.text.toString().isNotEmpty() &&
                    mnemonic_input_2.text.toString().isNotEmpty() &&
                    mnemonic_input_3.text.toString().isNotEmpty() &&
                    mnemonic_input_4.text.toString().isNotEmpty() &&
                    mnemonic_input_5.text.toString().isNotEmpty() &&
                    mnemonic_input_6.text.toString().isNotEmpty() &&
                    mnemonic_input_7.text.toString().isNotEmpty() &&
                    mnemonic_input_8.text.toString().isNotEmpty() &&
                    mnemonic_input_9.text.toString().isNotEmpty() &&
                    mnemonic_input_10.text.toString().isNotEmpty() &&
                    mnemonic_input_11.text.toString().isNotEmpty() &&
                    mnemonic_input_12.text.toString().isNotEmpty()
        )
    }
}