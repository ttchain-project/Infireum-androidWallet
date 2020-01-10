package com.ttchain.walletproject.model

import android.content.Context
import com.ttchain.walletproject.database.UsdtTransRecordDao
import com.ttchain.walletproject.database.TransRecordDao
import com.ttchain.walletproject.database.WalletDao
import com.ttchain.walletproject.cache.GlobalConstant
import com.ttchain.walletproject.database.*
import com.ttchain.walletproject.database.data.*

class DbHelperImpl(private val mContext: Context) : DbHelper {

    private val identityDao: IdentityDao = IdentityDao(mContext)
    private val coinDao: CoinDao = CoinDao(mContext)
    private val wallDao: WalletDao = WalletDao(mContext)
    private val coinSelectionDao: CoinSelectionDao = CoinSelectionDao(mContext)
    private val assetDao: AssetDao = AssetDao(mContext)
    private val addressDao: AddressDao = AddressDao(mContext)
    private val languageDao: LanguageDao = LanguageDao(mContext)
    private val fiatDao: FiatDao = FiatDao(mContext)
    private val coinToCoinRateDao: CoinToCoinRateDao = CoinToCoinRateDao(mContext)
    private val coinToFiatRateDao: CoinToFiatRateDao = CoinToFiatRateDao(mContext)
    private val fiatToFiatRateDao: FiatToFiatRateDao = FiatToFiatRateDao(mContext)
    private val transRecordDao: TransRecordDao = TransRecordDao(mContext)
    private val lightningTransRecordDao: LightningTransRecordDao = LightningTransRecordDao(mContext)
    private val usdtTransRecordDao: UsdtTransRecordDao = UsdtTransRecordDao(mContext)
    private val chatRoomDao: ChatRoomDao = ChatRoomDao(mContext)
    private val chatMessageDao: ChatMessageDao = ChatMessageDao(mContext)
    private val chatCommunicationDao: ChatCommunicationDao = ChatCommunicationDao(mContext)
    private val chatGroupDao: ChatGroupDao = ChatGroupDao(mContext)

    val chatRoomDataList: List<ChatRoomData>
        get() = chatRoomDao.all

    override fun deleteDb() {
        coinDao.deleteDB(mContext)
    }

    override fun isExistDb(): Boolean {
        return coinDao.existDb()
    }

    override fun isCoinDataEmpty(): Boolean {
        return coinDao.isEmpty
    }

    override fun addCoinData(data: CoinData): Int {
        return coinDao.insert(data)
    }

    override fun updateCoinData(data: CoinData) {
        coinDao.update(data)
    }

    override fun deleteCoinData(_id: Int) {
        coinDao.deleteById(_id)
    }

    override fun getCoinDataListByWalletTypeId(typeId: Int): List<CoinData> {
        return when (typeId) {
            GlobalConstant.WALLET_TYPE_ETH,
            GlobalConstant.WALLET_TYPE_BTC,
            GlobalConstant.WALLET_TYPE_CIC,
            GlobalConstant.WALLET_TYPE_GUC ->
                coinDao.getCoinListByWalletTypeId(typeId)
            else -> coinDao.all
        }
    }

    override fun getCoinDataListByDefaultIsDefaultSelected(): List<CoinData> {
        return coinDao.getCoinListByDefaultIsDefaultSelected()
    }

    override fun getCoinDataListByMainCoinId(mainCoinId: String): List<CoinData> {
        return coinDao.getCoinListByMainCoinId(mainCoinId)
    }

    override fun getCoinDataListByMainCoinIdAndWord(
        mainCoinId: String,
        word: String
    ): List<CoinData> {
        return coinDao.getCoinListByMainCoinIdAndWord(mainCoinId, word)
    }


    override fun setCoinDataList(list: List<CoinData>) {
        coinDao.insertWithTransaction(list)
    }

    override fun isWalletDataEmpty(): Boolean {
        return wallDao.isEmpty
    }

    override fun getWalletDataList(): List<WalletData> {
        return wallDao.all
    }

    override fun setWalletDataList(list: List<WalletData>) {
        wallDao.insertWithTransaction(list)
    }

    override fun getDefaultWalletTypeWalletData(): WalletData {
        return wallDao.getDefaultWalletTypeWalletData()
    }

