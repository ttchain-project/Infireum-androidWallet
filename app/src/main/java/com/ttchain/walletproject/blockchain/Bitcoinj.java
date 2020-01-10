package com.ttchain.walletproject.blockchain;

import com.google.gson.Gson;
import com.quincysx.crypto.bitcoin.BitcoinException;
import com.quincysx.crypto.ethereum.ECDSASignature;
import com.quincysx.crypto.ethereum.EthECKeyPair;
import com.quincysx.crypto.utils.Base58;
import com.ttchain.walletproject.BuildConfig;
import com.ttchain.walletproject.enums.CoinEnum;
import com.ttchain.walletproject.model.ApiWalletData;
import com.ttchain.walletproject.model.ResponseUserIdentity;
import com.ttchain.walletproject.model.SignBTCBodyData;
import com.ttchain.walletproject.model.SignETHBodyRequest;
import com.ttchain.walletproject.model.SignEthQueryModel;
import com.ttchain.walletproject.model.TxData;
import com.ttchain.walletproject.model.UnspendData;
import com.ttchain.walletproject.utils.HexUtil;
import com.ttchain.walletproject.utils.MnemonicUtil;
import com.ttchain.walletproject.utils.NumberUtils;
import com.ttchain.walletproject.utils.Utility;

import org.apache.commons.codec.binary.Hex;
import org.bitcoinj.core.Address;
import org.bitcoinj.core.Coin;
import org.bitcoinj.core.DumpedPrivateKey;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.LegacyAddress;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.core.Sha256Hash;
import org.bitcoinj.core.TransactionInput;
import org.bitcoinj.crypto.DeterministicKey;
import org.bitcoinj.crypto.HDKeyDerivation;
import org.bitcoinj.crypto.HDUtils;
import org.bitcoinj.crypto.TransactionSignature;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.script.Script;
import org.bitcoinj.script.ScriptBuilder;
import org.bitcoinj.wallet.DeterministicKeyChain;
import org.bitcoinj.wallet.DeterministicSeed;
import org.bouncycastle.jcajce.provider.digest.Keccak;
import org.spongycastle.asn1.sec.SECNamedCurves;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.signers.ECDSASigner;
import org.spongycastle.crypto.signers.HMacDSAKCalculator;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Uint;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Keys;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.TransactionEncoder;
import org.web3j.utils.Numeric;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import io.reactivex.Observable;
import timber.log.Timber;

public class Bitcoinj {

    private static void LOG(String msg) {
        if (BuildConfig.DEBUG) {
            Timber.e(msg);
        }
    }

    public static Observable<ResponseUserIdentity> init() {
        return init("");
    }

