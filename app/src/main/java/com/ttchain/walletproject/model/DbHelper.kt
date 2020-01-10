package com.ttchain.walletproject.model

import com.ttchain.walletproject.database.data.*


interface DbHelper {
    fun deleteDb()

    fun clearAllTableData()

    fun clearUserIdentityRelativeTables()

    fun isExistDb(): Boolean

    // IdentityData

    fun isIdentityDataEmpty(): Boolean

    fun clearIdentityDataTable()

    fun addIdentityData(data: IdentityData): Int

    fun deleteIdentityData(_id: Int)

    fun updateIdentityData(data: IdentityData)

    fun getIdentityData(_id: Int): IdentityData?

    fun setIdentityDataList(list: List<IdentityData>)

    fun getIdentityDataList(): List<IdentityData>

    // CoinData

    fun isCoinDataEmpty(): Boolean

    fun clearCoinDataTable()

    fun addCoinData(data: CoinData): Int

    fun updateCoinData(data: CoinData)

    fun deleteCoinData(_id: Int)

    fun setCoinDataList(list: List<CoinData>)

    fun getCoinDataList(): List<CoinData>

    fun getCoinData(coinID: Int): CoinData

    fun getCoinDataByCoinId(coinId: String): CoinData

    fun getCoinDataListByWalletTypeId(typeId: Int): List<CoinData>

    fun getCoinDataListByMainCoinIdAndWord(mainCoinId: String, word: String): List<CoinData>

    fun getCoinDataListByDefaultIsDefaultSelected(): List<CoinData>

    fun getCoinDataListByMainCoinId(mainCoinId: String): List<CoinData>

    // WalletData

    fun isWalletDataEmpty(): Boolean

    fun clearWalletDataTable()

    fun addWalletData(data: WalletData): Int

    fun deleteWalletData(_id: Int): Int

    fun getWalletData(_id: Int): WalletData?

    fun getDefaultWalletTypeWalletData(): WalletData

    fun getDefaultSelectedWalletDataByIdentityID(identityID: Int): WalletData?

    fun getWalletDataByAddress(address: String): WalletData

    fun updateWalletData(data: WalletData): Int

    fun getWalletDataListCountByWalletType(walletType: Int): Int

    fun setWalletDataList(list: List<WalletData>)

    fun getWalletDataList(): List<WalletData>

    fun getDefaultWalletDataList(): List<WalletData>

    fun getImportWalletDataList(): List<WalletData>

    fun getWalletDataListByWalletType(walletType: Int): List<WalletData>

    // CoinSelectionData

    fun isCoinSelectionDataEmpty(): Boolean

    fun clearCoinSelectionDataTable()

    fun addCoinSelectionData(data: CoinSelectionData): Int

    fun updateCoinSelectionData(data: CoinSelectionData)

    fun deleteCoinSelectionData(_id: Int)

    fun getCoinSelectionData(_id: Int): CoinSelectionData

    fun setCoinSelectionDataList(list: List<CoinSelectionData>)

    fun getCoinSelectionDataList(): List<CoinSelectionData>

    fun getCoinSelectionDataListByWalletID(walletID: Int): List<CoinSelectionData>

    fun getIsSelectedCoinSelectionDataListByWalletID(walletID: Int): List<CoinSelectionData>

    // AssetData

    fun isAssetDataEmpty(): Boolean

    fun clearAssetDataTable()

    fun addAssetData(data: AssetData): Int

    fun updateAssetData(data: AssetData)

    fun setAssetDataList(list: List<AssetData>)

    fun getAssetDataList(): List<AssetData>

    fun deleteAssetData(_id: Int)

    fun getAssetDataByWalletIDAndCoinID(walletID: Int, coinID: Int): AssetData

    fun getAssetDataListByCoinIDs(coinIds: List<Int>): List<AssetData>

    fun getAssetDataListByWalletID(walletID: Int): List<AssetData>

    fun getAssetDataListByWalletIDAndCoinID(walletID: Int, coinID: Int): List<AssetData>

    // AddressData

    fun isAddressDataEmpty(): Boolean

    fun clearAddressDataTable()

    fun addAddressData(data: AddressData): Int

    fun updateAddressData(data: AddressData)

    fun getAddressData(_id: Int): AddressData

    fun deleteAddressData(_id: Int)

    fun setAddressDataList(list: List<AddressData>)

    fun getAddressDataList(): List<AddressData>

    // FiatData

    fun isFiatDataEmpty(): Boolean

    fun clearFiatDataTable()

    fun addFiatData(data: FiatData): Int

    fun updateFiatData(data: FiatData)

    fun getFiatData(_id: Int): FiatData

    fun getFiatDataByName(name: String): FiatData

    fun getFiatDataByFiatId(fiatId: Int): FiatData

    fun deleteFiatData(_id: Int)

    fun setFiatDataList(list: List<FiatData>)

    fun getFiatDataList(): List<FiatData>

    // LanguageData

    fun isLanguageDataEmpty(): Boolean

    fun clearLanguageDataTable()

    fun addLanguageData(data: LanguageData): Int

    fun updateLanguageData(data: LanguageData)

    fun getLanguageData(_id: Int): LanguageData

    fun deleteLanguageData(_id: Int)

    fun setLanguageDataList(list: List<LanguageData>)

    fun getLanguageDataList(): List<LanguageData>

    // CoinToCoinRateData

    fun isCoinToCoinRateDataEmpty(): Boolean

    fun clearCoinToCoinRateDataTable()

    fun addCoinToCoinRateData(data: CoinToCoinRateData): Int