    override fun getDefaultSelectedWalletDataByIdentityID(identityID: Int): WalletData {
        return wallDao.getDefaultSelectedWalletDataByIdentityID(identityID) ?: WalletData()
    }

    override fun getWalletDataByAddress(address: String): WalletData {
        return wallDao.getWalletDataByAddress(address)
    }

    override fun getWalletData(id: Int): WalletData {
        return wallDao.getById(id)
    }

    override fun clearAllTableData() {
        wallDao.clearTable(WalletData::class.java)
        coinDao.clearTable(CoinData::class.java)
        coinSelectionDao.clearTable(CoinSelectionData::class.java)
        identityDao.clearTable(IdentityData::class.java)
        assetDao.clearTable(AssetData::class.java)
        addressDao.clearTable(AddressData::class.java)
        languageDao.clearTable(LanguageData::class.java)
        fiatDao.clearTable(FiatData::class.java)
        coinToCoinRateDao.clearTable(CoinToCoinRateData::class.java)
        coinToFiatRateDao.clearTable(CoinToFiatRateData::class.java)
        fiatToFiatRateDao.clearTable(FiatToFiatRateData::class.java)
        transRecordDao.clearTable(TransRecordData::class.java)
        lightningTransRecordDao.clearTable(LightningTransRecordData::class.java)
        usdtTransRecordDao.clearTable(UsdtTransRecordData::class.java)
        chatRoomDao.clearTable(ChatRoomData::class.java)
        chatMessageDao.clearTable(ChatMessageData::class.java)
        chatCommunicationDao.clearTable(ChatCommunicationData::class.java)
        chatGroupDao.clearTable(ChatGroupData::class.java)
    }

    override fun clearUserIdentityRelativeTables() {
        wallDao.clearTable(WalletData::class.java)
        coinSelectionDao.clearTable(CoinSelectionData::class.java)
        identityDao.clearTable(IdentityData::class.java)
        assetDao.clearTable(AssetData::class.java)
        addressDao.clearTable(AddressData::class.java)
        transRecordDao.clearTable(TransRecordData::class.java)
        lightningTransRecordDao.clearTable(LightningTransRecordData::class.java)
        usdtTransRecordDao.clearTable(UsdtTransRecordData::class.java)
        chatRoomDao.clearTable(ChatRoomData::class.java)
        chatMessageDao.clearTable(ChatMessageData::class.java)
        chatCommunicationDao.clearTable(ChatCommunicationData::class.java)
        chatGroupDao.clearTable(ChatGroupData::class.java)
    }

    override fun getDefaultWalletDataList(): List<WalletData> {
        return wallDao.getIsFromSystemWalletListData(true)
    }

    override fun getImportWalletDataList(): List<WalletData> {
        return wallDao.getIsFromSystemWalletListData(false)
    }

    override fun updateWalletData(data: WalletData): Int {
        return wallDao.update(data)
    }

    override fun addCoinSelectionData(data: CoinSelectionData): Int {
        return coinSelectionDao.insert(data)
    }

    override fun isCoinSelectionDataEmpty(): Boolean {
        return coinSelectionDao.isEmpty
    }

    override fun clearCoinSelectionDataTable() {
        coinSelectionDao.clearTable(CoinSelectionData::class.java)
    }

    override fun setCoinSelectionDataList(list: List<CoinSelectionData>) {
        coinSelectionDao.insertWithTransaction(list)
    }

    override fun getCoinSelectionDataList(): List<CoinSelectionData> {
        return coinSelectionDao.all
    }

    override fun getCoinSelectionDataListByWalletID(walletId: Int): List<CoinSelectionData> {
        return coinSelectionDao.getCoinSelectionDataListByWalletID(walletId)
    }

    override fun getIsSelectedCoinSelectionDataListByWalletID(walletId: Int): List<CoinSelectionData> {
        return coinSelectionDao.getIsSelectedCoinSelectionDataListByWalletID(walletId, true)
    }

    override fun getCoinSelectionData(id: Int): CoinSelectionData {
        return coinSelectionDao.getById(id)
    }

    override fun updateCoinSelectionData(data: CoinSelectionData) {
        coinSelectionDao.update(data)
    }

    override fun deleteCoinSelectionData(id: Int) {
        coinSelectionDao.deleteById(id)
    }

    override fun isAssetDataEmpty(): Boolean {
        return assetDao.isEmpty
    }

