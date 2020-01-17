package com.ttchain.walletproject.utils;

import java.lang.System;

/**
 * Created by williamhuang on 2017/12/15.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0002\b\u0003\u0018\u00010\rH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/ttchain/walletproject/utils/CustomQRCodeWriter;", "Lcom/google/zxing/Writer;", "()V", "encode", "Lcom/google/zxing/common/BitMatrix;", "contents", "", "format", "Lcom/google/zxing/BarcodeFormat;", "width", "", "height", "hints", "", "Lcom/google/zxing/EncodeHintType;", "Companion", "app_proPlayDebug"})
public final class CustomQRCodeWriter implements com.google.zxing.Writer {
    private static final int QUIET_ZONE_SIZE = 0;
    public static final com.ttchain.walletproject.utils.CustomQRCodeWriter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.zxing.common.BitMatrix encode(@org.jetbrains.annotations.NotNull()
    java.lang.String contents, @org.jetbrains.annotations.NotNull()
    com.google.zxing.BarcodeFormat format, int width, int height) throws com.google.zxing.WriterException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.zxing.common.BitMatrix encode(@org.jetbrains.annotations.NotNull()
    java.lang.String contents, @org.jetbrains.annotations.NotNull()
    com.google.zxing.BarcodeFormat format, int width, int height, @org.jetbrains.annotations.Nullable()
    java.util.Map<com.google.zxing.EncodeHintType, ?> hints) {
        return null;
    }
    
    public CustomQRCodeWriter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ttchain/walletproject/utils/CustomQRCodeWriter$Companion;", "", "()V", "QUIET_ZONE_SIZE", "", "renderResult", "Lcom/google/zxing/common/BitMatrix;", "code", "Lcom/google/zxing/qrcode/encoder/QRCode;", "width", "height", "app_proPlayDebug"})
    public static final class Companion {
        
        private final com.google.zxing.common.BitMatrix renderResult(com.google.zxing.qrcode.encoder.QRCode code, int width, int height) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}