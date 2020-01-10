package com.ttchain.walletproject.net

import com.ttchain.walletproject.model.ApiPostSignTtnTransResponse
import com.ttchain.walletproject.model.ApiTtnBalanceResponse
import com.ttchain.walletproject.model.SignTtnTransResultData
import com.ttchain.walletproject.model.TtnTransactionModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST

interface TtnServerApi {

    @GET("/getAccount")
    fun getAccount(
            @retrofit2.http.Query("address") address: String
    ): Observable<ApiTtnBalanceResponse>

    @POST("/signTransaction")
    fun postSignTtnTransaction(
            @retrofit2.http.Body model: TtnTransactionModel
    ): Observable<ApiPostSignTtnTransResponse>

    @POST("/broadcast")
    fun postTtnBroadcast(
            @retrofit2.http.Body model: SignTtnTransResultData
    ): Observable<String>
}