    override fun setAssetDataList(list: List<AssetData>) {
        assetDao.insertWithTransaction(list)
    }

    override fun getAssetDataList(): List<AssetData> {
        return assetDao.all
    }

    override fun getCoinData(coinID: Int): CoinData {
        return coinDao.getById(coinID)
    }

    override fun getCoinDataByCoinId(coinId: String): CoinData {
        return coinDao.getCoinByCoinId(coinId)
    }

    override fun addAssetData(data: AssetData): Int {
        return assetDao.insert(data)
    }

    override fun getAssetDataListByWalletID(walletID: Int): List<AssetData> {
        return assetDao.getAssetDataListByWalletID(walletID)
    }

    override fun getAssetDataByWalletIDAndCoinID(walletID: Int, coinID: Int): AssetData {
        val list = getAssetDataListByWalletIDAndCoinID(walletID, coinID)
        return if (list.isNotEmpty()) {
            list[0]
        } else AssetData()
    }

    override fun getAssetDataListByCoinIDs(coinIds: List<Int>): List<AssetData> {
        return assetDao.getAssetDataListByCoinIDs(coinIds)
    }

    override fun getAssetDataListByWalletIDAndCoinID(walletID: Int, coinID: Int): List<AssetData> {
        return assetDao.getAssetDataListByWalletIDAndCoinID(walletID, coinID)
    }

    override fun deleteAssetData(_id: Int) {
        assetDao.deleteById(_id)
    }

    override fun isAddressDataEmpty(): Boolean {
        return addressDao.isEmpty
    }

    override fun isIdentityDataEmpty(): Boolean {
        return identityDao.isEmpty
    }

    override fun addAddressData(data: AddressData): Int {
        return addressDao.insert(data)
    }

    override fun updateAssetData(data: AssetData) {
        assetDao.update(data)
    }

    override fun addIdentityData(data: IdentityData): Int {
        return identityDao.insert(data)
    }

    override fun updateIdentityData(data: IdentityData) {
        identityDao.update(data)
    }

    override fun getIdentityData(_id: Int): IdentityData? {
        return identityDao.getById(_id)
    }

    override fun setIdentityDataList(list: List<IdentityData>) {
        identityDao.insertWithTransaction(list)
    }

    override fun getIdentityDataList(): List<IdentityData> {
        return identityDao.all
    }

    override fun deleteIdentityData(_id: Int) {
        identityDao.deleteById(_id)
    }

    override fun updateAddressData(data: AddressData) {
        addressDao.update(data)
    }

    override fun getAddressData(_id: Int): AddressData {
        return addressDao.getById(_id)
    }

    override fun setAddressDataList(list: List<AddressData>) {
        addressDao.insertWithTransaction(list)
    }

    override fun getAddressDataList(): List<AddressData> {
        return addressDao.all
    }

    override fun deleteAddressData(_id: Int) {
        addressDao.deleteById(_id)
    }

    override fun getCoinDataList(): List<CoinData> {
        return coinDao.all
    }

    override fun addCoinToCoinRateData(data: CoinToCoinRateData): Int {
        return coinToCoinRateDao.insert(data)
    }

    override fun isFiatDataEmpty(): Boolean {
        return fiatDao.isEmpty
    }

    override fun isLanguageDataEmpty(): Boolean {
        return languageDao.isEmpty
    }

    override fun isCoinToCoinRateDataEmpty(): Boolean {
        return coinToCoinRateDao.isEmpty
    }

    override fun isCoinToFiatRateDataEmpty(): Boolean {
        return coinToFiatRateDao.isEmpty
    }

    override fun clearCoinToFiatRateDataTable() {
        coinToFiatRateDao.clearTable(CoinToFiatRateData::class.java)
    }

    override fun isFiatToFiatRateDataEmpty(): Boolean {
        return fiatToFiatRateDao.isEmpty
    }

    override fun clearFiatToFiatRateDataTable() {
        fiatToFiatRateDao.clearTable(FiatToFiatRateData::class.java)
    }

    override fun addFiatData(data: FiatData): Int {
        return fiatDao.insert(data)
    }

    override fun updateFiatData(data: FiatData) {
        fiatDao.update(data)
    }

    override fun getFiatData(_id: Int): FiatData {
        return fiatDao.getById(_id)
    }

