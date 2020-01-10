package com.ttchain.walletproject.enums

enum class AuthenticationError(val value: Int) {
    AUTHENTICATION_ERROR_LOCKOUT(7), //嘗試次數過多，請稍後再試
    AUTHENTICATION_ERROR_DISMISS(10), //使用者已取消指紋驗證作業
    AUTHENTICATION_ERROR_NOT_ENROLLED(11), //未登錄任何指紋
    AUTHENTICATION_ERROR_CANCELED(13), //取消
}