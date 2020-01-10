package com.awesomegaming.walletlibs.util

import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.Writer
import com.google.zxing.WriterException
import com.google.zxing.common.BitMatrix
import com.google.zxing.pdf417.encoder.Compaction
import com.google.zxing.pdf417.encoder.Dimensions
import com.google.zxing.pdf417.encoder.PDF417

import java.nio.charset.Charset

/**
 * Created by williamhuang on 2017/12/18.
 */

class CustomPDF417Writer : Writer {

    @Throws(WriterException::class)
    override fun encode(
        contents: String,
        format: BarcodeFormat,
        width: Int,
        height: Int,
        hints: Map<EncodeHintType, *>?
    ): BitMatrix {
        if (format != BarcodeFormat.PDF_417) {
            throw IllegalArgumentException("Can only encode PDF_417, but got $format")
        }

        val encoder = PDF417()
        val margin = 0
        var errorCorrectionLevel =
            DEFAULT_ERROR_CORRECTION_LEVEL

        if (hints != null) {
            if (hints.containsKey(EncodeHintType.PDF417_COMPACT)) {
                encoder.setCompact(java.lang.Boolean.valueOf(hints[EncodeHintType.PDF417_COMPACT]!!.toString()))
            }
            if (hints.containsKey(EncodeHintType.PDF417_COMPACTION)) {
                encoder.setCompaction(Compaction.valueOf(hints[EncodeHintType.PDF417_COMPACTION]!!.toString()))
            }
            if (hints.containsKey(EncodeHintType.PDF417_DIMENSIONS)) {
                val dimensions = hints[EncodeHintType.PDF417_DIMENSIONS] as Dimensions?
                encoder.setDimensions(
                    dimensions!!.maxCols,
                    dimensions.minCols,
                    dimensions.maxRows,
                    dimensions.minRows
                )
            }
            //            if (hints.containsKey(EncodeHintType.MARGIN)) {
            //                margin = Integer.parseInt(hints.get(EncodeHintType.MARGIN).toString());
            //            }
            if (hints.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                errorCorrectionLevel = Integer.parseInt(hints[EncodeHintType.ERROR_CORRECTION]!!.toString())
            }
            if (hints.containsKey(EncodeHintType.CHARACTER_SET)) {
                val encoding = Charset.forName(hints[EncodeHintType.CHARACTER_SET]!!.toString())
                encoder.setEncoding(encoding)
            }
        }

        return bitMatrixFromEncoder(
            encoder,
            contents,
            errorCorrectionLevel,
            width,
            height,
            margin
        )
    }

    @Throws(WriterException::class)
    override fun encode(
        contents: String,
        format: BarcodeFormat,
        width: Int,
        height: Int
    ): BitMatrix {
        return encode(contents, format, width, height, null)
    }

    companion object {

        /**
         * default white space (margin) around the code
         */
        //    static final int WHITE_SPACE = 30;

        /**
         * default error correction level
         */
        internal val DEFAULT_ERROR_CORRECTION_LEVEL = 2

        /**
         * Takes encoder, accounts for width/height, and retrieves bit matrix
         */
        @Throws(WriterException::class)
        private fun bitMatrixFromEncoder(
            encoder: PDF417,
            contents: String,
            errorCorrectionLevel: Int,
            width: Int,
            height: Int,
            margin: Int
        ): BitMatrix {
            encoder.generateBarcodeLogic(contents, errorCorrectionLevel)

            val aspectRatio = 4
            var originalScale = encoder.barcodeMatrix.getScaledMatrix(1, aspectRatio)
            var rotated = false
            if ((height > width) xor (originalScale[0].size < originalScale.size)) {
                originalScale =
                    rotateArray(originalScale)
                rotated = true
            }

            val scaleX = width / originalScale[0].size
            val scaleY = height / originalScale.size

            val scale: Int
            scale = when {
                scaleX < scaleY -> scaleX
                else -> scaleY
            }
            if (scale > 1) {
                var scaledMatrix = encoder.barcodeMatrix.getScaledMatrix(scale, scale * aspectRatio)
                if (rotated) {
                    scaledMatrix =
                        rotateArray(scaledMatrix)
                }
                return bitMatrixFrombitArray(
                    scaledMatrix,
                    margin
                )
            }
            return bitMatrixFrombitArray(
                originalScale,
                margin
            )
        }

        /**
         * This takes an array holding the values of the PDF 417
         *
         * @param input  a byte array of information with 0 is black, and 1 is white
         * @param margin border around the barcode
         * @return BitMatrix of the input
         */
        private fun bitMatrixFrombitArray(input: Array<ByteArray>, margin: Int): BitMatrix {
            // Creates the bitmatrix with extra space for whitespace
            val output = BitMatrix(input[0].size + 2, input.size + 2)
            output.clear()
            var y = 0
            var yOutput = output.height - 1
            while (y < input.size) {
                for (x in 0 until input[0].size) {
                    // Zero is white in the bytematrix
                    if (input[y][x].toInt() == 1) {
                        output.set(x, yOutput)
                    }
                }
                y++
                yOutput--
            }
            return output
        }

        /**
         * Takes and rotates the it 90 degrees
         */
        private fun rotateArray(bitArray: Array<ByteArray>): Array<ByteArray> {
            val temp = Array(bitArray[0].size) { ByteArray(bitArray.size) }
            for (ii in bitArray.indices) {
                // This makes the direction consistent on screen when rotating the
                // screen;
                val inverseii = bitArray.size - ii - 1
                for (jj in 0 until bitArray[0].size) {
                    temp[jj][inverseii] = bitArray[ii][jj]
                }
            }
            return temp
        }
    }

}
