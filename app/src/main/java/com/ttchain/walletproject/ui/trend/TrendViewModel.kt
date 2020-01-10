package com.ttchain.walletproject.ui.trend

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.repository.InfoRepositoryCo

class TrendViewModel(
    private val context: Context,
    private val infoRepository: InfoRepositoryCo
) : BaseViewModel() {

    val getDataLiveData = MutableLiveData<String>()

    fun getData() {
        viewModelLaunch({
            val response = infoRepository.getMarketTest()
            val htmlBuilder = StringBuilder()
            htmlBuilder.append(
                "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "<title>行情數據</title>\n" +
                        "</head>\n" +
                        "<body>"
            )
            //News
            for (news in response.data?.markettool ?: arrayListOf()) {
                htmlBuilder.append(news.content)
            }
            htmlBuilder.append(
                "</body>\n" +
                        "</html>"
            )
            getDataLiveData.value = htmlBuilder.toString()
        }, {
        })
    }
}