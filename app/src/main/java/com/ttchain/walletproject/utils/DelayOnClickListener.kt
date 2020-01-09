package com.ttchain.walletproject.utils

import android.view.View
import com.ttchain.walletproject.App
import com.ttchain.walletproject.App.Companion.clickLastClickTime

class DelayOnClickListener(
    private val onDelayClick: (View) -> Unit
) : View.OnClickListener {

    override fun onClick(v: View?) {
        if (System.currentTimeMillis() - clickLastClickTime < App.FAST_CLICK_DELAY_TIME) {
            return
        }
        clickLastClickTime = System.currentTimeMillis()
        v?.let { onDelayClick(it) }
    }
}