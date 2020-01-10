package com.ttchain.walletproject

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Point
import android.util.DisplayMetrics
import android.util.TypedValue
import android.view.WindowManager

/**
 * Dp to px
 * @receiver Float Dp float
 * @param context Context context
 * @return Int = px
 */
fun Float.dp2px(context: Context) = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP, this, context.resources
        .displayMetrics
).toInt()

/**
 * Sp to px
 * @receiver Float Sp Float
 * @param context Context context
 * @return Int = px
 */
fun Float.sp2px(context: Context) = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_SP, this, context.resources
        .displayMetrics
).toInt()

/**
 * Px to dp
 * @receiver Float Px float
 * @param context Context context
 * @return Float = dp
 */
fun Float.px2dp(context: Context) = this / context.resources.displayMetrics.density

/**
 * Px to sp
 * @receiver Float Px float
 * @param context Context context
 * @return Float = sp
 */
fun Float.px2sp(context: Context) = this / context.resources.displayMetrics.scaledDensity

/**
 * Get screen width
 * @receiver Context context
 * @return Int = screen width
 */
fun Context.getScreenWidth(): Int {
    val outMetrics = DisplayMetrics()
    val wm = this.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    wm.defaultDisplay.getMetrics(outMetrics)
    return outMetrics.widthPixels
}

/**
 * Get screen height
 * @receiver Context context
 * @return Int = Screen height
 */
fun Context.getScreenHeight(): Int {
    val outMetrics = DisplayMetrics()
    val wm = this.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    wm.defaultDisplay.getMetrics(outMetrics)
    return outMetrics.heightPixels
}

/**
 * 取得 NavigationBar 高度
 * @receiver Context
 * @return Int = NavigationBar Height
 */
fun Context.getNavigationBar(): Int {
    val resources = this.resources
    val resourceId = resources.getIdentifier("navigation_bar_height", "dimen", "android")
    return if (resourceId > 0) {
        resources.getDimensionPixelSize(resourceId)
    } else 0
}

/**
 * 取得 status Bar 高度
 * @receiver Context
 * @return Int = StatusBar Height
 */
fun Context.getStatusBarHeight(): Int {
    var result = 0
    val resourceId = this.resources
        .getIdentifier("status_bar_height", "dimen", "android")
    if (resourceId > 0) {
        result = this.resources.getDimensionPixelSize(resourceId)
    }
    return result
}

/**
 * Check Device Has NavigationBar
 * @receiver Context
 * @return Boolean = hasNavigationBar?
 */
@SuppressLint("PrivateApi")
fun Context.checkDeviceHasNavigationBar(): Boolean {
    var hasNavigationBar = false
    val rs = this.resources
    val id = rs.getIdentifier("config_showNavigationBar", "bool", "android")
    if (id > 0) {
        hasNavigationBar = rs.getBoolean(id)
    }
    try {
        val systemPropertiesClass = Class.forName("android.os.SystemProperties")
        val m = systemPropertiesClass.getMethod("get", String::class.java)
        val navBarOverride = m.invoke(systemPropertiesClass, "qemu.hw.mainkeys") as String
        if ("1" == navBarOverride) {
            hasNavigationBar = false
        } else if ("0" == navBarOverride) {
            hasNavigationBar = true
        }
    } catch (ignored: Exception) {
    }

    return hasNavigationBar
}

/**
 * 取得螢幕尺寸
 * @receiver context context
 * @return point point
 */
fun Context.getScreenSize(): Point {
    val wm = getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val screenSize = Point()
    wm.defaultDisplay.getSize(screenSize)
    return screenSize
}

/**
 * 取得螢幕解析度
 * @receiver Context
 * @return Float = 螢幕解析度
 */
fun Context.getScreenDensity() = this.resources.displayMetrics.density