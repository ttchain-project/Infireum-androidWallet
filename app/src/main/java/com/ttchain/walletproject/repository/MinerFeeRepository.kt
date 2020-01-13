package com.ttchain.walletproject.repository

import android.text.Editable
import android.text.TextWatcher
import android.widget.CompoundButton
import android.widget.SeekBar
import com.google.gson.Gson
import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.isZero
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.utils.RuleUtils
import java.math.BigDecimal
import java.math.RoundingMode

class MinerFeeRepository(private val apiHelper: ApiHelper) : BaseRepository() {
    var needPayload = false

    var selectedWalletId: Int = -1

    var selectedChainType: Int = ChainType.NONE.value
        set(value) {
            field = value
            minerFeeEditBean.chainType = value
        }

    val minerFeeGasItemBean by lazy {
        MinerFeeGasItemBean(
            -1,
            getEthAdvancedCheckListener(),
            getEthSeekBarChangeListener(),
            getEthInputCustomGasPriceWatcher(),
            getEthInputCustomGasWatcher()
        )
    }

    val minerFeeSatItemBean by lazy {
        MinerFeeSatItemBean(
            -1,
            getBtcOnCheckedListener(),
            getBtcInputCustomGasWatcher()
        )
    }

    var minerFeeEditBean: MinerFeeEditBean = MinerFeeEditBean()

    fun saveEthMinerFeeFromApiToString(string: String) {
        apiHelper.saveEthMinerFeeFromApi(string)
    }

    fun getEthMinerFeeFromApiString(): String {
        return apiHelper.ethMinerFeeFromApi
    }

    fun setEthMinerFeeFromApiString() {
        val fee = getEthMinerFeeFromApiString()
        if (fee.isNotEmpty()) {
            val data = Gson().fromJson(fee, ApiETHFeeData::class.java)
            setEthMinerFeeFromApi(
                BigDecimal(data.suggestGasPrice),
                BigDecimal(data.maxGasPrice),
                BigDecimal(data.minGasPrice)
            )
        }
    }

    fun setEthMinerFeeFromApi(
        suggest: BigDecimal,
        maxGasPrice: BigDecimal,
        minGasPrice: BigDecimal
    ) {
        minerFeeEditBean.suggestGasPriceEth = suggest
        minerFeeEditBean.maxGasPriceEth = maxGasPrice
        minerFeeEditBean.minGasPriceEth = minGasPrice
    }

    fun saveBtcMinerFeeFromApiToString(string: String) {
        apiHelper.saveBtcMinerFeeFromApi(string)
    }

    fun getBtcMinerFeeFromApiString(): String {
        return apiHelper.btcMinerFeeFromApi
    }

    fun setBtcMinerFeeFromApiString() {
        val fee = getBtcMinerFeeFromApiString()
        if (fee.isNotEmpty()) {
            val data = Gson().fromJson(fee, ApiBTCFeeData::class.java)
            setBtcMinerFeeFromApi(
                BigDecimal(data.regular.toString()).multiply(BigDecimal("1E+8")),
                BigDecimal(data.priority.toString()).multiply(BigDecimal("1E+8"))
            )
        }
    }

    fun setBtcMinerFeeFromApi(regular: BigDecimal, priority: BigDecimal) {

        minerFeeEditBean.regularPriceBtc =
            regular.multiply(225.toBigDecimal()).setScale(-4, RoundingMode.UP)
        minerFeeEditBean.priorityPriceBtc =
            priority.multiply(225.toBigDecimal()).setScale(-4, RoundingMode.UP)

//        minerFeeEditBean.regularPriceBtc = regular
//        minerFeeEditBean.priorityPriceBtc = priority

//        minerFeeEditBean.regularPriceBtc = BigDecimal(BuildConfig.BTC_MINER_FEE_REGULAR)
//        minerFeeEditBean.priorityPriceBtc = BigDecimal(BuildConfig.BTC_MINER_FEE_PRIORITY)
    }

    var minerFeeModelListener: MinerFeeModelListener? = null

    interface MinerFeeModelListener {
        fun onResultAdvancedStatusChanged(status: Boolean)

        fun onResultMinerFeeGasGwei(decimal: BigDecimal)

        fun onResultMinerFeeGasGweiToCoinAmount(decimal: BigDecimal)

        fun onResultMinerFeeFormulaText(text: String)

        fun onResultInputCustomGasPrice(decimal: BigDecimal)

        fun onResultInputCustomGas(decimal: BigDecimal)
    }

    var minerFeeModelCustomBtcGasListener: MinerFeeModelCustomBtcGasListener? = null

    interface MinerFeeModelCustomBtcGasListener {
        fun onResultMinerFeeBtcGas(decimal: BigDecimal)
    }

    fun getMinerFeeToCoinAmount(
        gasPrice: BigDecimal,
        gas: BigDecimal = if (needPayload) minerFeeEditBean.payloadGasEth else minerFeeEditBean.defaultGasEth
    ): BigDecimal {
        return gas
            .multiply(gasPrice)
            .multiply("1E+9".toBigDecimal())
            .multiply("1E-18".toBigDecimal())
    }

    private fun getEthAdvancedCheckListener(): CompoundButton.OnCheckedChangeListener {
        return CompoundButton.OnCheckedChangeListener { _, status ->
            minerFeeEditBean.isAdvanced = status
            minerFeeModelListener?.onResultAdvancedStatusChanged(status)
        }
    }

