package com.ttchain.walletproject.utils

import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.SignTtnTransResultData
import com.ttchain.walletproject.model.TtnTransactionOutData
import org.web3j.crypto.ECKeyPair
import org.web3j.crypto.Hash
import org.web3j.crypto.Sign
import java.math.BigDecimal
import java.util.ArrayList

object TtnUtils {
    private const val radix = 16

    fun getTtnTransModel(
        toAddress: String,
        ttnNonce: String,
        type: String,
        input: String,
        coinId: String,
        transCoinAmount: BigDecimal
    ): SignTtnTransResultData {
        return SignTtnTransResultData().apply {
            fee = "0" //可不帶，鏈上有定義礦工費
            to = toAddress
            nonce = ttnNonce.toInt()
            this.type = type
            //轉帳："空字串"
            //閃兌："幣種A$轉幣種B$數量"
            //提出："b2bbbbbb0000000000000001" + 轉入地址
            this.input = input
            crypto = "cic"
            //已知 BTCN, USDTN 為8位，其他均為18位
            val digit: String = when (coinId) {
                CoinEnum.BTCN.coinId, CoinEnum.USDTN.coinId -> {
                    "8"
                }
                else -> {
                    "18"
                }
            }
            val value = transCoinAmount.multiply(BigDecimal("1E+$digit"))
            //除 TTN 轉帳之外，其他幣種藉由 out 來傳值
            when (coinId) {
                CoinEnum.TTN.coinId -> {
                    balance = NumberUtils.show(value, 0)
                    out = null
                }
                else -> {
                    balance = "0"
                    val outModels = ArrayList<TtnTransactionOutData>()
                    outModels.add(TtnTransactionOutData().apply {
                        token = CoinEnum.mappingByCoinId(coinId).inputName
                        balance = NumberUtils.show(value, 0)
                    })
                    out = outModels
                }
            }
        }
    }

    fun getPublicKey(pri: String): String {
        val ecKeyPair = ECKeyPair.create(pri.toBigInteger(radix))
        return "04" + ecKeyPair.publicKey.toString(radix) //公鑰產生公式
    }

    fun signTransaction(trans: SignTtnTransResultData, pri: String): SignTtnTransResultData {
        trans.blockHash = ""
        trans.version = "sDAGraph"
        trans.publicKey = getPublicKey(pri)
        val encodeTrans = encodeForSign(trans).orEmpty()
        val ecKeyPair = ECKeyPair.create(pri.toBigInteger(radix))
        trans.sign = Utility.bytesToHex(secpSign(encodeTrans, ecKeyPair))
        trans.tx = Utility.bytesToHex(sha256(encodeTrans))
        return trans
    }

    fun encodeForSign(trans: SignTtnTransResultData): String? {
        val from = "wx" + paddingLeftZero(trans.publicKey, 42)
        val to = "gx" + paddingLeftZero(trans.to, 42)
        val nonceTmp = trans.nonce?.toString(radix)
        val nonce = "hx" + paddingLeftZero(nonceTmp, 32)
        val fee = "ix" + paddingLeftZero(trans.fee, 32)
        val type = "kx" + paddingLeftZero(trans.type, 8)
        val inputTmp = trans.input?.length?.toString(radix)
        val input = "lx" + paddingLeftZero(inputTmp, 3) + trans.input
        val balance = "sx" + paddingLeftZero(trans.balance, 32)
        val protocol = "tx" + paddingLeftZero("null", 8)

        var outResult = ""
        trans.out?.let {
            val outSize = it.size
            for (i in 0 until outSize) {
                val tokenTmp = Utility.bytesToHex(it[i].token.toByteArray())
                val token = paddingLeftZero(tokenTmp, 8).orEmpty()
                val tokenBalance = paddingLeftZero(it[i].balance, 32).orEmpty()
                val vOutTmp = it[i].vout.toString(10)
                val vOut = paddingLeftZero(vOutTmp, 3)
                outResult = "${outResult}px$vOut$token$tokenBalance" //支援多筆out
            }
        }
        return from + to + nonce + fee + type + outResult + input + balance + protocol
    }

    fun sha256(encodeTrans: String): ByteArray {
        return Hash.sha256(encodeTrans.toByteArray())
    }

    fun secpSign(encodeTrans: String, ecKeyPair: ECKeyPair): ByteArray {
        val signature = Sign.signMessage(encodeTrans.toByteArray(), ecKeyPair)

        val r = Utility.bytesToHex(signature.r).toBigInteger(radix).toString(10)
        val s = Utility.bytesToHex(signature.s).toBigInteger(radix).toString(10)
        return (r + "x" + s).toByteArray()
    }

    private fun paddingLeftZero(text: String?, digits: Int): String? {
        var paddingText = text
        val textLength = paddingText?.length ?: 0
        val paddingDigits = digits - textLength
        for (i in 0 until paddingDigits) {
            paddingText = "0$paddingText" //前面補0
        }
        return paddingText
    }
}