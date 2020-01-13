package com.ttchain.walletproject.repository

import com.ttchain.walletproject.model.ApiTtnBalanceResponse
import com.ttchain.walletproject.net.TtnClientApi
import io.reactivex.Observable

class TtnClientApiRepository(private val api: TtnClientApi) : BaseRepository() {

    fun performGetTtnAccountData(
        address: String
    ): Observable<ApiTtnBalanceResponse> {
        return getApi(api.getAccount(address))
    }
}