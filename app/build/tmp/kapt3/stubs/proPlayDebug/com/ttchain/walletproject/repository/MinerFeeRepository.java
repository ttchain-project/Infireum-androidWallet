package com.ttchain.walletproject.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002QRB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u00102\u001a\u000203H\u0002J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000203H\u0002J\b\u0010;\u001a\u000203H\u0002J\u0006\u0010<\u001a\u000205J\b\u0010=\u001a\u00020>H\u0002J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@J\u0006\u0010C\u001a\u00020#J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u000205J\u000e\u0010G\u001a\u00020E2\u0006\u0010F\u001a\u000205J\u0016\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020@2\u0006\u0010J\u001a\u00020@J\u0006\u0010K\u001a\u00020EJ\u001e\u0010L\u001a\u00020E2\u0006\u0010M\u001a\u00020@2\u0006\u0010N\u001a\u00020@2\u0006\u0010O\u001a\u00020@J\u0006\u0010P\u001a\u00020ER\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R$\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020)@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.\u00a8\u0006S"}, d2 = {"Lcom/ttchain/walletproject/repository/MinerFeeRepository;", "Lcom/ttchain/walletproject/repository/BaseRepository;", "apiHelper", "Lcom/ttchain/walletproject/model/ApiHelper;", "(Lcom/ttchain/walletproject/model/ApiHelper;)V", "minerFeeEditBean", "Lcom/ttchain/walletproject/model/MinerFeeEditBean;", "getMinerFeeEditBean", "()Lcom/ttchain/walletproject/model/MinerFeeEditBean;", "setMinerFeeEditBean", "(Lcom/ttchain/walletproject/model/MinerFeeEditBean;)V", "minerFeeGasItemBean", "Lcom/ttchain/walletproject/model/MinerFeeGasItemBean;", "getMinerFeeGasItemBean", "()Lcom/ttchain/walletproject/model/MinerFeeGasItemBean;", "minerFeeGasItemBean$delegate", "Lkotlin/Lazy;", "minerFeeModelCustomBtcGasListener", "Lcom/ttchain/walletproject/repository/MinerFeeRepository$MinerFeeModelCustomBtcGasListener;", "getMinerFeeModelCustomBtcGasListener", "()Lcom/ttchain/walletproject/repository/MinerFeeRepository$MinerFeeModelCustomBtcGasListener;", "setMinerFeeModelCustomBtcGasListener", "(Lcom/ttchain/walletproject/repository/MinerFeeRepository$MinerFeeModelCustomBtcGasListener;)V", "minerFeeModelListener", "Lcom/ttchain/walletproject/repository/MinerFeeRepository$MinerFeeModelListener;", "getMinerFeeModelListener", "()Lcom/ttchain/walletproject/repository/MinerFeeRepository$MinerFeeModelListener;", "setMinerFeeModelListener", "(Lcom/ttchain/walletproject/repository/MinerFeeRepository$MinerFeeModelListener;)V", "minerFeeSatItemBean", "Lcom/ttchain/walletproject/model/MinerFeeSatItemBean;", "getMinerFeeSatItemBean", "()Lcom/ttchain/walletproject/model/MinerFeeSatItemBean;", "minerFeeSatItemBean$delegate", "needPayload", "", "getNeedPayload", "()Z", "setNeedPayload", "(Z)V", "value", "", "selectedChainType", "getSelectedChainType", "()I", "setSelectedChainType", "(I)V", "selectedWalletId", "getSelectedWalletId", "setSelectedWalletId", "getBtcInputCustomGasWatcher", "Landroid/text/TextWatcher;", "getBtcMinerFeeFromApiString", "", "getBtcOnCheckedListener", "Lcom/ttchain/walletproject/model/MinerFeeSatItem$OnMinerFeeSatItemGasItemListener;", "getEthAdvancedCheckListener", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "getEthInputCustomGasPriceWatcher", "getEthInputCustomGasWatcher", "getEthMinerFeeFromApiString", "getEthSeekBarChangeListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getMinerFeeToCoinAmount", "Ljava/math/BigDecimal;", "gasPrice", "gas", "isValidMinerFee", "saveBtcMinerFeeFromApiToString", "", "string", "saveEthMinerFeeFromApiToString", "setBtcMinerFeeFromApi", "regular", "priority", "setBtcMinerFeeFromApiString", "setEthMinerFeeFromApi", "suggest", "maxGasPrice", "minGasPrice", "setEthMinerFeeFromApiString", "MinerFeeModelCustomBtcGasListener", "MinerFeeModelListener", "app_proPlayDebug"})
public final class MinerFeeRepository extends com.ttchain.walletproject.repository.BaseRepository {
    private boolean needPayload;
    private int selectedWalletId;
    private int selectedChainType;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy minerFeeGasItemBean$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy minerFeeSatItemBean$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private com.ttchain.walletproject.model.MinerFeeEditBean minerFeeEditBean;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.repository.MinerFeeRepository.MinerFeeModelListener minerFeeModelListener;
    @org.jetbrains.annotations.Nullable()
    private com.ttchain.walletproject.repository.MinerFeeRepository.MinerFeeModelCustomBtcGasListener minerFeeModelCustomBtcGasListener;
    private final com.ttchain.walletproject.model.ApiHelper apiHelper = null;
    