    public static Observable<ResponseUserIdentity> init(String mnemonicsRaw) {

        try {

            return Observable.just(mnemonicsRaw)
                    .map(mnemonics -> {
//                        List<String> mnemonicWordsInAList = new ArrayList<>();
//                        if (mnemonics.isEmpty()) {
//                            byte[] random = RandomSeed.random(WordCount.TWELVE);
//                            mnemonicWordsInAList = new MnemonicGenerator(ChineseSimplified.INSTANCE).createMnemonic(random);
//
//                            StringBuilder mnemonicsBuilder = new StringBuilder();
//                            for (int i = 0; i < mnemonicWordsInAList.size(); i++) {
//                                mnemonicsBuilder.append(mnemonicWordsInAList.get(i));
//
//                                if (i != mnemonicWordsInAList.size() - 1) {
//                                    mnemonicsBuilder.append(" ");
//                                }
//                            }
//
//                            mnemonics = mnemonicsBuilder.toString();
//                        } else {
//                            mnemonicWordsInAList = Arrays.asList(mnemonics.split(" "));
//                        }
//
//                        byte[] seed = MnemonicCode.toSeed(mnemonicWordsInAList, "");
//                        ExtendedKey extendedKey = ExtendedKey.create(seed);
//
//                        CoinPairDerive coinKeyPair = new CoinPairDerive(extendedKey);
//                        AddressIndex ethAddressIndex = BIP44.m()
//                                .purpose44()
//                                .coinType(CoinTypes.Ethereum)
//                                .account(0)
//                                .external()
//                                .address(0);
//
//                        ECKeyPair ethMaster = coinKeyPair.derive(ethAddressIndex);
//                        String ethAddress = "0x" + ethMaster.getAddress().toLowerCase();
//
//                        String noPrefixAddress = Utility.getSHA256(ethMaster.getPublicKey()).substring(24, 64);
//
//                        AddressIndex btcAddress = BIP44.m()
//                                .purpose44()
//                                .coinType(CoinTypes.Bitcoin)
//                                .account(0)
//                                .external()
//                                .address(0);
//
//                        ECKeyPair btcMaster = coinKeyPair.derive(btcAddress);
//
////                        Log.i("test99", "btc " + btcMaster.getAddress() + " " + btcMaster.getPrivateKey());
//
//                        ResponseUserIdentity responseUserIdentity = new ResponseUserIdentity();
//                        responseUserIdentity.setVersion("0.01");
//                        responseUserIdentity.setMnemonic(mnemonics);
//                        responseUserIdentity.setHDkey(extendedKey.serialize(true));
//
//                        ApiWalletData bitcoinWallet = new ApiWalletData();
//                        bitcoinWallet.setPrivateKey(btcMaster.getPrivateKey());
//                        bitcoinWallet.setAddress(btcMaster.getAddress());
//                        bitcoinWallet.setUncompressAddress("");
//                        responseUserIdentity.setBitcoin(bitcoinWallet);
//
//
//                        ApiWalletData EthWallet = new ApiWalletData();
//                        EthWallet.setPrivateKey(ethMaster.getPrivateKey());
//                        EthWallet.setAddress(ethAddress);
//                        responseUserIdentity.setEthereum(EthWallet);
//
//                        ApiWalletData noPrefixWallet = new ApiWalletData();
//                        noPrefixWallet.setPrivateKey(ethMaster.getPrivateKey());
//                        noPrefixWallet.setAddress(noPrefixAddress);
//                        responseUserIdentity.setNoprefix(noPrefixWallet);
//
//                        return responseUserIdentity;
                        if (mnemonics.isEmpty()) {

                            byte[] initialEntropy = new byte[16];
                            SecureRandom secureRandom = new SecureRandom();
                            secureRandom.nextBytes(initialEntropy);

                            mnemonics = MnemonicUtil.generateMnemonic(initialEntropy);
                        }

                        LOG("mnemonics " + mnemonics);

                        DeterministicSeed deterministicSeed = new DeterministicSeed(mnemonics, null, "", 0L);
                        DeterministicKey rootPrivateKey = HDKeyDerivation.createMasterPrivateKey(deterministicSeed.getSeedBytes());

                        MainNetParams mainnetParams = MainNetParams.get();

                        String hdKey = rootPrivateKey.serializePrivB58(mainnetParams);
                        LOG("HdKey " + hdKey);

                        DeterministicKeyChain deterministicKeyChain = DeterministicKeyChain.builder().seed(deterministicSeed).build();
                        BigInteger privKey = deterministicKeyChain.getKeyByPath(HDUtils.parsePath("44H / 60H / 0H / 0 / 0"), true).getPrivKey();
                        ECKey ecKey = ECKey.fromPrivate(privKey);

                        //BTC
                        String btcKey = ecKey.getPrivateKeyEncoded(mainnetParams).toString();
//                        Address address = ecKey.toAddress(mainnetParams);
                        Address uncompressAddress = LegacyAddress.fromKey(mainnetParams, ecKey.decompress());
                        String btcAdr = uncompressAddress.toString();
                        LOG("btc pky " + btcKey);
                        LOG("btc adr " + btcAdr);


                        //ETH
                        ECKeyPair childEcKeyPair0 = ECKeyPair.create(privKey);
                        String ethPky = ecKey.getPrivateKeyAsHex();
                        String ethAdr = "0x" + Keys.getAddress(childEcKeyPair0);
                        LOG("eth pky " + ethPky);
                        LOG("eth adr " + ethAdr);
                        LOG("eth getPublicKeyAsHex " + ecKey.decompress().getPublicKeyAsHex().substring(2));

                        String noPrefixAddress = Utility.getSHA256(ecKey.decompress().getPublicKeyAsHex().substring(2)).substring(24, 64);

                        LOG("noPrefixAddress " + noPrefixAddress);

                        ResponseUserIdentity responseUserIdentity = new ResponseUserIdentity();
                        responseUserIdentity.setVersion("0.01");
                        responseUserIdentity.setMnemonic(mnemonics);
                        responseUserIdentity.setHDkey(hdKey);

                        ApiWalletData bitcoinWallet = new ApiWalletData();
                        bitcoinWallet.setPrivateKey(btcKey);
                        bitcoinWallet.setAddress(btcAdr);
                        responseUserIdentity.setBitcoin(bitcoinWallet);


                        ApiWalletData ethWallet = new ApiWalletData();
                        ethWallet.setPrivateKey(ethPky);
                        ethWallet.setAddress(ethAdr);
                        responseUserIdentity.setEthereum(ethWallet);

                        ApiWalletData noPrefixWallet = new ApiWalletData();
                        noPrefixWallet.setPrivateKey(ethPky);
                        noPrefixWallet.setAddress(noPrefixAddress);
                        responseUserIdentity.setNoprefix(noPrefixWallet);

                        Timber.d(new Gson().toJson(responseUserIdentity));
                        return responseUserIdentity;
                    });

        } catch (Exception e) {
            e.printStackTrace();
            return Observable.error(new Throwable(e));
        }
    }

    public final static String ADDRESS = "ADDRESS";
    public final static String KEY = "KEY";

