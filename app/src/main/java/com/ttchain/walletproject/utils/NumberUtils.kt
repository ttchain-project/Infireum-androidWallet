package com.ttchain.walletproject.utils

import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

object NumberUtils {

    val DIGIT_COIN_DEFAULT = 4
    val DIGIT_BTC = 8
    val DIGIT_ETH = 18

    val decimalFormat_8 = DecimalFormat("0.0000")
    val decimalFormat_common_8 = DecimalFormat("#,###,###.########")

    val df_pound_2 = DecimalFormat("0.00")
    val df_zero_4 = DecimalFormat("0.0000")

    //除法運算默認精確度
    private const val DEF_DIV_SCALE = 32

    fun showFiat(bigDecimal: BigDecimal): String {
        return formatPound2Down(bigDecimal.toDouble())
    }

    @JvmOverloads
    fun showNew(bigDecimal: BigDecimal, digit: Int = DIGIT_COIN_DEFAULT): String {
        val value = bigDecimal.toPlainString()
        val formatValue = formatZero4Up(bigDecimal.toDouble())
        return if (isEqualsAmount(value, formatValue)) {
            formatValue
        } else {
            formatDigitNew(bigDecimal.toDouble(), digit)
        }
    }

    fun showZeroReplaceNew(bigDecimal: BigDecimal, digit: Int, replace: String): String {
        return if (bigDecimal.toDouble() == 0.0) {
            replace
        } else show(bigDecimal, digit)
    }

    fun createPoundFormatString(digit: Int): String {
        var digit = digit
        val sb = StringBuilder()
        if (digit <= 0) {
            sb.append("0")
        } else {
            sb.append("0.")
            while (digit > 0) {
                sb.append("#")
                digit--
            }
        }
        return sb.toString()
    }

    fun isEqualsAmount(value1: String, value2: String): Boolean {
        try {
            val bigDecimal1 = BigDecimal(value1)
            val bigDecimal2 = BigDecimal(value2)
            return bigDecimal1.subtract(bigDecimal2).toDouble() == 0.0
        } catch (e: NumberFormatException) {
            e.printStackTrace()
        }

        return false
    }

    fun formatDigitNew(value: Double?, digit: Int): String {
        val format = DecimalFormat(createPoundFormatString(digit))
        format.roundingMode = RoundingMode.DOWN
        return format.format(value)
    }

    fun formatPound2Down(value: Double?): String {
        df_pound_2.roundingMode = RoundingMode.HALF_UP
        return df_pound_2.format(value)
    }

    /**
     * Show amount format in default at app system.
     * Format rounding mode is [RoundingMode].UP.
     *
     * @param value amount of double type
     * @return the amount format 0.0000
     */
    fun formatZero4Up(value: Double?): String {
        df_zero_4.roundingMode = RoundingMode.UP
        return df_zero_4.format(value)
    }

    /**
     * Show all coin amount in app. And the scale default is 8.
     *
     * @param amount
     * @return
     */
    fun show(amount: Double): String {
        return show(valueOf(amount), 8)
    }

    fun show(amount: Double, scale: Int): String {
        return formatAmount(valueOf(amount), scale)
    }

    @JvmOverloads
    fun show(bigDecimal: BigDecimal, scale: Int = 8): String {
        if (formatAmountBig(bigDecimal, scale).compareTo(BigDecimal(0E-18)) == 0)
            return formatAmount(bigDecimal, 4)
        else {
            return formatAmount(bigDecimal, scale)
        }
    }

    fun showRate(amount: Double): String {
        return formatAmount(valueOf(amount), 2)
    }

    fun showRate(bigDecimal: BigDecimal): String {
        return formatAmount(bigDecimal, 2)
    }

    @JvmOverloads
    fun showNonZero(bigDecimal: BigDecimal?, replace: String = "-"): String {
        if (bigDecimal != null) {
            val amount = bigDecimal.toDouble()
            return if (amount == 0.0) {
                replace
            } else {
                decimalFormat_common_8.format(bigDecimal.toDouble())
            }
        }
        return ""
    }

