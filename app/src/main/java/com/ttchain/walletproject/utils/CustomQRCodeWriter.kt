package com.git4u.tt_wallet_android.utils

import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.Writer
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel
import com.google.zxing.qrcode.encoder.Encoder
import com.google.zxing.qrcode.encoder.QRCode

/**
 * Created by williamhuang on 2017/12/15.
 */

class CustomQRCodeWriter : Writer {

    @Throws(WriterException::class)
    override fun encode(contents: String, format: BarcodeFormat, width: Int, height: Int): BitMatrix {

        return encode(contents, format, width, height, null)
    }

    @Throws(WriterException::class)
    override fun encode(
        contents: String,
        format: BarcodeFormat,
        width: Int,
        height: Int,
        hints: Map<EncodeHintType, *>?
    ): BitMatrix {

        if (contents.isEmpty()) {
            throw IllegalArgumentException("Found empty contents")
        }

        if (format != BarcodeFormat.QR_CODE) {
            throw IllegalArgumentException("Can only encode QR_CODE, but got $format")
        }

        if (width < 0 || height < 0) {
            throw IllegalArgumentException(
                "Requested dimensions are too small: " + width + 'x'.toString() +
                        height
            )
        }

        var errorCorrectionLevel = ErrorCorrectionLevel.L
        var quietZone = QUIET_ZONE_SIZE
        if (hints != null) {
            if (hints.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                errorCorrectionLevel = ErrorCorrectionLevel.valueOf(hints[EncodeHintType.ERROR_CORRECTION].toString())
            }
            if (hints.containsKey(EncodeHintType.MARGIN)) {
                quietZone = Integer.parseInt(hints[EncodeHintType.MARGIN].toString())
            }
        }

        val code = Encoder.encode(contents, errorCorrectionLevel, hints)
        return renderResult(code, width, height)
    }

    companion object {

        private const val QUIET_ZONE_SIZE = 0

        // Note that the input matrix uses 0 == white, 1 == black, while the output matrix uses
        // 0 == black, 255 == white (i.e. an 8 bit greyscale bitmap).
        //    private static BitMatrix renderResult(QRCode code, int width, int height, int quietZone) {
        //        ByteMatrix input = code.getMatrix();
        //        if (input == null) {
        //            throw new IllegalStateException();
        //        }
        //        int inputWidth = input.getWidth();
        //        int inputHeight = input.getHeight();
        //        int qrWidth = inputWidth;
        //        int qrHeight = inputHeight;
        //        int outputWidth = Math.max(width, qrWidth);
        //        int outputHeight = Math.max(height, qrHeight);
        //
        //        int multiple = Math.min(outputWidth / qrWidth, outputHeight / qrHeight);
        //        // Padding includes both the quiet zone and the extra white pixels to accommodate the requested
        //        // dimensions. For example, if input is 25x25 the QR will be 33x33 including the quiet zone.
        //        // If the requested size is 200x160, the multiple will be 4, for a QR of 132x132. These will
        //        // handle all the padding from 100x100 (the actual QR) up to 200x160.
        //        int leftPadding = (outputWidth - (inputWidth * multiple)) / 2;
        //        int topPadding = (outputHeight - (inputHeight * multiple)) / 2;
        //
        //        BitMatrix output = new BitMatrix(outputWidth, outputHeight);
        //
        //        for (int inputY = 0, outputY = topPadding; inputY < inputHeight; inputY++, outputY += multiple) {
        //            // Write the contents of this row of the barcode
        //            for (int inputX = 0, outputX = leftPadding; inputX < inputWidth; inputX++, outputX += multiple) {
        //                if (input.get(inputX, inputY) == 1) {
        //                    output.setRegion(outputX, outputY, multiple, multiple);
        //                }
        //            }
        //        }
        //
        //        return output;
        //    }


        private fun renderResult(code: QRCode, width: Int, height: Int): BitMatrix {
            val input = code.matrix ?: throw IllegalStateException()
            val inputWidth = input.width
            val inputHeight = input.height
            // 这里qrWidth就是原始的二维码的宽度了，包含8单位宽度的白边
            // 依据用户的输入宽高，计算最后的输出宽高
            val outputWidth = width.coerceAtLeast(inputWidth)
            val outputHeight = height.coerceAtLeast(inputHeight)

            val output = BitMatrix(outputWidth, outputHeight)
            //计算缩放比例
            val multiple = (outputWidth / inputWidth).coerceAtMost(outputHeight / inputHeight)
            var inputY = 0
            // 嵌套循环，将ByteMatrix的内容计算padding后转换成BitMatrix
            var outputY = 0
            while (inputY < inputHeight) {
                var inputX = 0
                var outputX = 0
                while (inputX < inputWidth) {
                    if (input.get(inputX, inputY).toInt() == 1) {
                        output.setRegion(outputX, outputY, multiple, multiple)
                    }
                    inputX++
                    outputX += multiple
                }
                inputY++
                outputY += multiple
            }
            return output
        }
    }
}
