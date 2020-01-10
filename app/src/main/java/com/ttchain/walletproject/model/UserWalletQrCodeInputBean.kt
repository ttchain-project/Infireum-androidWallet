package com.ttchain.walletproject.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserWalletQrCodeInputBean(var pwd: String, var hint: String) : Parcelable
