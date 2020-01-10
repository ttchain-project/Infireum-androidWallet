package com.ttchain.walletproject.repository

import com.ttchain.walletproject.enums.ApiCodeEnum
import com.ttchain.walletproject.model.ApiResult
import com.ttchain.walletproject.net.ApiError
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.Deferred

open class BaseRepository {
    private val apiSchedulers = Schedulers.newThread()

    fun <T> getApi(observable: Observable<T>): Observable<T> {
        return observable.subscribeOn(apiSchedulers)
            .observeOn(AndroidSchedulers.mainThread())
    }

    private fun <T> checkError(result: ApiResult<T>): Throwable {
        return if (ApiCodeEnum.values().contains(result.code)) {
            ApiError(result.code, result.message)
        } else {
            Throwable(result.message)
        }
    }

    fun <T> checkResultRepository(result: ApiResult<T>): RepositoryResult<T> {
        return when (result.code) {
            ApiCodeEnum.NUMBER_0 -> {
                RepositoryResult.success(result.data)
            }
            else -> {
                throw checkError(result)
            }
        }
    }

    suspend fun <T> checkDeferred(deferred: Deferred<ApiResult<T>>): RepositoryResult<T> {
        return try {
            val result = deferred.await()
            checkResultRepository(result)
        } catch (e: Throwable) {
            if (deferred.isCompleted) {
                throw e
            } else {
                RepositoryResult.error(e)
            }
        }
    }
}