    override fun setFiatDataList(list: List<FiatData>) {
        fiatDao.insertWithTransaction(list)
    }

    override fun getFiatDataList(): List<FiatData> {
        return fiatDao.all
    }

    override fun deleteFiatData(_id: Int) {
        fiatDao.deleteById(_id)
    }

    override fun addLanguageData(data: LanguageData): Int {
        return languageDao.insert(data)
    }

    override fun updateLanguageData(data: LanguageData) {
        languageDao.update(data)
    }

    override fun getLanguageData(_id: Int): LanguageData {
        return languageDao.getById(_id)
    }

    override fun setLanguageDataList(list: List<LanguageData>) {
        languageDao.insertWithTransaction(list)
    }

    override fun getLanguageDataList(): List<LanguageData> {
        return languageDao.all
    }

    override fun deleteLanguageData(_id: Int) {
        languageDao.deleteById(_id)
    }

    override fun updateCoinToCoinRateData(data: CoinToCoinRateData) {
        coinToCoinRateDao.update(data)
    }

    override fun getCoinToCoinRateData(_id: Int): CoinToCoinRateData {
        return coinToCoinRateDao.getById(_id)
    }

    override fun getCoinToCoinRateDataByCoinID(fromCoinId: Int, toCoinId: Int): CoinToCoinRateData {
        return coinToCoinRateDao.getCoinToCoinRateDataByCoinID(fromCoinId, toCoinId)
            ?: CoinToCoinRateData()
    }

    override fun setCoinToCoinRateDataList(list: List<CoinToCoinRateData>) {
        coinToCoinRateDao.insertWithTransaction(list)
    }

    override fun getCoinToCoinRateDataList(): List<CoinToCoinRateData> {
        return coinToCoinRateDao.all
    }

    override fun deleteCoinToCoinRateData(_id: Int) {
        coinToCoinRateDao.deleteById(_id)
    }

    override fun addCoinToFiatRateData(data: CoinToFiatRateData): Int {
        return coinToFiatRateDao.insert(data)
    }

    override fun updateCoinToFiatRateData(data: CoinToFiatRateData) {
        coinToFiatRateDao.update(data)
    }

    override fun getCoinToFiatRateData(_id: Int): CoinToFiatRateData {
        return coinToFiatRateDao.getById(_id)
    }

    override fun setCoinToFiatRateDataList(list: List<CoinToFiatRateData>) {
        coinToFiatRateDao.insertWithTransaction(list)
    }

    override fun getCoinToFiatRateDataList(): List<CoinToFiatRateData> {
        return coinToFiatRateDao.all
    }

    override fun deleteCoinToFiatRateData(_id: Int) {
        coinToFiatRateDao.deleteById(_id)
    }

    override fun addFiatToFiatRateData(data: FiatToFiatRateData): Int {
        return fiatToFiatRateDao.insert(data)
    }

    override fun updateFiatToFiatRateData(data: FiatToFiatRateData) {
        fiatToFiatRateDao.update(data)
    }

    override fun getFiatToFiatRateData(_id: Int): FiatToFiatRateData {
        return fiatToFiatRateDao.getById(_id)
    }

    override fun setFiatToFiatRateDataList(list: List<FiatToFiatRateData>) {
        fiatToFiatRateDao.insertWithTransaction(list)
    }

    override fun getFiatToFiatRateDataList(): List<FiatToFiatRateData> {
        return fiatToFiatRateDao.all
    }

    override fun getFiatToFiatRateDataByFromFiatIDToFiatID(
        fromFiatID: Int,
        toFiatID: Int
    ): FiatToFiatRateData {
        return fiatToFiatRateDao.getByFromFiatIDToFiatID(fromFiatID, toFiatID)
    }

    override fun deleteFiatToFiatRateData(_id: Int) {
        fiatToFiatRateDao.deleteById(_id)
    }

    override fun getCoinToFiatRateDataFromCoinIDToFiatId(
        coinID: Int,
        fiatId: Int
    ): CoinToFiatRateData {
        return coinToFiatRateDao.getDataFromCoinIDToFiatId(coinID, fiatId)
    }

    override fun getFiatDataByName(name: String): FiatData {
        return fiatDao.getByName(name)
    }

    override fun getFiatDataByFiatId(fiatId: Int): FiatData {
        return fiatDao.getByFiatId(fiatId)
    }