    @JvmOverloads
    fun formatInputAmount(bigDecimal: BigDecimal?, replace: String = ""): String {
        if (bigDecimal != null) {
            val amount = bigDecimal.toDouble()
            if (amount != 0.0) {
                decimalFormat_8.roundingMode = RoundingMode.UP
                return decimalFormat_8.format(bigDecimal.toDouble())
            }
        }
        return replace
    }

    fun formatAmount(bigDecimal: BigDecimal, scale: Int): String {
        return bigDecimal.setScale(scale, BigDecimal.ROUND_DOWN).toPlainString()
    }

    fun formatAmountBig(bigDecimal: BigDecimal, scale: Int): BigDecimal {
        return bigDecimal.setScale(scale, BigDecimal.ROUND_DOWN)
    }

    fun valueOf(decimal: BigDecimal): Double {
        return decimal.toDouble()
    }

    fun valueOf(`val`: Double): BigDecimal {
        return BigDecimal(`val`.toString())
    }

    fun valueOf(`val`: String): BigDecimal {
        return BigDecimal(`val`)
    }

    fun valueOf(`val`: String, scale: Int): BigDecimal {
        var `val` = `val`
        if (`val`.isEmpty()) {
            `val` = "0"
        }
        if (`val`.contains("\u202C")) {
            `val` = `val`.replace("\u202C", "")
        }
        return BigDecimal(`val`).divide(BigDecimal("1E$scale"))
    }

    fun valueOf(`val`: BigDecimal, scale: Int): BigDecimal {
        return `val`.divide(BigDecimal("1E$scale"))
    }

    fun formatFloorDouble(`val`: Double): String {
        return DecimalFormat("#").format(`val`)
    }

    /**
     * 精確加法
     */
    fun add(value1: Double, value2: Double): Double {
        val b1 = BigDecimal.valueOf(value1)
        val b2 = BigDecimal.valueOf(value2)
        return b1.add(b2).toDouble()
    }

    /**
     * 精確減法
     */
    fun sub(value1: Double, value2: Double): Double {
        val b1 = BigDecimal.valueOf(value1)
        val b2 = BigDecimal.valueOf(value2)
        return b1.subtract(b2).toDouble()
    }

    /**
     * 精確乘法
     */
    fun mul(value1: Double, value2: Double): Double {
        val b1 = BigDecimal.valueOf(value1)
        val b2 = BigDecimal.valueOf(value2)
        return b1.multiply(b2).toDouble()
    }

    /**
     * 精確除法
     *
     * @param scale 精度
     */
    @Throws(IllegalAccessException::class)
    @JvmOverloads
    fun div(value1: Double, value2: Double, scale: Int = DEF_DIV_SCALE): Double {
        if (scale < 0) {
            throw IllegalAccessException("精確度不能小於0")
        }
        val b1 = BigDecimal.valueOf(value1)
        val b2 = BigDecimal.valueOf(value2)

        return b1.divide(b2, scale, RoundingMode.DOWN).toDouble()
    }

    /**
     * 四捨五入
     *
     * @param scale 小數點後保留幾位
     */
    @Throws(IllegalAccessException::class)
    fun round(v: Double, scale: Int): Double {
        return div(v, 1.0, scale)
    }

    /**
     * 比較大小
     */
    fun equalTo(b1: BigDecimal?, b2: BigDecimal?): Boolean {
        return if (b1 == null || b2 == null) {
            false
        } else 0 == b1.compareTo(b2)
    }

    fun hexToLong(input: String, def: Int): Long {
        val value = hexToLong(input)
        return value ?: def.toLong()
    }

    fun hexToLong(input: String): Long? {
        return try {
            java.lang.Long.decode(input)
        } catch (ex: NumberFormatException) {
            null
        }

    }

    fun hexToInteger(input: String, def: Int): Int {
        val value = hexToInteger(input)
        return value ?: def
    }

    fun hexToInteger(input: String): Int? {
        try {
            return Integer.decode(input)
        } catch (ex: NumberFormatException) {
            return null
        }

    }
}
/**
 * Show all coin amount in app. And the scale default is 4.
 *
 * @param bigDecimal
 * @return
 */
/**
 * Show all coin amount in app. And the scale default is 8. Not showing zero.
 *
 *
 * If amount == 0, showing the "-".
 *
 * @param bigDecimal
 * @return
 */
/**
 * 精確除法 使用默認精度
 */
