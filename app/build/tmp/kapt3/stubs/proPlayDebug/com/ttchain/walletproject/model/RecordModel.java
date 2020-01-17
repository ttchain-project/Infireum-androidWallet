package com.ttchain.walletproject.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0019J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017J\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006!"}, d2 = {"Lcom/ttchain/walletproject/model/RecordModel;", "Lcom/ttchain/walletproject/repository/BaseMainModel;", "context", "Landroid/content/Context;", "apiHelper", "Lcom/ttchain/walletproject/model/ApiHelper;", "userHelper", "Lcom/ttchain/walletproject/model/UserHelper;", "dbHelper", "Lcom/ttchain/walletproject/model/DbHelper;", "(Landroid/content/Context;Lcom/ttchain/walletproject/model/ApiHelper;Lcom/ttchain/walletproject/model/UserHelper;Lcom/ttchain/walletproject/model/DbHelper;)V", "mContext", "getMContext", "()Landroid/content/Context;", "createRecordBean", "Lcom/ttchain/walletproject/model/RecordBean;", "data", "Lcom/ttchain/walletproject/database/data/LightningTransRecordData;", "Lcom/ttchain/walletproject/database/data/TransRecordData;", "createRecordEntity", "Lcom/ttchain/walletproject/model/RecordEntity;", "recordBean", "viewType", "", "createUsdtRecordBean", "Lcom/ttchain/walletproject/database/data/UsdtTransRecordData;", "getRecordEntityList", "", "bean", "Lcom/ttchain/walletproject/model/RecordQueryBean;", "page", "getRecordTotalEntitySize", "getUsdtRecordEntityList", "app_proPlayDebug"})
public final class RecordModel extends com.ttchain.walletproject.repository.BaseMainModel {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public final int getRecordTotalEntitySize(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.RecordQueryBean bean) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.RecordEntity> getRecordEntityList(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.RecordQueryBean bean, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.RecordBean createRecordBean(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.TransRecordData data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.RecordBean createRecordBean(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.LightningTransRecordData data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.RecordEntity createRecordEntity(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.RecordBean recordBean, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.ttchain.walletproject.model.RecordEntity> getUsdtRecordEntityList(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.RecordQueryBean bean, int page) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.RecordBean createUsdtRecordBean(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.database.data.UsdtTransRecordData data) {
        return null;
    }
    
    public RecordModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.ApiHelper apiHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.UserHelper userHelper, @org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.DbHelper dbHelper) {
        super(null, null, null);
    }
}