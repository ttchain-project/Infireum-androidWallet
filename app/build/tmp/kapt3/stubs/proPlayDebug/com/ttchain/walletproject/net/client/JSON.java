package com.ttchain.walletproject.net.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0005\u0018\u0019\u001a\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/ttchain/walletproject/net/client/JSON;", "", "()V", "dateTypeAdapter", "Lcom/ttchain/walletproject/net/client/JSON$DateTypeAdapter;", "<set-?>", "Lcom/google/gson/Gson;", "gson", "getGson", "()Lcom/google/gson/Gson;", "localDateTypeAdapter", "Lcom/ttchain/walletproject/net/client/JSON$LocalDateTypeAdapter;", "offsetDateTimeTypeAdapter", "Lcom/ttchain/walletproject/net/client/JSON$OffsetDateTimeTypeAdapter;", "sqlDateTypeAdapter", "Lcom/ttchain/walletproject/net/client/JSON$SqlDateTypeAdapter;", "setDateFormat", "dateFormat", "Ljava/text/DateFormat;", "setGson", "setLocalDateFormat", "Lorg/threeten/bp/format/DateTimeFormatter;", "setOffsetDateTimeFormat", "setSqlDateFormat", "Companion", "DateTypeAdapter", "LocalDateTypeAdapter", "OffsetDateTimeTypeAdapter", "SqlDateTypeAdapter", "app_proPlayDebug"})
public final class JSON {
    
