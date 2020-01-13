package com.ttchain.walletproject.ui.coin_transfer

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.observe
import com.git4u.tt_wallet_android.rx.RxBusTag
import com.ttchain.walletproject.R
import com.ttchain.walletproject.addDialog
import com.ttchain.walletproject.base.BaseFragment
import com.ttchain.walletproject.dialog.WarningDialog
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.enums.QRCodeEnum
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.rx.RxBus
import com.ttchain.walletproject.setDelayClickListener
import com.ttchain.walletproject.showNumber
import com.ttchain.walletproject.ui.me.commonaddress.CommonAddressActivity
import com.ttchain.walletproject.ui.scanner_new.ScannerActivity
import com.ttchain.walletproject.utils.NumberUtils
import kotlinx.android.synthetic.main.fragment_coin_transfer.*
import kotlinx.android.synthetic.main.view_normal_transfer_confirm.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.math.BigDecimal

class CoinTransferFragment : BaseFragment() {

    companion object {
        fun newInstance(
            coinId: String,
            receiptAddress: String,
            amount: String
        ): CoinTransferFragment = CoinTransferFragment().apply {
            arguments = bundleOf(
                CoinTransferActivity._ID to coinId,
                CoinTransferActivity._ADDRESS to receiptAddress,
                CoinTransferActivity._AMOUNT to amount
            )
        }
    }

    private val viewModel by viewModel<CoinTransferViewModel>()

    private var menu: Menu? = null

    private val bundleCoinId: String by lazy {
        arguments?.getString(CoinTransferActivity._ID, "") ?: ""
    }

    private val bundleReceiptAddressValue: String by lazy {
        arguments?.getString(CoinTransferActivity._ADDRESS, "") ?: ""
    }

    private val bundleAmountValue: String by lazy {
        arguments?.getString(CoinTransferActivity._AMOUNT, "") ?: ""
    }

    private var onMinerFeeSatItemGasItemListener:
            MinerFeeSatItem.OnMinerFeeSatItemGasItemListener? = null