    public static HashMap<String, String> createBtcAddressByMnemonic(String mnemonic, List<String> addressList) {

        HashMap<String, String> hashMap = new LinkedHashMap<>();

        try {
            DeterministicSeed deterministicSeed = new DeterministicSeed(mnemonic, null, "", 0L);
            DeterministicKey rootPrivateKey = HDKeyDerivation.createMasterPrivateKey(deterministicSeed.getSeedBytes());

            MainNetParams mainnetParams = MainNetParams.get();

            String hdKey = rootPrivateKey.serializePrivB58(mainnetParams);
            LOG("HdKey " + hdKey);

            DeterministicKeyChain deterministicKeyChain = DeterministicKeyChain.builder().seed(deterministicSeed).build();
            //  最多可以利用一個住記詞創建出 10 個錢包
            BigInteger privKey = null;
            for (int i = 0; i < 10; i++) {
                BigInteger priKey = deterministicKeyChain.getKeyByPath(HDUtils.parsePath("44H / 60H / 0H / 0 / " + i), true).getPrivKey();
                ECKey ecKey = ECKey.fromPrivate(priKey);
                Address address = LegacyAddress.fromKey(mainnetParams, ecKey.decompress());
                String btcAdr = address.toString();
                if (!addressList.contains(btcAdr)) {
                    privKey = priKey;
                    break;
                }
            }
            ECKey ecKey = ECKey.fromPrivate(privKey);
            //BTC
            String btcKey = ecKey.getPrivateKeyEncoded(mainnetParams).toString();
            Address address = LegacyAddress.fromKey(mainnetParams, ecKey.decompress());
            String btcAdr = address.toString();
            LOG("btc pky " + btcKey);
            LOG("btc adr " + btcAdr);

            if (!addressList.contains(btcAdr)) {
                hashMap.put(ADDRESS, btcAdr);
                hashMap.put(KEY, btcKey);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hashMap;
    }

    public static HashMap<String, String> createEthAddressByMnemonic(String mnemonic, List<String> addressList) {

        HashMap<String, String> hashMap = new LinkedHashMap<>();

        try {
            DeterministicSeed deterministicSeed = new DeterministicSeed(mnemonic, null, "", 0L);
            DeterministicKey rootPrivateKey = HDKeyDerivation.createMasterPrivateKey(deterministicSeed.getSeedBytes());

            MainNetParams mainnetParams = MainNetParams.get();

            String hdKey = rootPrivateKey.serializePrivB58(mainnetParams);
            LOG("HdKey " + hdKey);

            DeterministicKeyChain deterministicKeyChain = DeterministicKeyChain.builder().seed(deterministicSeed).build();
            BigInteger privKey = null;
            for (int i = 0; i < 10; i++) {
                BigInteger priKey = deterministicKeyChain.getKeyByPath(HDUtils.parsePath("44H / 60H / 0H / 0 / " + i), true).getPrivKey();
                ECKeyPair childEcKeyPair0 = ECKeyPair.create(priKey);
                String ethAdr = "0x" + Keys.getAddress(childEcKeyPair0);
                if (!addressList.contains(ethAdr)) {
                    privKey = priKey;
                    break;
                }
            }
            ECKey ecKey = ECKey.fromPrivate(privKey);
            //ETH
            ECKeyPair childEcKeyPair0 = ECKeyPair.create(privKey);
            String ethPky = ecKey.getPrivateKeyAsHex();
            String ethAdr = "0x" + Keys.getAddress(childEcKeyPair0);
            LOG("eth pky " + ethPky);
            LOG("eth adr " + ethAdr);

            if (!addressList.contains(ethAdr)) {
                hashMap.put(ADDRESS, ethAdr);
                hashMap.put(KEY, ethPky);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hashMap;
    }

    public static Observable<String> signBtcTransaction(SignBTCBodyData model, String ttnAddress, String btcAddress) {

        try {

            return Observable.just(model)
                    .map(signBTCBodyModel -> {
                        Timber.i("test99 signBtcTransaction 0");

                        NetworkParameters networkParams = MainNetParams.get();

                        String privateKeyRaw = signBTCBodyModel.getPrivatekey();
                        DumpedPrivateKey dumpedPrivateKey = DumpedPrivateKey.fromBase58(networkParams, privateKeyRaw);
                        ECKey ecKey = dumpedPrivateKey.getKey();

                        org.bitcoinj.core.Transaction transaction = new org.bitcoinj.core.Transaction(networkParams);

                        //output
                        for (TxData txModel : signBTCBodyModel.getTx()) {
                            transaction.addOutput(Coin.valueOf(Long.valueOf((long) txModel.getValue())), LegacyAddress.fromBase58(networkParams, txModel.getAddress()));
                        }
                        //add output with ttnAddress
                        Timber.i("test99 ttnAddress: %s", ttnAddress);
                        ByteArrayOutputStream os = new ByteArrayOutputStream();
                        os.write(0x6a);

                        byte[] data = HexUtil.fromHex("c2cccccc0000000000000001" + ttnAddress);
                        os.write(data != null ? data.length : 0);
                        os.write(data);
                        os.close();

                        transaction.addOutput(Coin.valueOf(0), new Script(os.toByteArray()));

                        //input
                        String ethPky = ecKey.getPrivateKeyAsHex();
                        ECKey uncompressKey = ECKey.fromPrivate(new BigInteger(ethPky, 16).toByteArray(), false);
                        ECKey compressKey = ECKey.fromPrivate(new BigInteger(ethPky, 16).toByteArray(), true);

                        String uncompressAddress = LegacyAddress.fromKey(networkParams, uncompressKey).toBase58();
                        String compressAddress = LegacyAddress.fromKey(networkParams, compressKey).toBase58();

                        Script uncompressScript = ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, uncompressKey));
                        Timber.i("test99 uncompressScript: %s", uncompressScript.toString());

                        Script compressScript = ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, compressKey));
                        Timber.i("test99 compressScript: %s", compressScript.toString());

                        Script checkScript;
                        ECKey checkKey;

                        if (uncompressAddress.equals(btcAddress)) {
                            checkScript = uncompressScript;
                            checkKey = uncompressKey;
                        } else if (compressAddress.equals(btcAddress)) {
                            checkScript = compressScript;
                            checkKey = compressKey;
                        } else {
                            return "";
                        }

//                        //for test output format
//                        byte[] data1 = new byte[0];
//                        transaction.addInput(new TransactionInput(networkParams, transaction, data1));
                        for (UnspendData unspendModel : signBTCBodyModel.getUnspend()) {
                            transaction.addInput(Sha256Hash.wrap(unspendModel.getTxid()), (long) unspendModel.getValue(), checkScript);
                        }

                        for (int i = 0; i < transaction.getInputs().size(); i++) {
                            TransactionInput transactionInput = transaction.getInput(i);

                            Sha256Hash hash = transaction.hashForSignature(i, checkScript, org.bitcoinj.core.Transaction.SigHash.ALL, false);
                            ECKey.ECDSASignature ecSig = checkKey.sign(hash);
                            TransactionSignature txSig = new TransactionSignature(ecSig, org.bitcoinj.core.Transaction.SigHash.ALL, false);

                            Script inputScript = ScriptBuilder.createInputScript(txSig, checkKey);

                            transactionInput.setScriptSig(inputScript);
                        }

                        String signTx = new String(Hex.encodeHex(transaction.bitcoinSerialize()));
                        Timber.i("test99 signTx: %s", signTx);

                        return signTx;
                    });

        } catch (Exception e) {
            Timber.i("test99 signTx e: %s", e.getMessage());
            return Observable.error(new Throwable(e));
        }

    }

