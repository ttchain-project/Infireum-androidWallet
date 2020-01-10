package com.git4u.tt_wallet_android.utils

import com.git4u.tt_wallet_android.cache.GlobalConstant
import com.git4u.tt_wallet_android.enums.CoinEnum
import com.git4u.tt_wallet_android.model.type.ChainType
import com.git4u.tt_wallet_android.model.type.MainCoinType
import com.git4u.tt_wallet_android.repository.CoinRepository
import java.util.regex.Pattern

class RuleUtils {
    companion object {
        private const val ZERO_STRING_LENGTH = 0
        private const val MIN_STRING_LENGTH = 1
        private const val NORMAL_STRING_LENGTH = 30
        private const val BIG_STRING_LENGTH = 256
        private const val MIN_MNEMONIC_WORD = 12

        @JvmStatic
        fun isValidUserNameLength(name: String): Boolean {
            return isValidStringLength(name, MIN_STRING_LENGTH, NORMAL_STRING_LENGTH)
        }

        @JvmStatic
        fun isValidWalletNameLength(name: String): Boolean {
            return isValidStringLength(name, MIN_STRING_LENGTH, NORMAL_STRING_LENGTH)
        }

        @JvmStatic
        fun isValidNoteLength(name: String): Boolean {
            return isValidStringLength(name, MIN_STRING_LENGTH, BIG_STRING_LENGTH)
        }

        @JvmStatic
        fun isValidCommentLength(comment: String): Boolean {
            return isValidStringLength(comment, ZERO_STRING_LENGTH, NORMAL_STRING_LENGTH)
        }

        @JvmStatic
        fun isValidPwd(pwd: String): Boolean {
            return isValidPattern(PASSWORD_PATTERN, pwd)
        }

        @JvmStatic
        fun isValidMnemonic(mnemonic: String): Boolean {
            val mnemonicArray = mnemonic.split(" ")
            val arraySize = mnemonicArray.size

            if (arraySize < MIN_MNEMONIC_WORD) {
                return false
            }

//            var i = 0

            //support chinese mnemonic
//            while (i < arraySize && result) {
//                result = result && isLowerCaseWord(mnemonicArray[i])
//                i++
//            }

            return true
        }

        @JvmStatic
        fun isValidStringLength(string: String, min: Int, max: Int): Boolean {
            return string.length in min..max
        }

        @JvmStatic
        fun isLowerCaseWord(string: String): Boolean {
            return isValidPattern(LOWER_CASE_WORD_EXPRESSION_PATTERN, string)
        }

        @JvmStatic
        fun isValidAddress(address: String, type: Int): Boolean {
            return when (type) {
                GlobalConstant.WALLET_TYPE_ETH -> isValidPattern(ETH_ADDRESS_PATTERN, address)
                GlobalConstant.WALLET_TYPE_CIC -> isValidPattern(CIC_ADDRESS_PATTERN, address)
                GlobalConstant.WALLET_TYPE_GUC -> isValidPattern(GUC_ADDRESS_PATTERN, address)
                GlobalConstant.WALLET_TYPE_BTC -> isValidPattern(BTC_ADDRESS_PATTERN, address)
                else -> false
            }
        }

        @JvmStatic
        fun isMainCoinType(address: String, type: MainCoinType): Boolean {
            return when (type) {
                MainCoinType.ETH -> isValidPattern(ETH_ADDRESS_PATTERN, address)
                MainCoinType.CIC -> isValidPattern(CIC_ADDRESS_PATTERN, address)
                MainCoinType.GUC -> isValidPattern(GUC_ADDRESS_PATTERN, address)
                MainCoinType.BTC -> isValidPattern(BTC_ADDRESS_PATTERN, address)
                MainCoinType.NONE -> false
            }
        }

        @JvmStatic
        fun getMainCoinType(address: String): MainCoinType {
            return when {
                isValidPattern(ETH_ADDRESS_PATTERN, address) -> MainCoinType.ETH
                isValidPattern(CIC_ADDRESS_PATTERN, address) -> MainCoinType.CIC
                isValidPattern(GUC_ADDRESS_PATTERN, address) -> MainCoinType.GUC
                isValidPattern(BTC_ADDRESS_PATTERN, address) -> MainCoinType.BTC
                else -> MainCoinType.NONE
            }
        }

        @JvmStatic
        fun isChainType(chainType: Int, type: ChainType): Boolean {
            return when (type) {
                ChainType.ETH -> chainType == ChainType.ETH.value
                ChainType.BTC -> chainType == ChainType.BTC.value
                ChainType.CIC -> chainType == ChainType.CIC.value
                ChainType.TTN -> chainType == ChainType.TTN.value
                ChainType.NONE -> false
            }
        }

        @JvmStatic
        fun isChainType(address: String, type: ChainType): Boolean {
            return when (type) {
                ChainType.ETH -> isValidPattern(ETH_ADDRESS_PATTERN, address)
                ChainType.CIC -> isValidPattern(CIC_ADDRESS_PATTERN, address) || isValidPattern(
                    GUC_ADDRESS_PATTERN,
                    address
                )
                ChainType.BTC -> isValidPattern(BTC_ADDRESS_PATTERN, address)
                ChainType.TTN -> isValidPattern(NON_PREFIX_ADDRESS_PATTERN, address)
                ChainType.NONE -> false
            }
        }

        @JvmStatic
        fun getChainType(chainType: Int): ChainType {
            return when (chainType) {
                ChainType.ETH.value -> ChainType.ETH
                ChainType.BTC.value -> ChainType.BTC
                ChainType.CIC.value -> ChainType.CIC
                ChainType.TTN.value -> ChainType.TTN
                else -> ChainType.NONE
            }
        }

        @JvmStatic
        fun getChainType(address: String): ChainType {
            return when {
                isValidPattern(ETH_ADDRESS_PATTERN, address) -> ChainType.ETH
                isValidPattern(CIC_ADDRESS_PATTERN, address) || isValidPattern(
                    GUC_ADDRESS_PATTERN,
                    address
                ) -> ChainType.CIC
                isValidPattern(BTC_ADDRESS_PATTERN, address) -> ChainType.BTC
                isValidPattern(NON_PREFIX_ADDRESS_PATTERN, address) -> ChainType.TTN

                else -> ChainType.NONE
            }
        }

        @JvmStatic
        fun getMainCoinId(address: String): String {
            return when {
                isValidPattern(ETH_ADDRESS_PATTERN, address) -> CoinEnum.ETH.coinId
                isValidPattern(CIC_ADDRESS_PATTERN, address) -> CoinRepository.COIN_CIC_IDENTIFIER
                isValidPattern(GUC_ADDRESS_PATTERN, address) -> CoinRepository.COIN_GUC_IDENTIFIER
                isValidPattern(BTC_ADDRESS_PATTERN, address) -> CoinEnum.BTC.coinId
                isValidPattern(NON_PREFIX_ADDRESS_PATTERN, address) -> CoinEnum.TTN.coinId
                else -> ""
            }
        }

        @JvmStatic
        fun getDefaultWalletName(address: String): String {
            return when {
                isValidPattern(
                    ETH_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_ETH
                isValidPattern(
                    CIC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_CIC
                isValidPattern(
                    GUC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_GUC
                isValidPattern(
                    BTC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_BTC
                isValidPattern(
                    NON_PREFIX_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_TTN
                else -> ""
            }
        }

        @JvmStatic
        fun addressToWalletType(address: String): String {
            return when {
                isValidPattern(
                    ETH_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_ETH
                isValidPattern(
                    CIC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_CIC
                isValidPattern(
                    GUC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_GUC
                isValidPattern(
                    BTC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_BTC
                isValidPattern(
                    NON_PREFIX_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_NAME_TTN
                else -> ""
            }
        }


        @JvmStatic
        fun getDefaultWalletTitle(address: String): String {
            return when {
                isValidPattern(
                    ETH_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_TITLE_ETH
                isValidPattern(
                    CIC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_TITLE_CIC
                isValidPattern(
                    GUC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_TITLE_GUC
                isValidPattern(
                    BTC_ADDRESS_PATTERN,
                    address
                ) -> GlobalConstant.DEFAULT_WALLET_TITLE_BTC
                else -> ""
            }
        }

        @JvmStatic
        fun isUUIDType(uuid: String): Boolean {
            return isValidPattern(UUID_PATTERN, uuid)
        }

        @JvmStatic
        fun hasSpaceInStartOrEndOfString(string: String): Boolean {
            return string.startsWith(" ") || string.endsWith(" ")
        }

        @JvmStatic
        fun hasSpaceInString(string: String): Boolean {
            return string.contains(" ")
        }

        @JvmStatic
        fun isUrlImage(url: String): Boolean {
            return isValidPattern(URL_IMAGE_PATTERN, url)
        }

        @JvmStatic
        fun isUrlFile(url: String): Boolean {
            return isValidPattern(URL_FILE_PATTERN, url)
        }

        @JvmStatic
        fun isUrlAudio(url: String): Boolean {
            return isValidPattern(URL_AUDIO_PATTERN, url)
        }

        @JvmStatic
        fun isUrl(url: String): Boolean {
            return isValidPattern(URL_PATTERN, url)
        }

        @JvmStatic
        fun isTtnTxId(txId: String): Boolean {
            return isValidPattern(TTN_TXID_PATTERN, txId)
        }

        @JvmStatic
        fun isBtcPrivateKey(string: String): Boolean {
            return isValidPattern(BTC_PRIVATE_KEY_PATTERN, string)
        }

        @JvmStatic
        fun isEthPrivateKey(string: String): Boolean {
            return isValidPattern(ETH_PRIVATE_KEY_PATTERN, string)
        }

        // useless
        private const val USER_NAME_EXPRESSION = "\\w{1,30}\$"
        private val USER_NAME_PATTERN = Pattern.compile(USER_NAME_EXPRESSION)

        private const val PASSWORD_EXPRESSION = "[a-zA-Z0-9]{8,20}$"
        private val PASSWORD_PATTERN = Pattern.compile(PASSWORD_EXPRESSION)

        private const val MNEMONIC_EXPRESSION =
            "[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}\\s[a-z]{1,}"
        private val MNEMONIC_PATTERN = Pattern.compile(MNEMONIC_EXPRESSION)

        private const val LOWER_CASE_WORD_EXPRESSION = "[a-z]+"
        private val LOWER_CASE_WORD_EXPRESSION_PATTERN = Pattern.compile(LOWER_CASE_WORD_EXPRESSION)

        // 0x開頭 + hex 16 長度固定40, 英文不分大小寫
        private const val ETH_ADDRESS_EXPRESSION = "0x[a-fA-F0-9]{40}"
        private val ETH_ADDRESS_PATTERN = Pattern.compile(ETH_ADDRESS_EXPRESSION)

        // base58 長度不固定, 開頭排除0x, cx, gx
        private const val BTC_ADDRESS_EXPRESSION = "^[13][a-km-zA-HJ-NP-Z0-9]{26,33}\$"
        private val BTC_ADDRESS_PATTERN = Pattern.compile(BTC_ADDRESS_EXPRESSION)

        // cx開頭 + hex 16 長度固定40, 英文不分大小寫
        private const val CIC_ADDRESS_EXPRESSION = "cx[a-fA-F0-9]{40}"
        private val CIC_ADDRESS_PATTERN = Pattern.compile(CIC_ADDRESS_EXPRESSION)

        private const val GUC_ADDRESS_EXPRESSION = "gx[a-fA-F0-9]{40}"
        private val GUC_ADDRESS_PATTERN = Pattern.compile(GUC_ADDRESS_EXPRESSION)

        private const val UUID_EXPRESSION =
            "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}\$"
        private val UUID_PATTERN = Pattern.compile(UUID_EXPRESSION)

        private const val URL_IMAGE_EXPRESSION = "(http(s?):)(.)*\\.(jpg|jpeg|png)"
        private val URL_IMAGE_PATTERN = Pattern.compile(URL_IMAGE_EXPRESSION)

        private const val URL_FILE_EXPRESSION = "(http(s?):)(.)*\\.[a-zA-Z]{2,4}"
        private val URL_FILE_PATTERN = Pattern.compile(URL_FILE_EXPRESSION)

        private const val URL_AUDIO_EXPRESSION = "(http(s?):)(.)*\\.(3gp|3gpp)"
        private val URL_AUDIO_PATTERN = Pattern.compile(URL_AUDIO_EXPRESSION)

        private const val URL_EXPRESSION =
            "(https?:\\/\\/)?(www\\.)?[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)"
        private val URL_PATTERN = Pattern.compile(URL_EXPRESSION)

        private const val NON_PREFIX_ADDRESS_EXPRESSION = "[a-fA-F0-9]{40}"
        private val NON_PREFIX_ADDRESS_PATTERN = Pattern.compile(NON_PREFIX_ADDRESS_EXPRESSION)

        private const val TTN_TXID_EXPRESSION = "[a-f0-9]{64}"
        private val TTN_TXID_PATTERN = Pattern.compile(TTN_TXID_EXPRESSION)

        private const val BTC_PRIVATE_KEY_EXPRESS = "^[5KL][a-km-zA-HJ-NP-Z0-9]{50,51}\$"
        private val BTC_PRIVATE_KEY_PATTERN = Pattern.compile(BTC_PRIVATE_KEY_EXPRESS)

        private const val ETH_PRIVATE_KEY_EXPRESS = "[a-f0-9]{64}"
        private val ETH_PRIVATE_KEY_PATTERN = Pattern.compile(ETH_PRIVATE_KEY_EXPRESS)

        private fun isValidPattern(pattern: Pattern, string: String): Boolean {
            return pattern.matcher(string).matches()
        }
    }
}