-dontskipnonpubliclibraryclassmembers

-keep class android.support.v4.app.** { *; }
-keep interface android.support.v4.app.** { *; }

-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgent
-keep public class * extends android.preference.Preference
-keep public class * extends android.support.v4.app.Fragment
-keep public class * extends android.support.v4.app.DialogFragment

-dontwarn android.support.design.**
-keep class android.support.design.** { *; }
-keep interface android.support.design.** { *; }
-keep public class android.support.design.R$* { *; }

-keep public class * extends android.view.View {
	public <init>(android.content.Context);
	public <init>(android.content.Context, android.util.AttributeSet);
	public <init>(android.content.Context, android.util.AttributeSet, int);
	public void set*(...);
}

-keepclasseswithmembers class * {
	public <init>(android.content.Context, android.util.AttributeSet);
}

-keepclasseswithmembers class * {
	public <init>(android.content.Context, android.util.AttributeSet, int);
}

-keepclassmembers class * extends android.app.Activity {
	public void *(android.view.View);
}

-keepclassmembers enum * {
	public static **[] values();
	public static ** valueOf(java.lang.String);
}

-dontwarn android.support.**
-dontwarn com.google.ads.**

#kotlin
-dontwarn kotlin.**
#Glide
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public class * extends com.bumptech.glide.module.AppGlideModule
-keep public enum com.bumptech.glide.load.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}
#support design
-keep public class androidx.** { *; }

-dontwarn com.google.android.material.**
-keep class com.google.android.material.** { *; }
-keep interface com.google.android.material.** { *; }
-keep public class com.google.android.material.R$* { *; }

#RecyclerView
-keep public class * extends androidx.recyclerview.widget.RecyclerView.ItemDecoration
-keep class androidx.recyclerview.widget.RecyclerView

#GSON
-keepattributes Signature
-dontwarn sun.misc.Unsafe
-keep class sun.misc.Unsafe { *; }
-keep class tw.com.masterhand.cucumbervideo.model.** { *; }

# RxJava2
-keep class io.reactivex.** { *; }

#retrofit2
-keepclassmembernames,allowobfuscation interface * {
    @retrofit2.http.* <methods>;
}
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
#okhttp3
-dontwarn okhttp3.**
-dontwarn okio.**
-dontwarn javax.annotation.**
-dontwarn org.conscrypt.**
-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase
# Android architecture components
-keepclassmembers class * implements androidx.lifecycle.LifecycleObserver {
    <init>(...);
}
-keepclassmembers class * extends androidx.lifecycle.ViewModel {
    <init>(...);
}
-keepclassmembers class androidx.lifecycle.Lifecycle$State { *; }
-keepclassmembers class androidx.lifecycle.Lifecycle$Event { *; }
-keepclassmembers class * {
    @androidx.lifecycle.OnLifecycleEvent *;
}
-keepclassmembers class * implements androidx.lifecycle.LifecycleObserver {
    <init>(...);
}
-keep class * implements androidx.lifecycle.LifecycleObserver {
    <init>(...);
}
-keepclassmembers class android.arch.** { *; }
-keep class android.arch.** { *; }
-dontwarn android.arch.**

################################
#---- customize parameters ----#
################################

-dontwarn org.apache.**
-dontwarn org.joda.**
-dontwarn org.junit.**
-dontwarn org.slf4j.**
-dontwarn junit.**

-dontwarn retrofit.**
-dontwarn okio.**
-dontwarn com.octo.android.**
-dontwarn com.viewpagerindicator**
-dontwarn com.crashlytics.**
-dontwarn android.support.v4.**
-dontwarn com.squareup.okhttp3.**
-dontwarn retrofit2.**

-keep class org.joda.** { *; }
-keep class org.apache.** { *; }
-keep class org.junit.** { *; }
-keep class org.slf4j.** { *; }
-keep class junit.** { *; }

-keep class com.crashlytics.** { *; }
-keep class retrofit.** { *; }
-keep class **$$ViewBinder { *; }
-keep class okio.** { *; }
-keep class com.octo.android.** { *; }
-keep class com.viewpagerindicator** { *; }
-keep class com.squareup.okhttp3.* { *; }
-keep class retrofit2.** { *; }
-keep class rx.internal.util.unsafe.** { *; }
-keep class okhttp3.internal.huc.** { *; }

-keep class com.git4u.tt_wallet_android.net.** { *; }
-keep class com.git4u.tt_wallet_android.cache.** { *; }
-keep class com.git4u.tt_wallet_android.ui.** { *; }
-keep class com.git4u.tt_wallet_android.database.** { *; }
-keep class com.git4u.tt_wallet_android.model.** { *; }
-keep class com.git4u.tt_wallet_android.enums.** { *; }

