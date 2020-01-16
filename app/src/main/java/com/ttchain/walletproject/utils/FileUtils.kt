package com.ttchain.walletproject.utils

import android.content.Context
import android.graphics.Bitmap
import android.os.Environment
import android.text.TextUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

import java.io.File
import java.io.FileOutputStream

object FileUtils {

    val TAG = FileUtils::class.java.simpleName

    /**
     * Checks if external storage is available for read and write
     */
    val isExternalStorageWritable: Boolean
        get() {
            val state = Environment.getExternalStorageState()
            return Environment.MEDIA_MOUNTED == state
        }

    /**
     * Checks if external storage is available to at least read
     */
    val isExternalStorageReadable: Boolean
        get() {
            val state = Environment.getExternalStorageState()
            return Environment.MEDIA_MOUNTED == state || Environment.MEDIA_MOUNTED_READ_ONLY == state
        }

//    val folder: File
//        get() {
//            var folder = File(
//                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).toString() +
//                        File.separator + "Infireum"
//            )
//            if (!folder.exists()) {
//                if (!folder.mkdirs()) {
//                    folder =
//                        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
//                }
//            }
//            return folder
//        }

    val saveQrCodeFolder: File
        get() {
            var folder =
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)

            if (!folder.exists()) {
                if (!folder.mkdirs()) {
                    folder =
                        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
                }
            }
            return folder
        }

    /**
     * @param saveDir
     * @param fileName *.jpg
     * @param bitmap
     * @param listener
     */
    fun saveBitmap(
        saveDir: File?,
        fileName: String,
        bitmap: Bitmap?,
        listener: SaveBitmapListener?
    ) {
        if (saveDir == null || TextUtils.isEmpty(fileName) || bitmap == null) {
            listener?.onSaveStatus(false)
            return
        }

        val file = File(saveDir, fileName)
        val status = try {
            val out = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out)
            out.flush()
            out.close()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }

        listener!!.onSaveStatus(status)
    }

    interface SaveBitmapListener {
        fun onSaveStatus(status: Boolean)
    }

    fun saveBitmap(
        saveDir: File?,
        fileName: String,
        bitmap: Bitmap?,
        onSaveStatus: ((status: Boolean) -> Unit)
    ) {
        if (saveDir == null || TextUtils.isEmpty(fileName) || bitmap == null) {
            onSaveStatus.invoke(false)
            return
        }

        val file = File(saveDir, fileName)
        val status = try {
            val out = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out)
            out.flush()
            out.close()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
        onSaveStatus.invoke(status)
    }

    suspend fun saveBitMap(
        saveDir: File?,
        fileName: String,
        bitmap: Bitmap?,
        onSaveStatus: ((status: Boolean) -> Unit)
    ) = withContext(Dispatchers.IO) {
        if (saveDir == null || TextUtils.isEmpty(fileName) || bitmap == null) {
            onSaveStatus.invoke(false)
            return@withContext
        }

        val file = File(saveDir, fileName)
        val status = try {
            val out = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, out)
            out.flush()
            out.close()
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
        onSaveStatus.invoke(status)
    }

    private var onSaveStatus: ((status: Boolean) -> Unit)? = null

    fun getInternalCacheFileDir(context: Context): File {
        return context.cacheDir
    }


    /**
     * Get the directory for the user's public pictures directory.
     *
     * @param albumName
     * @return the file. If directory not created, return null.
     */
    fun getAlbumStorageDir(albumName: String): File? {
        val file = File(
            Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            ), albumName
        )
        if (file.exists()) {
            return file
        } else if (!file.mkdirs()) {
            return null
        }
        return file
    }

}
