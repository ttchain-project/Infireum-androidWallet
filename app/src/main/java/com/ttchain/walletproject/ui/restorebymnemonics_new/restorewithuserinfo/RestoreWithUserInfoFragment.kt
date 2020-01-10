package com.ttchain.walletproject.ui.restorebymnemonics_new.restorewithuserinfo

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.ui.restorebymnemonics_new.RestoreByMnemonicsActivity
import com.ttchain.walletproject.ui.restorebymnemonics_new.restoremnemonicswalletlist.RestoreWalletListFragment
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addFragment
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.model.PersonalInfo
import com.ttchain.walletproject.model.ResponseUserIdentity
import com.ttchain.walletproject.setDelayClickListener
import kotlinx.android.synthetic.main.fragment_restore_with_user_info.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class RestoreWithUserInfoFragment : BaseFragment() {

    companion object {
        fun newInstance(personalInfo: PersonalInfo, responseUserIdentity: ResponseUserIdentity) =
            RestoreWithUserInfoFragment().apply {
                arguments =
                    bundleOf(
                        RestoreByMnemonicsActivity.BUNDLE_PERSONAL_INFO_MODEL to personalInfo,
                        RestoreByMnemonicsActivity.BUNDLE_RESPONSE_USER_IDENTITY to responseUserIdentity
                    )
            }
    }

    private val activity: RestoreByMnemonicsActivity by lazy {
        requireContext() as RestoreByMnemonicsActivity
    }

    private val bundlePersonalInfo: PersonalInfo by lazy {
        arguments?.getSerializable(RestoreByMnemonicsActivity.BUNDLE_PERSONAL_INFO_MODEL) as PersonalInfo
    }

    private val bundleValueResponseUserIdentity: ResponseUserIdentity by lazy {
        arguments?.getSerializable(RestoreByMnemonicsActivity.BUNDLE_RESPONSE_USER_IDENTITY) as ResponseUserIdentity
    }

    private val viewModel by viewModel<RestoreWithUserInfoViewModel>()

    override val layoutId = R.layout.fragment_restore_with_user_info

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
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
                bundlePersonalInfo.nickName,
                customEditTextPassword.getText(),
                customEditTextConfirmPassword.getText(),
                customEditTextHint.getText()
            )
        }
    }

    private fun initData() {
        viewModel.apply {
            responseUserIdentity = bundleValueResponseUserIdentity
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
            customEditTextPassword.getText().isNotEmpty() &&
                    customEditTextConfirmPassword.getText().isNotEmpty() &&
                    customEditTextConfirmPassword.getText().isNotEmpty()
        )
    }
}