package com.ttchain.walletproject.ui.webview

import android.webkit.WebView
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.blockchain.Bitcoinj
import com.ttchain.walletproject.database.data.WalletData
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.model.DbHelper
import com.ttchain.walletproject.model.MainnetInfuraRequest
import com.ttchain.walletproject.model.Message
import com.ttchain.walletproject.model.Transaction
import com.ttchain.walletproject.repository.BroadcastRepository
import com.ttchain.walletproject.repository.VerifyRepository
import com.ttchain.walletproject.toMain
import com.ttchain.walletproject.utils.Utility
import com.ttchain.walletproject.utils.Utils
import timber.log.Timber
import java.util.*

class WebViewViewModel(
    private val dbHelper: DbHelper,
    private val verifyRepository: VerifyRepository,
    private val broadcastRepository: BroadcastRepository
) : BaseViewModel() {

    var onViewCreateLivaData = MutableLiveData<String>()

    init {
        onViewCreate()
    }

    fun onViewCreate() {
        var ethAddress = ""
        if (getEthWalletDataList().isNotEmpty()) {
            ethAddress = getEthWalletDataList()[0].address
        }
        onViewCreateLivaData.postValue(ethAddress)
    }

    var signTxActionLiveData = MutableLiveData<Transaction>()

    fun signTxAction(webView: WebView, transaction: Transaction) {
        webView.post {
            //            mView.onSignCancel(transaction);
            //            mView.onSignTransactionSuccessful(transaction, "");

            var ethAddress = ""
            if (getEthWalletDataList().isNotEmpty()) {
                ethAddress = getEthWalletDataList()[0].address
            }

            transaction.from = ethAddress

            if (transaction.value == null) {
                transaction.value = "0x0"
            }

            if (transaction.gasPrice == null) {
                transaction.gasPrice = "0xb2d05e00"
            }
            if (transaction.gasLimit == null) {
                transaction.gasLimit = "0xc3500"
            }
            signTxActionLiveData.postValue(transaction)
        }
    }


    private fun getEthWalletDataList(): List<WalletData> {
        val list = ArrayList<WalletData>()

        for (walletData in dbHelper.getWalletDataList()) {
            if (walletData.mainCoinId == CoinEnum.ETH.coinId) {
                list.add(walletData)
            }
        }

        return list
    }

    fun performGetEthNonceRequest(transaction: Transaction) {
        val infuraModel = MainnetInfuraRequest().apply {
            jsonrpc = "2.0"
            method = "eth_getTransactionCount"
            id = 1
            addParamsItem(transaction.from)
            addParamsItem("latest")
        }
        add(
            broadcastRepository.performMainnetInfuraRequest(infuraModel)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({ data ->
                    val nonce = data.data
                    performEthSignRequest(transaction, nonce ?: "")
                }, { throwable ->
                    isLoading.postValue(false)
                    Timber.i("test99 throwable $throwable")
                })
        )
    }

    private fun performEthSignRequest(transaction: Transaction, nonce: String) {
        val walletData = getEthWalletDataList()[0]
        val pky = Utility.decryptPrivateKey(
            walletData.epKey,
            verifyRepository.decryptString(walletData.pwd)
        )
        add(
            Bitcoinj.signEthRawTransaction(transaction, pky, nonce)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = false))
                .subscribe({ signText ->
                    Timber.i("test99 signText $signText")
                    performEthBroadcastRequest(transaction, signText)
                }, { throwable ->
                    isLoading.postValue(false)
                    Timber.i("test99 throwable $throwable")
                })
        )
    }

    var onSignTransactionSuccessfulLiveData = MutableLiveData<Array<Any>>()

    private fun performEthBroadcastRequest(transaction: Transaction, signText: String) {
        val infuraModel = MainnetInfuraRequest().apply {
            jsonrpc = "2.0"
            method = "eth_sendRawTransaction"
            id = 1
            addParamsItem("0x$signText")
        }
        add(
            broadcastRepository.performMainnetInfuraRequest(infuraModel)
                .toMain()
                .compose(loadingView(showLoading = true, closeLoading = true))
                .subscribe({ data ->
                    val hex = data.data
                    Timber.i("test99 hex $hex")
                    val sdf = arrayOf(transaction, hex ?: "")
                    onSignTransactionSuccessfulLiveData.postValue(sdf)
                }, { throwable ->
                    isLoading.postValue(false)
                    Timber.i("test99 throwable $throwable")
                })
        )
    }

    var signPersonalMessageLiveData = MutableLiveData<Array<Any>>()

    fun signPersonalMessage(message: Message<Transaction>) {
        val msg = Utils.hexToString(message.value.data)
        signPersonalMessageLiveData.postValue(arrayOf(message, msg))
    }

    var onSignMessageSuccessfulLiveData = MutableLiveData<Array<Any>>()

    fun performSignPersonalMessage(message: Message<Transaction>) {
        //        String msg = message.value.data;
        val msg = Utils.hexToString(message.value.data)
        val walletData = getEthWalletDataList().get(0)
        val pky = Utility.decryptPrivateKey(
            walletData.epKey,
            verifyRepository.decryptString(walletData.pwd)
        )
        add(
            Bitcoinj.signPersonaMessage(msg, pky)
                .toMain()
                .subscribe({ hexSign ->
                    Timber.i("test99 hexSign $hexSign")
                    onSignMessageSuccessfulLiveData.postValue(arrayOf(message, hexSign))
                }, { throwable ->
                    //                    mView.onHideLoading();
                    Timber.i("test99 throwable $throwable")
                })
        )
    }
}