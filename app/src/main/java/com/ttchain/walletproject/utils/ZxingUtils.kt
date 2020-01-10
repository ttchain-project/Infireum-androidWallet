package com.ttchain.walletproject.utils

import android.content.ContentResolver
import android.graphics.*
import android.net.Uri
import android.provider.MediaStore
import com.google.zxing.*
import com.google.zxing.common.GlobalHistogramBinarizer
import com.google.zxing.common.HybridBinarizer
import java.io.IOException
import java.util.*


object ZxingUtils {

    @JvmStatic
    @Throws(IOException::class)
    fun readQrCodeFile(cr: ContentResolver, uri: Uri): String? {
        val HINTS = EnumMap<DecodeHintType, Any>(DecodeHintType::class.java)
        var source: LuminanceSource? = null
        var result: Result
        var bitmap: BinaryBitmap

        try {
            val options = BitmapFactory.Options()
            options.inPreferredConfig = Bitmap.Config.ARGB_8888
            val fileBitmap = MediaStore.Images.Media.getBitmap(cr, uri)

            val intArray = IntArray(fileBitmap.width * fileBitmap.height)
            fileBitmap.getPixels(
                intArray,
                0,
                fileBitmap.width,
                0,
                0,
                fileBitmap.width,
                fileBitmap.height
            )

            source = RGBLuminanceSource(fileBitmap.width, fileBitmap.height, intArray)
            bitmap = BinaryBitmap(HybridBinarizer(source))
            result = MultiFormatReader().decode(bitmap, HINTS)
            return result.text
        } catch (e: NotFoundException) {
            e.printStackTrace()
            if (source != null) {
                try {
                    bitmap = BinaryBitmap(GlobalHistogramBinarizer(source))
                    result = MultiFormatReader().decode(bitmap, HINTS)
                    return result.text
                } catch (e2: NotFoundException) {
                    e2.printStackTrace()
                }
            }
        }
        return null
    }

    fun addBorderToBitmap(
        srcBitmap: Bitmap,
        borderWidth: Int,
        borderColor: Int
    ): Bitmap { // Initialize a new Bitmap to make it bordered bitmap
        val dstBitmap = Bitmap.createBitmap(
            srcBitmap.width + borderWidth * 2,  // Width
            srcBitmap.height + borderWidth * 2,  // Height
            Bitmap.Config.ARGB_8888 // Config
        )
        val canvas = Canvas(dstBitmap)
        // Initialize a new Paint instance to draw border
        val paint = Paint()
        paint.color = borderColor
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.strokeWidth = borderWidth.toFloat()
        paint.isAntiAlias = true
        val rect = Rect(
            borderWidth / 2,
            borderWidth / 2,
            canvas.width - borderWidth / 2,
            canvas.height - borderWidth / 2
        )
        canvas.drawRect(rect, paint)
        canvas.drawBitmap(srcBitmap, borderWidth.toFloat(), borderWidth.toFloat(), null)
        srcBitmap.recycle()
        return dstBitmap
    }
}