    public static Observable<String> signBtcTransaction(SignBTCBodyData model, String btcAddress) {

        try {

            return Observable.just(model)
                    .map(signBTCBodyModel -> {
                        Timber.i("test99 signBtcTransaction 0");

                        NetworkParameters networkParams = MainNetParams.get();

                        String privateKeyRaw = signBTCBodyModel.getPrivatekey();
                        DumpedPrivateKey dumpedPrivateKey = DumpedPrivateKey.fromBase58(networkParams, privateKeyRaw);
                        ECKey ecKey = dumpedPrivateKey.getKey();

                        org.bitcoinj.core.Transaction transaction = new org.bitcoinj.core.Transaction(networkParams);

                        //output
                        for (TxData txModel : signBTCBodyModel.getTx()) {
                            transaction.addOutput(Coin.valueOf((long) txModel.getValue()), LegacyAddress.fromBase58(networkParams, txModel.getAddress()));
                        }

                        //input
                        String ethPky = ecKey.getPrivateKeyAsHex();
                        ECKey uncompressKey = ECKey.fromPrivate(new BigInteger(ethPky, 16).toByteArray(), false);
                        ECKey compressKey = ECKey.fromPrivate(new BigInteger(ethPky, 16).toByteArray(), true);

                        String uncompressAddress = LegacyAddress.fromKey(networkParams, uncompressKey).toBase58();
                        String compressAddress = LegacyAddress.fromKey(networkParams, compressKey).toBase58();

                        Script uncompressScript = ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, uncompressKey));
                        Timber.i("test99 uncompressScript: %s", uncompressScript.toString());

                        Script compressScript = ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, compressKey));
                        Timber.i("test99 compressScript: %s", compressScript.toString());

                        Script checkScript;
                        ECKey checkKey;

                        if (uncompressAddress.equals(btcAddress)) {
                            checkScript = uncompressScript;
                            checkKey = uncompressKey;
                        } else if (compressAddress.equals(btcAddress)) {
                            checkScript = compressScript;
                            checkKey = compressKey;
                        } else {
                            return "";
                        }

                        for (UnspendData unspendModel : signBTCBodyModel.getUnspend()) {
                            transaction.addInput(Sha256Hash.wrap(unspendModel.getTxid()), (long) unspendModel.getValue(), checkScript);
                        }

                        for (int i = 0; i < transaction.getInputs().size(); i++) {
                            TransactionInput transactionInput = transaction.getInput(i);

                            Sha256Hash hash = transaction.hashForSignature(i, checkScript, org.bitcoinj.core.Transaction.SigHash.ALL, false);
                            ECKey.ECDSASignature ecSig = checkKey.sign(hash);
                            TransactionSignature txSig = new TransactionSignature(ecSig, org.bitcoinj.core.Transaction.SigHash.ALL, false);

                            Script inputScript = ScriptBuilder.createInputScript(txSig, checkKey);

                            transactionInput.setScriptSig(inputScript);
                        }

                        String signTx = new String(Hex.encodeHex(transaction.bitcoinSerialize()));
                        Timber.i("test99 signTx: %s", signTx);