    public final boolean getNeedPayload() {
        return false;
    }
    
    public final void setNeedPayload(boolean p0) {
    }
    
    public final int getSelectedWalletId() {
        return 0;
    }
    
    public final void setSelectedWalletId(int p0) {
    }
    
    public final int getSelectedChainType() {
        return 0;
    }
    
    public final void setSelectedChainType(int value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.MinerFeeGasItemBean getMinerFeeGasItemBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.MinerFeeSatItemBean getMinerFeeSatItemBean() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.model.MinerFeeEditBean getMinerFeeEditBean() {
        return null;
    }
    
    public final void setMinerFeeEditBean(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.MinerFeeEditBean p0) {
    }
    
    public final void saveEthMinerFeeFromApiToString(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEthMinerFeeFromApiString() {
        return null;
    }
    
    public final void setEthMinerFeeFromApiString() {
    }
    
    public final void setEthMinerFeeFromApi(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal suggest, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal maxGasPrice, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal minGasPrice) {
    }
    
    public final void saveBtcMinerFeeFromApiToString(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBtcMinerFeeFromApiString() {
        return null;
    }
    
    public final void setBtcMinerFeeFromApiString() {
    }
    
    public final void setBtcMinerFeeFromApi(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal regular, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal priority) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.repository.MinerFeeRepository.MinerFeeModelListener getMinerFeeModelListener() {
        return null;
    }
    
    public final void setMinerFeeModelListener(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.repository.MinerFeeRepository.MinerFeeModelListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.ttchain.walletproject.repository.MinerFeeRepository.MinerFeeModelCustomBtcGasListener getMinerFeeModelCustomBtcGasListener() {
        return null;
    }
    
    public final void setMinerFeeModelCustomBtcGasListener(@org.jetbrains.annotations.Nullable()
    com.ttchain.walletproject.repository.MinerFeeRepository.MinerFeeModelCustomBtcGasListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getMinerFeeToCoinAmount(@org.jetbrains.annotations.NotNull()
    java.math.BigDecimal gasPrice, @org.jetbrains.annotations.NotNull()
    java.math.BigDecimal gas) {
        return null;
    }
    
    private final android.widget.CompoundButton.OnCheckedChangeListener getEthAdvancedCheckListener() {
        return null;
    }
    
    private final android.widget.SeekBar.OnSeekBarChangeListener getEthSeekBarChangeListener() {
        return null;
    }
    
    private final android.text.TextWatcher getEthInputCustomGasPriceWatcher() {
        return null;
    }
    
    private final android.text.TextWatcher getEthInputCustomGasWatcher() {
        return null;
    }
    
    private final com.ttchain.walletproject.model.MinerFeeSatItem.OnMinerFeeSatItemGasItemListener getBtcOnCheckedListener() {
        return null;
    }
    
    private final android.text.TextWatcher getBtcInputCustomGasWatcher() {
        return null;
    }
    
    public final boolean isValidMinerFee() {
        return false;
    }
    
    public MinerFeeRepository(@org.jetbrains.annotations.NotNull()
    com.ttchain.walletproject.model.ApiHelper apiHelper) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\u000f"}, d2 = {"Lcom/ttchain/walletproject/repository/MinerFeeRepository$MinerFeeModelListener;", "", "onResultAdvancedStatusChanged", "", "status", "", "onResultInputCustomGas", "decimal", "Ljava/math/BigDecimal;", "onResultInputCustomGasPrice", "onResultMinerFeeFormulaText", "text", "", "onResultMinerFeeGasGwei", "onResultMinerFeeGasGweiToCoinAmount", "app_proPlayDebug"})
    public static abstract interface MinerFeeModelListener {
        
        public abstract void onResultAdvancedStatusChanged(boolean status);
        
        public abstract void onResultMinerFeeGasGwei(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal decimal);
        
        public abstract void onResultMinerFeeGasGweiToCoinAmount(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal decimal);
        
        public abstract void onResultMinerFeeFormulaText(@org.jetbrains.annotations.NotNull()
        java.lang.String text);
        
        public abstract void onResultInputCustomGasPrice(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal decimal);
        
        public abstract void onResultInputCustomGas(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal decimal);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ttchain/walletproject/repository/MinerFeeRepository$MinerFeeModelCustomBtcGasListener;", "", "onResultMinerFeeBtcGas", "", "decimal", "Ljava/math/BigDecimal;", "app_proPlayDebug"})
    public static abstract interface MinerFeeModelCustomBtcGasListener {
        
        public abstract void onResultMinerFeeBtcGas(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal decimal);
    }
}