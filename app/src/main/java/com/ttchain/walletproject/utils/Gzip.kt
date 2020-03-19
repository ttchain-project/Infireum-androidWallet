package com.ttchain.walletproject.utils

import android.util.Base64
import java.io.*
import java.util.zip.GZIPInputStream
import java.util.zip.GZIPOutputStream

object Gzip {
    fun compress(data: String): String {
        return try {
            val bos = ByteArrayOutputStream(data.length)
            val gzip = GZIPOutputStream(bos)
            gzip.write(data.toByteArray())
            gzip.close()
            val compressed = bos.toByteArray()
            bos.close()
            Base64.encodeToString(compressed, Base64.NO_WRAP)
        } catch (e: IOException) {
            e.printStackTrace()
            ""
        }
    }

    @JvmStatic
    fun decompress(compressed: String?): String {
        return try {
            val bis = ByteArrayInputStream(
                Base64.decode(
                    compressed,
                    Base64.NO_WRAP
                )
            )
            val gis = GZIPInputStream(bis)
            val br =
                BufferedReader(InputStreamReader(gis, "UTF-8"))
            val sb = StringBuilder()
            var line: String?
            while (br.readLine().also { line = it } != null) {
                sb.append(line)
            }
            br.close()
            gis.close()
            bis.close()
            sb.toString()
        } catch (e: IOException) {
            ""
        }
    }
}