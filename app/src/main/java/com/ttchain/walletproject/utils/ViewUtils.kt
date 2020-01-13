package com.ttchain.walletproject.utils

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.drawable.Drawable
import android.graphics.drawable.GradientDrawable
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.core.content.res.ResourcesCompat
import android.text.SpannableString
import android.text.Spanned
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.google.zxing.BarcodeFormat
import com.google.zxing.WriterException
import com.journeyapps.barcodescanner.BarcodeEncoder

object ViewUtils {

    @Throws(WriterException::class)
    fun createQrCodeBitmap(string: String, w: Int, h: Int): Bitmap {
        return BarcodeEncoder().encodeBitmap(string, BarcodeFormat.QR_CODE, w, h)
    }

    fun createBitmapFromView(v: View): Bitmap {
        val bitmap = Bitmap.createBitmap(v.measuredWidth, v.measuredHeight, Bitmap.Config.ARGB_8888)
        val c = Canvas(bitmap)
        v.layout(v.left, v.top, v.right, v.bottom)
        v.draw(c)
        return bitmap
    }

    fun setTextColor(textView: TextView?, colorRes: Int): TextView? {
        if (textView == null) {
            return null
        }
        val color = ResourcesCompat.getColor(textView.resources, colorRes, null)
        textView.setTextColor(color)
        return textView
    }

    fun setTextDrawableColorFilter(textView: TextView?, @ColorRes colorRes: Int): TextView? {
        if (textView == null) {
            return null
        }
        val color = ResourcesCompat.getColor(textView.resources, colorRes, null)
        for (drawable in textView.compoundDrawables) {
            if (drawable != null) {
                drawable.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN)
            }
        }
        return textView
    }

    fun setImageDrawableColorFilter(image: ImageView?, @ColorRes colorRes: Int): ImageView? {
        if (image == null) {
            return null
        }
        val color = ResourcesCompat.getColor(image.resources, colorRes, null)
        image.drawable.colorFilter = PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN)
        return image
    }

    fun getHeaderRadiusGradientDrawable(
        startColor: Int,
        endColor: Int,
        radius: Float
    ): GradientDrawable {
        val drawable = GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT,
            intArrayOf(startColor, endColor)
        )
        drawable.cornerRadii = floatArrayOf(radius, radius, radius, radius, 0f, 0f, 0f, 0f)
        return drawable
    }

    fun getHeaderRadiusDrawable(bgColor: Int, radius: Float): GradientDrawable {
        val drawable = GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT,
            intArrayOf(bgColor, bgColor)
        )
        drawable.cornerRadii = floatArrayOf(radius, radius, radius, radius, 0f, 0f, 0f, 0f)
        return drawable
    }

    fun getFooterRadiusDrawable(bgColor: Int, radius: Float): GradientDrawable {
        val drawable = GradientDrawable(
            GradientDrawable.Orientation.LEFT_RIGHT,
            intArrayOf(bgColor, bgColor)
        )
        drawable.cornerRadii = floatArrayOf(0f, 0f, 0f, 0f, radius, radius, radius, radius)
        return drawable
    }

    fun setPadding(context: Context, view: View, @DimenRes paddingRes: Int): View {
        val padding = context.resources.getDimensionPixelOffset(paddingRes)
        view.setPadding(padding, padding, padding, padding)
        return view
    }

    fun setPaddingTop(context: Context, view: View, @DimenRes paddingRes: Int): View {
        val padding = context.resources.getDimensionPixelOffset(paddingRes)
        view.setPadding(view.paddingLeft, padding, view.paddingRight, view.paddingBottom)
        return view
    }

    fun setPaddingBottom(context: Context, view: View, @DimenRes paddingRes: Int): View {
        val padding = context.resources.getDimensionPixelOffset(paddingRes)
        view.setPadding(view.paddingLeft, view.paddingTop, view.paddingRight, padding)
        return view
    }

    fun setPaddingVertical(context: Context, view: View, @DimenRes paddingRes: Int): View {
        val padding = context.resources.getDimensionPixelOffset(paddingRes)
        view.setPadding(view.paddingLeft, padding, view.paddingRight, padding)
        return view
    }

    fun setPaddingLeft(context: Context, view: View, @DimenRes paddingRes: Int): View {
        val padding = context.resources.getDimensionPixelOffset(paddingRes)
        view.setPadding(padding, view.paddingTop, view.paddingRight, view.paddingBottom)
        return view
    }

    fun setPaddingRight(context: Context, view: View, @DimenRes paddingRes: Int): View {
        val padding = context.resources.getDimensionPixelOffset(paddingRes)
        view.setPadding(view.paddingLeft, view.paddingTop, padding, view.paddingBottom)
        return view
    }

    fun setPaddingHorizontal(context: Context, view: View, @DimenRes paddingRes: Int): View {
        val padding = context.resources.getDimensionPixelOffset(paddingRes)
        view.setPadding(padding, view.paddingTop, padding, view.paddingBottom)
        return view
    }

    fun setUnderLineString(string: String): SpannableString {
        val content = SpannableString(string)
        content.setSpan(UnderlineSpan(), 0, string.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        return content
    }
}
