package com.ttchain.walletproject.blockchain

import android.annotation.SuppressLint
import com.google.gson.Gson
import com.quincysx.crypto.bitcoin.BitcoinException
import com.quincysx.crypto.ethereum.ECDSASignature
import com.quincysx.crypto.ethereum.EthECKeyPair
import com.quincysx.crypto.utils.Base58
import com.ttchain.walletproject.BuildConfig
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.*
import com.ttchain.walletproject.utils.HexUtil
import com.ttchain.walletproject.utils.MnemonicUtil
import com.ttchain.walletproject.utils.NumberUtils.hexToLong
import com.ttchain.walletproject.utils.Utility
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.apache.commons.codec.binary.Hex
import org.bitcoinj.core.*
import org.bitcoinj.core.Address
import org.bitcoinj.core.Transaction
import org.bitcoinj.crypto.HDKeyDerivation
import org.bitcoinj.crypto.HDUtils
import org.bitcoinj.crypto.TransactionSignature
import org.bitcoinj.params.MainNetParams
import org.bitcoinj.script.Script
import org.bitcoinj.script.ScriptBuilder
import org.bitcoinj.wallet.DeterministicKeyChain
import org.bitcoinj.wallet.DeterministicSeed
import org.bouncycastle.jcajce.provider.digest.Keccak
import org.spongycastle.asn1.sec.SECNamedCurves
import org.spongycastle.crypto.digests.SHA256Digest
import org.spongycastle.crypto.params.ECDomainParameters
import org.spongycastle.crypto.params.ECPrivateKeyParameters
import org.spongycastle.crypto.signers.ECDSASigner
import org.spongycastle.crypto.signers.HMacDSAKCalculator
import org.web3j.abi.FunctionEncoder
import org.web3j.abi.TypeReference
import org.web3j.abi.datatypes.Function
import org.web3j.abi.datatypes.Type
import org.web3j.abi.datatypes.Uint
import org.web3j.crypto.*
import org.web3j.utils.Numeric
import timber.log.Timber
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.math.BigDecimal
import java.math.BigInteger
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.security.SecureRandom
import java.util.*

object BitcoinjNew {

    const val ADDRESS = "ADDRESS"
    const val KEY = "KEY"
    const val ERROR = "ERROR"

    private fun LOG(msg: String) {
        if (BuildConfig.DEBUG) {
            Timber.e(msg)
        }
    }

    suspend fun init(): ResponseUserIdentity = init("")

    suspend fun init(mnemonicsRaw: String) = withContext(Dispatchers.IO) {
        var mnemonics = mnemonicsRaw
        if (mnemonics.isEmpty()) {
            val initialEntropy = ByteArray(16)
            val secureRandom = SecureRandom()
            secureRandom.nextBytes(initialEntropy)
            mnemonics = MnemonicUtil.generateMnemonic(initialEntropy)
        }
        LOG("mnemonics $mnemonics")


        val deterministicSeed = DeterministicSeed(mnemonics, null, "", 0L)
        val rootPrivateKey =
            HDKeyDerivation.createMasterPrivateKey(deterministicSeed.seedBytes)

        val mainNetParams = MainNetParams.get()

        val hdKey = rootPrivateKey.serializePrivB58(mainNetParams)
        LOG("HdKey $hdKey")

        val deterministicKeyChain =
            DeterministicKeyChain.builder().seed(deterministicSeed).build()
        val privateKey = deterministicKeyChain.getKeyByPath(
            HDUtils.parsePath("44H / 60H / 0H / 0 / 0"), true
        ).privKey
        val ecKey = ECKey.fromPrivate(privateKey)

        //BTC
        val btcKey = ecKey.getPrivateKeyEncoded(mainNetParams).toString()
        val compressAddress = LegacyAddress.fromKey(mainNetParams, ecKey)
        LOG("btc compress address : $compressAddress")
        val uncompressAddress = LegacyAddress.fromKey(mainNetParams, ecKey.decompress())
        LOG("btc uncompress address : $uncompressAddress")
        val btcAdr = compressAddress.toString()
        LOG("btc pky $btcKey")
        LOG("btc adr $btcAdr")


        //ETH
        val childEcKeyPair0 =
            ECKeyPair.create(privateKey)
        val ethPky = ecKey.privateKeyAsHex
        val ethAdr = "0x" + Keys.getAddress(childEcKeyPair0)
        LOG("eth pky $ethPky")
        LOG("eth adr $ethAdr")
        LOG(
            "eth getPublicKeyAsHex ${ecKey.decompress().publicKeyAsHex.substring(2)}"
        )

        val noPrefixAddress =
            Utility.getSHA256(ecKey.decompress().publicKeyAsHex.substring(2)).substring(24, 64)

        LOG("noPrefixAddress $noPrefixAddress")

        val responseUserIdentity = ResponseUserIdentity()
        responseUserIdentity.version = "0.01"
        responseUserIdentity.mnemonic = mnemonics
        responseUserIdentity.HDkey = hdKey

        val bitCoinWallet = ApiWalletData()
        bitCoinWallet.privateKey = btcKey
        bitCoinWallet.address = btcAdr
        responseUserIdentity.bitcoin = bitCoinWallet


        val ethWallet = ApiWalletData()
        ethWallet.privateKey = ethPky
        ethWallet.address = ethAdr
        responseUserIdentity.ethereum = ethWallet

        val noPrefixWallet = ApiWalletData()
        noPrefixWallet.privateKey = ethPky
        noPrefixWallet.address = noPrefixAddress
        responseUserIdentity.noprefix = noPrefixWallet

        Timber.d(Gson().toJson(responseUserIdentity))
        return@withContext responseUserIdentity
    }


