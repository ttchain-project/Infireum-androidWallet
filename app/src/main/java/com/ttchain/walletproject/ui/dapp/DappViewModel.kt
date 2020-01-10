package com.ttchain.walletproject.ui.dapp

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.model.ExplorerDappBean
import com.ttchain.walletproject.repository.InfoRepositoryCo

class DappViewModel(
    private val context: Context,
    private val infoRepository: InfoRepositoryCo
) : BaseViewModel() {

    val getDataLiveData = MutableLiveData<List<ExplorerDappBean>>()

    fun getData() {
        viewModelLaunch({
            val response = infoRepository.getMarketTest()
            val list: MutableList<ExplorerDappBean> = arrayListOf()
            var bean: ExplorerDappBean
            for (news in response.data?.dapp ?: arrayListOf()) {
                bean = ExplorerDappBean(news.title!!, news.url!!, news.img!!)
                list.add(bean)
            }
            getDataLiveData.value = list
        }, {
        })
    }
}