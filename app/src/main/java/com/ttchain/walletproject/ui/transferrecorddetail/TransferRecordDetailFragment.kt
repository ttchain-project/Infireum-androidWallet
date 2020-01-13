package com.ttchain.walletproject.ui.transferrecorddetail

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import com.ttchain.walletproject.R
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.model.RecordBean
import com.ttchain.walletproject.performCopyString
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.ui.webview.WebViewActivity
import com.ttchain.walletproject.utils.RuleUtils
import kotlinx.android.synthetic.main.fragment_transfer_record_detail.*

class TransferRecordDetailFragment : BaseFragment() {

    companion object {
        fun newInstance(recordBean: RecordBean) = TransferRecordDetailFragment().apply {
            arguments = bundleOf(TransferRecordDetailActivity._RECORD to recordBean)
        }
    }

    private val bundleValue: RecordBean by lazy {
        arguments?.getSerializable(TransferRecordDetailActivity._RECORD) as RecordBean
    }

    override val layoutId = R.layout.fragment_transfer_record_detail

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun initView() {
        if (bundleValue.status == GlobalConstant.TRANSACTION_STATE_FAIL) {
            status_tv.text = getString(R.string.transaction_fail)
            status_iv.setImageResource(R.mipmap.wallet_receipt_failure)
        } else {
            if (bundleValue.amountText.startsWith("+")) {
                status_tv.text = getString(R.string.transaction_record_receipt_success)
            } else if (bundleValue.amountText.startsWith("-")) {
                status_tv.text = getString(R.string.transaction_success)
            }
        }

        if (bundleValue.amountText.startsWith("+")) {
            val amounts = bundleValue.amountText.replace("+", "")
            amount_tv.text = amounts
            amount_title_tv.text = getString(R.string.transaction_record_receipt_amount)
            requireActivity().title =
                bundleValue.coinDisplayName + " " + getString(R.string.transaction_record_receipt_record)
        } else if (bundleValue.amountText.startsWith("-")) {
            val amounts = bundleValue.amountText.replace("-", "")
            amount_tv.text = amounts
            amount_title_tv.text = getString(R.string.transaction_record_pay_amount)
            requireActivity().title =
                bundleValue.coinDisplayName + " " + getString(R.string.transaction_record_pay_record)
        }

        when {
            RuleUtils.isChainType(bundleValue.address, ChainType.TTN) ->
                bottom_view.setBackgroundResource(R.drawable.bg_blue_radius_8_bottom)
            else ->
                bottom_view.setBackgroundResource(R.drawable.bg_green_radius_8_bottom)
        }

        date_tv.text = bundleValue.date
        miner_fee_tv.text = bundleValue.minerFeeText
        receipt_address_tv.text = bundleValue.toAddress
        payment_address_tv.text = bundleValue.fromAddress
        note_tv.text = bundleValue.comment
        txid_tv.text = bundleValue.txid
        block_no_tv.text = bundleValue.block

        receipt_address_btn.setDelayClickListener {
            bundleValue.toAddress.performCopyString(requireContext())
        }
        payment_address_btn.setDelayClickListener {
            bundleValue.fromAddress.performCopyString(requireContext())
        }
        txid_btn.setDelayClickListener {
            bundleValue.txid?.performCopyString(requireContext())
        }
        look_up_btn.setDelayClickListener {
            WebViewActivity.launch(requireActivity(), bundleValue.superLinkUrl)
        }
    }
}