    suspend fun createBtcAddressByMnemonic(
        mnemonic: String,
        addressList: List<String>,
        isDecompress: Boolean
    ): HashMap<String, String> = withContext(Dispatchers.IO) {
        val hashMap: HashMap<String, String> = LinkedHashMap()
        try {
            val deterministicSeed = DeterministicSeed(mnemonic, null, "", 0L)
            val rootPrivateKey =
                HDKeyDerivation.createMasterPrivateKey(deterministicSeed.seedBytes)
            val mainNetParams = MainNetParams.get()
            val hdKey = rootPrivateKey.serializePrivB58(mainNetParams)
            LOG("HdKey $hdKey")
            val deterministicKeyChain =
                DeterministicKeyChain.builder().seed(deterministicSeed).build()
            //  最多可以利用一個住記詞創建出 10 個錢包
            var privateKey: BigInteger? = null
            for (i in 1..9) {
                val priKey = deterministicKeyChain.getKeyByPath(
                    HDUtils.parsePath("44H / 0H / 0H / 0 / $i"),
                    true
                ).privKey
                val ecKey = ECKey.fromPrivate(priKey)
                val address = when {
                    isDecompress -> {
                        LegacyAddress.fromKey(mainNetParams, ecKey.decompress())
                    }
                    else -> {
                        LegacyAddress.fromKey(mainNetParams, ecKey)
                    }
                }
                val btcAdr = address.toString()
                if (!addressList.contains(btcAdr)) {
                    privateKey = priKey
                    break
                }
            }
            val ecKey = ECKey.fromPrivate(privateKey)
            //BTC
            val btcKey = ecKey.getPrivateKeyEncoded(mainNetParams).toString()
            val address = when {
                isDecompress -> {
                    LegacyAddress.fromKey(mainNetParams, ecKey.decompress())
                }
                else -> {
                    LegacyAddress.fromKey(mainNetParams, ecKey)
                }
            }
            val btcAdr = address.toString()
            LOG("btc pky $btcKey")
            LOG("btc adr $btcAdr")
            if (!addressList.contains(btcAdr)) {
                hashMap[ADDRESS] = btcAdr
                hashMap[KEY] = btcKey
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return@withContext hashMap
    }

    suspend fun createDecompressBtcAddressByMnemonic(
        isSpecific: Boolean,
        mnemonic: String,
        addressList: List<String>
    ): HashMap<String, String> = withContext(Dispatchers.IO) {
        val hashMap: HashMap<String, String> = LinkedHashMap()
        try {
            val deterministicSeed = DeterministicSeed(mnemonic, null, "", 0L)
            val rootPrivateKey =
                HDKeyDerivation.createMasterPrivateKey(deterministicSeed.seedBytes)
            val mainNetParams = MainNetParams.get()
            val hdKey = rootPrivateKey.serializePrivB58(mainNetParams)
            LOG("HdKey $hdKey")
            val deterministicKeyChain =
                DeterministicKeyChain.builder().seed(deterministicSeed).build()
            val privateKey: BigInteger = deterministicKeyChain.getKeyByPath(
                HDUtils.parsePath("44H / 60H / 0H / 0 / 0"),
                true
            ).privKey
            val ecKey = ECKey.fromPrivate(privateKey)
            //BTC
            val btcKey = ecKey.getPrivateKeyEncoded(mainNetParams).toString()
            val address = when {
                isSpecific -> LegacyAddress.fromKey(mainNetParams, ecKey)
                else -> LegacyAddress.fromKey(mainNetParams, ecKey.decompress())
            }
            val btcAdr = address.toString()
            LOG("btc pky $btcKey")
            LOG("btc adr $btcAdr")
            if (!addressList.contains(btcAdr)) {
                hashMap[ADDRESS] = btcAdr
                hashMap[KEY] = btcKey
            } else {
                hashMap[ERROR] = ERROR
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return@withContext hashMap
    }

    @SuppressLint("DefaultLocale")
    suspend fun createEthAddressByMnemonic(
        mnemonic: String,
        addressList: List<String>
    ): HashMap<String, String> = withContext(Dispatchers.IO) {
        val hashMap: HashMap<String, String> = LinkedHashMap()
        try {
            val deterministicSeed = DeterministicSeed(mnemonic, null, "", 0L)
            val rootPrivateKey =
                HDKeyDerivation.createMasterPrivateKey(deterministicSeed.seedBytes)
            val mainNetParams = MainNetParams.get()
            val hdKey = rootPrivateKey.serializePrivB58(mainNetParams)
            LOG("HdKey $hdKey")
            val deterministicKeyChain =
                DeterministicKeyChain.builder().seed(deterministicSeed).build()
            var privateKey: BigInteger? = null
            for (i in 1..9) {
                val priKey = deterministicKeyChain.getKeyByPath(
                    HDUtils.parsePath("44H / 60H / 0H / 0 / $i"),
                    true
                ).privKey
                val childEcKeyPair0 = ECKeyPair.create(priKey)
                val ethAdr = "0x" + Keys.getAddress(childEcKeyPair0)
                if (!addressList.contains(ethAdr)) {
                    privateKey = priKey
                    break
                }
            }
            val ecKey = ECKey.fromPrivate(privateKey)
            //ETH
            val childEcKeyPair0 =
                ECKeyPair.create(privateKey)
            val ethPky = ecKey.privateKeyAsHex
            val ethAdr = "0x" + Keys.getAddress(childEcKeyPair0)
            LOG("eth pky $ethPky")
            LOG("eth adr $ethAdr")
            if (!addressList.contains(ethAdr)) {
                hashMap[ADDRESS] = ethAdr
                hashMap[KEY] = ethPky
            }
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }

        return@withContext hashMap
    }

    suspend fun signBtcTransaction(
        model: SignBTCBodyData,
        ttnAddress: String,
        btcAddress: String
    ): String = withContext(Dispatchers.IO) {
        Timber.i("test99 signBtcTransaction 0")
        val networkParams: NetworkParameters = MainNetParams.get()
        val privateKeyRaw = model.privatekey
        val dumpedPrivateKey = DumpedPrivateKey.fromBase58(networkParams, privateKeyRaw)
        val ecKey = dumpedPrivateKey.key
        val transaction = Transaction(networkParams)
        //output
        for ((address, value) in model.tx!!) {
            transaction.addOutput(
                Coin.valueOf(java.lang.Long.valueOf(value.toLong())),
                LegacyAddress.fromBase58(networkParams, address)
            )
        }
        //add output with ttnAddress
        Timber.i("test99 ttnAddress: %s", ttnAddress)
        val os = ByteArrayOutputStream()
        os.write(0x6a)
        val data = HexUtil.fromHex("c2cccccc0000000000000001$ttnAddress")
        os.write(data?.size ?: 0)
        os.write(data)
        os.close()
        transaction.addOutput(Coin.valueOf(0), Script(os.toByteArray()))
        //input
        //input
        val ethPky = ecKey.privateKeyAsHex
        val uncompressKey = ECKey.fromPrivate(
            BigInteger(ethPky, 16).toByteArray(),
            false
        )
        val compressKey = ECKey.fromPrivate(
            BigInteger(ethPky, 16).toByteArray(),
            true
        )

        val uncompressAddress = LegacyAddress.fromKey(networkParams, ecKey.decompress()).toBase58()
        val compressAddress = LegacyAddress.fromKey(networkParams, ecKey).toBase58()

        val uncompressScript =
            ScriptBuilder.createOutputScript(
                LegacyAddress.fromKey(networkParams, ecKey.decompress())
            )
        Timber.i("test99 uncompressScript: %s", uncompressScript.toString())

        val compressScript =
            ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, ecKey))
        Timber.i("test99 compressScript: %s", compressScript.toString())

        val checkScript: Script
        val checkKey: ECKey

        when {
            uncompressAddress == btcAddress -> {
                checkScript = uncompressScript
                checkKey = uncompressKey
            }
            compressAddress == btcAddress -> {
                checkScript = compressScript
                checkKey = compressKey
            }
            else -> {
                return@withContext ""
            }
        }
        //for test output format
        //byte[] data1 = new byte[0];
        //transaction.addInput(new TransactionInput(networkParams, transaction, data1));
        for ((txId, value) in model.unspend ?: arrayListOf()) {
            transaction.addInput(
                Sha256Hash.wrap(txId),
                value.toLong(),
                checkScript
            )
        }

        for (i in transaction.inputs.indices) {
            val transactionInput =
                transaction.getInput(i.toLong())
            val hash = transaction.hashForSignature(
                i,
                checkScript,
                Transaction.SigHash.ALL,
                false
            )
            val ecSig = checkKey.sign(hash)
            val txSig =
                TransactionSignature(ecSig, Transaction.SigHash.ALL, false)
            val inputScript =
                ScriptBuilder.createInputScript(txSig, checkKey)
            transactionInput.scriptSig = inputScript
        }

        val signTx =
            String(Hex.encodeHex(transaction.bitcoinSerialize()))
        Timber.i("test99 signTx: %s", signTx)

        return@withContext signTx
    }

    suspend fun signBtcTransaction(model: SignBTCBodyData, btcAddress: String): String =
        withContext(Dispatchers.IO) {
            Timber.i("test99 signBtcTransaction 0")

            val networkParams: NetworkParameters = MainNetParams.get()

            val privateKeyRaw = model.privatekey
            val dumpedPrivateKey =
                DumpedPrivateKey.fromBase58(networkParams, privateKeyRaw)
            val ecKey = dumpedPrivateKey.key

            val transaction =
                Transaction(networkParams)

            //output
            //output
            for ((address, value) in model.tx ?: arrayListOf()) {
                transaction.addOutput(
                    Coin.valueOf(value.toLong()), LegacyAddress.fromBase58(networkParams, address)
                )
            }

            //input
            //input
            val ethPky = ecKey.privateKeyAsHex
            val uncompressKey = ECKey.fromPrivate(
                BigInteger(ethPky, 16).toByteArray(),
                false
            )
            val compressKey = ECKey.fromPrivate(
                BigInteger(ethPky, 16).toByteArray(),
                true
            )

            val uncompressAddress =
                LegacyAddress.fromKey(networkParams, ecKey.decompress()).toBase58()
            val compressAddress = LegacyAddress.fromKey(networkParams, ecKey).toBase58()

            val uncompressScript =
                ScriptBuilder.createOutputScript(
                    LegacyAddress.fromKey(networkParams, ecKey.decompress())
                )
            Timber.i("test99 uncompressScript: %s", uncompressScript.toString())

            val compressScript =
                ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, ecKey))
            Timber.i("test99 compressScript: %s", compressScript.toString())

            val checkScript: Script
            val checkKey: ECKey

            when {
                uncompressAddress == btcAddress -> {
                    checkScript = uncompressScript
                    checkKey = uncompressKey
                }
                compressAddress == btcAddress -> {
                    checkScript = compressScript
                    checkKey = compressKey
                }
                else -> {
                    return@withContext ""
                }
            }

            for ((txId, value) in model.unspend ?: arrayListOf()) {
                transaction.addInput(
                    Sha256Hash.wrap(txId),
                    value.toLong(),
                    checkScript
                )
            }

            for (i in transaction.inputs.indices) {
                val transactionInput =
                    transaction.getInput(i.toLong())
                val hash = transaction.hashForSignature(
                    i,
                    checkScript,
                    Transaction.SigHash.ALL,
                    false
                )
                val ecSig = checkKey.sign(hash)
                val txSig =
                    TransactionSignature(ecSig, Transaction.SigHash.ALL, false)
                val inputScript =
                    ScriptBuilder.createInputScript(txSig, checkKey)
                transactionInput.scriptSig = inputScript
            }

            val signTx =
                String(Hex.encodeHex(transaction.bitcoinSerialize()))
            Timber.i("test99 signTx: %s", signTx)
            return@withContext signTx
        }

