package com.ttchain.walletproject

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.provider.Settings
import com.ttchain.walletproject.utils.BiometricUtil


/**
 * 檢查是否支援生物辨識
 * @receiver Context
 * @return Boolean
 */
fun Context.isSupportBiometric(): Boolean {
    return when {
        !BiometricUtil.isSdkVersionSupported() -> false
        else -> BiometricUtil.isHardwareAvailable(this)
    }
}

/**
 * 檢查是否有進行生物辨識登記
 * @receiver Context
 * @return Boolean
 */
fun Context.isBiometricEnrolled(): Boolean {
    return BiometricUtil.hasBiometricEnrolled(this)
}

const val FINGERPRINT_REQUEST_CODE = 121
/**
 * 前往設定生物辨識
 * @receiver Activity
 */
fun Activity.goToBiometricEnrolledSetting() {
    intent = when {
        Build.VERSION.SDK_INT >= Build.VERSION_CODES.M -> Intent(Settings.ACTION_SECURITY_SETTINGS)
        Build.VERSION.SDK_INT >= Build.VERSION_CODES.P -> Intent(Settings.ACTION_FINGERPRINT_ENROLL)
        else -> Intent(Settings.ACTION_SECURITY_SETTINGS)
    }
    startActivityForResult(intent, FINGERPRINT_REQUEST_CODE)
}