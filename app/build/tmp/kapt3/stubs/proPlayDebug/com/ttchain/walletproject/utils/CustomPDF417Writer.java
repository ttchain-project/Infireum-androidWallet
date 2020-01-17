package com.ttchain.walletproject.utils;

import java.lang.System;

/**
 * Created by williamhuang on 2017/12/18.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0002\b\u0003\u0018\u00010\rH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/ttchain/walletproject/utils/CustomPDF417Writer;", "Lcom/google/zxing/Writer;", "()V", "encode", "Lcom/google/zxing/common/BitMatrix;", "contents", "", "format", "Lcom/google/zxing/BarcodeFormat;", "width", "", "height", "hints", "", "Lcom/google/zxing/EncodeHintType;", "Companion", "app_proPlayDebug"})
public final class CustomPDF417Writer implements com.google.zxing.Writer {
    
    /**
     * default error correction level
     */
    private static final int DEFAULT_ERROR_CORRECTION_LEVEL = 2;
    public static final com.ttchain.walletproject.utils.CustomPDF417Writer.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.zxing.common.BitMatrix encode(@org.jetbrains.annotations.NotNull()
    java.lang.String contents, @org.jetbrains.annotations.NotNull()
    com.google.zxing.BarcodeFormat format, int width, int height, @org.jetbrains.annotations.Nullable()
    java.util.Map<com.google.zxing.EncodeHintType, ?> hints) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.zxing.common.BitMatrix encode(@org.jetbrains.annotations.NotNull()
    java.lang.String contents, @org.jetbrains.annotations.NotNull()
    com.google.zxing.BarcodeFormat format, int width, int height) throws com.google.zxing.WriterException {
        return null;
    }
    
    public CustomPDF417Writer() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J#\u0010\u0011\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0002\u0010\u0015J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u00a2\u0006\u0002\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0019"}, d2 = {"Lcom/ttchain/walletproject/utils/CustomPDF417Writer$Companion;", "", "()V", "DEFAULT_ERROR_CORRECTION_LEVEL", "", "getDEFAULT_ERROR_CORRECTION_LEVEL$app_proPlayDebug", "()I", "bitMatrixFromEncoder", "Lcom/google/zxing/common/BitMatrix;", "encoder", "Lcom/google/zxing/pdf417/encoder/PDF417;", "contents", "", "errorCorrectionLevel", "width", "height", "margin", "bitMatrixFrombitArray", "input", "", "", "([[BI)Lcom/google/zxing/common/BitMatrix;", "rotateArray", "bitArray", "([[B)[[B", "app_proPlayDebug"})
    public static final class Companion {
        
        public final int getDEFAULT_ERROR_CORRECTION_LEVEL$app_proPlayDebug() {
            return 0;
        }
        
        /**
         * Takes encoder, accounts for width/height, and retrieves bit matrix
         */
        private final com.google.zxing.common.BitMatrix bitMatrixFromEncoder(com.google.zxing.pdf417.encoder.PDF417 encoder, java.lang.String contents, int errorCorrectionLevel, int width, int height, int margin) throws com.google.zxing.WriterException {
            return null;
        }
        
        /**
         * This takes an array holding the values of the PDF 417
         *
         * @param input  a byte array of information with 0 is black, and 1 is white
         * @param margin border around the barcode
         * @return BitMatrix of the input
         */
        private final com.google.zxing.common.BitMatrix bitMatrixFrombitArray(byte[][] input, int margin) {
            return null;
        }
        
        /**
         * Takes and rotates the it 90 degrees
         */
        private final byte[][] rotateArray(byte[][] bitArray) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}