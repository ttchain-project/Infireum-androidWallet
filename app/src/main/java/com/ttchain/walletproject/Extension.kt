package com.ttchain.walletproject

import android.app.Activity
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.text.Html
import android.util.Patterns
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterInside
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.scottyab.aescrypt.AESCrypt
import com.ttchain.walletproject.App.Companion.isMainNet
import com.ttchain.walletproject.base.BaseDialogFragment
import com.ttchain.walletproject.enums.CoinEnum
import com.ttchain.walletproject.utils.DelayOnClickListener
import com.ttchain.walletproject.utils.NumberUtils
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
import java.math.BigDecimal

fun <T> Observable<T>.toMain(): Observable<T> {
    return subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
}

fun BaseDialogFragment.add(subscription: Disposable) {
    mCompositeDisposable.add(subscription)
}

fun BaseDialogFragment.clear() {
    mCompositeDisposable.clear()
}

fun BaseDialogFragment.setBehaviorView(view: View) {
    view.parent?.let {
        mBehavior =
            com.google.android.material.bottomsheet.BottomSheetBehavior.from(view.parent as View)
    }
}

fun BigDecimal.isZero(): Boolean {
    return this.toDouble() == 0.0
}

fun FragmentManager.addDialog(fragment: Fragment, tag: String) {
    if (this.findFragmentByTag(tag)?.isAdded == true) {
        return
    }
    commit(true) {
        add(fragment, tag)
    }
}

fun AppCompatActivity.changeFragment(container: Int, fragment: Fragment) {
    supportFragmentManager.commit(true) {
        replace(container, fragment)
    }
}

fun AppCompatActivity.addFragment(container: Int, fragment: Fragment) {
    supportFragmentManager.commit(true) {
        add(container, fragment)
    }
}

fun Fragment.addFragment(container: Int, fragment: Fragment) {
    childFragmentManager.commit(true) {
        add(container, fragment)
    }
}

/**
 * Delay click listener
 */
fun View.setDelayClickListener(onDelayOnClick: (View) -> Unit) {
    val safeClickListener = DelayOnClickListener {
        onDelayOnClick(it)
    }
    setOnClickListener(safeClickListener)
}

fun ImageView.loadCoinCenterCrop(url: String) {
    Glide.with(this)
        .load(url)
        .apply(
            RequestOptions()
                .placeholder(R.mipmap.icon_list_noimage)
                .error(R.mipmap.icon_list_noimage)
                .centerCrop()
        ).into(this)
}

fun ImageView.loadCenterInside(url: String?) {
    Glide.with(this)
        .load(url ?: "")
        .apply(
            RequestOptions()
                .placeholder(R.mipmap.no_image)
                .error(R.mipmap.no_image)
                .centerInside()
        ).into(this)
}

fun ImageView.loadCenterInsideRoundedCorners(url: String?, roundingRadius: Int) {
    Glide.with(this)
        .load(url ?: "")
        .apply(
            RequestOptions()
                .placeholder(R.mipmap.no_image)
                .error(R.mipmap.no_image)
                .transform(CenterInside(), RoundedCorners(roundingRadius))
        ).into(this)
}

fun Context.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun String.performCopyString(context: Context) {
    val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
    clipboard.primaryClip = ClipData.newPlainText(null, this)
    context.showToast(context.getString(R.string.g_copied))
}

fun encrypt(context: Context, plaintext: String): String {
    return try {
        AESCrypt.encrypt(context.getString(R.string.aeskey), plaintext)
    } catch (e: Exception) {
        e.printStackTrace()
        plaintext
    }
}

fun decrypt(context: Context, cipherText: String): String {
    return try {
        AESCrypt.decrypt(context.getString(R.string.aeskey), cipherText)
    } catch (e: Exception) {
        e.printStackTrace()
        cipherText
    }
}

fun String.encryptString(context: Context): String {
    return encrypt(context, this)
}

fun String.decryptString(context: Context): String {
    return decrypt(context, this)
}

/**
 * 外開url
 */
fun Context.openWebUrl(url: String) {
    if (url.isNotEmpty() && Patterns.WEB_URL.matcher(url).matches()) {
        startActivity(
            Intent().apply {
                action = Intent.ACTION_VIEW
                data = Uri.parse(url)
            }
        )
    } else {
        Timber.e("webUrl is wrong")
    }
}

/**
 * 關閉鍵盤
 */
fun Activity.hideKeyboard() {
    val inputMethodManager =
        this.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    var focusView = this.currentFocus
    if (focusView == null)
        focusView = View(this)
    inputMethodManager.hideSoftInputFromWindow(focusView.windowToken, 0)
}

/**
 * 開啟鍵盤
 */
fun View.showKeyboard() {
    (this.context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager).showSoftInput(
        this@showKeyboard,
        InputMethodManager.SHOW_IMPLICIT
    )
}

/**
 * 載入html文字
 */
@Suppress("DEPRECATION")
fun TextView.html(html: String) {
    text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(html, Html.FROM_HTML_MODE_COMPACT)!!
    } else {
        Html.fromHtml(html)
    }
}

const val showNumber = 4
/**
 * 統一處理幣種數值
 */
fun String.handleAmount(coinId: String): String {
    return when (coinId) {
        CoinEnum.TTN.coinId -> {
            NumberUtils.show(NumberUtils.valueOf(this, 18), showNumber)
        }
        CoinEnum.BTCN.coinId -> {
            NumberUtils.show(NumberUtils.valueOf(this, 8), showNumber)
        }
        CoinEnum.USDTN.coinId -> {
            NumberUtils.show(NumberUtils.valueOf(this, 8), showNumber)
        }
        CoinEnum.ETHN.coinId -> {
            NumberUtils.show(NumberUtils.valueOf(this, 18), showNumber)
        }
        CoinEnum.EXR.coinId -> {
            NumberUtils.show(NumberUtils.valueOf(this, 18), showNumber)
        }
        CoinEnum.MCC.coinId -> {
            NumberUtils.show(NumberUtils.valueOf(this, 18), showNumber)
        }
        CoinEnum.DAI1.coinId -> {
            NumberUtils.show(NumberUtils.valueOf(this, 18), showNumber)
        }
        CoinEnum.TUSD1.coinId -> {
            NumberUtils.show(NumberUtils.valueOf(this, 18), showNumber)
        }
        else -> {
            NumberUtils.show(NumberUtils.valueOf(this, 18), showNumber)
        }
    }
}

/**
 * 鏈 host
 */
const val mainNetHost = "http://3.1.196.86" //主鏈 host
const val testNetHost = "http://13.251.130.190" //測試鏈 AWS host
/**
 * 鏈 Server Port
 */
const val serverPort = 9998

fun getTtnServerNet(): String {
    return when {
        isMainNet -> "$mainNetHost:$serverPort/"
        else -> "$testNetHost:$serverPort/"
    }
}

/**
 * 鏈 Client Port
 */
const val clientPort = 9997

fun getTtnClientNet(): String {
    return when {
        isMainNet -> "$mainNetHost:$clientPort/"
        else -> "$testNetHost:$clientPort/"
    }
}

fun getTtnBalanceHost(): String {
    return when {
        isMainNet -> mainNetHost
        else -> testNetHost
    }
}

fun <T> Fragment.lazy(key: String): Lazy<T> = lazy {
    arguments?.get(key) as T
}

fun Fragment.startSettingActivity(requestCode: Int) {
    startActivityForResult(Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
        data = Uri.parse("package:${requireContext().applicationContext.packageName}")
    }, requestCode)
}
