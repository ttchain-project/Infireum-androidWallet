package com.ttchain.walletproject.net

import com.ttchain.walletproject.enums.ApiCodeEnum


class ApiError(val errorCode: ApiCodeEnum, val errorMessage: String) : Throwable(errorMessage) {
}