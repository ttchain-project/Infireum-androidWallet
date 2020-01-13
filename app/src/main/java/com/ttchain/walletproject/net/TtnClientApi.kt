package com.ttchain.walletproject.net

import com.ttchain.walletproject.model.ApiTtnBalanceResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface TtnClientApi {

    @GET("/getAccount")
    fun getAccount(
            @retrofit2.http.Query("address") address: String
    ): Observable<ApiTtnBalanceResponse>
}