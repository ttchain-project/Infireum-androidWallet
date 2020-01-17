package com.ttchain.walletproject.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001$B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aJP\u0010\u001b\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 JE\u0010!\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\rJ,\u0010!\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\nR+\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/ttchain/walletproject/utils/FileUtils;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "isExternalStorageReadable", "", "()Z", "isExternalStorageWritable", "onSaveStatus", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "status", "", "saveQrCodeFolder", "Ljava/io/File;", "getSaveQrCodeFolder", "()Ljava/io/File;", "getAlbumStorageDir", "albumName", "getInternalCacheFileDir", "context", "Landroid/content/Context;", "saveBitMap", "saveDir", "fileName", "bitmap", "Landroid/graphics/Bitmap;", "(Ljava/io/File;Ljava/lang/String;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveBitmap", "listener", "Lcom/ttchain/walletproject/utils/FileUtils$SaveBitmapListener;", "SaveBitmapListener", "app_proPlayDebug"})
public final class FileUtils {
    private static final java.lang.String TAG = null;
    private static kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSaveStatus;
    public static final com.ttchain.walletproject.utils.FileUtils INSTANCE = null;
    
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final boolean isExternalStorageWritable() {
        return false;
    }
    
    public final boolean isExternalStorageReadable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getSaveQrCodeFolder() {
        return null;
    }
    
    /**
     * @param saveDir
     * @param fileName *.jpg
     * @param bitmap
     * @param listener
     */
    public final void saveBitmap(@org.jetbrains.annotations.Nullable()
    java.io.File saveDir, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.utils.FileUtils.SaveBitmapListener listener) {
    }
    
    public final void saveBitmap(@org.jetbrains.annotations.Nullable()
    java.io.File saveDir, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSaveStatus) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveBitMap(@org.jetbrains.annotations.Nullable()
    java.io.File saveDir, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSaveStatus, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p4) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getInternalCacheFileDir(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Get the directory for the user's public pictures directory.
     *
     * @param albumName
     * @return the file. If directory not created, return null.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getAlbumStorageDir(@org.jetbrains.annotations.NotNull()
    java.lang.String albumName) {
        return null;
    }
    
    private FileUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ttchain/walletproject/utils/FileUtils$SaveBitmapListener;", "", "onSaveStatus", "", "status", "", "app_proPlayDebug"})
    public static abstract interface SaveBitmapListener {
        
        public abstract void onSaveStatus(boolean status);
    }
}