package com.ttchain.walletproject.utils;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.Html;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.git4u.tt_wallet_android.net.model.Function3Response;
import com.git4u.tt_wallet_android.net.model.Function4Response;
import com.scottyab.aescrypt.AESCrypt;
import com.ttchain.walletproject.BuildConfig;
import com.ttchain.walletproject.model.BiResponse;
import com.ttchain.walletproject.model.UserHelperImpl;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.bitcoinj.core.Base58;
import org.bitcoinj.core.Sha256Hash;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.spec.SecretKeySpec;

public class Utility {


    public static final DecimalFormat decimalFormat = new DecimalFormat("#,###,###.########");
    public static final DecimalFormat decimalFormatQuantity = new DecimalFormat("#");

    public static final String KEY = "gibofflinewallet";
    private static final String IV = "walletofflinegib";

    /**
     * [概 要]:消除「Unchecked Cast」警告
     * [說 明]:
     * [備 注]:
     *
     * @param obj 待轉對象
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T> T convert(Object obj) {
        return (T) obj;
    }

    public static boolean hasNetworkConnection(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        return !(networkInfo == null || !networkInfo.isConnectedOrConnecting());
    }

    /**
     * 確認網路目前狀態
     *
     * @param context
     * @return true 可以使用網路, false 無法使用網路
     */
    public static boolean getInternetStatus(Context context) {
        ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (mConnectivityManager != null) {
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            // 如果未連線的話，mNetworkInfo會等於null
            if (mNetworkInfo != null) {
                // 網路是否已連線(true or false)
                mNetworkInfo.isConnected();
                // 網路連線方式名稱(WIFI or mobile)
                mNetworkInfo.getTypeName();
                // 網路連線狀態(CONNECTED or DISCONNECTED)
                mNetworkInfo.getState();
                // 網路是否可使用(true or false)
                mNetworkInfo.isAvailable();

                StringBuffer sb = new StringBuffer();
                sb.append("isConnected : ").append(mNetworkInfo.isConnected()).append("\n");
                sb.append("TypeName : ").append(mNetworkInfo.getTypeName()).append("\n");
                sb.append("State : ").append(mNetworkInfo.getState()).append("\n");
                sb.append("isAvailable : ").append(mNetworkInfo.isAvailable()).append("\n");
//            Log.d(TAG, "NetworkInfo : \n" + sb.toString());

                return mNetworkInfo.isConnected() && mNetworkInfo.isAvailable();
            }
        }
        return false;
    }

    /**
     * When service stop, the api header 'X-Android-Is-Disable' will be true. (maybe!?)
     * Only api header 'X-Android-Is-Disable' is equals 'false' return false value.
     * Other exception situation will return true.
     *
     * @param apiResponseAppStatus 'true' or 'false'
     * @return default: true, false when service stop.
     */
    public static boolean isAppDisable(String apiResponseAppStatus) {
        if (apiResponseAppStatus == null) {
            return true;
        }

        if (apiResponseAppStatus.toLowerCase().equals("false")) {
            return false;
        } else if (apiResponseAppStatus.toLowerCase().equals("true")) {
            return true;
        }

        return true;
    }

