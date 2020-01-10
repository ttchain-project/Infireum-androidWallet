package com.ttchain.walletproject.ui.me.usinglocker

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.goToBiometricEnrolledSetting
import com.ttchain.walletproject.isBiometricEnrolled
import com.ttchain.walletproject.isSupportBiometric
import kotlinx.android.synthetic.main.fragment_using_locker.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class UsingLockerFragment : BaseFragment() {

    companion object {
        fun newInstance() = UsingLockerFragment()
    }

    private val viewModel by sharedViewModel<UsingLockerViewModel>()

    override val layoutId = R.layout.fragment_using_locker

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        initData()
    }

    override fun initView() {
        requireActivity().title = getString(R.string.setting_using_locker)
        bio_container.setOnClickListener {
            when {
                bio_ckb.isChecked -> {
                    bio_ckb.isChecked = false
                }
                else -> {
                    context?.let {
                        when {
                            it.isSupportBiometric() -> {
                                when {
                                    it.isBiometricEnrolled() -> bio_ckb.isChecked = true
                                    else -> activity?.goToBiometricEnrolledSetting()
                                }
                            }
                            else -> {
                                showToast(getString(R.string.authentication_not_support))
                            }
                        }
                    }
                }
            }
            viewModel.updateUserTouchId(bio_ckb.isChecked)
        }
    }

    private fun initData() {
        viewModel.touchIdLiveData.observe(this) {
            bio_ckb.isChecked = it
        }
    }
}