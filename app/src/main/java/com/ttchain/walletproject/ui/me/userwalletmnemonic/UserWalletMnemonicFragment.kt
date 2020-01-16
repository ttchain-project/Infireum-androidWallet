package com.ttchain.walletproject.ui.me.userwalletmnemonic

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.observe
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.performCopyString
import kotlinx.android.synthetic.main.fragment_user_wallet_mnemonic.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserWalletMnemonicFragment : BaseFragment() {

    companion object {
        fun newInstance() = UserWalletMnemonicFragment().apply {

        }
    }

    private var mnemonic = ""

    override val layoutId = R.layout.fragment_user_wallet_mnemonic

    private val viewModel by viewModel<UserWalletMnemonicViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
        initData()
    }

    override fun initView() {
        requireActivity().title = getString(R.string.user_wallet_mnemonic_title)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_copy, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.copy -> {
                mnemonic.performCopyString(requireContext())
                return true
            }
        }
        return false
    }


    private fun initData() {
        viewModel.apply {
            getMnemonicRx()
            getMnemonicRxLiveData.observe(requireActivity()) {
                mnemonic = it
                textViewMnemonics.text = mnemonic
                val mnemonicList = mnemonic.split(" ")
//                mnemonicList.forEachIndexed { index, s ->
//                    when (index) {
//                        0 -> {
//                            textViewMnemonic1.text = s
//                        }
//                        1 -> {
//                            textViewMnemonic2.text = s
//                        }
//                        2 -> {
//                            textViewMnemonic3.text = s
//                        }
//                        3 -> {
//                            textViewMnemonic4.text = s
//                        }
//                        4 -> {
//                            textViewMnemonic5.text = s
//                        }
//                        5 -> {
//                            textViewMnemonic6.text = s
//                        }
//                        6 -> {
//                            textViewMnemonic7.text = s
//                        }
//                        7 -> {
//                            textViewMnemonic8.text = s
//                        }
//                        8 -> {
//                            textViewMnemonic9.text = s
//                        }
//                        9 -> {
//                            textViewMnemonic10.text = s
//                        }
//                        10 -> {
//                            textViewMnemonic11.text = s
//                        }
//                        11 -> {
//                            textViewMnemonic12.text = s
//                        }
//                    }
//                }
            }
        }
    }
}