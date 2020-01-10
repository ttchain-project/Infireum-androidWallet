package com.ttchain.walletproject.ui.discovery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ttchain.walletproject.base.BaseViewModel
import com.ttchain.walletproject.model.ExplorerBean
import com.ttchain.walletproject.model.ExplorerDappBean
import com.ttchain.walletproject.model.ExplorerListEntity
import com.ttchain.walletproject.repository.CoinRepository
import com.ttchain.walletproject.repository.HelperRepositoryCo
import com.ttchain.walletproject.repository.InfoRepositoryCo
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DiscoveryViewModel(
    private val helperRepositoryCo: HelperRepositoryCo,
    private val coinRepository: CoinRepository,
    private val infoRepositoryCo: InfoRepositoryCo
) : BaseViewModel() {

    var quotesResult = MutableLiveData<List<ExplorerListEntity>>()

    var newsResult = MutableLiveData<Boolean>()
    var bannerResult = MutableLiveData<List<ExplorerBean>>()
    var mediaResult = MutableLiveData<List<ExplorerDappBean>>()
    var dappResult = MutableLiveData<List<ExplorerDappBean>>()
    var blockChainExplorerResult = MutableLiveData<List<ExplorerDappBean>>()
    var marketMsgResult = MutableLiveData<List<ExplorerDappBean>>()

    init {
        newsResult.value = false
        viewModelScope.launch {
            while (true) {
                getQuotes()
                delay(30 * 1000)
            }
        }
    }

    fun getUserPrefFiatName(): String {
        return coinRepository.getUserPrefFiatName()
    }

    fun getQuotes() {
        viewModelLaunch({
            val result =
                helperRepositoryCo.crypeToCurrencyQuotes(getUserPrefFiatName())

            val explorerListEntity = arrayListOf<ExplorerListEntity>()
            //quotes
            var bean: ExplorerBean
            for (quotesData in result.data ?: arrayListOf()) {
                bean = ExplorerBean().apply {
                    title = quotesData.title
                    price = quotesData.price
                    change = quotesData.change
                    img = quotesData.img
                    url = quotesData.url
                }
                explorerListEntity.add(ExplorerListEntity(ExplorerListEntity.NORMAL, bean))
            }
            quotesResult.value = explorerListEntity
        }, {
        })
    }

    fun getNews() {
        viewModelLaunch({
            val result = infoRepositoryCo.getMarketTest()
            val response = result.data
//            //Banner
//            val explorerBeans = arrayListOf<ExplorerBean>()
//            var bean: ExplorerBean
//            for (banner in response?.banner.orEmpty()) {
//                bean = ExplorerBean().apply {
//                    title = banner.title.orEmpty()
//                    content = banner.content.orEmpty()
//                    img = banner.img.orEmpty()
//                    url = banner.url.orEmpty()
//                }
//                explorerBeans.add(bean)
//            }
//            bannerResult.value = explorerBeans

            //Media
            val explorerMediaBeans = arrayListOf<ExplorerDappBean>()
            var mediaBean: ExplorerDappBean
            for (dapp in response?.finnews.orEmpty()) {
                mediaBean = ExplorerDappBean(
                    dapp.title.orEmpty(),
                    dapp.url.orEmpty(),
                    dapp.img.orEmpty()
                )
                explorerMediaBeans.add(mediaBean)
            }
            mediaResult.value = explorerMediaBeans

            //Dapp
            val explorerDappBeans = arrayListOf<ExplorerDappBean>()
            var dappBean: ExplorerDappBean
            for (dapp in response?.dapp.orEmpty()) {
                dappBean = ExplorerDappBean(
                    dapp.title.orEmpty(),
                    dapp.url.orEmpty(),
                    dapp.img.orEmpty()
                )
                explorerDappBeans.add(dappBean)
            }
            dappResult.value = explorerDappBeans

            //BlockChain Explorer
            val blockChainExplorerBeans = arrayListOf<ExplorerDappBean>()
            var blockChainExplorerBean: ExplorerDappBean
            for (dapp in response?.explorer.orEmpty()) {
                blockChainExplorerBean =
                    ExplorerDappBean(
                        dapp.title.orEmpty(),
                        dapp.url.orEmpty(),
                        dapp.img.orEmpty()
                    )
                blockChainExplorerBeans.add(blockChainExplorerBean)
            }
            blockChainExplorerResult.value = blockChainExplorerBeans

            //MarketMsg
            val marketMsgBeans = arrayListOf<ExplorerDappBean>()
            var marketMsgBean: ExplorerDappBean
            for (dapp in response?.marketmsg.orEmpty()) {
                marketMsgBean =
                    ExplorerDappBean(
                        dapp.title.orEmpty(),
                        dapp.url.orEmpty(),
                        dapp.img.orEmpty()
                    )
                marketMsgBeans.add(marketMsgBean)

            }
            marketMsgResult.value = marketMsgBeans
            newsResult.value = true
        }, {
            newsResult.value = false
        })
    }
}