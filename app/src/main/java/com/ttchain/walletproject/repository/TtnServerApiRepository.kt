package com.ttchain.walletproject.repository

import com.ttchain.walletproject.model.ApiTtnBalanceResponse
import com.ttchain.walletproject.model.SignTtnTransResultData
import com.ttchain.walletproject.net.TtnServerApi
import io.reactivex.Observable

class TtnServerApiRepository(private val api: TtnServerApi) : BaseRepository() {

    fun performGetTtnBalanceWithContractAddress(
        address: String
    ): Observable<ApiTtnBalanceResponse> {
        return getApi(api.getAccount(address))
    }

    fun performPostTtnBroadcast(model: SignTtnTransResultData): Observable<String> {
        return getApi(api.postTtnBroadcast(model))
    }
}