package com.ttchain.walletproject.utils

import android.app.Activity
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.widget.ImageView
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel
import com.ttchain.walletproject.dp2px
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.*

/**
 * QR Code 工具類
 */
object BarCodeUtil {

    /**
     * 產生QRCode
     *
     * @param activity  activity
     * @param widthDp   寬度(dp)
     * @param heightDp  高度(dp)
     * @param content   內容(String)
     * @param imageView imageView
     */
    fun onQrCodeGen(
        activity: Activity,
        widthDp: Float,
        heightDp: Float,
        content: String,
        imageView: ImageView
    ) {
        Thread(Runnable {
            val qrCodeWidth = widthDp.dp2px(activity)
            val qrCodeHeight = heightDp.dp2px(activity)
            // QR code 內容編碼
            val hints = EnumMap<EncodeHintType, Any>(EncodeHintType::class.java)
            hints[EncodeHintType.CHARACTER_SET] = "UTF-8"
            hints[EncodeHintType.MARGIN] = 0
            // 容錯率姑且可以將它想像成解析度，分為 4 級：L(7%)，M(15%)，Q(25%)，H(30%)
            // 設定 QR code 容錯率為 H
            hints[EncodeHintType.ERROR_CORRECTION] = ErrorCorrectionLevel.H
            // 建立 QR code 的資料矩陣
            var matrix: BitMatrix? = null
            try {
                matrix = CustomMultiFormatWriter().encode(
                    content,
                    BarcodeFormat.QR_CODE, qrCodeWidth, qrCodeHeight, hints
                )
            } catch (e: WriterException) {
                e.printStackTrace()
            }

            matrix = updateBit(matrix!!, 0)
            val w = matrix.width
            val h = matrix.height
            val rawData = IntArray(w * h)
            for (i in 0 until w) {
                for (j in 0 until h) {
                    var color = Color.WHITE
                    if (matrix.get(i, j)) {
                        // 有内容的部分，颜色设置为黑色，当然这里可以自己修改成喜欢的颜色
                        color = Color.BLACK
                    }
                    rawData[i + j * w] = color
                }
            }
            val bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.RGB_565)
            bitmap.setPixels(rawData, 0, w, 0, 0, w, h)

            // 設定為 QR code 影像
            activity.runOnUiThread { imageView.setImageBitmap(bitmap) }
        }).start()
    }

    suspend fun onQrCodeGenAsync(
        context: Context,
        widthDp: Float,
        heightDp: Float,
        content: String
    ): Bitmap = withContext(Dispatchers.IO) {
        val qrCodeWidth = widthDp.dp2px(context)
        val qrCodeHeight = heightDp.dp2px(context)
        // QR code 內容編碼
        val hints = EnumMap<EncodeHintType, Any>(EncodeHintType::class.java)
        hints[EncodeHintType.CHARACTER_SET] = "UTF-8"
        hints[EncodeHintType.MARGIN] = 0
        // 容錯率姑且可以將它想像成解析度，分為 4 級：L(7%)，M(15%)，Q(25%)，H(30%)
        // 設定 QR code 容錯率為 H
//        hints[EncodeHintType.ERROR_CORRECTION] = ErrorCorrectionLevel.L
        // 建立 QR code 的資料矩陣
        var matrix: BitMatrix? = null
        try {
            matrix = CustomMultiFormatWriter().encode(
                content,
                BarcodeFormat.QR_CODE, qrCodeWidth, qrCodeHeight, hints
            )
        } catch (e: WriterException) {
            e.printStackTrace()
        }

        matrix = updateBit(matrix!!, 20)
        val w = matrix.width
        val h = matrix.height
        val rawData = IntArray(w * h)
        for (i in 0 until w) {
            for (j in 0 until h) {
                var color = Color.WHITE
                if (matrix.get(i, j)) {
                    // 有内容的部分，颜色设置为黑色，当然这里可以自己修改成喜欢的颜色
                    color = Color.BLACK
                }
                rawData[i + j * w] = color
            }
        }
        val bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.RGB_565)
        bitmap.setPixels(rawData, 0, w, 0, 0, w, h)
        return@withContext bitmap
    }

    fun onQrCodeGen(context: Context, widthDp: Float, heightDp: Float, content: String): Bitmap {
        kotlin.run {
            val qrCodeWidth = widthDp.dp2px(context)
            val qrCodeHeight = heightDp.dp2px(context)
            // QR code 內容編碼
            val hints = EnumMap<EncodeHintType, Any>(EncodeHintType::class.java)
            hints[EncodeHintType.CHARACTER_SET] = "UTF-8"
            hints[EncodeHintType.MARGIN] = 0
            // 容錯率姑且可以將它想像成解析度，分為 4 級：L(7%)，M(15%)，Q(25%)，H(30%)
            // 設定 QR code 容錯率為 H
            hints[EncodeHintType.ERROR_CORRECTION] = ErrorCorrectionLevel.H
            // 建立 QR code 的資料矩陣
            var matrix: BitMatrix? = null
            try {
                matrix = CustomMultiFormatWriter().encode(
                    content,
                    BarcodeFormat.QR_CODE, qrCodeWidth, qrCodeHeight, hints
                )
            } catch (e: WriterException) {
                e.printStackTrace()
            }

            matrix = updateBit(matrix!!, 0)
            val w = matrix.width
            val h = matrix.height
            val rawData = IntArray(w * h)
            for (i in 0 until w) {
                for (j in 0 until h) {
                    var color = Color.WHITE
                    if (matrix.get(i, j)) {
                        // 有内容的部分，颜色设置为黑色，当然这里可以自己修改成喜欢的颜色
                        color = Color.BLACK
                    }
                    rawData[i + j * w] = color
                }
            }
            val bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.RGB_565)
            bitmap.setPixels(rawData, 0, w, 0, 0, w, h)
            return bitmap
        }
    }

    /**
     * 客製化無邊框的條碼
     *
     * @param matrix matrix
     * @param margin margin
     * @return BitMatrix
     */
    private fun updateBit(matrix: BitMatrix, margin: Int): BitMatrix {
        val tempM = margin * 2
        val rec = matrix.enclosingRectangle // 获取二维码图案的属性
        val resWidth = rec[2] + tempM
        val resHeight = rec[3] + tempM
        val resMatrix = BitMatrix(resWidth, resHeight) // 按照自定义边框生成新的BitMatrix
        resMatrix.clear()
        for (i in margin until resWidth - margin) { // 循环，将二维码图案绘制到新的bitMatrix中
            for (j in margin until resHeight - margin) {
                if (matrix.get(i - margin + rec[0], j - margin + rec[1])) {
                    resMatrix.set(i, j)
                }
            }
        }
        return resMatrix
    }
}