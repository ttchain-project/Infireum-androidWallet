package com.ttchain.walletproject.net

import io.reactivex.Observable
import retrofit2.http.GET

interface BalanceApi {

    @GET("/topChain/getBalance_app/{address}")
    fun getBalance(
            @retrofit2.http.Path("address") address: String,
            @retrofit2.http.QueryMap options: Map<String, String>
    ): Observable<String>
}