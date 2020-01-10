package com.ttchain.walletproject.view

import android.content.Context
import android.text.TextUtils
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MarqueeTextView : AppCompatTextView {
    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs,
            defStyleAttr) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        setSingleLine()
        ellipsize = TextUtils.TruncateAt.MARQUEE
        isFocusable = true
        marqueeRepeatLimit = -1
        isFocusableInTouchMode = true
    }

    override fun isFocused(): Boolean {
        return true
    }

    override fun onWindowFocusChanged(hasWindowFocus: Boolean) {
        if (hasWindowFocus)
            super.onWindowFocusChanged(hasWindowFocus)
    }
}