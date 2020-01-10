package com.ttchain.walletproject.utils

import java.math.BigDecimal
import java.text.SimpleDateFormat
import java.util.*

const val LATEST_RANGE_OF_DAYS = 90

object TimeUtils {

    /**
     * timeStampString in SECONDS.
     */
    @JvmStatic
    fun getTimeFormat(timeStampString: String): String {
        return if (timeStampString.isNotEmpty()) {
            val timeStamp = java.lang.Long.parseLong(timeStampString)
            getFormatTimeInDefaultLocale(timeStamp * 1000L)
        } else {
            ""
        }
    }

    /**
     * time in MILLISECONDS.
     */
    @JvmStatic
    fun getFormatTimeInDefaultLocale(time: Long): String {
        val cal = Calendar.getInstance(Locale.getDefault())
        cal.timeInMillis = time
        val sdf = SimpleDateFormat("MM/dd/yyyy HH:mm:ss", Locale.getDefault())
        return sdf.format(cal.time)
    }

    /**
     * Timestamp in SECONDS.
     */
    @JvmStatic
    fun getNowTimestamp(): Long {
        val cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"))
        return cal.time.time / 1000L
    }

    /**
     * Timestamp in SECONDS.
     */
    @JvmStatic
    fun getTodayTimestamp(): Long {
        val cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+00:00"))
        cal.set(Calendar.HOUR_OF_DAY, 0)
        cal.set(Calendar.MINUTE, 0)
        cal.set(Calendar.SECOND, 0)
        cal.set(Calendar.MILLISECOND, 0)
        return cal.time.time / 1000L
    }

    @JvmStatic
    fun getLongOfDays(days: Int): Long {
        return (days * 24 * 3600).toLong()
    }

    @JvmStatic
    fun isTimestampInRange(timeStamp: String): Boolean {
        return isTimestampInRange(
            timeStamp.toLong(),
            getTodayTimestamp(),
            getLongOfDays(LATEST_RANGE_OF_DAYS)
        )
    }

    @JvmStatic
    fun isTimestampInRange(timeStamp: Long): Boolean {
        return isTimestampInRange(
            timeStamp,
            getTodayTimestamp(),
            getLongOfDays(LATEST_RANGE_OF_DAYS)
        )
    }

    @JvmStatic
    fun isTimestampInRange(
        timeStamp: Long,
        todayLong: Long = getTodayTimestamp(),
        latestLong: Long = getLongOfDays(LATEST_RANGE_OF_DAYS)
    ): Boolean {
        val recordTimeStamp = BigDecimal(timeStamp.toString())
        val latest = BigDecimal(todayLong.toString()).subtract(BigDecimal(latestLong.toString()))
        return recordTimeStamp.subtract(latest).toDouble() >= 0
    }

    @JvmStatic
    fun compareTimestamp(
        timeStamp1: String,
        timeStamp2: String
    ): Long {
        val time1 = timeStamp1.toLong()
        val time2 = timeStamp2.toLong()
        return time1 - time2
    }
}