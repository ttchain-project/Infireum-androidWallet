package com.ttchain.walletproject.repository

import com.git4u.tt_wallet_android.net.api.response.ApiUsdtBalanceResponse
import com.ttchain.walletproject.model.ApiUsdtTransactionRecordResponse
import com.ttchain.walletproject.model.UsdtTransactionRecordModel
import com.ttchain.walletproject.net.OmniExplorerApi
import io.reactivex.Observable
import okhttp3.MultipartBody
import okhttp3.RequestBody

class OmniExplorerRepository(private val api: OmniExplorerApi) : BaseRepository() {

    fun postUsdtTransactionRecord(request: UsdtTransactionRecordModel): Observable<ApiUsdtTransactionRecordResponse> {
        val requestBody: RequestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("addr", request.addr)
            .addFormDataPart("page", request.page)
            .build()
        return getApi(api.postUsdtTransactionRecord(requestBody))
    }

    fun performGetUsdtBalance(address: String): Observable<ApiUsdtBalanceResponse> {
        val requestBody: RequestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("addr", address)
            .build()
        return getApi(api.postUsdtBalance(requestBody))
    }
}