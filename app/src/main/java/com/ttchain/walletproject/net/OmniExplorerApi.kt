package com.ttchain.walletproject.net

import com.git4u.tt_wallet_android.net.api.response.ApiUsdtBalanceResponse
import com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse
import io.reactivex.Observable
import okhttp3.RequestBody
import retrofit2.http.*

interface OmniExplorerApi {

    @POST("/v1/transaction/address")
    fun postUsdtTransactionRecord(
        @Body body: RequestBody
    ): Observable<ApiUsdtTransactionRecordResponse>

    @POST("/v1/address/addr")
    fun postUsdtBalance(
        @Body body: RequestBody
    ): Observable<ApiUsdtBalanceResponse>
}