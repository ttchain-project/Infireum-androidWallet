package com.ttchain.walletproject.interceptor


import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException

class HeaderAcceptInterceptor : Interceptor {

    val TAG = javaClass.simpleName

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()

        builder.addHeader("Content-Type", "application/json")
        builder.addHeader("Connection", "close")
        //        builder.addHeader("Accept", "application/json");
        //        builder.addHeader("Accept-Language", "zh-TW,zh;q=0.8,en-US;q=0.6,en;q=0.4,zh-CN;q=0.2");

        val request = builder.build()

        return chain.proceed(request)
    }
}
