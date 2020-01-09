package com.ttchain.walletproject.utils

import android.content.Context
import android.os.Build
import androidx.biometric.BiometricManager

object BiometricUtil {

    fun isSdkVersionSupported(): Boolean {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
    }

    fun isHardwareAvailable(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val bm = BiometricManager.from(context)
            val canAuthenticate = bm.canAuthenticate()
            !(canAuthenticate == BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE ||
                    canAuthenticate == BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE)

        } else {
            false
        }
    }

    fun hasBiometricEnrolled(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val bm = BiometricManager.from(context)
            val canAuthenticate = bm.canAuthenticate()
            (canAuthenticate == BiometricManager.BIOMETRIC_SUCCESS)

        } else {
            false
        }
    }
}