package com.ttchain.walletproject.base

import androidx.annotation.CallSuper
import androidx.annotation.IntDef
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.cache.GlobalConstant
import io.reactivex.ObservableTransformer

abstract class BaseRecyclerViewViewModel<L> : BaseViewModel() {

    companion object {
        const val NORMAL_REQUEST = 9001
        const val LOAD_MORE_REQUEST = 9002
        const val REFRESH_REQUEST = 9003
    }

    var isRefreshLoading = MutableLiveData<Boolean>()
    var isLoadMoreEnd = MutableLiveData<Boolean>()
    var isLoadMoreComplete = MutableLiveData<Boolean>()

    @IntDef(NORMAL_REQUEST, LOAD_MORE_REQUEST, REFRESH_REQUEST)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    annotation class RequestStatus

    protected var mPageNow = -1


    var mRequestStatus = NORMAL_REQUEST

    fun <T> loadingRecyclerView(@RequestStatus status: Int): ObservableTransformer<T, T> {
        return loadingRecyclerView(status, showLoading = true, closeLoading = true)
    }

    fun <T> loadingRecyclerView(
        @RequestStatus status: Int, showLoading: Boolean
    ): ObservableTransformer<T, T> {
        return loadingRecyclerView(status, showLoading, true)
    }

    fun <T> loadingRecyclerView(
        @RequestStatus status: Int, showLoading: Boolean,
        closeLoading: Boolean
    ): ObservableTransformer<T, T> {
        return ObservableTransformer { upstream ->
            upstream
                .doOnSubscribe { disposable ->
                    if (showLoading) {
                        if (status == NORMAL_REQUEST) {
                            isLoading.postValue(true)
                        } else if (status == REFRESH_REQUEST) {
                            isRefreshLoading.postValue(true)
                        }
                    }
                }
                .doFinally {
                    if (closeLoading) {
                        isLoading.postValue(false)
                        isRefreshLoading.postValue(false)
                    }
                }
        }
    }

    var addArrayListLiveData = MutableLiveData<List<L>>()
    var setListDataLiveData = MutableLiveData<List<L>>()

    protected fun onSubscribeComplete(list: List<L>) {
        if (mRequestStatus == LOAD_MORE_REQUEST) {
            addArrayListLiveData.postValue(list)
        } else {
            setListDataLiveData.postValue(list)
        }
        if (mPageNow >= 1) {
            isLoadMoreComplete.postValue(true)
        } else {
            isLoadMoreEnd.postValue(true)
        }
    }

    var setEmptyMsg = MutableLiveData<String>()
    val onShowMessageDialog = MutableLiveData<String>()

    protected fun onSubscribeError(throwable: Throwable) {
        isLoadMoreEnd.postValue(true)
        if (mRequestStatus == NORMAL_REQUEST) {
            setEmptyMsg.postValue(throwable.message)
        } else {
            onShowMessageDialog.postValue(throwable.message)
        }
    }

    protected fun setNextPage(next: Int) {
        mPageNow = next
    }

    open fun normalRequest() {
        mPageNow = 1
        mRequestStatus = NORMAL_REQUEST
    }

    // Must use PAGE_LIMIT_NORMAL size for paging
    protected fun hasNextPage(total: Int): Boolean {
        return mPageNow * GlobalConstant.PAGE_LIMIT_NORMAL < total
    }

    @CallSuper
    protected open fun loadMoreRequest() {
        if (mPageNow > 1) {
            mRequestStatus = LOAD_MORE_REQUEST
        }
    }

    @CallSuper
    protected open fun refreshRequest() {
        mPageNow = 1
        mRequestStatus = REFRESH_REQUEST
    }

}