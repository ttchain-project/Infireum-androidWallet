package com.ttchain.walletproject.koin

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.ttchain.walletproject.net.client.GsonCustomConverterFactory
import com.ttchain.walletproject.interceptor.HeaderAcceptInterceptor
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.ttchain.walletproject.*
import com.ttchain.walletproject.net.*
import com.ttchain.walletproject.net.client.JSON
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit

inline fun <reified T> providesApi(client: OkHttpClient, url: String): T {
    return Retrofit.Builder()
        .baseUrl(url)
        .client(client)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonCustomConverterFactory.create(JSON().gson))
        .build()
        .create(T::class.java)
}

inline fun <reified T> providesApiCo(client: OkHttpClient, url: String): T {
    return Retrofit.Builder()
        .baseUrl(url)
        .client(client)
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonCustomConverterFactory.create(JSON().gson))
        .build()
        .create(T::class.java)
}

val networkModule = module {

    //okHttp
    single {
        val logging = HttpLoggingInterceptor()
        OkHttpClient.Builder()
            .addNetworkInterceptor(HeaderAcceptInterceptor())
            .addNetworkInterceptor(StethoInterceptor())
            .retryOnConnectionFailure(true)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS).apply {
                if (BuildConfig.DEBUG)
                    addNetworkInterceptor(logging.setLevel(HttpLoggingInterceptor.Level.BODY))
            }
            .build()
    }

    val ttnServer = "ttnServer"
    single(named(ttnServer)) {
        val logging = HttpLoggingInterceptor()
        OkHttpClient.Builder()
            .addNetworkInterceptor(HeaderAcceptInterceptor())
            .addNetworkInterceptor(StethoInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS).apply {
                if (BuildConfig.DEBUG)
                    addNetworkInterceptor(logging.setLevel(HttpLoggingInterceptor.Level.BODY))
            }
            // change host
            .addInterceptor(ServerHostSelectionInterceptor())
            .build()
    }

    val ttnClient = "ttnClient"
    single(named(ttnClient)) {
        val logging = HttpLoggingInterceptor()
        OkHttpClient.Builder()
            .addNetworkInterceptor(HeaderAcceptInterceptor())
            .addNetworkInterceptor(StethoInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS).apply {
                if (BuildConfig.DEBUG)
                    addNetworkInterceptor(logging.setLevel(HttpLoggingInterceptor.Level.BODY))
            }
            // change host
            .addInterceptor(ClientHostSelectionInterceptor())
            .build()
    }

//    single { providesApi<MikeApi>(get(), BuildConfig.MIKE_API_URL) }
    single { providesApi<BalanceApi>(get(), BuildConfig.GIT_WALLET_BALANCE_API_URL) }
    single { providesApi<HelperApi>(get(), BuildConfig.GIT_HELPER_API_URL) }
    single {
        providesApiCo<HelperApiCo>(get(), BuildConfig.GIT_HELPER_API_URL)
    }
    single { providesApi<BroadcastApi>(get(), BuildConfig.GIT_HELPER_API_URL) }
//    single { providesApi<InfoApi>(get(), BuildConfig.GIT_IM_API_URL) }
    single { providesApiCo<InfoApiCo>(get(), BuildConfig.GIT_IM_API_URL) }
//
    single { providesApi<BlockExplorerApi>(get(), BuildConfig.BLOCKEXPLORER_API_URL) }
    single { providesApi<EtherscanApi>(get(), BuildConfig.ETHERSCAN_API_URL) }
    single { providesApi<OmniExplorerApi>(get(), BuildConfig.OMNIEXPLORER_API_URL) }
    single {
        providesApi<TtnServerApi>(
            get(named(ttnServer)), getTtnServerNet()
        )
    }
    single {
        providesApi<TtnClientApi>(
            get(named(ttnClient)), getTtnClientNet()
        )
    }
}

class ServerHostSelectionInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val newUrl = request.url().newBuilder()
            .host(
                HttpUrl.parse(getTtnServerNet())?.host() ?: getTtnBalanceHost()
            )
            .port(serverPort)
            .build()
        request = request.newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(request)
    }
}

class ClientHostSelectionInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val newUrl = request.url().newBuilder()
            .host(
                HttpUrl.parse(getTtnClientNet())?.host() ?: getTtnBalanceHost()
            )
            .port(clientPort)
            .build()
        request = request.newBuilder()
            .url(newUrl)
            .build()

        return chain.proceed(request)
    }
}