package com.ttchain.walletproject.model

import com.ttchain.walletproject.enums.ChainType
import com.ttchain.walletproject.enums.MainCoinType
import com.ttchain.walletproject.utils.RuleUtils
import java.io.Serializable
import java.math.BigDecimal

data class MinerFeeEditBean(var _Id: Int = -1) : Serializable {
    var isAdvanced: Boolean = false

    var isZeroFee: Boolean = false
        get() {
            field = maxGasPriceEth.toDouble() == 0.0 &&
                    minGasPriceEth.toDouble() == 0.0 &&
                    suggestGasPriceEth.toDouble() == 0.0
            return field
        }

    var transCoinId: String = ""

    var transAddress: String = ""

    var chainType: Int = ChainType.NONE.value

    var gasRateEth: BigDecimal = BigDecimal("100")

    var suggestGasPriceEth: BigDecimal = BigDecimal("0")
        get() {
            return field.multiply(gasRateEth)
        }
    var minDefaultGasPriceEth: BigDecimal = BigDecimal("8")
        get() {
            return field.multiply(gasRateEth)
        }
    var minGasPriceEth: BigDecimal = BigDecimal("0")
        get() {
//            if (minDefaultGasPriceEth > field.multiply(gasRateEth)) {
//                return minDefaultGasPriceEth
//            }
            return field.multiply(gasRateEth)
        }
    var maxGasPriceEth: BigDecimal = BigDecimal("0")
        get() {
            return field.multiply(gasRateEth)
        }

    var defaultGasEth: BigDecimal = BigDecimal("21000")
    var payloadGasEth: BigDecimal = BigDecimal("60000")
    var defaultGasNonEth: BigDecimal = BigDecimal("120000")
    var seekProgress: Int = 0
    var userSeekGasPriceEth: BigDecimal = BigDecimal("0")
    var customGasPriceEth: BigDecimal = BigDecimal("0")
    var customGasEth: BigDecimal = BigDecimal("0")

    var regularPriceBtc: BigDecimal = BigDecimal("0")
    var priorityPriceBtc: BigDecimal = BigDecimal("0")
    var customPriceBtc: BigDecimal = BigDecimal("0")

    var isRegularPriceBtcChecked: Boolean = true
        set(value) {
            field = value
            if (value) {
                isPriorityPriceBtcChecked = false
                isCustomPriceBtcChecked = false
            }
        }
    var isPriorityPriceBtcChecked: Boolean = false
        set(value) {
            field = value
            if (value) {
                isRegularPriceBtcChecked = false
                isCustomPriceBtcChecked = false
            }
        }
    var isCustomPriceBtcChecked: Boolean = false
        set(value) {
            field = value
            if (value) {
                isRegularPriceBtcChecked = false
                isPriorityPriceBtcChecked = false
            }
        }

    var minerFeeCoinId: String = ""
        get() {
            field = RuleUtils.getMainCoinId(transAddress)
            return field
        }
    var minerFeeCoinAmount: BigDecimal = BigDecimal("0")
    var minerFeeCustomCoinAmount: BigDecimal = BigDecimal("0")
    var minerFeeCoinShortName: String = ""
        get() {
            field = when (RuleUtils.getMainCoinType(transAddress)) {
                MainCoinType.BTC -> {
                    ""
                }
                MainCoinType.ETH -> {
                    "ETH"
                }
                MainCoinType.CIC -> {
                    "cic"
                }
                MainCoinType.GUC -> {
                    "guc"
                }
                else -> {
                    ""
                }
            }
            return field
        }

}

