package com.ttchain.walletproject.database;

import android.content.Context;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.misc.TransactionManager;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.table.TableUtils;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class BaseDao<T, ID> {

    private Dao<T, ID> mDao;
    private DbHelper mHelper;

    public BaseDao(Context context, Class<T> clazz) {
        try {
            mHelper = DbHelper.getHelper(context);
            mDao = mHelper.getDao(clazz);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Dao<T, ID> getDao() {
        return mDao;
    }

    public int insert(T item) {
        try {
            mDao.create(item);
            Field message = item.getClass().getDeclaredField("_id");
            message.setAccessible(true);
            return (int) message.get(item);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int insertByPosition(T item) {
        try {
            mDao.create(item);
            Field message = item.getClass().getDeclaredField("_id");
            message.setAccessible(true);
            return (int) message.get(item);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int deleteById(ID primaryKey) {
        int id;
        try {
            id = mDao.deleteById(primaryKey);
        } catch (SQLException e) {
            e.printStackTrace();
            id = -1;
        }
        return id;
    }

    public int update(T item) {
        int id;
        try {
            id = mDao.update(item);
        } catch (SQLException e) {
            e.printStackTrace();
            id = -1;
        }
        return id;
    }

    public T getById(ID id) {
        try {
            return mDao.queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                mDao.queryBuilder().iterator().closeQuietly();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public int getCount() {
        return getAll().size();
    }

    public List<T> getAll() {
        try {
            return mDao.queryBuilder().orderBy(DbConstants._ID, true).query();
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        } finally {
            try {
                mDao.queryBuilder().iterator().closeQuietly();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public T maxOfFieldItem(String field) throws Exception {
        return mDao.queryBuilder().orderBy(field, false).limit(1L).query().get(0);
    }

    public T minOfFieldItem(String field) throws Exception {
        return mDao.queryBuilder().orderBy(field, true).limit(1L).query().get(0);
    }

    /**
     * get all data
     *
     * @param isAsc true asc, false desc
     * @return List<T> sort by id
     */
    public List<T> getAll(boolean isAsc) {
        try {
            return mDao.queryBuilder().orderBy("_id", isAsc).query();
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    /**
     * get all data
     *
     * @param field sort by field
     * @param isAsc true asc, false desc
     * @return List<T> sort by field
     */
    public List<T> getAll(String field, boolean isAsc) {
        try {
            return mDao.queryBuilder().orderBy(field, isAsc).query();
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public QueryBuilder<T, ID> getQueryBuilder() {
        return mDao.queryBuilder();
    }

    public void insertWithTransaction(final List<T> items) {
        try {
            TransactionManager.callInTransaction(mHelper.getConnectionSource(), new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    for (T t : items) {
                        mDao.create(t);
                    }
                    return null;
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void createWithTransaction(final List<T> items) {
        try {
            TransactionManager.callInTransaction(mHelper.getConnectionSource(), new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    for (T t : items) {
                        mDao.update(t);
                    }
                    return null;
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateWithTransaction(final List<ID> items) {
        try {
            TransactionManager.callInTransaction(mHelper.getConnectionSource(), new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    mDao.deleteIds(items);
                    return null;
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void clearTable(Class<T> clazz) {
        try {
            TableUtils.clearTable(mHelper.getConnectionSource(), clazz);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteDB(Context context) {
        DbHelper.deleteDb(context);
    }

    public boolean existDb() {
        if (mHelper != null) {
            return mHelper.getWritableDatabase() != null;
        }
        return false;
    }
}