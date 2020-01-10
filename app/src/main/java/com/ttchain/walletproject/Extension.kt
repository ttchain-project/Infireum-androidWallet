package com.ttchain.walletproject

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterInside
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
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

fun ImageView.loadCoinCenterCrop(url: String) {
    Glide.with(this)
        .load(url)
        .apply(
            RequestOptions()
                .placeholder(R.mipmap.icon_list_noimage)
                .error(R.mipmap.icon_list_noimage)
                .centerCrop()
        ).into(this)
}

fun ImageView.loadCenterInside(url: String?) {
    Glide.with(this)
        .load(url ?: "")
        .apply(
            RequestOptions()
                .placeholder(R.mipmap.no_image)
                .error(R.mipmap.no_image)
                .centerInside()
        ).into(this)
}

fun ImageView.loadCenterInsideRoundedCorners(url: String?, roundingRadius: Int) {
    Glide.with(this)
        .load(url ?: "")
        .apply(
            RequestOptions()
                .placeholder(R.mipmap.no_image)
                .error(R.mipmap.no_image)
                .transform(CenterInside(), RoundedCorners(roundingRadius))
        ).into(this)
}
