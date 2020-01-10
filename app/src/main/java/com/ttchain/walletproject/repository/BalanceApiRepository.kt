package com.ttchain.walletproject.repository

import com.ttchain.walletproject.net.BalanceApi
import io.reactivex.Observable

class BalanceApiRepository(private val api: BalanceApi) : BaseRepository() {

    fun performGetBalance(
        address: String,
        queryMap: Map<String, String>
    ): Observable<String> {
        return getApi(api.getBalance(address, queryMap))
    }
}