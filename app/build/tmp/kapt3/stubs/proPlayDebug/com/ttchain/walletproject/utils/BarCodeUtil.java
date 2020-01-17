package com.ttchain.walletproject.utils;

import java.lang.System;

/**
 * QR Code 工具類
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ&\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ1\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0002\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/ttchain/walletproject/utils/BarCodeUtil;", "", "()V", "onQrCodeGen", "", "activity", "Landroid/app/Activity;", "widthDp", "", "heightDp", "content", "", "imageView", "Landroid/widget/ImageView;", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "onQrCodeGenAsync", "(Landroid/content/Context;FFLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBit", "Lcom/google/zxing/common/BitMatrix;", "matrix", "margin", "", "app_proPlayDebug"})
public final class BarCodeUtil {
    public static final com.ttchain.walletproject.utils.BarCodeUtil INSTANCE = null;
    
    /**
     * 產生QRCode
     *
     * @param activity  activity
     * @param widthDp   寬度(dp)
     * @param heightDp  高度(dp)
     * @param content   內容(String)
     * @param imageView imageView
     */
    public final void onQrCodeGen(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, float widthDp, float heightDp, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object onQrCodeGenAsync(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float widthDp, float heightDp, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.graphics.Bitmap> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap onQrCodeGen(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float widthDp, float heightDp, @org.jetbrains.annotations.NotNull()
    java.lang.String content) {
        return null;
    }
    
    /**
     * 客製化無邊框的條碼
     *
     * @param matrix matrix
     * @param margin margin
     * @return BitMatrix
     */
    private final com.google.zxing.common.BitMatrix updateBit(com.google.zxing.common.BitMatrix matrix, int margin) {
        return null;
    }
    
    private BarCodeUtil() {
        super();
    }
}