    override fun addWalletData(data: WalletData): Int {
        return wallDao.insert(data)
    }

    override fun deleteWalletData(_id: Int): Int {
        return wallDao.deleteById(_id)
    }

    override fun getWalletDataListByWalletType(walletType: Int): List<WalletData> {
        return wallDao.getWalletDataListByWalletType(walletType)
    }

    override fun getWalletDataListCountByWalletType(walletType: Int): Int {
        return wallDao.getWalletDataListCountByWalletType(walletType)
    }

    override fun isTransRecordDataEmpty(): Boolean {
        return transRecordDao.isEmpty
    }

    override fun setTransRecordDataList(list: List<TransRecordData>) {
        transRecordDao.insertWithTransaction(list)
    }

    override fun getTransRecordDataList(): List<TransRecordData> {
        return transRecordDao.all
    }

    override fun getTransRecordDataListByCoinID(coinID: Int): List<TransRecordData> {
        return transRecordDao.getTransRecordDataListByCoinID(coinID)
    }

    override fun getTransRecordDataListByCondition(
        walletAddress: String,
        coinID: Int,
        state: Int
    ): List<TransRecordData> {
        return transRecordDao.getTransRecordDataListByCondition(walletAddress, coinID, state, 1, -1)
    }

    override fun getTransRecordDataListByCondition(
        walletAddress: String,
        coinID: Int,
        state: Int,
        page: Int
    ): List<TransRecordData> {
        return transRecordDao.getTransRecordDataListByCondition(
            walletAddress,
            coinID,
            state,
            page,
            GlobalConstant.PAGE_LIMIT_NORMAL.toLong()
        )
    }

    override fun isLightningTransRecordDataEmpty(): Boolean {
        return lightningTransRecordDao.isEmpty
    }

    override fun setLightningTransRecordDataList(list: List<LightningTransRecordData>) {
        lightningTransRecordDao.insertWithTransaction(list)
    }

    override fun getLightningTransRecordDataList(coin_Id: Int): List<LightningTransRecordData> {
        return lightningTransRecordDao.getLightningTransRecordDataListByCoinId(coin_Id)
    }

    override fun getLightningTransRecordDataListByAddress(address: String): List<LightningTransRecordData> {
        return lightningTransRecordDao.getLightningTransRecordDataListByAddress(address)
    }

    override fun getAllLightningTransRecordDataList(): List<LightningTransRecordData> {
        return lightningTransRecordDao.all
    }

    override fun getAllLightningTransRecordDataList(page: Int): List<LightningTransRecordData> {
        return lightningTransRecordDao.getAll(page, GlobalConstant.PAGE_LIMIT_NORMAL.toLong())
    }

    override fun clearAddressDataTable() {
        addressDao.clearTable(AddressData::class.java)
    }

    override fun clearIdentityDataTable() {
        identityDao.clearTable(IdentityData::class.java)
    }

    override fun clearCoinDataTable() {
        coinDao.clearTable(CoinData::class.java)
    }

    override fun clearWalletDataTable() {
        wallDao.clearTable(WalletData::class.java)
    }

    override fun clearAssetDataTable() {
        assetDao.clearTable(AssetData::class.java)
    }

    override fun clearFiatDataTable() {
        fiatDao.clearTable(FiatData::class.java)
    }

    override fun clearLanguageDataTable() {
        languageDao.clearTable(LanguageData::class.java)
    }

    override fun clearCoinToCoinRateDataTable() {
        coinToCoinRateDao.clearTable(CoinToCoinRateData::class.java)
    }

    override fun clearTransRecordDataTable() {
        transRecordDao.clearTable(TransRecordData::class.java)
    }

    override fun deleteLightningTransRecordData(_id: Int) {
        lightningTransRecordDao.deleteById(_id)
    }

    override fun deleteTransRecordData(_id: Int) {
        transRecordDao.deleteById(_id)
    }

    override fun getLightningTransRecordData(_id: Int): LightningTransRecordData? {
        return lightningTransRecordDao.getById(_id)
    }

    override fun getTransRecordData(_id: Int): TransRecordData? {
        return transRecordDao.getById(_id)
    }

    override fun updateLightningTransRecordData(data: LightningTransRecordData) {
        lightningTransRecordDao.update(data)
    }

    override fun updateTransRecordData(data: TransRecordData) {
        transRecordDao.update(data)
    }

