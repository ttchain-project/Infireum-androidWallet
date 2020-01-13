package com.ttchain.walletproject.model

import android.text.TextWatcher
import java.io.Serializable

data class MinerFeeSatItemBean(
        var _Id: Int = -1,
        var onMinerFeeSatItemGasItemListener: MinerFeeSatItem.OnMinerFeeSatItemGasItemListener? = null,
        var inputCustomGasWatcher: TextWatcher? = null
) : Serializable {
}