                        return signTx;
                    });

        } catch (Exception e) {
            Timber.i("test99 signTx e: %s", e.getMessage());
            return Observable.error(new Throwable(e));
        }

    }

    public static Observable<String> signUsdtTransaction(SignBTCBodyData model, String ttnAddress, BigDecimal usdtAmount, String btcAddress) {

        try {

            return Observable.just(model)
                    .map(signBTCBodyModel -> {
                        Timber.i("test98 signUsdtTransaction 0");

                        NetworkParameters networkParams = MainNetParams.get();

                        String privateKeyRaw = signBTCBodyModel.getPrivatekey();
                        DumpedPrivateKey dumpedPrivateKey = DumpedPrivateKey.fromBase58(networkParams, privateKeyRaw);
                        ECKey ecKey = dumpedPrivateKey.getKey();

                        org.bitcoinj.core.Transaction transaction = new org.bitcoinj.core.Transaction(networkParams);

                        //output

                        // usdt
                        ByteArrayOutputStream os = new ByteArrayOutputStream();
                        os.write(0x6a);

                        String usdtHex = usdtAmount.toBigInteger().toString(16);
                        String padded = "0000000000000000".substring(usdtHex.length()) + usdtHex;

                        Timber.i("test98 padded: %s", padded);

                        byte[] data = HexUtil.fromHex("6f6d6e69000000000000001f" + padded);
                        os.write(data != null ? data.length : 0);
                        os.write(data);
                        os.close();

                        transaction.addOutput(Coin.valueOf(0), new Script(os.toByteArray()));
                        //usdt-n
                        transaction.addOutput(Coin.valueOf(546), new Script(buildOutput(Utility.ttnAddressToBase58(ttnAddress))));

                        for (TxData txModel : signBTCBodyModel.getTx()) {
                            transaction.addOutput(Coin.valueOf((long) txModel.getValue()), LegacyAddress.fromBase58(networkParams, txModel.getAddress()));
                        }

                        //input
                        String ethPky = ecKey.getPrivateKeyAsHex();
                        ECKey uncompressKey = ECKey.fromPrivate(new BigInteger(ethPky, 16).toByteArray(), false);
                        ECKey compressKey = ECKey.fromPrivate(new BigInteger(ethPky, 16).toByteArray(), true);

                        String uncompressAddress = LegacyAddress.fromKey(networkParams, uncompressKey).toBase58();
                        String compressAddress = LegacyAddress.fromKey(networkParams, compressKey).toBase58();

                        Script uncompressScript = ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, uncompressKey));
                        Timber.i("test98 uncompressScript: %s", uncompressScript.toString());

                        Script compressScript = ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, compressKey));
                        Timber.i("test98 compressScript: %s", compressScript.toString());

                        Script checkScript;
                        ECKey checkKey;

                        if (uncompressAddress.equals(btcAddress)) {
                            checkScript = uncompressScript;
                            checkKey = uncompressKey;
                        } else if (compressAddress.equals(btcAddress)) {
                            checkScript = compressScript;
                            checkKey = compressKey;
                        } else {
                            return "";
                        }

