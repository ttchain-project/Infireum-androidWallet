package com.ttchain.walletproject.ui.create_id

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.enums.AgreementEnum
import com.ttchain.walletproject.model.UserBean
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.agreement.AgreementActivity
import com.ttchain.walletproject.ui.create_id.mnemonics.MnemonicsStartActivity
import kotlinx.android.synthetic.main.fragment_create_id.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class CreateIdFragment : BaseFragment() {

    companion object {
        fun newInstance() = CreateIdFragment()
    }

    private val viewModel by viewModel<CreateIdViewModel>()

    override val layoutId = R.layout.fragment_create_id

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        showToolbar(false)
        agreement_tv.setDelayClickListener {
            launchAgreementActivity()
        }
        create.setOnClickListener {
            viewModel.onCreateClick(
                customEditTextPassword.getText(),
                customEditTextConfirmPassword.getText(),
                customEditTextHint.getText()
            )
        }
        previous.setDelayClickListener {
            finishActivity()
        }
        customEditTextPassword.addTextChangeListener {
            setCreateButtonEnable(!it.isNullOrEmpty())
        }
        customEditTextConfirmPassword.addTextChangeListener {
            setCreateButtonEnable(!it.isNullOrEmpty())
        }
        customEditTextHint.addTextChangeListener {
            setCreateButtonEnable(!it.isNullOrEmpty())
        }
    }

    private fun initData() {
        viewModel.apply {
            isLoading.observe(requireActivity()) {
                if (it) onShowLoading() else onHideLoading()
            }
            throwableMessage.observe(requireActivity()) {
                when {
                    viewModel.isPageFinish -> onShowMessageDialogFinish(it)
                    else -> onShowMessageDialog(it)
                }
            }
            buttonEnable.observe(requireActivity()) {
                create.setEnable(it)
            }
            pwdErrorLiveData.observe(requireActivity()) { msg ->
                customEditTextPassword.setError(msg)
            }
            confirmPwdErrorLiveData.observe(requireActivity()) { msg ->
                customEditTextConfirmPassword.setError(msg)
            }
            noteErrorLiveData.observe(requireActivity()) {
                customEditTextHint.setError(it)
            }
            performCreateAccountRequestLiveData.observe(requireActivity()) {
                if (mUserBean != null)
                    if (it) launchMnemonicsStart(mUserBean ?: UserBean())
            }
        }
    }

    private fun setCreateButtonEnable(result: Boolean) {
        viewModel.setButtonEnable(result)
    }

    private fun launchMnemonicsStart(userData: UserBean) {
        MnemonicsStartActivity.launch(requireActivity(), userData)
    }

    private fun launchAgreementActivity() {
        startActivityForResult(Intent(requireActivity(), AgreementActivity::class.java).apply {
            putExtra(AgreementActivity._ID, AgreementEnum.AGREEMENT.type)
        }, AgreementActivity.REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == AgreementActivity.REQUEST_CODE) {
            agreement_ckb.isChecked =
                data?.getBooleanExtra(AgreementActivity.RESULT_DATA, false) == true
        }
    }
}