    suspend fun signUsdtTransaction(
        model: SignBTCBodyData,
        ttnAddress: String,
        usdtAmount: BigDecimal,
        btcAddress: String
    ): String = withContext(Dispatchers.IO) {
        Timber.i("test98 signUsdtTransaction 0")

        val networkParams: NetworkParameters = MainNetParams.get()

        val privateKeyRaw = model.privatekey
        val dumpedPrivateKey =
            DumpedPrivateKey.fromBase58(networkParams, privateKeyRaw)
        val ecKey = dumpedPrivateKey.key

        val transaction =
            Transaction(networkParams)
        // usdt
        //output
        val os = ByteArrayOutputStream()
        os.write(0x6a)

        val usdtHex = usdtAmount.toBigInteger().toString(16)
        val padded = "0000000000000000".substring(usdtHex.length) + usdtHex

        Timber.i("test98 padded: %s", padded)

        val data = HexUtil.fromHex("6f6d6e69000000000000001f$padded")
        os.write(data.size)
        os.write(data)
        os.close()

        transaction.addOutput(Coin.valueOf(0), Script(os.toByteArray()))
        //usdt-n
        transaction.addOutput(
            Coin.valueOf(546), Script(buildOutput(Utility.ttnAddressToBase58(ttnAddress)))
        )

        for ((address, value) in model.tx ?: arrayListOf()) {
            transaction.addOutput(
                Coin.valueOf(value.toLong()),
                LegacyAddress.fromBase58(networkParams, address)
            )
        }

        //input
        val ethPky = ecKey.privateKeyAsHex
        val uncompressKey = ECKey.fromPrivate(
            BigInteger(ethPky, 16).toByteArray(),
            false
        )
        val compressKey = ECKey.fromPrivate(
            BigInteger(ethPky, 16).toByteArray(),
            true
        )

        val uncompressAddress = LegacyAddress.fromKey(networkParams, ecKey.decompress()).toBase58()
        val compressAddress = LegacyAddress.fromKey(networkParams, ecKey).toBase58()

        val uncompressScript =
            ScriptBuilder.createOutputScript(
                LegacyAddress.fromKey(networkParams, ecKey.decompress())
            )
        Timber.i("test98 uncompressScript: %s", uncompressScript.toString())

        val compressScript =
            ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, ecKey))
        Timber.i("test98 compressScript: %s", compressScript.toString())

        val checkScript: Script
        val checkKey: ECKey

        when {
            uncompressAddress == btcAddress -> {
                checkScript = uncompressScript
                checkKey = uncompressKey
            }
            compressAddress == btcAddress -> {
                checkScript = compressScript
                checkKey = compressKey
            }
            else -> {
                return@withContext ""
            }
        }
