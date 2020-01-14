package com.ttchain.walletproject.ui.ttn.ttntransfer

import android.annotation.SuppressLint
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.ttchain.walletproject.ui.ttn.ttnrecord.TtnRecordActivity
import com.ttchain.walletproject.rx.RxBusTag
import com.ttchain.walletproject.App.Companion.DEFAULT_AMOUNT
import com.ttchain.walletproject.App.Companion.ttnFeeText
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.dialog.StatusDialog
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.enums.QRCodeEnum
import com.ttchain.walletproject.handleAmount
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.me.commonaddress.CommonAddressActivity
import com.ttchain.walletproject.ui.scanner_new.ScannerActivity
import com.ttchain.walletproject.utils.NumberUtils
import com.ttchain.walletproject.utils.RuleUtils
import kotlinx.android.synthetic.main.fragment_ttn_transfer.*
import kotlinx.android.synthetic.main.view_ttn_transfer_confirm.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class TtnTransferFragment : BaseFragment() {

    companion object {
        fun newInstance(id: String) = TtnTransferFragment().apply {
            arguments = bundleOf(TtnTransferActivity._ID to id)
        }
    }

    private val viewModel by viewModel<TtnTransferViewModel>()

    private val bundleValue: String by lazy {
        arguments?.getString(TtnTransferActivity._ID, "") ?: ""
    }

    override val layoutId = R.layout.fragment_ttn_transfer

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
        initData()
    }

    @SuppressLint("SetTextI18n")
    override fun initView() {
        miner_fee_tv.text = ttnFeeText
        miner_fee_fiat_tv.text = "≈${viewModel.fiatSymbol} $DEFAULT_AMOUNT"
        RxBus.getInstance().register<String>(RxBusTag.SELECT_ADDRESS_OK)
            .subscribe({ address ->
                receive_address_et.setText(address)
            }, {
            })
        buttonApply.setOnClickListener {
            viewModel.setValue(
                transfer_et.text.toString(),
                receive_address_et.text.toString(),
                note_et.text.toString()
            )
            viewModel.isValidTransactionInputThenShowDialog()
        }
        confirm_apply.setDelayClickListener {
            showPwdDialog()
        }
        confirm_cancel.setDelayClickListener {
            confirm_view.visibility = View.GONE
            buttonApply.visibility = View.VISIBLE
            cancel.visibility = View.VISIBLE
        }
        transfer_all_btn.setDelayClickListener {
            viewModel.transferAllAmount()
        }
        cancel.setDelayClickListener {
            finishActivity()
        }
        common_address_btn.setDelayClickListener {
            CommonAddressActivity.launch(requireActivity(), true)
        }
    }

    private fun showPwdDialog() {
        val hint = viewModel.getTtnWalletData().pwdHint
        showAuthenticationDialog(hint,
            pwdListener = {
                viewModel.getVerifyIdentityPwdObservable(it)
            },
            bioListener = {
                viewModel.getVerifyIdentityPwdObservable(it)
            })
    }

    private fun initData() {
        viewModel.apply {
            setCoinIdData(bundleValue)
            getBalance()
            fiatTextLiveData.observe(requireActivity()) {
                miner_fee_fiat_tv.text = it
            }
            ttnAddressLiveData.observe(requireActivity()) {
                pay_address_tv.text = it
            }
            isLoading.observe(requireActivity()) {
                if (it) onShowLoading() else onHideLoading()
            }
            throwableMessage.observe(requireActivity()) {
                when {
                    viewModel.isPageFinish -> onShowMessageDialogFinish(it)
                    else -> onShowMessageDialog(it)
                }
            }
            getBalanceLiveData.observe(requireActivity()) { response ->
                var amount = DEFAULT_AMOUNT
                var coinName = ""
                when (coinId) {
                    CoinEnum.TTN.coinId -> if (response.balance.isNotEmpty()) {
                        amount = response.balance.handleAmount(coinId)
                        coinName = CoinEnum.mappingByCoinId(coinId).coinName
                    }
                    CoinEnum.BTCN.coinId -> if (response.token != null && response.token.btcn.isNotEmpty()) {
                        amount = response.token.btcn.handleAmount(coinId)
                        coinName = CoinEnum.mappingByCoinId(coinId).coinName
                    }
                    CoinEnum.USDTN.coinId -> if (response.token != null && response.token.usdtn.isNotEmpty()) {
                        amount = response.token.usdtn.handleAmount(coinId)
                        coinName = CoinEnum.mappingByCoinId(coinId).coinName
                    }
                    CoinEnum.ETHN.coinId -> if (response.token != null && response.token.ethn.isNotEmpty()) {
                        amount = response.token.ethn.handleAmount(coinId)
                        coinName = CoinEnum.mappingByCoinId(coinId).coinName
                    }
                    CoinEnum.EXR.coinId -> if (response.token != null && response.token.exr.isNotEmpty()) {
                        amount = response.token.exr.handleAmount(coinId)
                        coinName = CoinEnum.mappingByCoinId(coinId).coinName
                    }
                    CoinEnum.MCC.coinId -> if (response.token != null && response.token.mcc.isNotEmpty()) {
                        amount = response.token.mcc.handleAmount(coinId)
                        coinName = CoinEnum.mappingByCoinId(coinId).coinName
                    }
                    CoinEnum.DAI1.coinId -> if (response.token != null && response.token.dai1.isNotEmpty()) {
                        amount = response.token.dai1.handleAmount(coinId)
                        coinName = CoinEnum.mappingByCoinId(coinId).coinName
                    }
                    CoinEnum.TUSD1.coinId -> if (response.token != null && response.token.tusd1.isNotEmpty()) {
                        amount = response.token.tusd1.handleAmount(coinId)
                        coinName = CoinEnum.mappingByCoinId(coinId).coinName
                    }
                }
                balanceAmount = amount
                showAmount("( $coinName ${getString(R.string.remain)}：$amount )")
            }
            setCoinIdDataLiveData.observe(requireActivity()) {
                when (coinId) {
                    CoinEnum.TTN.coinId,
                    CoinEnum.BTCN.coinId,
                    CoinEnum.USDTN.coinId,
                    CoinEnum.ETHN.coinId,
                    CoinEnum.EXR.coinId,
                    CoinEnum.MCC.coinId,
                    CoinEnum.DAI1.coinId,
                    CoinEnum.TUSD1.coinId -> {
                        requireActivity().title =
                            it.displayName + " " + getString(R.string.lighten_transfer)
                    }
                }
            }
            isValidTransactionInputThenShowDialog.observe(requireActivity()) { transDecimal ->
                if (transDecimal.toDouble() > 0) {
                    val address = coinTransferBeanViewModel.transReceiptAddress
                    if (address.isNotEmpty()) {
                        if (RuleUtils.getMainCoinId(address) == CoinEnum.TTN.coinId) {
                            if (coinTransferBeanViewModel.transPayAddress == address) {
                                onShowMessageDialog(getString(R.string.error_address_of_pay_as_the_same_receipt))
                            } else {
                                if (NumberUtils.valueOf(balanceAmount).compareTo(transDecimal) != -1) {
                                    if (RuleUtils.isValidCommentLength(coinTransferBeanViewModel.transComment)) {
                                        comment = (coinTransferBeanViewModel.transComment)
                                        val coinName = getDisplayNameByCoinId(coinId)
                                        showConfirmView(coinName)
                                    } else {
                                        onShowMessageDialog(getString(R.string.error_note_too_long))
                                    }
                                } else {
                                    onShowMessageDialog(
                                        coinTransferBeanViewModel.transCoinName + " " + getString(
                                            R.string.fail_amount_not_enough
                                        )
                                    )
                                }
                            }
                        } else {
                            onShowMessageDialog(getString(R.string.error_receipt_address_format))
                        }
                    } else {
                        onShowMessageDialog(getString(R.string.fill_in_receipt_address_p))
                    }
                } else {
                    onShowMessageDialog(getString(R.string.fill_in_amount_p))
                }
            }
            getVerifyIdentityPwdObservableLiveData.observe(requireActivity()) { status ->
                if (status) {
                    // if success
                    performGetTtnNonce()
                } else {
                    // if error
                    onShowMessageDialog(
                        getString(R.string.fail_verify_pwd_and_reinput_p),
                        getString(R.string.g_ok)
                    ) {
                        showPwdDialog()
                    }
                }
            }
            performPostTtnBroadcastLiveData.observe(requireActivity()) { response ->
                onHideLoading()
                if (RuleUtils.isTtnTxId(response)) {
                    performTransactionSucceed(response)
                } else {
                    onShowMessageDialog(getString(R.string.transaction_account_fail))
                }
            }
            performTransactionSucceedLiveData.observe(requireActivity()) {
                showSuccessDialog()
            }
            transferAllAmountLiveData.observe(requireActivity()) { amount ->
                setTransferAmount(NumberUtils.show(amount))
            }
        }
    }

    private fun setTransferAmount(amount: String) {
        transfer_et.setText(amount)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_scan, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.scan -> {
                ScannerActivity.launchForResult(this, ScannerActivity.BASIC, QRCodeEnum.TYPE_IMPORT)
                return true
            }
        }
        return false
    }

    private fun showAmount(ttnAmount: String) {
        transfer_remains_tv.text = ttnAmount
    }

    @SuppressLint("SetTextI18n")
    private fun showConfirmView(coinName: String) {
        confirm_view.visibility = View.VISIBLE
        buttonApply.visibility = View.GONE
        cancel.visibility = View.GONE
        confirm_amount_tv.text = "${transfer_et.text} $coinName"
        confirm_receipt_address_tv.text = receive_address_et.text.toString()
        confirm_pay_address_tv.text = pay_address_tv.text.toString()
        confirm_miner_fee_tv.text = ttnFeeText
        confirm_note_tv.text = note_et.text.toString()
    }

    private fun showSuccessDialog() {
        val statusDialog = StatusDialog()
            .setTitle(getString(R.string.transfer_success_title))
            .setContentString(getString(R.string.transfer_success_detail))
            .setBtnText(
                getString(R.string.back),
                getString(R.string.transfer_success_and_check_record)
            )
            .setLeftBtnRedBg()
            .setOnRightClickListener { finishActivity() }
            .setOnLeftClickListener {
                TtnRecordActivity.launch(requireActivity(), bundleValue)
                finishActivity()
            }
        childFragmentManager.addDialog(statusDialog, "showTransferSuccessDialog")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == RESULT_OK && requestCode == ScannerActivity.REQUEST_CODE) {
            val address = data?.getStringExtra(ScannerActivity.EXTRA_CODE_ADDRESS).orEmpty()
            receive_address_et.setText(address)
        }
    }
}