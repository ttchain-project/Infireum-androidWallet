package com.ttchain.walletproject.model

import com.ttchain.walletproject.utils.NumberUtils

import java.math.BigDecimal
import java.net.URL

import okhttp3.HttpUrl

object ImTokenReceiptQrCode {

    private const val HTTPS = "https"
    private const val ETHEREUM = "ethereum"
    private const val BITCOIN = "bitcoin"

    private const val CONTRACT_ADDRESS = "contractAddress"
    private const val DECIMAL = "decimal"
    private const val _18 = "18"

    private const val VALUE = "value"
    private const val AMOUNT = "amount"

    fun getErc20URL(address: String, contractAddress: String, value: String): String {
        val url = HttpUrl.Builder()
            .scheme(HTTPS)
            .host(address)
            .addQueryParameter(CONTRACT_ADDRESS, contractAddress)
            .addQueryParameter(DECIMAL, _18)
            .addQueryParameter(VALUE, value)
            .build().url()

        var result = url.toString().replace(HTTPS, ETHEREUM)
        result = result.replace("/", "")

        return result
    }

    fun getEthURL(address: String, value: String): String {
        val url = HttpUrl.Builder()
            .scheme(HTTPS)
            .host(address)
            .addQueryParameter(DECIMAL, _18)
            .addQueryParameter(VALUE, value)
            .build().url()

        var result = url.toString().replace(HTTPS, ETHEREUM)
        result = result.replace("/", "")

        return result
    }

    fun getBtcURL(address: String, amount: String): String {
        //        URL url = new HttpUrl.Builder()
        //                .scheme(HTTPS)
        //                .host(address)
        //                .addQueryParameter(AMOUNT, amount)
        //                .build().url();
        //
        //        String result = url.toString().replace(HTTPS, BITCOIN);
        //        result = result.replace("/", "");


        return "$BITCOIN:$address?amount=$amount"
    }

    fun getAddressFromQrCode(qrCode: String): String {
        return try {
            qrCode.substring(qrCode.indexOf(":") + 1, qrCode.indexOf("?"))
        } catch (e: Exception) {
            qrCode
        }
    }

    fun getImportFromQrCode(qrCode: String): String {
        return try {
            qrCode.substring(qrCode.indexOf(":") + 1)
        } catch (e: Exception) {
            qrCode
        }
    }

    fun getAmountFromQrCode(qrCode: String): String {
        try {

            if (qrCode.contains("amount")) {
                return qrCode.substring(qrCode.indexOf("amount=") + 7)
            } else if (qrCode.contains("value")) {

                val value = qrCode.substring(qrCode.indexOf("value=") + 6)

                val valueB = NumberUtils.valueOf(value, 18)

                return NumberUtils.show(valueB)
            }

            return ""


        } catch (e: Exception) {
            return ""
        }

    }
}