    /**
     * Get Gson.
     *
     * @return Gson
     */
    @org.jetbrains.annotations.NotNull()
    private com.google.gson.Gson gson;
    private final com.ttchain.walletproject.net.client.JSON.DateTypeAdapter dateTypeAdapter = null;
    private final com.ttchain.walletproject.net.client.JSON.SqlDateTypeAdapter sqlDateTypeAdapter = null;
    private final com.ttchain.walletproject.net.client.JSON.OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = null;
    private final com.ttchain.walletproject.net.client.JSON.LocalDateTypeAdapter localDateTypeAdapter = null;
    public static final com.ttchain.walletproject.net.client.JSON.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.net.client.JSON setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.net.client.JSON setOffsetDateTimeFormat(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.format.DateTimeFormatter dateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.net.client.JSON setLocalDateFormat(@org.jetbrains.annotations.NotNull()
    org.threeten.bp.format.DateTimeFormatter dateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.net.client.JSON setDateFormat(@org.jetbrains.annotations.Nullable()
    java.text.DateFormat dateFormat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ttchain.walletproject.net.client.JSON setSqlDateFormat(@org.jetbrains.annotations.Nullable()
    java.text.DateFormat dateFormat) {
        return null;
    }
    
    public JSON() {
        super();
    }
    
    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ttchain/walletproject/net/client/JSON$OffsetDateTimeTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lorg/threeten/bp/OffsetDateTime;", "formatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "(Lorg/threeten/bp/format/DateTimeFormatter;)V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "setFormat", "", "dateFormat", "write", "out", "Lcom/google/gson/stream/JsonWriter;", "date", "app_proPlayDebug"})
    public static final class OffsetDateTimeTypeAdapter extends com.google.gson.TypeAdapter<org.threeten.bp.OffsetDateTime> {
        private org.threeten.bp.format.DateTimeFormatter formatter;
        
        public final void setFormat(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.format.DateTimeFormatter dateFormat) {
        }
        
        @java.lang.Override()
        public void write(@org.jetbrains.annotations.NotNull()
        com.google.gson.stream.JsonWriter out, @org.jetbrains.annotations.Nullable()
        org.threeten.bp.OffsetDateTime date) throws java.io.IOException {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public org.threeten.bp.OffsetDateTime read(@org.jetbrains.annotations.NotNull()
        com.google.gson.stream.JsonReader in) throws java.io.IOException {
            return null;
        }
        
        public OffsetDateTimeTypeAdapter(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.format.DateTimeFormatter formatter) {
            super();
        }
        
        public OffsetDateTimeTypeAdapter() {
            super();
        }
    }
    
    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ttchain/walletproject/net/client/JSON$LocalDateTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lorg/threeten/bp/LocalDate;", "formatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "(Lcom/ttchain/walletproject/net/client/JSON;Lorg/threeten/bp/format/DateTimeFormatter;)V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "setFormat", "", "dateFormat", "write", "out", "Lcom/google/gson/stream/JsonWriter;", "date", "app_proPlayDebug"})
    public final class LocalDateTypeAdapter extends com.google.gson.TypeAdapter<org.threeten.bp.LocalDate> {
        private org.threeten.bp.format.DateTimeFormatter formatter;
        
        public final void setFormat(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.format.DateTimeFormatter dateFormat) {
        }
        
        @java.lang.Override()
        public void write(@org.jetbrains.annotations.NotNull()
        com.google.gson.stream.JsonWriter out, @org.jetbrains.annotations.Nullable()
        org.threeten.bp.LocalDate date) throws java.io.IOException {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public org.threeten.bp.LocalDate read(@org.jetbrains.annotations.NotNull()
        com.google.gson.stream.JsonReader in) throws java.io.IOException {
            return null;
        }
        
        public LocalDateTypeAdapter(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.format.DateTimeFormatter formatter) {
            super();
        }
        
        public LocalDateTypeAdapter() {
            super();
        }
    }
    
    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ttchain/walletproject/net/client/JSON$SqlDateTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/sql/Date;", "()V", "dateFormat", "Ljava/text/DateFormat;", "(Ljava/text/DateFormat;)V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "setFormat", "", "write", "out", "Lcom/google/gson/stream/JsonWriter;", "date", "app_proPlayDebug"})
    public static final class SqlDateTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Date> {
        private java.text.DateFormat dateFormat;
        
        public final void setFormat(@org.jetbrains.annotations.Nullable()
        java.text.DateFormat dateFormat) {
        }
        
        @java.lang.Override()
        public void write(@org.jetbrains.annotations.NotNull()
        com.google.gson.stream.JsonWriter out, @org.jetbrains.annotations.Nullable()
        java.sql.Date date) throws java.io.IOException {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.sql.Date read(@org.jetbrains.annotations.NotNull()
        com.google.gson.stream.JsonReader in) throws java.io.IOException {
            return null;
        }
        
        public SqlDateTypeAdapter() {
            super();
        }
        
        public SqlDateTypeAdapter(@org.jetbrains.annotations.Nullable()
        java.text.DateFormat dateFormat) {
            super();
        }
    }
    
    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0003B\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/ttchain/walletproject/net/client/JSON$DateTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Ljava/util/Date;", "()V", "dateFormat", "Ljava/text/DateFormat;", "(Ljava/text/DateFormat;)V", "read", "in", "Lcom/google/gson/stream/JsonReader;", "setFormat", "", "write", "out", "Lcom/google/gson/stream/JsonWriter;", "date", "app_proPlayDebug"})
    public static final class DateTypeAdapter extends com.google.gson.TypeAdapter<java.util.Date> {
        private java.text.DateFormat dateFormat;
        
        public final void setFormat(@org.jetbrains.annotations.Nullable()
        java.text.DateFormat dateFormat) {
        }
        
        @java.lang.Override()
        public void write(@org.jetbrains.annotations.NotNull()
        com.google.gson.stream.JsonWriter out, @org.jetbrains.annotations.Nullable()
        java.util.Date date) throws java.io.IOException {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.util.Date read(@org.jetbrains.annotations.NotNull()
        com.google.gson.stream.JsonReader in) throws java.io.IOException {
            return null;
        }
        
        public DateTypeAdapter() {
            super();
        }
        
        public DateTypeAdapter(@org.jetbrains.annotations.Nullable()
        java.text.DateFormat dateFormat) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J$\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u000e\u0010\u0007\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002\u00a8\u0006\u000f"}, d2 = {"Lcom/ttchain/walletproject/net/client/JSON$Companion;", "", "()V", "createGson", "Lcom/google/gson/GsonBuilder;", "getClassByDiscriminator", "Ljava/lang/Class;", "classByDiscriminatorValue", "", "discriminatorValue", "", "getDiscriminatorValue", "readElement", "Lcom/google/gson/JsonElement;", "discriminatorField", "app_proPlayDebug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.gson.GsonBuilder createGson() {
            return null;
        }
        
        private final java.lang.String getDiscriminatorValue(com.google.gson.JsonElement readElement, java.lang.String discriminatorField) {
            return null;
        }
        
        private final java.lang.Class<?> getClassByDiscriminator(java.util.Map<?, ?> classByDiscriminatorValue, java.lang.String discriminatorValue) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}