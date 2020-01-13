package com.ttchain.walletproject.model

import com.ttchain.walletproject.cache.GlobalConstant
import java.io.Serializable

data class CoinRecordListBean(
        val coinId: String = "",
        val recordType: Int = RecordEntity.NORMAL,
        val recordState: Int = GlobalConstant.TRANSACTION_STATE_ALL
) : Serializable