    override fun clearLightningTransRecordDataTable() {
        lightningTransRecordDao.clearTable(LightningTransRecordData::class.java)
    }

    override fun addLightningTransRecordData(data: LightningTransRecordData): Int {
        return lightningTransRecordDao.insert(data)
    }

    override fun addTransRecordData(data: TransRecordData): Int {
        return transRecordDao.insert(data)
    }

    override fun getLightningTransRecordDataByTxId(txId: String): LightningTransRecordData {
        return lightningTransRecordDao.getLightningTransRecordDataByTxId(txId)
    }

    override fun getTransRecordDataByTxId(txId: String): TransRecordData {
        return transRecordDao.getTransRecordDataByTxId(txId)
    }

    override fun getTransRecordDataListByAddress(address: String): List<TransRecordData> {
        return transRecordDao.getTransRecordDataListByAddress(address)
    }

    override fun getLatestTransRecordDataByAddress(address: String): TransRecordData {
        return transRecordDao.getLatestTransRecordDataByAddress(address)
    }

    override fun getUsdtTransRecordDataByTxId(txId: String): UsdtTransRecordData {
        return usdtTransRecordDao.getTransRecordDataByTxId(txId)
    }

    override fun addUsdtTransRecordData(data: UsdtTransRecordData): Int {
        return usdtTransRecordDao.insert(data)
    }

    override fun updateUsdtTransRecordData(data: UsdtTransRecordData) {
        usdtTransRecordDao.update(data)
    }

    override fun getUsdtTransRecordDataListByCondition(
        walletAddress: String,
        coinID: Int,
        state: Int,
        page: Int
    ): List<UsdtTransRecordData> {
        return usdtTransRecordDao.getTransRecordDataListByCondition(
            walletAddress,
            coinID,
            state,
            page,
            GlobalConstant.PAGE_LIMIT_NORMAL.toLong()
        )
    }

    override fun getLatestUsdtTransRecordDataByAddress(address: String): UsdtTransRecordData {
        return usdtTransRecordDao.getLatestTransRecordDataByAddress(address)
    }

    override fun addChatRoomData(data: ChatRoomData): Int {
        return chatRoomDao.insert(data)
    }

    override fun updateChatRoomData(data: ChatRoomData) {
        chatRoomDao.update(data)
    }

    override fun getChatRoomDataByRoomId(roomId: String): ChatRoomData {
        return chatRoomDao.getChatRoomByRoomId(roomId)
    }

    override fun addChatMessageData(data: ChatMessageData): Int {
        return chatMessageDao.insert(data)
    }

    override fun updateChatMessageData(data: ChatMessageData) {
        chatMessageDao.update(data)
    }

    override fun getChatMessageDataByMsgId(msgId: String): ChatMessageData {
        return chatMessageDao.getChatMessageByMsgId(msgId)
    }

    override fun getChatMessageDataListByRoomId(roomId: String): List<ChatMessageData> {
        return chatMessageDao.getChatMessageDataListByRoomId(chatRoomDao.getChatRoomByRoomId(roomId)._id)
    }

    override fun deleteMsgByRoomId(roomId: String) {
        chatMessageDao.deleteMsgByRoomId(chatRoomDao.getChatRoomByRoomId(roomId)._id)
    }

    override fun getChatCommunicationDataList(): List<ChatCommunicationData> {
        return chatCommunicationDao.getChatCommunicationDataList()
    }

    override fun getChatCommunicationByRoomId(roomId: String): ChatCommunicationData {
        return chatCommunicationDao.getChatCommunicationByRoomId(roomId)
    }

    override fun updateChatCommunicationData(data: ChatCommunicationData) {
        chatCommunicationDao.update(data)
    }

    override fun addChatCommunicationData(data: ChatCommunicationData): Int {
        return chatCommunicationDao.insert(data)
    }

    override fun deleteChatCommunicationData(_id: Int) {
        chatCommunicationDao.deleteById(_id)
    }

    override fun getChatGroupDataByRoomId(roomId: String): ChatGroupData {
        return chatGroupDao.getChatGroupDataByRoomId(roomId)
    }

    override fun updateChatGroupData(data: ChatGroupData) {
        chatGroupDao.update(data)
    }

    override fun addChatGroupData(data: ChatGroupData): Int {
        return chatGroupDao.insert(data)
    }
}
