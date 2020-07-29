package com.ttchain.walletproject.base

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ttchain.walletproject.App.Companion.app
import com.ttchain.walletproject.App.Companion.rateList
import com.ttchain.walletproject.R
import com.ttchain.walletproject.model.BtcTransferException
import com.ttchain.walletproject.model.MinerFeeEditBean
import com.ttchain.walletproject.model.MinerFeeSatItemBean
import com.ttchain.walletproject.net.ApiError
import com.ttchain.walletproject.net.ApiException
import com.ttchain.walletproject.showNumber
import com.ttchain.walletproject.utils.NumberUtils
import io.reactivex.ObservableTransformer
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import timber.log.Timber
import java.math.BigDecimal
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

abstract class BaseViewModel : AndroidViewModel(app) {
    val RATE_DATA_CACHE_TIME_IN_SEC = 60 * 5

    var minerFeeHeaderItemAmountText = MutableLiveData<String>()
    var minerFeeSatItem = MutableLiveData<MinerFeeSatItemBean>()
    var minerFeeSatItemGas = MutableLiveData<MinerFeeEditBean>()
    var minerFeeGasItemGasPriceRange = MutableLiveData<MinerFeeEditBean>()

    var showToastText = MutableLiveData<String>()
    var isViewFinished = MutableLiveData<Boolean>()

    init {
        isViewFinished.value = false
    }

    var confirmView = MutableLiveData<String>()

    var updateCoinBalanceSubject: Subject<Boolean> = PublishSubject.create()
    var isLoading = MutableLiveData<Boolean>()
    var isPageFinish = false
    var throwableMessage = MutableLiveData<String>()
    var apiThrowableLiveData = MutableLiveData<ApiException>()

    var roomId = ""
    var roomType = ""

    private val disposables = CompositeDisposable()

    fun add(job: Disposable) {
        disposables.add(job)
    }

    override fun onCleared() {
        disposables.clear()
        super.onCleared()
    }

    fun forceClear() {
        disposables.clear()
    }

    protected fun <T> loadingView(): ObservableTransformer<T, T> {
        return loadingView(showLoading = true, closeLoading = true)
    }

    protected fun <T> loadingView(showLoading: Boolean): ObservableTransformer<T, T> {
        return loadingView(showLoading, true)
    }

    protected fun <T> loadingView(
        showLoading: Boolean,
        closeLoading: Boolean
    ): ObservableTransformer<T, T> {
        return ObservableTransformer {
            it.doOnSubscribe {
                if (showLoading) {
                    isLoading.postValue(true)
                }
            }.doFinally {
                if (closeLoading) {
                    isLoading.postValue(false)
                }
            }
        }
    }

    fun viewModelLaunch(action: suspend (() -> Unit)) {
        viewModelLaunch(showLoading = true, closeLoading = true, action = action)
    }

    fun viewModelLaunch(showLoading: Boolean, action: suspend (() -> Unit)) {
        viewModelLaunch(showLoading, true, action)
    }

    fun viewModelLaunch(showLoading: Boolean, closeLoading: Boolean, action: suspend (() -> Unit)) {
        viewModelScope.launch(exceptionHandler) {
            if (showLoading)
                isLoading.postValue(true)
            val task = async {
                action.invoke()
            }
            task.await()
            if (closeLoading)
                isLoading.postValue(false)
        }
    }

    fun viewModelLaunch(action: suspend (() -> Unit), errorAction: (throwable:Throwable) -> Unit) {
        viewModelLaunch(
            showLoading = true,
            closeLoading = true,
            action = action,
            errorAction = errorAction
        )
    }

    fun viewModelLaunch(
        showLoading: Boolean,
        action: suspend (() -> Unit),
        errorAction: (throwable:Throwable) -> Unit
    ) {
        viewModelLaunch(showLoading, true, action, errorAction)
    }

    fun viewModelLaunch(
        showLoading: Boolean,
        closeLoading: Boolean,
        action: suspend (() -> Unit),
        errorAction: (throwable:Throwable) -> Unit
    ) {
        viewModelScope.launch(customExceptionHandler(errorAction)) {
            if (showLoading)
                isLoading.postValue(true)
            val task = async {
                action.invoke()
            }
            task.await()
            if (closeLoading)
                isLoading.postValue(false)
        }
    }

    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        consumerThrowable(throwable)
    }

    fun customExceptionHandler(action: (throwable:Throwable) -> Unit): CoroutineExceptionHandler {
        return CoroutineExceptionHandler { _, throwable->
            action.invoke(throwable)
        }
    }

    fun consumerThrowable(throwable: Throwable) {
        consumerThrowable(throwable, true)
    }

    var btcTransferExceptionLiveData = MutableLiveData<BtcTransferException>()

    fun consumerThrowable(throwable: Throwable, showMessage: Boolean) {
        isPageFinish = false
        if (!showMessage) {
            isLoading.postValue(false)
            return
        }
        when (throwable) {
            is SocketTimeoutException -> {
                Timber.e("SocketTimeoutException")
                isPageFinish = true
                throwableMessage.postValue(
                    app.getString(R.string.g_a_network_timeout_error)
                )
            }
            is UnknownHostException -> {
                Timber.e("UnknownHostException")
                throwableMessage.postValue(
                    app.getString(R.string.error_server_busy_try_again_p_z)
                )
            }
            is ConnectException -> {
                val connectError =
                    "${app.getString(R.string.g_a_network_error)}(${throwable.message})"
                Timber.e("ConnectException: $connectError")
                throwableMessage.postValue(connectError)
            }
            is ApiError -> {
                throwableMessage.postValue(throwable.errorMessage)
            }
            is IllegalArgumentException -> {
                Timber.e("IllegalArgumentException: ${throwable.message}")
                throwableMessage.postValue(throwable.message)
            }
            is BtcTransferException -> {
                Timber.e("BtcTransferException: ${throwable.message}")
                btcTransferExceptionLiveData.postValue(throwable)
            }
            else -> {
                throwableMessage.postValue(throwable.message)
            }
        }
        isLoading.postValue(false)
    }

    fun getRate(coinId: String): BigDecimal {
        return rateList.find { it.identifier == coinId }?.rate?.toBigDecimal() ?: 0.toBigDecimal()
    }

    fun getFiatRate(coinId: String, amount: BigDecimal): BigDecimal {
        val rate = getRate(coinId)
        return amount.multiply(rate)
    }

    fun getFiatRateText(coinId: String, amount: BigDecimal, symbol: String): String {
        val fiat = getFiatRate(coinId, amount)
        return "≈$symbol ${NumberUtils.show(fiat, showNumber)}"
    }
}