    /**
     * When device app version name that first bit and second bit is lower than
     * api header, 'X-Android-Version', android version, enforce user to update app version.
     *
     * @param apiResponseAppVersionName four bit version name from api header
     * @param appVersionName            BuildConfig.VERSION_NAME
     * @return default: false, true if device app version lower api app version .
     */
    public static boolean isAppVersionDeprecated(String apiResponseAppVersionName, String appVersionName) {
        if (TextUtils.isEmpty(apiResponseAppVersionName)) {
            return false;
        }

        String[] apiVersionNameArray = null;
        if (apiResponseAppVersionName.contains(".")) {
            apiVersionNameArray = apiResponseAppVersionName.split("\\.");
        }

        if (apiVersionNameArray == null) {
            return false;
        }
        //原先有加上 "$-${commit資訊}"
//        int vIndex = appVersionName.indexOf("-");
//
//        appVersionName = appVersionName.substring(0, vIndex);

        String[] appVersionNameArray = appVersionName.split("\\.");

        if (apiVersionNameArray.length > 1 && appVersionNameArray.length > 1) {
            try {
                int verNew = Integer.parseInt(apiVersionNameArray[0]) * 10000 + Integer.parseInt(apiVersionNameArray[1]) * 100 + Integer.parseInt(apiVersionNameArray[2]);
                int ver = Integer.parseInt(appVersionNameArray[0]) * 10000 + Integer.parseInt(appVersionNameArray[1]) * 100 + Integer.parseInt(appVersionNameArray[2]);
                return ver < verNew;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public static boolean isAppVersionDeprecated(String apiMiniVersion, String apiLatestVersion, String appVersionName) {
        if (TextUtils.isEmpty(apiMiniVersion) || TextUtils.isEmpty(apiLatestVersion)) {
            return false;
        }

        String[] apiMiniVersionNameArray = null;
        if (apiMiniVersion.contains(".")) {
            apiMiniVersionNameArray = apiMiniVersion.split("\\.");
        }

        if (apiMiniVersionNameArray == null) {
            return false;
        }

        String[] apiLatestVersionNameArray = null;
        if (apiLatestVersion.contains(".")) {
            apiLatestVersionNameArray = apiLatestVersion.split("\\.");
        }

        if (apiLatestVersionNameArray == null) {
            return false;
        }

        String[] appVersionNameArray = appVersionName.split("\\.");

        if (apiMiniVersionNameArray.length > 1 && apiLatestVersionNameArray.length > 1 && appVersionNameArray.length > 1) {
            try {
                int verMini = Integer.parseInt(apiMiniVersionNameArray[0]) * 10000 + Integer.parseInt(apiMiniVersionNameArray[1]) * 100;
                int verNew = Integer.parseInt(apiLatestVersionNameArray[0]) * 10000 + Integer.parseInt(apiLatestVersionNameArray[1]) * 100;
                int ver = Integer.parseInt(appVersionNameArray[0]) * 10000 + Integer.parseInt(appVersionNameArray[1]) * 100;
                return ver < verMini;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    public static String getApplicationId() {
//        if (!FeatureUtils.isRelease()) {
//            return BuildConfig.APPLICATION_ID.substring(0, BuildConfig.APPLICATION_ID.lastIndexOf("."));
//        }
        return BuildConfig.APPLICATION_ID;
    }

    public static String formatDate(SimpleDateFormat src, SimpleDateFormat dest, String date) {
        if (date != null) {
            try {
                return dest.format(src.parse(date));
            } catch (ParseException e) {
                return "";
            }
        }

        return "";
    }

    public static String formatDate(SimpleDateFormat dest, Date date) {
        if (date != null) {
            return dest.format(date);
        }
        return "";
    }

    public static Date formatDate(String date, SimpleDateFormat format) {
        if (date == null) {
            return new Date();
        } else {
            try {
                return format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
                return new Date();
            }
        }
    }

    private final static DateTimeFormatter DATE_TIME_LAST_SECS_AM_PM = DateTimeFormatter.ofPattern("yyyy/MM/dd a hh:mm:ss", Locale.getDefault());
    private final static DateTimeFormatter DATE_TIME_LAST_SECS_AM_PM_US = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a", Locale.US);
    private final static DateTimeFormatter DATE_TIME_LAST_DAY = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final static DateTimeFormatter DATE_TIME_LAST_MINS = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private final static DateTimeFormatter DATE_TIME_LAST_SECS = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private final static DateTimeFormatter DATE_TIME_LAST_SECS_WITH_LOCALE = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZZ").withLocale(Locale.getDefault());

    public static String formatDateTimeDay(OffsetDateTime offsetDateTime) {
        return formatDateTime(DATE_TIME_LAST_DAY, offsetDateTime);
    }

    public static String formatDateTimeMins(OffsetDateTime offsetDateTime) {
        return formatDateTime(DATE_TIME_LAST_MINS, offsetDateTime);
    }

    public static String formatDateTimeSecs(OffsetDateTime offsetDateTime) {
        return formatDateTime(DATE_TIME_LAST_SECS, offsetDateTime);
    }

    public static String formatDateTimeSecsWithLocale(OffsetDateTime offsetDateTime) {
        return formatDateTime(DATE_TIME_LAST_SECS_WITH_LOCALE, offsetDateTime);
    }

    public static String formatDateTimeSecsAmPm(OffsetDateTime offsetDateTime) {
        return formatDateTime(DATE_TIME_LAST_SECS_AM_PM, offsetDateTime);
    }

    public static String formatDateTimeSecsAmPmUs(OffsetDateTime offsetDateTime) {
        return formatDateTime(DATE_TIME_LAST_SECS_AM_PM_US, offsetDateTime);
    }

    public static OffsetDateTime getOffsetDateTime(String dateTime) {
        OffsetDateTime offsetDateTime = null;
        try {
            offsetDateTime = OffsetDateTime.parse(dateTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return offsetDateTime;
    }


    /**
     * Get OffsetDateTime from time format to secs with locale in app from {@link #getTimeSecsWithLocale(OffsetDateTime)}
     *
     * @param dateTime
     * @return
     */
    public static OffsetDateTime getOffsetDateTimeWithLocale(String dateTime) {
        OffsetDateTime offsetDateTime = null;
        try {
            offsetDateTime = OffsetDateTime.parse(dateTime, DATE_TIME_LAST_SECS_WITH_LOCALE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return offsetDateTime;
    }


    /**
     * Get time to secs with locale in app.
     *
     * @param offsetDateTime
     * @return
     */
    public static String getTimeSecsWithLocale(OffsetDateTime offsetDateTime) {
        return formatDateTimeSecsWithLocale(offsetDateTime);
    }

    private static String formatDateTime(DateTimeFormatter dateTimeFormatter, OffsetDateTime
            offsetDateTime) {
        if (offsetDateTime == null) {
            return "";
        }
        return offsetDateTime.format(dateTimeFormatter);
    }

    public static String formatAmount(Object price) {
        if (price != null) {
            return decimalFormat.format(price);
        } else {
            return decimalFormat.format(0.0);
        }
    }

    public static String formatQuantity(Object quantity) {
        if (quantity != null) {
            return decimalFormatQuantity.format(quantity);
        } else {
            return decimalFormatQuantity.format(0);
        }
    }

    public static String getUrlEncode(String paramater) {
        try {
            return URLEncoder.encode(paramater, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String MD5Encoding(String s) {
        final String MD5 = "MD5";
        try {
            // Create MD5 Hash
            MessageDigest digest = MessageDigest
                    .getInstance(MD5);
            digest.update(s.getBytes());
            byte messageDigest[] = digest.digest();

            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (byte aMessageDigest : messageDigest) {
                String h = Integer.toHexString(0xFF & aMessageDigest);
                while (h.length() < 2)
                    h = "0" + h;
                hexString.append(h);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static Integer[] getResourceIdArray(Resources resources, int array_rId) {
        TypedArray typedArray = resources.obtainTypedArray(array_rId);
        Integer[] rIds = new Integer[typedArray.length()];
        for (int i = 0; i < typedArray.length(); i++) {
            rIds[i] = typedArray.getResourceId(i, -1);
        }
        typedArray.recycle();
        return rIds;
    }

    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    @SuppressLint("HardwareIds")
    public static String getUniquePhoneIdentity(Context context) {
        String m_szDevIDShort = "35"
                + (Build.BOARD.length() % 10)
                + (Build.BRAND.length() % 10)
                + (Build.CPU_ABI.length() % 10)
                + (Build.DEVICE.length() % 10)
                + (Build.MANUFACTURER.length() % 10)
                + (Build.MODEL.length() % 10)
                + (Build.PRODUCT.length() % 10);

        String serial;
        try {
            serial = Build.class.getField("SERIAL").get(null).toString();
        } catch (Exception exception) {
            serial = "serial";
        }

        String android_id;
        try {
            android_id = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        } catch (Exception exception) {
            android_id = "android_id";
        }

        return new UUID(m_szDevIDShort.hashCode(), (serial + android_id).hashCode()).toString();
    }

    public static boolean haveInstallChrome(Context context) {
        String packageName = "com.android.chrome";
        Intent browserIntent = new Intent();
        browserIntent.setPackage(packageName);
        List<ResolveInfo> activitiesList = context.getPackageManager().queryIntentActivities(
                browserIntent, -1);

        return activitiesList.size() > 0;
    }

    public static void parseUrlScheme(Context context, String scheme) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        intent.setData(Uri.parse(scheme));
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {

        }
    }

    public static String getSHA1(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(text.getBytes(StandardCharsets.ISO_8859_1), 0, text.length());
        byte[] sha1hash = md.digest();

        // Create Hex String
        StringBuilder hexString = new StringBuilder();
        for (byte aMessageDigest : sha1hash) {
            String h = Integer.toHexString(0xFF & aMessageDigest);
            while (h.length() < 2)
                h = "0" + h;
            hexString.append(h);
        }
        return hexString.toString();
    }

    public static String getSHA256(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes(StandardCharsets.ISO_8859_1), 0, text.length());
        byte[] sha1hash = md.digest();

        // Create Hex String
        StringBuilder hexString = new StringBuilder();
        for (byte aMessageDigest : sha1hash) {
            String h = Integer.toHexString(0xFF & aMessageDigest);
            while (h.length() < 2)
                h = "0" + h;
            hexString.append(h);
        }
        return hexString.toString();
    }

    public static boolean isBarcodeReceiveLeftPart(String code) {
        boolean isLeftPart = false;

        try {
            String invoicePattern = "[a-zA-Z]{2}[0-9]{15}(?=.*=)";
            Pattern regEx = Pattern.compile(invoicePattern);

            // Find instance of pattern matches
            Matcher m = regEx.matcher(code);
            if (m.find()) {
                isLeftPart = true;
            }

        } catch (Exception e) {
            // do nothing.
        }

        return isLeftPart;
    }

    /**
     * Get a bitmap by using Base64 decoder.
     *
     * @param imageString the image string is encode to base64.
     * @return get a bitmap, the default is return null.
     */
    public static Bitmap getBitmap(String imageString) {
        if (!TextUtils.isEmpty(imageString)) {
            byte[] decodedString = Base64.decode(imageString, Base64.DEFAULT);
            return BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        }
        return null;
    }

    public static BiResponse buildBiResponse(Object object1, Object object2) {
        return new BiResponse(object1, object2);
    }

    public static Function3Response buildFunction3Response(Object object1, Object
            object2, Object object3) {
        return new Function3Response(object1, object2, object3);
    }

    public static Function4Response buildFunction4Response(Object object1, Object
            object2, Object object3, Object object4) {
        return new Function4Response(object1, object2, object3, object4);
    }

    public static boolean compareVersion(String newVersionName, String versionName) {

        if (TextUtils.isEmpty(newVersionName) || TextUtils.isEmpty(versionName)) {
            return false;
        }

        try {
            String newVersionNameArray[] = newVersionName.split("\\.");
            String versionNameArray[] = versionName.split("\\.");

            return !newVersionNameArray[0].equals(versionNameArray[0])
                    || !newVersionNameArray[1].equals(versionNameArray[1]);

        } catch (Exception e) {
            return false;
        }
    }

    @SuppressWarnings("deprecation")
    public static String fromHtml(String html) {
        String result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY).toString();
        } else {
            result = Html.fromHtml(html).toString();
        }
        return result;
    }

    public static class MapValueComparator implements Comparator<Map.Entry<String, String>> {
        @Override
        public int compare(Map.Entry<String, String> me1, Map.Entry<String, String> me2) {
            return me1.getValue().compareTo(me2.getValue());
        }
    }

    /**
     * In ShoppingCartActivity. ResponseShoppingCartItemModel.
     *
     * @param specName
     * @return
     */
    public static String formatSpecName(String specName) {
        if (specName == null) {
            return "";
        }

        if (!specName.contains(";")) {
            return specName;
        }

        return specName.replace(";", "\n");
    }

    public static void setDeleteFlagsTextView(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }

    public static void copyString(Context context, @NonNull String text) {
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        if (clipboard != null) {
            clipboard.setPrimaryClip(ClipData.newPlainText(null, text));
        }
    }

    public static String encryptPrivateKey(@NonNull String privateKey, @NonNull String pwd) {
        String key = pwd;

        try {

            int interval = 16 - key.getBytes().length;

            while (interval != 0) {
                if (interval > 0) {
                    key += key;
                } else {
                    key = new String(Arrays.copyOfRange(key.getBytes(), 0, 16));
                }

                interval = 16 - key.getBytes().length;
            }

            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");

            return Base64.encodeToString(
                    AESCrypt.encrypt(
                            keySpec,
                            IV.getBytes(),
                            privateKey.getBytes()),
                    Base64.NO_WRAP);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pwd;
    }


    public static String encryptWith32ByteKey(@NonNull String privateKey, @NonNull String pwd) {
        String key = pwd;

        try {

            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");

            return Base64.encodeToString(
                    AESCrypt.encrypt(
                            keySpec,
                            IV.getBytes(),
                            privateKey.getBytes()),
                    Base64.NO_WRAP);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pwd;
    }

    public static String decryptPrivateKeyWith32ByteKey(@NonNull String epKey, @NonNull String pwd) {
        String key = pwd;

        try {

            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");

            return new String(
                    AESCrypt.decrypt(
                            keySpec,
                            IV.getBytes(),
                            Base64.decode(epKey.getBytes(), Base64.NO_WRAP)));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pwd;
    }

    public static String decryptPrivateKey(@NonNull String epKey, @NonNull String pwd) {
        String key = pwd;
        try {
            int interval = 16 - key.getBytes().length;
            while (interval != 0) {
                if (interval > 0) {
                    key += key;
                } else {
                    key = new String(Arrays.copyOfRange(key.getBytes(), 0, 16));
                }
                interval = 16 - key.getBytes().length;
            }
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "AES");
            return new String(
                    AESCrypt.decrypt(
                            keySpec,
                            IV.getBytes(),
                            Base64.decode(epKey.getBytes(), Base64.NO_WRAP)));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return pwd;
    }

    public static String hashIdentityIdFromMnemonic(String mnemonic) {
        String prefix = "OW";

        StringBuilder sb = new StringBuilder(mnemonic.replace(" ", "")).reverse();

        String base64Str = Base64.encodeToString(sb.toString().getBytes(), Base64.NO_WRAP);

        return prefix + new String(Hex.encodeHex(DigestUtils.sha1(base64Str)));
    }

    public static String getProgressDisplayLine(long currentBytes, long totalBytes) {
        return getBytesToMBString(currentBytes) + "/" + getBytesToMBString(totalBytes);
    }

    private static String getBytesToMBString(long bytes) {
        return String.format(Locale.ENGLISH, "%.2fMb", bytes / (1024.00 * 1024.00));
    }

    public static Locale getPrefLocal(Context context) {
        return getPrefLocal(new UserHelperImpl(context).getPreferLanguage());
    }

    public static Locale getPrefLocal(String language) {
        Locale locale = null;
        if (language.contains("zh_TW")) {
            locale = Locale.TAIWAN;
        } else if (language.contains("zh_CN")) {
            locale = Locale.CHINA;
        } else if (language.contains("en")) {
            locale = Locale.ENGLISH;
        } else {
            String defaultLanguage = Locale.getDefault().toString();
            if (defaultLanguage.contains(Locale.TAIWAN.toString()) ||
                    defaultLanguage.contains(Locale.CHINA.toString()) ||
                    defaultLanguage.contains(Locale.ENGLISH.toString())) {
                locale = Locale.getDefault();
            }
        }
        return locale;
    }


    @SuppressLint("HardwareIds")
    public static String getDeviceId(Context context) {

        String deviceId;

        String serial = Build.SERIAL;
        String androidId = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);

        if (serial != null && androidId != null) {
            deviceId = MD5Encoding(serial + androidId);
        } else if (serial == null && androidId != null) {
            deviceId = MD5Encoding(androidId);
        } else if (serial != null) {
            deviceId = MD5Encoding(serial);
        } else {
            String manufacturer = Build.MANUFACTURER;
            String model = Build.MODEL;
            deviceId = MD5Encoding(manufacturer + model);
        }

        return deviceId;
    }

    public static String encodeBase64ToBitmap(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return "data:image/png;base64," + Base64.encodeToString(byteArray, 0);
    }

    public static Bitmap decodeBase64ToBitmap(String base64) {

        if (base64.contains("data:image/png;base64,")) {
            base64 = base64.replace("data:image/png;base64,", "");
        }

        byte[] decodedString = Base64.decode(base64, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
    }

    public static final UUID initialUUID = UUID.fromString("00000000-0000-0000-0000-000000000000");

    public static String ttnAddressToBase58(String address) {

        String stri = "00" + address;

        String finalHash = bytesToHex(Sha256Hash.hashTwice(hexToBytes(stri)));
        System.out.println("finalHash: " + finalHash);

        stri = stri + finalHash.substring(0, 8);

        String base58 = Base58.encode(hexToBytes(stri));

        return base58;
    }

    public static float dpToPixel(Context context, float dip) {
        float px = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dip,
                context.getResources().getDisplayMetrics()
        );

        return px;
    }

    public static void hideKeyboard(Activity activity) {
        activity.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
    }

    public static String hexToString(String hex) {
        try {
            String hexString = hex.replace("0x", "");
            byte[] bytes = Hex.decodeHex(hexString.toCharArray());
            return new String(bytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            return "";
        }
    }

    public static String toHexString(byte[] input, int offset, int length, boolean withPrefix) {
        StringBuilder stringBuilder = new StringBuilder();
        if (withPrefix) {
            stringBuilder.append("0x");
        }
        for (int i = offset; i < offset + length; i++) {
            stringBuilder.append(String.format("%02x", input[i] & 0xFF));
        }

        return stringBuilder.toString();
    }

    public static String toHexString(byte[] input) {
        return toHexString(input, 0, input.length, true);
    }

    public static int stringToAscii(String value) {
//        StringBuffer sbu = new StringBuffer();
        int result = 0;
        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1) {
//                sbu.append((int)chars[i]).append(",");
                result += (int) chars[i];
            } else {
//                sbu.append((int)chars[i]);
                result = (int) chars[i];
            }
        }
//        return sbu.toString();
        return result;
    }

    final private static char[] hexArray = "0123456789abcdef".toCharArray();

    private static int getHexVal(char hex) {
        int val = (int) hex;
        return val - (val < 58 ? 48 : (val < 97 ? 55 : 87));
    }

    public static byte[] hexToBytes(String hex) throws IllegalArgumentException {
        char[] hexArray = hex.toCharArray();

        if (hex.length() % 2 == 1) {
            throw new IllegalArgumentException("Error: The binary key cannot have an odd number of digits");
        }
        byte[] arr = new byte[hex.length() >> 1];

        for (int i = 0; i < hex.length() >> 1; ++i) {
            arr[i] = (byte) ((getHexVal(hexArray[i << 1]) << 4) + (getHexVal(hexArray[(i << 1) + 1])));
        }
        return arr;
    }

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