    override val layoutId = R.layout.fragment_coin_transfer

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        initView()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_scan, menu)
        this.menu = menu
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.scan -> {
                ScannerActivity.launch(
                    requireActivity(),
                    ScannerActivity.BASIC,
                    QRCodeEnum.TYPE_WALLET
                )
                return true
            }
        }
        return false
    }

    override fun initView() {
        RxBus.getInstance().register<String>(RxBusTag.SELECT_ADDRESS_OK)
            .subscribe {
                setReceiptAddress(it)
            }
        RxBus.getInstance().register<String>(RxBusTag.SCANNER_ADDRESS_TAG)
            .subscribe({
                setReceiptAddress(it)
            }, {
            })
        RxBus.getInstance().register<String>(RxBusTag.SCANNER_AMOUNT_TAG)
            .subscribe({
                setAmountItemContent(it)
            }, {
            })
        RxBus.getInstance().register<Int>(RxBusTag.SELECT_WALLET_OK)
            .map { walletId ->
                viewModel.setSelectedWalletId(walletId)
                true
            }
            .subscribe {
                viewModel.performUpdateSelectedWalletData()
            }
        RxBus.getInstance().register<MinerFeeEditBean>(RxBusTag.UPDATE_MINER_FEE_EDIT_BEAN_OK)
            .map {
                viewModel.minerFeeModel.minerFeeEditBean = it
                return@map it
            }
            .subscribe({
                setMinerFeeGasItemBean(it)
                setMinerFeeSatItemGas(it)
            }, {
            })
        viewModel.apply {
            setTransCoinId(bundleCoinId)
            setReceiptAddress(bundleReceiptAddressValue)
            onViewCreate()
            next.setOnClickListener {
                onClickNext()
            }

            cancel.setDelayClickListener {
                finishActivity()
            }
            confirm_apply.setOnClickListener {
                showVerifyPwdDialog()
            }
            confirm_cancel.setDelayClickListener {
                backToModifyView(baseCoinTransferModel.getBaseCoinTransferBean())
            }
            initAmountItem(createAmountBean())
            initReceiptAddressItem(createReceiptAddressBean())
            initMinerFeeHeaderItem(createMinerFeeHeaderBean())
            initCommentItem(createCommentBean())
            isLoading.observe(requireActivity()) {
                if (it) onShowLoading() else onHideLoading()
            }
            throwableMessage.observe(requireActivity()) {
                when {
                    viewModel.isPageFinish -> onShowMessageDialogFinish(it)
                    else -> onShowMessageDialog(it)
                }
            }
            btcTransferExceptionLiveData.observe(requireActivity()) {
                val warningDialog = WarningDialog()
                    .setTitle(it.titleText)
                    .setContent(it.messageText)
                    .setBtnText(getString(R.string.g_confirm), null)
                childFragmentManager.addDialog(warningDialog, "showWarningDialog")
            }
            minerFeeSatItem.observe(requireActivity()) {
                initMinerFeeSatItem(it)
            }
            minerFeeGasItem.observe(requireActivity()) {
                initMinerFeeGasItem(it)
            }
            minerFeeHeaderItemAmountText.observe(requireActivity()) {
                setMinerFeeHeaderItemAmountText(it)
            }
            showMinerFeeItemResult.observe(requireActivity()) {
                showMinerFeeItem(it)
                switchMinerFeeHeaderIcon(it)
            }
            minerFeeGasText.observe(requireActivity()) {
                setMinerFeeGasText(it)
            }
            minerFeeSatItemGas.observe(requireActivity()) {
                setMinerFeeSatItemGas(it)
            }
            minerFeeGasItemGasPriceRange.observe(requireActivity()) {
                setMinerFeeGasItemGasPriceRange(it)
            }
            coinTransferBean.observe(requireActivity()) {
                setCoinTransferBean(it)
            }
            fiatEquals.observe(requireActivity()) {
                //舊版UI會估轉帳金額大約多少法幣
            }
            amountItemContent.observe(requireActivity()) {
                setAmountItemContent(it)
            }
            isLaunchCommonAddressActivity.observe(requireActivity()) {
                if (it) launchCommonAddressActivity()
            }
            confirmView.observe(requireActivity()) {
                showConfirmView(it)
            }
            verifyUerPwdLiveData.observe(requireActivity()) { status ->
                if (status) {
                    verifyUserInputPwdSuccess()
                } else {
                    onShowMessageDialog(getString(R.string.fail_verify_pwd_and_reinput_p)) {
                        showVerifyPwdDialog()
                    }
                }
            }
            showToastText.observe(requireActivity()) {
                showToast(it)
            }
            isViewFinished.observe(requireActivity()) {
                if (it) finishActivity()
            }
        }
        viewModel.mReceiptAddress.let {
            it.isNotEmpty().run {
                if (this) setReceiptAddress(it)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        RxBus.getInstance().register<String>(RxBusTag.UPDATE_PAYMENT_DETAIL_DIALOG_INPUT_COMMENT)
            .subscribe({
                viewModel.baseCoinTransferModel.getBaseCoinTransferBean().transComment = it
                setComment(it)
            }, {
            })
    }

    override fun onPause() {
        super.onPause()
        RxBus.getInstance().unregister(RxBusTag.UPDATE_PAYMENT_DETAIL_DIALOG_INPUT_COMMENT)
    }

    override fun onDestroy() {
        super.onDestroy()
        RxBus.getInstance().unregister(RxBusTag.SELECT_ADDRESS_OK)
        RxBus.getInstance().unregister(RxBusTag.SELECT_WALLET_OK)
        RxBus.getInstance().unregister(RxBusTag.UPDATE_MINER_FEE_EDIT_BEAN_OK)
        RxBus.getInstance().unregister(RxBusTag.SCANNER_ADDRESS_TAG)
        RxBus.getInstance().unregister(RxBusTag.SCANNER_AMOUNT_TAG)
        viewModel.baseCoinTransferModel.coinTransferBean = null
    }

    private fun initAmountItem(bean: TransCoinItemBean) {
        transfer_et.addTextChangedListener(bean.inputTextChangedListener)
        if (bundleAmountValue.isNotEmpty()) {
            transfer_et.setText(bundleAmountValue)
        }
        transfer_all_btn.setDelayClickListener {
            viewModel.transferAllCoin()
        }
    }

    private fun setAmountItemContent(content: String) {
        transfer_et.setText(content)
    }

    private fun initReceiptAddressItem(bean: TransCoinItemBean) {
        val hint = when {
            viewModel.baseCoinTransferModel.isEthMainCoinType() ->
                getString(R.string.hint_fill_in_valid_eth_address)
            viewModel.baseCoinTransferModel.isBtcMainCoinType() ->
                getString(R.string.hint_fill_in_valid_bth_address)
            else -> ""
        }
        receipt_et.hint = hint
        receipt_et.addTextChangedListener(bean.inputTextChangedListener)
        if (bundleReceiptAddressValue.isNotEmpty()) {
            receipt_et.setText(bundleReceiptAddressValue)
        }
        common_address_btn.setDelayClickListener {
            launchCommonAddressActivity()
        }
    }

    private fun initMinerFeeHeaderItem(bean: TransCoinItemBean) {
        miner_fee_header_container.setOnClickListener(bean.subNameCallListener)
    }

    private fun initMinerFeeGasItem(bean: MinerFeeGasItemBean) {
        seekBar.setOnSeekBarChangeListener(bean.seekBarChangeListener)
    }

    private fun initMinerFeeSatItem(bean: MinerFeeSatItemBean) {
        onMinerFeeSatItemGasItemListener = bean.onMinerFeeSatItemGasItemListener
        sat_custom_et.addTextChangedListener(bean.inputCustomGasWatcher)
        sat_regular_container.setOnClickListener { updateCheckedDrawableView(0) }
        sat_priority_container.setOnClickListener { updateCheckedDrawableView(1) }
        sat_custom_container.setOnClickListener { updateCheckedDrawableView(2) }
        sat_custom_et.setOnTouchListener { _, _ ->
            updateCheckedDrawableView(2)
            false
        }
    }

    private fun updateCheckedDrawableView(view: Int) {
        sat_regular_arrow_iv.visibility = View.INVISIBLE
        sat_priority_arrow_iv.visibility = View.INVISIBLE
        sat_custom_arrow_iv.visibility = View.INVISIBLE
        when (view) {
            0 -> {
                sat_regular_arrow_iv.visibility = View.VISIBLE
                onMinerFeeSatItemGasItemListener?.onCheckedRegular()
            }
            1 -> {
                sat_priority_arrow_iv.visibility = View.VISIBLE
                onMinerFeeSatItemGasItemListener?.onCheckedPriority()
            }
            2 -> {
                sat_custom_arrow_iv.visibility = View.VISIBLE
                onMinerFeeSatItemGasItemListener?.onCheckedCustom(sat_custom_et.text.toString())
            }
            else -> {
                sat_regular_arrow_iv.visibility = View.VISIBLE
                onMinerFeeSatItemGasItemListener?.onCheckedRegular()
            }
        }
    }

    private fun initCommentItem(bean: TransCoinItemBean) {
        note_et.addTextChangedListener(bean.inputTextChangedListener)
    }

    private fun setMinerFeeHeaderItemAmountText(text: String) {
        miner_fee_amount_tv.text = text
    }

    private fun setCoinTransferBean(bean: CoinTransferBean) {
        requireActivity().title = "${bean.viewTitleName} ${getString(R.string.transaction_account)}"
        transfer_available_tv.text = bean.viewCoinRemindAmount.format(getString(R.string.remain))
        pay_wallet_tv.text = bean.viewTransPayWalletName
        pay_address_tv.text = bean.transPayAddress
    }

    private fun setMinerFeeGasItemGasPriceRange(bean: MinerFeeEditBean) {
        seekBar.max = bean.maxGasPriceEth.divide(BigDecimal.ONE, 0, BigDecimal.ROUND_DOWN).toInt()
        seekBar.progress =
            bean.suggestGasPriceEth.divide(BigDecimal.ONE, 0, BigDecimal.ROUND_DOWN).toInt()
    }

    private fun setMinerFeeGasItemBean(bean: MinerFeeEditBean) {
        seekBar.progress = bean.seekProgress
    }

    private fun setMinerFeeGasText(text: String) {
        gas_text.text = text
    }

    @SuppressLint("SetTextI18n")
    private fun setMinerFeeSatItemGas(bean: MinerFeeEditBean) {
        sat_regular_amount_tv.text =
            "${NumberUtils.show(
                NumberUtils.valueOf(bean.regularPriceBtc, 8), showNumber
            )} ${CoinEnum.BTC.inputName}"
        sat_priority_amount_tv.text =
            "${NumberUtils.show(
                NumberUtils.valueOf(bean.priorityPriceBtc, 8), showNumber
            )} ${CoinEnum.BTC.inputName}"
        sat_custom_et.setText(NumberUtils.formatInputAmount(bean.customPriceBtc))
        sat_regular_arrow_iv.visibility =
            if (bean.isRegularPriceBtcChecked) View.VISIBLE else View.INVISIBLE
        sat_priority_arrow_iv.visibility =
            if (bean.isPriorityPriceBtcChecked) View.VISIBLE else View.INVISIBLE
        sat_custom_arrow_iv.visibility =
            if (bean.isCustomPriceBtcChecked) View.VISIBLE else View.INVISIBLE
    }

    private fun showMinerFeeItem(show: Boolean) {
        when (bundleCoinId) {
            CoinEnum.BTC.coinId, CoinEnum.USDT.coinId ->
                when {
                    show -> miner_fee_sat_container.visibility = View.VISIBLE
                    else -> miner_fee_sat_container.visibility = View.GONE
                }
            else ->
                when {
                    show -> miner_fee_gas_container.visibility = View.VISIBLE
                    else -> miner_fee_gas_container.visibility = View.GONE
                }
        }
    }

    private fun switchMinerFeeHeaderIcon(show: Boolean) {
        when {
            show -> miner_fee_arrow_iv.setImageResource(R.mipmap.btn_close)
            else -> miner_fee_arrow_iv.setImageResource(R.mipmap.btn_open)
        }
    }

    private fun launchCommonAddressActivity() {
        CommonAddressActivity.launch(requireActivity(), true)
    }

    private fun setReceiptAddress(address: String) {
        receipt_et.setText(address)
    }

    private fun setComment(comment: String) {
        note_et.setText(comment)
    }

    @SuppressLint("SetTextI18n")
    private fun showConfirmView(coinName: String) {
        confirm_view.visibility = View.VISIBLE
        next.visibility = View.GONE
        cancel.visibility = View.GONE
        confirm_amount_tv.text = "${transfer_et.text} $coinName"
        confirm_receipt_address_tv.text = receipt_et.text.toString()
        confirm_pay_address_tv.text = pay_address_tv.text.toString()
        confirm_miner_fee_tv.text = miner_fee_amount_tv.text.toString()
        confirm_note_tv.text = note_et.text.toString()
        requireActivity().title = coinName + " " + getString(R.string.transfer_confirm)
        menu?.findItem(R.id.scan)?.isVisible = false
    }

    private fun backToModifyView(bean: CoinTransferBean) {
        confirm_view.visibility = View.GONE
        next.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE
        requireActivity().title = bean.viewTitleName
        menu?.findItem(R.id.scan)?.isVisible = true
    }

    private fun showVerifyPwdDialog() {
        val walletId = viewModel.baseCoinTransferModel.walletSelectedId
        val hint = viewModel.baseCoinTransferModel.getSelectedWalletData().pwdHint
        showAuthenticationDialog(hint,
            pwdListener = {
                viewModel.verifyUserPwdObservable(walletId, it)
            },
            bioListener = {
                viewModel.verifyUserPwdObservable(walletId, it)
            })
    }
}
