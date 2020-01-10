package com.ttchain.walletproject.repository

import com.ttchain.walletproject.App
import com.ttchain.walletproject.R


/**
 * Repository處理結果
 */
class RepositoryResult<T>(val status: Status, val data: T?, val exception: Throwable?) {

    enum class Status {
        SUCCESS, ERROR
    }

    companion object {

        fun <T> success(data: T?): RepositoryResult<T> {
            return RepositoryResult(
                Status.SUCCESS,
                data,
                null
            )
        }

        fun <T> error(exception: Throwable): RepositoryResult<T> {
            return RepositoryResult(
                Status.ERROR,
                null,
                if (exception.message?.toLowerCase()?.contains("failed to connect")!! ||
                    exception.message?.toLowerCase()?.contains("timeout")!!
                ) {
                    Throwable(App.app.getString(R.string.g_a_network_error))
                } else {
                    exception
                }
            )
        }
    }
}