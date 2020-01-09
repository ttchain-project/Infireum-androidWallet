package com.ttchain.walletproject

import android.view.View
import com.ttchain.walletproject.utils.DelayOnClickListener

/**
 * Delay click listener
 */
fun View.setDelayClickListener(onDelayOnClick: (View) -> Unit) {
    val safeClickListener = DelayOnClickListener {
        onDelayOnClick(it)
    }
    setOnClickListener(safeClickListener)
}