package com.ttchain.walletproject.ui.restorebymnemonics_new.restorenouserinfo

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.ui.restorebymnemonics_new.RestoreByMnemonicsActivity
import com.ttchain.walletproject.ui.restorebymnemonics_new.restoremnemonicswalletlist.RestoreWalletListFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addFragment
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.lazy
import com.ttchain.walletproject.model.ResponseUserIdentity
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_restore_with_user_info.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class RestoreNoUserInfoFragment : BaseFragment() {

    companion object {
        fun newInstance(responseUserIdentity: ResponseUserIdentity) =
            RestoreNoUserInfoFragment().apply {
                arguments =
                    bundleOf(
                        RestoreByMnemonicsActivity.BUNDLE_RESPONSE_USER_IDENTITY to responseUserIdentity
                    )
            }
    }

    private val activity: RestoreByMnemonicsActivity by lazy {
        requireContext() as RestoreByMnemonicsActivity
    }

    private val bundleValueResponseUserIdentity: ResponseUserIdentity by lazy(
        RestoreByMnemonicsActivity.BUNDLE_RESPONSE_USER_IDENTITY
    )

    private val viewModel by viewModel<RestoreNoUserInfoViewModel>()

    override val layoutId = R.layout.fragment_restore_with_user_info

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        customEditTextNickName.visibility = View.VISIBLE
        linearLayoutPolicy.visibility = View.VISIBLE
        customEditTextNickName.addTextChangeListener {
            checkButtonEnable()
        }
        customEditTextPassword.addTextChangeListener {
            checkButtonEnable()
        }
        customEditTextConfirmPassword.addTextChangeListener {
            checkButtonEnable()
        }
        customEditTextHint.addTextChangeListener {
            checkButtonEnable()
        }
        previous.setDelayClickListener {
            finishActivity()
        }
        next.setOnClickListener {
            viewModel.onRestoreClick(
                customEditTextNickName.getText(),
                customEditTextPassword.getText(),
                customEditTextConfirmPassword.getText(),
                customEditTextHint.getText()
            )
        }
    }

    private fun initData() {
        viewModel.apply {
            responseUserIdentity = bundleValueResponseUserIdentity
            nameErrorLiveData.observe(requireActivity()) {
                customEditTextNickName.setError(it)
            }
            pwdErrorLiveData.observe(requireActivity()) {
                customEditTextPassword.setError(it)
            }
            confirmPasswordErrorLiveData.observe(requireActivity()) {
                customEditTextConfirmPassword.setError(it)
            }
            hintPasswordErrorLiveData.observe(requireActivity()) {
                customEditTextHint.setError(it)
            }
            performRestoreIdentityLiveData.observe(requireActivity()) {
                onHideLoading()
                if (it) {
                    activity.addFragment(
                        R.id.content_view,
                        RestoreWalletListFragment.newInstance()
                    )
                } else {
                    onShowMessageDialog(getString(R.string.fail_restore_identity))
                }
            }
            isLoading.observe(requireActivity()) {
                if (it) onShowLoading() else onHideLoading()
            }
        }
    }

    private fun checkButtonEnable() {
        next.setEnable(
            customEditTextNickName.getText().isNotEmpty() &&
                    customEditTextPassword.getText().isNotEmpty() &&
                    customEditTextConfirmPassword.getText().isNotEmpty() &&
                    customEditTextHint.getText().isNotEmpty()
        )
    }
}