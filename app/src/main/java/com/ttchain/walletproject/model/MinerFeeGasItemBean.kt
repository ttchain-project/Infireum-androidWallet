package com.ttchain.walletproject.model

import android.text.TextWatcher
import android.widget.CompoundButton
import android.widget.SeekBar
import java.io.Serializable

data class MinerFeeGasItemBean(
        var _Id: Int = -1,
        var advancedCheckedListener: CompoundButton.OnCheckedChangeListener? = null,
        var seekBarChangeListener: SeekBar.OnSeekBarChangeListener? = null,
        var inputCustomGasPriceWatcher: TextWatcher? = null,
        var inputCustomGasWatcher: TextWatcher? = null
) : Serializable {
}