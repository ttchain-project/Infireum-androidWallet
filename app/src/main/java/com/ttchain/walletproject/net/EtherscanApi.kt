package com.ttchain.walletproject.net

import com.ttchain.walletproject.model.ApiEtherscanResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface EtherscanApi {
    @GET("/api")
    fun getEtherscanApiResult(
            @retrofit2.http.QueryMap options: Map<String, String>
    ): Observable<ApiEtherscanResponse>
}