//                        //for test output format
//                        byte[] data1 = new byte[0];
//                        transaction.addInput(new TransactionInput(networkParams, transaction, data1));
        for ((txId, value) in model.unspend ?: arrayListOf()) {
            transaction.addInput(
                Sha256Hash.wrap(txId),
                value.toLong(),
                checkScript
            )
        }

        for (i in transaction.inputs.indices) {
            val transactionInput =
                transaction.getInput(i.toLong())
            val hash = transaction.hashForSignature(
                i,
                checkScript,
                Transaction.SigHash.ALL,
                false
            )
            val ecSig = checkKey.sign(hash)
            val txSig =
                TransactionSignature(ecSig, Transaction.SigHash.ALL, false)
            val inputScript =
                ScriptBuilder.createInputScript(txSig, checkKey)
            transactionInput.scriptSig = inputScript
        }

        val signTx =
            String(Hex.encodeHex(transaction.bitcoinSerialize()))
        Timber.i("test98 signTx: %s", signTx)

        return@withContext signTx
    }

    suspend fun signUsdtTransaction(
        model: SignBTCBodyData,
        usdtAmount: BigDecimal,
        btcAddress: String
    ): String = withContext(Dispatchers.IO) {
        Timber.i("test98 signUsdtTransaction 0")

        val networkParams: NetworkParameters = MainNetParams.get()

        val privateKeyRaw = model.privatekey
        val dumpedPrivateKey =
            DumpedPrivateKey.fromBase58(networkParams, privateKeyRaw)
        val ecKey = dumpedPrivateKey.key

        val transaction =
            Transaction(networkParams)
        //output
        // usdt
        val os = ByteArrayOutputStream()
        os.write(0x6a)

        val usdtHex = usdtAmount.toBigInteger().toString(16)
        val padded = "0000000000000000".substring(usdtHex.length) + usdtHex

        Timber.i("test98 padded: %s", padded)

        val data = HexUtil.fromHex("6f6d6e69000000000000001f$padded")
        os.write(data.size)
        os.write(data)
        os.close()

        transaction.addOutput(Coin.valueOf(0), Script(os.toByteArray()))

        for ((address, value) in model.tx ?: arrayListOf()) {
            transaction.addOutput(
                Coin.valueOf(value.toLong()),
                LegacyAddress.fromBase58(networkParams, address)
            )
        }

        //input
        val ethPky = ecKey.privateKeyAsHex
        val uncompressKey = ECKey.fromPrivate(
            BigInteger(ethPky, 16).toByteArray(),
            false
        )
        val compressKey = ECKey.fromPrivate(
            BigInteger(ethPky, 16).toByteArray(),
            true
        )

        val uncompressAddress = LegacyAddress.fromKey(networkParams, ecKey.decompress()).toBase58()
        val compressAddress = LegacyAddress.fromKey(networkParams, ecKey).toBase58()

        val uncompressScript =
            ScriptBuilder.createOutputScript(
                LegacyAddress.fromKey(networkParams, ecKey.decompress())
            )
        Timber.i("test98 uncompressScript: %s", uncompressScript.toString())

        val compressScript =
            ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, ecKey))
        Timber.i("test98 compressScript: %s", compressScript.toString())

        val checkScript: Script
        val checkKey: ECKey

        when {
            uncompressAddress == btcAddress -> {
                checkScript = uncompressScript
                checkKey = uncompressKey
            }
            compressAddress == btcAddress -> {
                checkScript = compressScript
                checkKey = compressKey
            }
            else -> {
                return@withContext ""
            }
        }
        //                        //for test
