package com.ttchain.walletproject.net.client

import com.google.gson.Gson
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.reflect.Type

class GsonCustomConverterFactory private constructor(gson: Gson?) :
    Converter.Factory() {
    private val gson: Gson
    private val gsonConverterFactory: GsonConverterFactory
    override fun responseBodyConverter(
        type: Type,
        annotations: Array<Annotation>,
        retrofit: Retrofit
    ): Converter<ResponseBody, *>? {
        return if (type == String::class.java) GsonResponseBodyConverterToString<Any>(
            gson,
            type
        ) else gsonConverterFactory.responseBodyConverter(type, annotations, retrofit)
    }

    override fun requestBodyConverter(
        type: Type,
        parameterAnnotations: Array<Annotation>,
        methodAnnotations: Array<Annotation>,
        retrofit: Retrofit
    ): Converter<*, RequestBody>? {
        return gsonConverterFactory.requestBodyConverter(
            type,
            parameterAnnotations,
            methodAnnotations,
            retrofit
        )
    }

    companion object {
        fun create(gson: Gson?): GsonCustomConverterFactory {
            return GsonCustomConverterFactory(gson)
        }
    }

    init {
        if (gson == null) throw NullPointerException("gson == null")
        this.gson = gson
        gsonConverterFactory = GsonConverterFactory.create(gson)
    }
}