    private fun getEthSeekBarChangeListener(): SeekBar.OnSeekBarChangeListener {
        return object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, p2: Boolean) {
                val min = minerFeeEditBean.minGasPriceEth
                    .divide(BigDecimal.ONE, 0, BigDecimal.ROUND_DOWN)
                    .intValueExact()
                if (progress < min) {
                    seekBar?.progress = min
                }

                seekBar?.progress?.let {
                    val seekResult = seekBar.progress.toBigDecimal()
                        .divide(minerFeeEditBean.gasRateEth, 2, BigDecimal.ROUND_DOWN)

                    val gas = when (minerFeeEditBean.transCoinId) {
                        CoinEnum.ETH.coinId, CoinEnum.ETHN.coinId -> {
                            if (needPayload) {
                                minerFeeEditBean.payloadGasEth
                            } else {
                                minerFeeEditBean.defaultGasEth
                            }
                        }
                        else -> minerFeeEditBean.defaultGasNonEth
                    }
                    val coinAmount = getMinerFeeToCoinAmount(seekResult, gas)

                    minerFeeModelListener?.onResultMinerFeeGasGwei(seekResult)
                    minerFeeEditBean.userSeekGasPriceEth = seekResult
                    minerFeeEditBean.seekProgress = seekBar.progress

                    minerFeeModelListener?.onResultMinerFeeGasGweiToCoinAmount(coinAmount)
                    minerFeeEditBean.minerFeeCoinAmount = coinAmount
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        }
    }

    private fun getEthInputCustomGasPriceWatcher(): TextWatcher {
        return object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                p0?.toString()?.let {
                    if (it.isNotEmpty()) {
                        if (it.startsWith(".")) {
                            minerFeeEditBean.customGasPriceEth = "0$it".toBigDecimal()
                        } else {
                            minerFeeEditBean.customGasPriceEth = it.toBigDecimal()
                        }
                    } else {
                        minerFeeEditBean.customGasPriceEth = "0".toBigDecimal()
                    }
                    minerFeeModelListener?.onResultInputCustomGasPrice(minerFeeEditBean.customGasPriceEth)
                }
            }
        }
    }

    private fun getEthInputCustomGasWatcher(): TextWatcher {
        return object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                p0?.toString()?.let {
                    if (it.isNotEmpty()) {
                        if (it.startsWith(".")) {
                            minerFeeEditBean.customGasEth = "0$it".toBigDecimal()
                        } else {
                            minerFeeEditBean.customGasEth = it.toBigDecimal()
                        }
                    } else {
                        minerFeeEditBean.customGasEth = "0".toBigDecimal()
                    }
                    minerFeeModelListener?.onResultInputCustomGas(minerFeeEditBean.customGasEth)
                }
            }
        }
    }

    private fun getBtcOnCheckedListener(): MinerFeeSatItem.OnMinerFeeSatItemGasItemListener {
        return object : MinerFeeSatItem.OnMinerFeeSatItemGasItemListener {
            override fun onCheckedRegular() {
                minerFeeEditBean.isRegularPriceBtcChecked = true
                minerFeeModelCustomBtcGasListener?.onResultMinerFeeBtcGas(minerFeeEditBean.regularPriceBtc)
            }

            override fun onCheckedPriority() {
                minerFeeEditBean.isPriorityPriceBtcChecked = true
                minerFeeModelCustomBtcGasListener?.onResultMinerFeeBtcGas(minerFeeEditBean.priorityPriceBtc)
            }

            override fun onCheckedCustom(string: String) {
                minerFeeEditBean.isCustomPriceBtcChecked = true
                string.apply {
                    if (string.isNotEmpty()) {
                        if (string.startsWith(".")) {
                            minerFeeEditBean.customPriceBtc =
                                "0$string".toBigDecimal().multiply("1E8".toBigDecimal())
                        } else {
                            minerFeeEditBean.customPriceBtc =
                                string.toBigDecimal().multiply("1E8".toBigDecimal())
                        }
                    } else {
                        minerFeeEditBean.customPriceBtc = "0".toBigDecimal()
                    }
                    minerFeeModelCustomBtcGasListener?.onResultMinerFeeBtcGas(minerFeeEditBean.customPriceBtc)
                }
            }
        }
    }

    private fun getBtcInputCustomGasWatcher(): TextWatcher {
        return object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                p0?.toString()?.let {
                    if (it.isNotEmpty()) {
                        if (it.startsWith(".")) {
                            minerFeeEditBean.customPriceBtc =
                                "0$it".toBigDecimal().multiply("1E8".toBigDecimal())
                        } else {
                            minerFeeEditBean.customPriceBtc =
                                it.toBigDecimal().multiply("1E8".toBigDecimal())
                        }
                    } else {
                        minerFeeEditBean.customPriceBtc = "0".toBigDecimal()
                    }
                    minerFeeModelCustomBtcGasListener?.onResultMinerFeeBtcGas(minerFeeEditBean.customPriceBtc)
                }
            }
        }
    }

    fun isValidMinerFee(): Boolean {
        when (RuleUtils.getChainType(minerFeeEditBean.chainType)) {
            ChainType.ETH -> {
                if (minerFeeEditBean.isAdvanced) {
                    return !(minerFeeEditBean.customGasPriceEth.isZero() || minerFeeEditBean.customGasEth.isZero())
                }
            }
            ChainType.BTC -> {
                if (minerFeeEditBean.isCustomPriceBtcChecked) {
                    return !minerFeeEditBean.customPriceBtc.isZero()
                }
            }
            else -> {
            }
        }
        return true
    }
}