//                        byte[] data1 = new byte[0];
//                        transaction.addInput(new TransactionInput(networkParams, transaction, data1));
        for ((txId, value) in model.unspend ?: arrayListOf()) {
            transaction.addInput(
                Sha256Hash.wrap(txId),
                value.toLong(),
                checkScript
            )
        }

        for (i in transaction.inputs.indices) {
            val transactionInput =
                transaction.getInput(i.toLong())
            val hash = transaction.hashForSignature(
                i,
                checkScript,
                Transaction.SigHash.ALL,
                false
            )
            val ecSig = checkKey.sign(hash)
            val txSig =
                TransactionSignature(ecSig, Transaction.SigHash.ALL, false)
            val inputScript =
                ScriptBuilder.createInputScript(txSig, checkKey)
            transactionInput.scriptSig = inputScript
        }

        val signTx =
            String(Hex.encodeHex(transaction.bitcoinSerialize()))
        Timber.i("test98 signTx: %s", signTx)

        return@withContext signTx
    }

    suspend fun signEthTransaction(
        signModel: SignETHBodyRequest,
        queryModel: SignEthQueryModel
    ): String = withContext(Dispatchers.IO) {
        val ecKeyPair =
            ECKeyPair.create(BigInteger(signModel.privateKey, 16))
        val credentials =
            Credentials.create(ecKeyPair)
        val signByte: ByteArray
        val nonce = BigInteger(queryModel.nonce!!.substring(2), 16) //remove 0x
        val gasPrice = BigInteger(queryModel.gasPrice)
        val gasLimit = BigInteger(queryModel.gasLimit)
        val amount = BigInteger(queryModel.value)
        val toAddress = queryModel.to!!.substring(2) //remove 0x
        val amountHex = amount.toString(16)
        signByte = run {
            val contractAddr = signModel.contractAddress?.substring(2) //remove 0x
            val addressType =
                org.web3j.abi.datatypes.Address(toAddress)
            val amountType = Uint(amount)
            object : TypeReference<Type<*>?>() {}
            val function = Function(
                "transfer",  // function we're calling
                listOf(
                    addressType,
                    amountType
                ),  // Parameters
                // to pass as Solidity Types
                listOf(object : TypeReference<Type<*>?>() {})
            )
            val encodedFunction = FunctionEncoder.encode(function)
            val txRaw = RawTransaction.createTransaction(
                nonce,
                gasPrice,
                gasLimit,
                contractAddr,
                encodedFunction
            )
            TransactionEncoder.signMessage(txRaw, credentials)
        }
        return@withContext Numeric.toHexString(signByte).substring(2) //remove 0x
    }

    suspend fun signEthTransaction(
        signModel: SignETHBodyRequest,
        queryModel: SignEthQueryModel,
        ttnAddress: String
    ): String = withContext(Dispatchers.IO) {
        val ecKeyPair =
            ECKeyPair.create(BigInteger(signModel.privateKey, 16))
        val credentials =
            Credentials.create(ecKeyPair)

        val signByte: ByteArray

        val nonce = Numeric.decodeQuantity(queryModel.nonce)
        val gasPrice = BigInteger(queryModel.gasPrice)
        val gasLimit = BigInteger(queryModel.gasLimit)
        val amount = BigInteger(queryModel.value)
        val toAddress = queryModel.to!!.substring(2) //remove 0x

        val amountHex = amount.toString(16)

        val data = "0xc2cccccc0000000000000001$ttnAddress"
        val txRaw =
            RawTransaction.createTransaction(nonce, gasPrice, gasLimit, toAddress, amount, data)
        signByte = TransactionEncoder.signMessage(txRaw, credentials)
        return@withContext Numeric.toHexString(signByte).substring(2) //remove 0x
    }

    suspend fun signEthRawTransaction(
        transaction: com.ttchain.walletproject.model.Transaction,
        pky: String,
        nonce: String
    ): String = withContext(Dispatchers.IO) {
        val ecKeyPair =
            ECKeyPair.create(BigInteger(pky, 16))
        val credentials =
            Credentials.create(ecKeyPair)

        val signByte: ByteArray

        val nonceB = BigInteger(nonce.substring(2), 16)
        val gasPrice = BigInteger.valueOf(
            hexToLong(transaction.gasPrice)!!
        )
        val gasLimit = BigInteger.valueOf(
            hexToLong(transaction.gasLimit)!!
        )
        val amount = BigInteger.valueOf(
            hexToLong(transaction.value)!!
        )

        val toAddress = transaction.to.replace("0x", "")

        val txRaw =
            RawTransaction.createTransaction(
                nonceB,
                gasPrice,
                gasLimit,
                toAddress,
                amount,
                transaction.data
            )
        signByte = TransactionEncoder.signMessage(txRaw, credentials)
        return@withContext Numeric.toHexString(signByte).substring(2) //remove 0x
    }

    suspend fun signPersonaMessage(msg: String, pky: String): String = withContext(Dispatchers.IO) {
        val unSignData = ("\u0019Ethereum Signed Message:\n"
                + msg.toByteArray().size
                + msg).toByteArray()
        val kecc: Keccak.DigestKeccak = Keccak.Digest256()
        kecc.update(unSignData, 0, unSignData.size)
        val messageHash = kecc.digest()

        val pkyBigInt = BigInteger(pky, 16)

        val CURVE = SECNamedCurves.getByName("secp256k1")
        val domain = ECDomainParameters(CURVE.curve, CURVE.g, CURVE.n, CURVE.h)
        val signer = ECDSASigner(HMacDSAKCalculator(SHA256Digest()))
        val privateKeyParams =
            ECPrivateKeyParameters(pkyBigInt, domain)
        signer.init(true, privateKeyParams)
        val components = signer.generateSignature(messageHash)
        val pub = CURVE.g.multiply(pkyBigInt).getEncoded(false)
        val publicKey = BigInteger(1, Arrays.copyOfRange(pub, 1, pub.size))
        val signature = ECDSASignature(components[0], components[1]).toCanonicalised()
        var recId = -1
        for (i in 0..3) {
            val k = EthECKeyPair.recoverPubBytesFromSignature(i, signature, messageHash)
            val kBig =
                BigInteger(1, Arrays.copyOfRange(k, 1, k.size))
            if (kBig == publicKey) {
                recId = i
                break
            }
        }
        if (recId == -1) {
            throw RuntimeException("Could not construct a recoverable key. This should never happen.")
        } else {
            signature.v = (recId + 27).toByte()
        }

        val sigQ = ByteArray(65)
        System.arraycopy(
            ECDSASignature.bigIntegerToBytes(
                signature.r
            ), 0, sigQ, 0, 32
        )
        System.arraycopy(
            ECDSASignature.bigIntegerToBytes(
                signature.s
            ), 0, sigQ, 32, 32
        )
        sigQ[64] = signature.v
        return@withContext Utility.toHexString(sigQ)
    }

    suspend fun checkBtcAddressIsCompress(pky: String, btcAddress: String): Boolean =
        withContext(Dispatchers.IO) {

            val params: NetworkParameters = MainNetParams.get()
            val dumpedPrivateKey =
                DumpedPrivateKey.fromBase58(params, pky)
            val key = dumpedPrivateKey.key

            val compressAddressFromKey: Address =
                LegacyAddress.fromKey(params, key)

            val btcCompressAddr = compressAddressFromKey.toString()
            return@withContext btcAddress == btcCompressAddr
        }

    @SuppressLint("DefaultLocale")
    suspend fun keyToAddress(pky: String, mainCoinId: String): String =
        withContext(Dispatchers.IO) {
            if (CoinEnum.BTC.coinId == mainCoinId) {
                val params: NetworkParameters = MainNetParams.get()
                val dumpedPrivateKey =
                    DumpedPrivateKey.fromBase58(params, pky)
                val key = dumpedPrivateKey.key
                val decompressAddressFromKey = LegacyAddress.fromKey(params, key.decompress())
                val compressAddressFromKey = LegacyAddress.fromKey(params, key)
                val btcCompressAddress = compressAddressFromKey.toString()
                val btcDecompressAddress = decompressAddressFromKey.toString()
                LOG("compress btc $btcCompressAddress")
                LOG("decompress btc $btcDecompressAddress")
                return@withContext btcCompressAddress
            } else if (CoinEnum.ETH.coinId == mainCoinId) {
                val ecKeyPair =
                    ECKeyPair.create(BigInteger(pky, 16))
                val credentials =
                    Credentials.create(ecKeyPair)
                return@withContext credentials.address.toLowerCase() //包含前綴0x
            }
            return@withContext ""
        }

    @Throws(BitcoinException::class)
    private fun buildOutput(address: String): ByteArray? {
        return try {
            val addressWithCheckSumAndNetworkCode =
                Base58.decode(address)
//            if (addressWithCheckSumAndNetworkCode[0] != 0 && addressWithCheckSumAndNetworkCode[0] != 111 && addressWithCheckSumAndNetworkCode[0] != 5) {
//                throw new BitcoinException (11, "Unknown address type", address);
//            } else {
            val bareAddress = ByteArray(20)
            System.arraycopy(
                addressWithCheckSumAndNetworkCode,
                1,
                bareAddress,
                0,
                bareAddress.size
            )
            val digestSha =
                MessageDigest.getInstance("SHA-256")
            digestSha.update(
                addressWithCheckSumAndNetworkCode,
                0,
                addressWithCheckSumAndNetworkCode.size - 4
            )
            val calculatedDigest = digestSha.digest(digestSha.digest())
            for (i in 0..3) {
                if (calculatedDigest[i] != addressWithCheckSumAndNetworkCode[addressWithCheckSumAndNetworkCode.size - 4 + i]
                ) {
                    throw BitcoinException(3, "Bad address", address)
                }
            }
            val buf: ByteArrayOutputStream
            if (addressWithCheckSumAndNetworkCode[0] == 5.toByte()) {
                buf = ByteArrayOutputStream()
                buf.write(-87)
                writeBytes(bareAddress, buf)
                buf.write(-121)
                buf.toByteArray()
            } else {
                buf = ByteArrayOutputStream(25)
                buf.write(118)
                buf.write(-87)
                writeBytes(bareAddress, buf)
                buf.write(-120)
                buf.write(-84)
                buf.toByteArray()
            }
            //            }
        } catch (var6: NoSuchAlgorithmException) {
            throw java.lang.RuntimeException(var6)
        } catch (var6: IOException) {
            throw java.lang.RuntimeException(var6)
        }
    }

    @Throws(IOException::class)
    private fun writeBytes(data: ByteArray, baos: ByteArrayOutputStream) {
        when {
            data.size < 76 -> {
                baos.write(data.size)
            }
            data.size < 255 -> {
                baos.write(76)
                baos.write(data.size)
            }
            data.size < 65535 -> {
                baos.write(77)
                baos.write(data.size and 255)
                baos.write(data.size shr 8 and 255)
            }
            else -> {
                baos.write(78)
                baos.write(data.size and 255)
                baos.write(data.size shr 8 and 255)
                baos.write(data.size shr 16 and 255)
                baos.write(data.size ushr 24 and 255)
            }
        }
        baos.write(data)
    }

    suspend fun systemWalletInit() = withContext(Dispatchers.IO) {
        systemWalletInit("")
    }

    suspend fun systemWalletInit(mnemonicsRaw: String) = withContext(Dispatchers.IO) {
        var mnemonics = mnemonicsRaw
        if (mnemonics.isEmpty()) {
            val initialEntropy = ByteArray(16)
            val secureRandom = SecureRandom()
            secureRandom.nextBytes(initialEntropy)
            mnemonics = MnemonicUtil.generateMnemonic(initialEntropy)
        }
        LOG("mnemonics $mnemonics")


        val deterministicSeed = DeterministicSeed(mnemonics, null, "", 0L)
        val rootPrivateKey =
            HDKeyDerivation.createMasterPrivateKey(deterministicSeed.seedBytes)

        val mainNetParams = MainNetParams.get()

        val hdKey = rootPrivateKey.serializePrivB58(mainNetParams)
        LOG("HdKey: $hdKey")

        val deterministicKeyChain =
            DeterministicKeyChain.builder().seed(deterministicSeed).build()
        val btcPrivateKey = deterministicKeyChain.getKeyByPath(
            HDUtils.parsePath("44H / 0H / 0H / 0 / 0"), true
        ).privKey
        val ethPrivateKey = deterministicKeyChain.getKeyByPath(
            HDUtils.parsePath("44H / 60H / 0H / 0 / 0"), true
        ).privKey
        val btcEcKey = ECKey.fromPrivate(btcPrivateKey)
        val ethEcKey = ECKey.fromPrivate(ethPrivateKey)

        //BTC
        val btcKeyNew = btcEcKey.getPrivateKeyEncoded(mainNetParams).toString()
        LOG("btc pky new: $btcKeyNew")
        val compressAddressNew = LegacyAddress.fromKey(mainNetParams, btcEcKey)
        LOG("btc compress address new: $compressAddressNew")

        val btcKeyOld = ethEcKey.getPrivateKeyEncoded(mainNetParams).toString()
        LOG("btc pky old: $btcKeyOld")
        val compressAddressOld = LegacyAddress.fromKey(mainNetParams, ethEcKey)
        LOG("btc compress address old: $compressAddressOld")
        val uncompressAddressOld = LegacyAddress.fromKey(mainNetParams, ethEcKey.decompress())
        LOG("btc uncompress address old: $uncompressAddressOld")

        val btcAdrNew = compressAddressNew.toString()
        LOG("btc adr new: $btcAdrNew")

        val btcAdrOld = compressAddressOld.toString()
        val btcUncompressAdrOld = uncompressAddressOld.toString()
        LOG("btc adr old: $btcAdrOld")
        LOG("btc uncompress adr old: $btcUncompressAdrOld")


        //ETH
        val childEcKeyPair0 =
            ECKeyPair.create(ethPrivateKey)
        val ethPky = ethEcKey.privateKeyAsHex
        val ethAdr = "0x" + Keys.getAddress(childEcKeyPair0)
        LOG("eth pky $ethPky")
        LOG("eth adr $ethAdr")
        LOG(
            "eth getPublicKeyAsHex ${ethEcKey.decompress().publicKeyAsHex.substring(2)}"
        )

        val noPrefixAddress =
            Utility.getSHA256(ethEcKey.decompress().publicKeyAsHex.substring(2)).substring(24, 64)

        LOG("noPrefixAddress $noPrefixAddress")

        val systemWalletSets = arrayListOf<UserWalletQrCodeImageBean.WalletContent>()
        //BTC wallet
        systemWalletSets.add(
            UserWalletQrCodeImageBean.WalletContent(
                CoinEnum.BTC.coinId, "BTC Wallet", btcKeyNew, btcAdrNew
            )
        )
//        systemWalletSets.add(
//            UserWalletQrCodeImageBean.WalletContent(
//                CoinEnum.BTC.coinId, "BTC Old", btcKeyOld, btcAdrOld
//            )
//        )
//        systemWalletSets.add(
//            UserWalletQrCodeImageBean.WalletContent(
//                CoinEnum.BTC.coinId, "Uncompress", btcKeyOld, btcUncompressAdrOld
//            )
//        )
        //ETH wallet
        systemWalletSets.add(
            UserWalletQrCodeImageBean.WalletContent(
                CoinEnum.ETH.coinId, "ETH Wallet", ethPky, ethAdr
            )
        )
        //TTH wallet
        systemWalletSets.add(
            UserWalletQrCodeImageBean.WalletContent(
                CoinEnum.TTN.coinId, "TTN Wallet", ethPky, noPrefixAddress
            )
        )
        Timber.d(Gson().toJson(systemWalletSets))
        val responseUserIdentity = ResponseUserIdentity()
        responseUserIdentity.version = "0.01"
        responseUserIdentity.mnemonic = mnemonics
        responseUserIdentity.HDkey = hdKey

        val bitCoinWallet = ApiWalletData()
        bitCoinWallet.privateKey = btcKeyNew
        bitCoinWallet.address = btcAdrNew
        responseUserIdentity.bitcoin = bitCoinWallet


        val ethWallet = ApiWalletData()
        ethWallet.privateKey = ethPky
        ethWallet.address = ethAdr
        responseUserIdentity.ethereum = ethWallet

        val noPrefixWallet = ApiWalletData()
        noPrefixWallet.privateKey = ethPky
        noPrefixWallet.address = noPrefixAddress
        responseUserIdentity.noprefix = noPrefixWallet

        Timber.d(Gson().toJson(responseUserIdentity))
        return@withContext responseUserIdentity
    }
}
