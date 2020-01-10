package com.ttchain.walletproject.view

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.widget.EditText
import androidx.core.content.ContextCompat
import com.ttchain.walletproject.R

class MnemonicsEditText:EditText , TextWatcher{

    constructor(context: Context) : super(context) {
        init(context, null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context, attrs,
        defStyleAttr
    ) {
        init(context, attrs)
    }

    private fun init(context: Context, attrs: AttributeSet?) {
        addTextChangedListener(this)
        background = ContextCompat.getDrawable(context, R.drawable.bg_edittxt_selector)
    }

    override fun afterTextChanged(s: Editable?) {
        background = if (s.toString().isNotEmpty()) {
            ContextCompat.getDrawable(context, R.drawable.bg_edittext_green)
        } else {
            ContextCompat.getDrawable(context, R.drawable.bg_edittxt_selector)
        }
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

    }
}