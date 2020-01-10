package com.ttchain.walletproject.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.ttchain.walletproject.database.data.AddressData;
import com.ttchain.walletproject.database.data.AssetData;
import com.ttchain.walletproject.database.data.ChatCommunicationData;
import com.ttchain.walletproject.database.data.ChatGroupData;
import com.ttchain.walletproject.database.data.ChatMessageData;
import com.ttchain.walletproject.database.data.ChatRoomData;
import com.ttchain.walletproject.database.data.CoinData;
import com.ttchain.walletproject.database.data.CoinSelectionData;
import com.ttchain.walletproject.database.data.CoinToCoinRateData;
import com.ttchain.walletproject.database.data.CoinToFiatRateData;
import com.ttchain.walletproject.database.data.FiatData;
import com.ttchain.walletproject.database.data.FiatToFiatRateData;
import com.ttchain.walletproject.database.data.IdentityData;
import com.ttchain.walletproject.database.data.LanguageData;
import com.ttchain.walletproject.database.data.LightningTransRecordData;
import com.ttchain.walletproject.database.data.TransRecordData;
import com.ttchain.walletproject.database.data.UsdtTransRecordData;
import com.ttchain.walletproject.database.data.WalletData;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import static com.ttchain.walletproject.database.DbConstants.WALLET_DB_NAME;

public class DbHelper extends OrmLiteSqliteOpenHelper {

    private final String TAG = getClass().getSimpleName();

    private static final int DATABASE_VERSION = 17;
    private static final String DATABASE_NAME = WALLET_DB_NAME;
    private static DbHelper instance;

    private DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static synchronized DbHelper getHelper(Context context) {
        context = context.getApplicationContext();
        if (instance == null) {
            synchronized (DbHelper.class) {
                if (instance == null)
                    instance = new DbHelper(context);
            }
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, IdentityData.class);
            TableUtils.createTable(connectionSource, WalletData.class);
            TableUtils.createTable(connectionSource, CoinData.class);
            TableUtils.createTable(connectionSource, CoinSelectionData.class);
            TableUtils.createTable(connectionSource, AssetData.class);
            TableUtils.createTable(connectionSource, AddressData.class);
            TableUtils.createTable(connectionSource, FiatData.class);
            TableUtils.createTable(connectionSource, LanguageData.class);
            TableUtils.createTable(connectionSource, CoinToCoinRateData.class);
            TableUtils.createTable(connectionSource, CoinToFiatRateData.class);
            TableUtils.createTable(connectionSource, FiatToFiatRateData.class);
            TableUtils.createTable(connectionSource, TransRecordData.class);
            TableUtils.createTable(connectionSource, LightningTransRecordData.class);
            TableUtils.createTable(connectionSource, UsdtTransRecordData.class);
            TableUtils.createTable(connectionSource, ChatRoomData.class);
            TableUtils.createTable(connectionSource, ChatMessageData.class);
            TableUtils.createTable(connectionSource, ChatCommunicationData.class);
            TableUtils.createTable(connectionSource, ChatGroupData.class);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        if (oldVersion < 14) {
            try {
                TableUtils.createTable(connectionSource, UsdtTransRecordData.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (oldVersion < 15) {
            try {
                TableUtils.createTable(connectionSource, ChatRoomData.class);
                TableUtils.createTable(connectionSource, ChatMessageData.class);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (oldVersion < 16) {
            try {
                TableUtils.createTable(connectionSource, ChatCommunicationData.class);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (oldVersion < 17) {
            try {
                TableUtils.createTable(connectionSource, ChatGroupData.class);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void deleteDb(Context context) {
        context.deleteDatabase(DATABASE_NAME);
    }

}