//                        //for test output format
//                        byte[] data1 = new byte[0];
//                        transaction.addInput(new TransactionInput(networkParams, transaction, data1));
                        for (UnspendData unspendModel : signBTCBodyModel.getUnspend()) {
                            transaction.addInput(Sha256Hash.wrap(unspendModel.getTxid()), (long) unspendModel.getValue(), checkScript);
                        }

                        for (int i = 0; i < transaction.getInputs().size(); i++) {
                            TransactionInput transactionInput = transaction.getInput(i);

                            Sha256Hash hash = transaction.hashForSignature(i, checkScript, org.bitcoinj.core.Transaction.SigHash.ALL, false);
                            ECKey.ECDSASignature ecSig = checkKey.sign(hash);
                            TransactionSignature txSig = new TransactionSignature(ecSig, org.bitcoinj.core.Transaction.SigHash.ALL, false);

                            Script inputScript = ScriptBuilder.createInputScript(txSig, checkKey);

                            transactionInput.setScriptSig(inputScript);
                        }

                        String signTx = new String(Hex.encodeHex(transaction.bitcoinSerialize()));
                        Timber.i("test98 signTx: %s", signTx);

                        return signTx;
                    });

        } catch (Exception e) {
            Timber.i("test98 signTx e: %s", e.getMessage());
            return Observable.error(new Throwable(e));
        }

    }

    public static Observable<String> signUsdtTransaction(SignBTCBodyData model, BigDecimal usdtAmount, String btcAddress) {

        try {

            return Observable.just(model)
                    .map(signBTCBodyModel -> {
                        Timber.i("test98 signUsdtTransaction 0");

                        NetworkParameters networkParams = MainNetParams.get();

                        String privateKeyRaw = signBTCBodyModel.getPrivatekey();
                        DumpedPrivateKey dumpedPrivateKey = DumpedPrivateKey.fromBase58(networkParams, privateKeyRaw);
                        ECKey ecKey = dumpedPrivateKey.getKey();

                        org.bitcoinj.core.Transaction transaction = new org.bitcoinj.core.Transaction(networkParams);

                        //output

                        // usdt
                        ByteArrayOutputStream os = new ByteArrayOutputStream();
                        os.write(0x6a);

                        String usdtHex = usdtAmount.toBigInteger().toString(16);
                        String padded = "0000000000000000".substring(usdtHex.length()) + usdtHex;

                        Timber.i("test98 padded: %s", padded);

                        byte[] data = HexUtil.fromHex("6f6d6e69000000000000001f" + padded);
                        os.write(data.length);
                        os.write(data);
                        os.close();

                        transaction.addOutput(Coin.valueOf(0), new Script(os.toByteArray()));

                        for (TxData txModel : signBTCBodyModel.getTx()) {
                            transaction.addOutput(Coin.valueOf((long) txModel.getValue()), LegacyAddress.fromBase58(networkParams, txModel.getAddress()));
                        }

                        //input
                        String ethPky = ecKey.getPrivateKeyAsHex();
                        ECKey uncompressKey = ECKey.fromPrivate(new BigInteger(ethPky, 16).toByteArray(), false);
                        ECKey compressKey = ECKey.fromPrivate(new BigInteger(ethPky, 16).toByteArray(), true);

                        String uncompressAddress = LegacyAddress.fromKey(networkParams, uncompressKey).toBase58();
                        String compressAddress = LegacyAddress.fromKey(networkParams, compressKey).toBase58();

                        Script uncompressScript = ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, uncompressKey));
                        Timber.i("test98 uncompressScript: %s", uncompressScript.toString());

                        Script compressScript = ScriptBuilder.createOutputScript(LegacyAddress.fromKey(networkParams, compressKey));
                        Timber.i("test98 compressScript: %s", compressScript.toString());

                        Script checkScript;
                        ECKey checkKey;

                        if (uncompressAddress.equals(btcAddress)) {
                            checkScript = uncompressScript;
                            checkKey = uncompressKey;
                        } else if (compressAddress.equals(btcAddress)) {
                            checkScript = compressScript;
                            checkKey = compressKey;
                        } else {
                            return "";
                        }

//                        //for test
//                        byte[] data1 = new byte[0];
//                        transaction.addInput(new TransactionInput(networkParams, transaction, data1));
                        for (UnspendData unspendModel : signBTCBodyModel.getUnspend()) {
                            transaction.addInput(Sha256Hash.wrap(unspendModel.getTxid()), (long) unspendModel.getValue(), checkScript);
                        }

                        for (int i = 0; i < transaction.getInputs().size(); i++) {
                            TransactionInput transactionInput = transaction.getInput(i);

                            Sha256Hash hash = transaction.hashForSignature(i, checkScript, org.bitcoinj.core.Transaction.SigHash.ALL, false);
                            ECKey.ECDSASignature ecSig = checkKey.sign(hash);
                            TransactionSignature txSig = new TransactionSignature(ecSig, org.bitcoinj.core.Transaction.SigHash.ALL, false);

                            Script inputScript = ScriptBuilder.createInputScript(txSig, checkKey);

                            transactionInput.setScriptSig(inputScript);
                        }

                        String signTx = new String(Hex.encodeHex(transaction.bitcoinSerialize()));
                        Timber.i("test98 signTx: %s", signTx);

                        return signTx;
                    });

        } catch (Exception e) {
            Timber.i("test98 signTx e: %s", e.getMessage());
            return Observable.error(new Throwable(e));
        }

    }

    public static Observable<String> signEthTransaction(SignETHBodyRequest signModel, SignEthQueryModel queryModel) {
        try {
            return Observable.just(signModel)
                    .map(model -> {
                        ECKeyPair ecKeyPair = ECKeyPair.create(new BigInteger(model.getPrivateKey(), 16));
                        Credentials credentials = Credentials.create(ecKeyPair);

                        byte[] signByte;

                        BigInteger nonce = new BigInteger(queryModel.getNonce().substring(2), 16);  //remove 0x
                        BigInteger gasPrice = new BigInteger(queryModel.getGasPrice());
                        BigInteger gasLimit = new BigInteger(queryModel.getGasLimit());
                        BigInteger amount = new BigInteger(queryModel.getValue());
                        String toAddr = queryModel.getTo().substring(2);  //remove 0x

                        if (signModel.getContractAddress() == null) {

                            RawTransaction txRaw = RawTransaction.createEtherTransaction(
                                    nonce,
                                    gasPrice,
                                    gasLimit,
                                    toAddr,
                                    amount
                            );
                            signByte = TransactionEncoder.signMessage(txRaw, credentials);

                        } else {
                            String contractAddr = signModel.getContractAddress().substring(2);  //remove 0x

                            org.web3j.abi.datatypes.Address addressType = new org.web3j.abi.datatypes.Address(toAddr);
                            Uint amountType = new Uint(amount);

                            Function function = new Function(
                                    "transfer",  // function we're calling
                                    Arrays.asList(addressType, amountType),  // Parameters to pass as Solidity Types
                                    Arrays.asList(new TypeReference<Type>() {
                                    }));

                            String encodedFunction = FunctionEncoder.encode(function);

                            RawTransaction txRaw = RawTransaction.createTransaction(
                                    nonce,
                                    gasPrice,
                                    gasLimit,
                                    contractAddr,
                                    encodedFunction
                            );
                            signByte = TransactionEncoder.signMessage(txRaw, credentials);
                        }

                        return Numeric.toHexString(signByte).substring(2); //remove 0x
                    });

        } catch (Exception e) {
            return Observable.error(new Throwable(e));
        }
    }

    public static Observable<String> signEthTransaction(SignETHBodyRequest signModel, SignEthQueryModel queryModel, String ttnAddress) {
        try {
            return Observable.just(signModel)
                    .map(model -> {
                        ECKeyPair ecKeyPair = ECKeyPair.create(new BigInteger(model.getPrivateKey(), 16));
                        Credentials credentials = Credentials.create(ecKeyPair);

                        byte[] signByte;

                        BigInteger nonce = new BigInteger(queryModel.getNonce().substring(2), 16);  //remove 0x
                        BigInteger gasPrice = new BigInteger(queryModel.getGasPrice());
                        BigInteger gasLimit = new BigInteger(queryModel.getGasLimit());
                        BigInteger amount = new BigInteger(queryModel.getValue());
                        String toAddr = queryModel.getTo().substring(2);  //remove 0x

                        String data = "0xc2cccccc0000000000000001" + ttnAddress;
                        RawTransaction txRaw = RawTransaction.createTransaction(
                                nonce,
                                gasPrice,
                                gasLimit,
                                toAddr,
                                amount,
                                data
                        );
                        signByte = TransactionEncoder.signMessage(txRaw, credentials);

                        return Numeric.toHexString(signByte).substring(2); //remove 0x
                    });

        } catch (Exception e) {
            return Observable.error(new Throwable(e));
        }
    }

    public static Observable<String> signEthRawTransaction(com.ttchain.walletproject.model.Transaction transaction, String pky, String nonce) {
        try {
            return Observable.just("")
                    .map(model -> {
                        ECKeyPair ecKeyPair = ECKeyPair.create(new BigInteger(pky, 16));
                        Credentials credentials = Credentials.create(ecKeyPair);

                        byte[] signByte;

                        BigInteger nonceB = new BigInteger(nonce.substring(2), 16);
                        BigInteger gasPrice = BigInteger.valueOf(NumberUtils.INSTANCE.hexToLong(transaction.gasPrice));
                        BigInteger gasLimit = BigInteger.valueOf(NumberUtils.INSTANCE.hexToLong(transaction.gasLimit));
                        BigInteger amount = BigInteger.valueOf(NumberUtils.INSTANCE.hexToLong(transaction.value));

                        String toAddress = transaction.to.replace("0x", "");

                        RawTransaction txRaw = RawTransaction.createTransaction(
                                nonceB,
                                gasPrice,
                                gasLimit,
                                toAddress,
                                amount,
                                transaction.data
                        );
                        signByte = TransactionEncoder.signMessage(txRaw, credentials);

                        return Numeric.toHexString(signByte).substring(2); //remove 0x
                    });

        } catch (Exception e) {
            return Observable.error(new Throwable(e));
        }
    }

    public static Observable<String> signPersonaMessage(String msg, String pky) {

        try {
            return Observable.just(msg)
                    .map(message -> {
                        byte[] unSignData = ("\u0019Ethereum Signed Message:\n"
                                + message.getBytes().length
                                + message).getBytes();

                        Keccak.DigestKeccak kecc = new Keccak.Digest256();
                        kecc.update(unSignData, 0, unSignData.length);
                        byte[] messageHash = kecc.digest();

                        BigInteger pkyBigInt = new BigInteger(pky, 16);

                        X9ECParameters CURVE = SECNamedCurves.getByName("secp256k1");
                        ECDomainParameters domain = new ECDomainParameters(CURVE.getCurve(), CURVE.getG(), CURVE.getN(), CURVE.getH());

                        ECDSASigner signer = new ECDSASigner(new HMacDSAKCalculator(new SHA256Digest()));
                        ECPrivateKeyParameters privKeyParams = new ECPrivateKeyParameters(pkyBigInt, domain);
                        signer.init(true, privKeyParams);
                        BigInteger[] components = signer.generateSignature(messageHash);

                        byte[] pub = CURVE.getG().multiply(pkyBigInt).getEncoded(false);


                        BigInteger publicKey = new BigInteger(1, Arrays.copyOfRange(pub, 1, pub.length));

                        ECDSASignature signature = new ECDSASignature(components[0], components[1]).toCanonicalised();


                        int recId = -1;
                        for (int i = 0; i < 4; ++i) {
                            byte[] k = EthECKeyPair.recoverPubBytesFromSignature(i, signature, messageHash);
                            BigInteger kBig = new BigInteger(1, Arrays.copyOfRange(k, 1, k.length));
                            if (kBig.equals(publicKey)) {
                                recId = i;
                                break;
                            }
                        }
                        if (recId == -1) {
                            throw new RuntimeException("Could not construct a recoverable key. This should never happen.");
                        } else {
                            signature.v = (byte) (recId + 27);
                        }

                        byte[] sigQ = new byte[65];
                        System.arraycopy(ECDSASignature.bigIntegerToBytes(signature.r), 0, sigQ, 0, 32);
                        System.arraycopy(ECDSASignature.bigIntegerToBytes(signature.s), 0, sigQ, 32, 32);
                        sigQ[64] = signature.v;

                        return Utility.toHexString(sigQ);


                    });
        } catch (Exception e) {
            return Observable.error(new Throwable(e));
        }
    }

    public static Observable<String> keyToAddress(String pky, String mainCoinId) {
        try {

            return Observable.just(pky)
                    .map(privateKeyRaw -> {

                        if (CoinEnum.BTC.getCoinId().equals(mainCoinId)) {
                            NetworkParameters params = MainNetParams.get();
                            DumpedPrivateKey dumpedPrivateKey = DumpedPrivateKey.fromBase58(params, privateKeyRaw);
                            ECKey key = dumpedPrivateKey.getKey();

                            Address compressAddressFromKey = LegacyAddress.fromKey(params, key.decompress());

                            String btcCompressAddr = compressAddressFromKey.toString();
                            LOG("compress btc " + btcCompressAddr);
                            return btcCompressAddr;
                        } else if (CoinEnum.ETH.getCoinId().equals(mainCoinId)) {
                            ECKeyPair ecKeyPair = ECKeyPair.create(new BigInteger(privateKeyRaw, 16));
                            Credentials credentials = Credentials.create(ecKeyPair);

                            return credentials.getAddress().toLowerCase(); //包含前綴0x
                        }
                        return "";
                    });

        } catch (Exception e) {
            Timber.e("keyToAddress e: %s", e.getMessage());
            return Observable.error(new Throwable(e));
        }
    }

    public static Observable<Boolean> checkBtcAddressIsCompress(String pky, String btcAddress) {
        try {

            return Observable.just(pky)
                    .map(privateKeyRaw -> {

                        NetworkParameters params = MainNetParams.get();
                        DumpedPrivateKey dumpedPrivateKey = DumpedPrivateKey.fromBase58(params, privateKeyRaw);
                        ECKey key = dumpedPrivateKey.getKey();

                        Address compressAddressFromKey = LegacyAddress.fromKey(params, key);

                        String btcCompressAddr = compressAddressFromKey.toString();
                        return btcAddress.equals(btcCompressAddr);
                    });

        } catch (Exception e) {
            Timber.e("CheckBtcAddressIsCompress e: %s", e.getMessage());
            return Observable.error(new Throwable(e));
        }
    }

    private static byte[] buildOutput(String address) throws BitcoinException {
        try {
            byte[] addressWithCheckSumAndNetworkCode = Base58.decode(address);
//            if (addressWithCheckSumAndNetworkCode[0] != 0 && addressWithCheckSumAndNetworkCode[0] != 111 && addressWithCheckSumAndNetworkCode[0] != 5) {
//                throw new BitcoinException(11, "Unknown address type", address);
//            } else {
                byte[] bareAddress = new byte[20];
                System.arraycopy(addressWithCheckSumAndNetworkCode, 1, bareAddress, 0, bareAddress.length);
                MessageDigest digestSha = MessageDigest.getInstance("SHA-256");
                digestSha.update(addressWithCheckSumAndNetworkCode, 0, addressWithCheckSumAndNetworkCode.length - 4);
                byte[] calculatedDigest = digestSha.digest(digestSha.digest());

                for(int i = 0; i < 4; ++i) {
                    if (calculatedDigest[i] != addressWithCheckSumAndNetworkCode[addressWithCheckSumAndNetworkCode.length - 4 + i]) {
                        throw new BitcoinException(3, "Bad address", address);
                    }
                }

                ByteArrayOutputStream buf;
                if (addressWithCheckSumAndNetworkCode[0] == 5) {
                    buf = new ByteArrayOutputStream();
                    buf.write(-87);
                    writeBytes(bareAddress, buf);
                    buf.write(-121);
                    return buf.toByteArray();
                } else {
                    buf = new ByteArrayOutputStream(25);
                    buf.write(118);
                    buf.write(-87);
                    writeBytes(bareAddress, buf);
                    buf.write(-120);
                    buf.write(-84);
                    return buf.toByteArray();
                }
//            }
        } catch (NoSuchAlgorithmException | IOException var6) {
            throw new RuntimeException(var6);
        }
    }

    private static void writeBytes(byte[] data, ByteArrayOutputStream baos) throws IOException {
        if (data.length < 76) {
            baos.write(data.length);
        } else if (data.length < 255) {
            baos.write(76);
            baos.write(data.length);
        } else if (data.length < 65535) {
            baos.write(77);
            baos.write(data.length & 255);
            baos.write(data.length >> 8 & 255);
        } else {
            baos.write(78);
            baos.write(data.length & 255);
            baos.write(data.length >> 8 & 255);
            baos.write(data.length >> 16 & 255);
            baos.write(data.length >>> 24 & 255);
        }

        baos.write(data);
    }
}
