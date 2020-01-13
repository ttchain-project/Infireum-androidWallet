package com.ttchain.walletproject.utils

import android.text.Editable

class TextWatcher (
    private val afterChange :(Editable? ) -> Unit
) : android.text.TextWatcher {
    override fun afterTextChanged(s: Editable?) {
        afterChange(s)
    }

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

}