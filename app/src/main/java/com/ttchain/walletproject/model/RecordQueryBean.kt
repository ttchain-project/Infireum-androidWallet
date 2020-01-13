package com.ttchain.walletproject.model

import java.io.Serializable

data class RecordQueryBean(
        var walletID: Int,
        var coinID: Int,
        var recordType: Int,
        var recordState: Int
) : Serializable