    fun updateCoinToCoinRateData(data: CoinToCoinRateData)

    fun getCoinToCoinRateData(_id: Int): CoinToCoinRateData

    fun getCoinToCoinRateDataByCoinID(fromCoinID: Int, toCoinID: Int): CoinToCoinRateData

    fun deleteCoinToCoinRateData(_id: Int)

    fun setCoinToCoinRateDataList(list: List<CoinToCoinRateData>)

    fun getCoinToCoinRateDataList(): List<CoinToCoinRateData>

    // CoinToFiatRateData

    fun isCoinToFiatRateDataEmpty(): Boolean

    fun clearCoinToFiatRateDataTable()

    fun addCoinToFiatRateData(data: CoinToFiatRateData): Int

    fun updateCoinToFiatRateData(data: CoinToFiatRateData)

    fun getCoinToFiatRateData(_id: Int): CoinToFiatRateData

    fun deleteCoinToFiatRateData(_id: Int)

    fun setCoinToFiatRateDataList(list: List<CoinToFiatRateData>)

    fun getCoinToFiatRateDataList(): List<CoinToFiatRateData>

    fun getCoinToFiatRateDataFromCoinIDToFiatId(coinID: Int, fiatId: Int): CoinToFiatRateData

    // FiatToFiatRateData

    fun isFiatToFiatRateDataEmpty(): Boolean

    fun clearFiatToFiatRateDataTable()

    fun addFiatToFiatRateData(data: FiatToFiatRateData): Int

    fun updateFiatToFiatRateData(data: FiatToFiatRateData)

    fun getFiatToFiatRateData(_id: Int): FiatToFiatRateData

    fun deleteFiatToFiatRateData(_id: Int)

    fun setFiatToFiatRateDataList(list: List<FiatToFiatRateData>)

    fun getFiatToFiatRateDataList(): List<FiatToFiatRateData>

    fun getFiatToFiatRateDataByFromFiatIDToFiatID(fromFiatID: Int, toFiatID: Int): FiatToFiatRateData

    // TransRecordData

    fun isTransRecordDataEmpty(): Boolean

    fun clearTransRecordDataTable()

    fun addTransRecordData(data: TransRecordData): Int

    fun deleteTransRecordData(_id: Int)

    fun getTransRecordData(_id: Int): TransRecordData?

    fun getTransRecordDataByTxId(txId: String): TransRecordData

    fun getTransRecordDataListByAddress(address: String): List<TransRecordData>

    fun getLatestTransRecordDataByAddress(address: String): TransRecordData

    fun updateTransRecordData(data: TransRecordData)

    fun setTransRecordDataList(list: List<TransRecordData>)

    fun getTransRecordDataList(): List<TransRecordData>

    fun getTransRecordDataListByCoinID(coinID: Int): List<TransRecordData>

    fun getTransRecordDataListByCondition(walletAddress: String, coinID: Int, state: Int): List<TransRecordData>

    fun getTransRecordDataListByCondition(walletAddress: String, coinID: Int, state: Int, page: Int): List<TransRecordData>

    // LightningTransRecordData

    fun isLightningTransRecordDataEmpty(): Boolean

    fun clearLightningTransRecordDataTable()

    fun addLightningTransRecordData(data: LightningTransRecordData): Int

    fun deleteLightningTransRecordData(_id: Int)

    fun getLightningTransRecordData(_id: Int): LightningTransRecordData?

    fun getLightningTransRecordDataByTxId(txId: String): LightningTransRecordData

    fun updateLightningTransRecordData(data: LightningTransRecordData)

    fun setLightningTransRecordDataList(list: List<LightningTransRecordData>)

    fun getLightningTransRecordDataList(coin_Id: Int): List<LightningTransRecordData>

    fun getLightningTransRecordDataListByAddress(address: String): List<LightningTransRecordData>

    fun getAllLightningTransRecordDataList(): List<LightningTransRecordData>

    fun getAllLightningTransRecordDataList(page: Int): List<LightningTransRecordData>

    // UsdtTransRecordData
    fun getUsdtTransRecordDataByTxId(txId: String): UsdtTransRecordData

    fun addUsdtTransRecordData(data: UsdtTransRecordData): Int

    fun updateUsdtTransRecordData(data: UsdtTransRecordData)

    fun getUsdtTransRecordDataListByCondition(walletAddress: String, coinID: Int, state: Int, page: Int): List<UsdtTransRecordData>

    fun getLatestUsdtTransRecordDataByAddress(address: String): UsdtTransRecordData

    // ChatRoomData

    fun addChatRoomData(data: ChatRoomData): Int

    fun updateChatRoomData(data: ChatRoomData)

    fun getChatRoomDataByRoomId(roomId: String): ChatRoomData

    //ChatMessageData

    fun addChatMessageData(data: ChatMessageData): Int

    fun updateChatMessageData(data: ChatMessageData)

    fun getChatMessageDataListByRoomId(roomId: String): List<ChatMessageData>

    fun getChatMessageDataByMsgId(msgId: String): ChatMessageData
    fun deleteMsgByRoomId(roomId: String)
    fun getChatCommunicationDataList(): List<ChatCommunicationData>
    fun getChatCommunicationByRoomId(roomId: String): ChatCommunicationData
    fun updateChatCommunicationData(data: ChatCommunicationData)
    fun addChatCommunicationData(data: ChatCommunicationData): Int
    fun getChatGroupDataByRoomId(roomId: String): ChatGroupData
    fun updateChatGroupData(data: ChatGroupData)
    fun addChatGroupData(data: ChatGroupData): Int
    fun deleteChatCommunicationData(_id: Int)
}