-keep class com.igexin.** { *; }
-keep class com.huawei.** { *; }
-keep class org.json.** { *; }
-keep class com.squareup.okhttp.** { *; }
-keep class com.google.android.gms.** { *; }

-keepattributes Signature
-keepattributes Exceptions

-keep class com.squareup.okhttp3.** { *; }

-keepclasseswithmembers class * {
    @retrofit2.http.* <methods>;
}

-keep class veg.** { *; }

# For using GSON @Expose annotation
-keepattributes *Annotation*
-keepattributes EnclosingMethod

# Gson specific classes
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.** { *; }


-keep class tw.org.iii.beaconcontentsdk.** { *; }
-keepclassmembers class tw.org.iii.beaconcontentsdk.** { *; }

-dontwarn com.igexin.**

-dontwarn rx.internal.util.unsafe.**
-dontwarn com.akr.android.beacon.**
-dontwarn com.huawei.**
-dontwarn com.squareup.okhttp.**

-dontwarn InnerClasses

# For BaseRecyclerViewAdapterHelper
-keep class com.chad.library.adapter.** {
*;
}
-keep public class * extends com.chad.library.adapter.base.BaseQuickAdapter
-keep public class * extends com.chad.library.adapter.base.BaseViewHolder
-keepclassmembers public class * extends com.chad.library.adapter.base.BaseViewHolder {
     <init>(android.view.View);
}

#-keep class java.lang.invoke.LambdaForm.* { *; }
-dontwarn java.lang.invoke.*

#Ormlite
-keep public class * extends com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper
-keep public class * extends com.j256.ormlite.android.apptools.OpenHelperManager
-keep class com.j256.ormlite.** { *; }
-keep class com.j256.ormlite.android.** { *; }
-keep class com.j256.ormlite.field.** { *; }
-keep class com.j256.ormlite.stmt.** { *; }
-dontwarn org.slf4j.**
-dontwarn org.apache.log4j.**
-dontwarn org.apache.commons.logging.**
-dontwarn org.apache.commons.codec.binary.**
-dontwarn javax.persistence.**
-dontwarn javax.lang.**
-dontwarn javax.annotation.**
-dontwarn javax.tools.**

#For okhttp3
-dontwarn okhttp3.**
-dontwarn okio.**
-dontwarn javax.annotation.**
-dontwarn org.conscrypt.**
# A resource is loaded with a relative path so the package of this class must be preserved.
-keepnames class okhttp3.internal.publicsuffix.PublicSuffixDatabase

# OkHttp3
-dontwarn okio.**
-dontwarn okhttp3.**
-keep class okhttp3.** { *;}
-keep interface okhttp3.* { *; }
-dontwarn javax.annotation.Nullable
-dontwarn javax.annotation.ParametersAreNonnullByDefault

#For Log
-assumenosideeffects class android.util.Log { *; }

#For facebook stetho
-dontwarn com.facebook.stetho.**
-keep class com.facebook.stetho.** { *; }

-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}
-keep public class * implements java.io.Serializable {*;}

-keep class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}
-keepclassmembers class * implements android.os.Parcelable {
    public <fields>;
    private <fields>;
    static ** CREATOR;
}
-keepclassmembers class **.R$* {
    public static <fields>;
}

-dontwarn pl.droidsonroids.gif.**
-keep class pl.droidsonroids.gif.** { *; }

#For BitcoinJ
-dontwarn org.bitcoinj.**
-keep class org.bitcoinj.** { *; }
-dontwarn org.bitcoin.**
-keep class org.bitcoin.** { *; }

#For Web3J
-dontwarn org.web3j.**
-keep class org.web3j.** { *; }

-dontwarn com.quincysx.**
-keep class com.quincysx.** { *; }

-dontwarn com.google.common.**
-keep class com.google.common.** { *; }

-dontwarn org.bouncycastle.**
-keep class org.bouncycastle.** { *; }
-dontwarn org.spongycastle.**
-keep class org.spongycastle.** { *; }

-dontwarn com.fasterxml.**
-keep class com.fasterxml.** { *; }

#Banner
-keep class com.ms.banner.** {*;}

#For Timber
-dontwarn com.jakewharton.timber.**
-keep class com.jakewharton.timber.** { *; }

# Api data class date time format
-keep class org.threeten.bp.** { *; }

# Coroutines
-keepclassmembernames class kotlinx.** {
    volatile <fields>;
}
-keepnames class kotlinx.** { *; }

# Coroutines adapter
-dontwarn com.jakewharton.retrofit.**
-keep class com.jakewharton.retrofit.** { *; }
-dontwarn com.jakewharton.retrofit2.**
-keep class com.jakewharton.retrofit2.** { *; }