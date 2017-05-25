package com.greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig localMusicDaoConfig;
    private final DaoConfig favoritesDaoConfig;
    private final DaoConfig downloadDaoConfig;
    private final DaoConfig recentDaoConfig;

    private final LocalMusicDao localMusicDao;
    private final FavoritesDao favoritesDao;
    private final DownloadDao downloadDao;
    private final RecentDao recentDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        localMusicDaoConfig = daoConfigMap.get(LocalMusicDao.class).clone();
        localMusicDaoConfig.initIdentityScope(type);

        favoritesDaoConfig = daoConfigMap.get(FavoritesDao.class).clone();
        favoritesDaoConfig.initIdentityScope(type);

        downloadDaoConfig = daoConfigMap.get(DownloadDao.class).clone();
        downloadDaoConfig.initIdentityScope(type);

        recentDaoConfig = daoConfigMap.get(RecentDao.class).clone();
        recentDaoConfig.initIdentityScope(type);

        localMusicDao = new LocalMusicDao(localMusicDaoConfig, this);
        favoritesDao = new FavoritesDao(favoritesDaoConfig, this);
        downloadDao = new DownloadDao(downloadDaoConfig, this);
        recentDao = new RecentDao(recentDaoConfig, this);

        registerDao(MusicBean.class, localMusicDao);
        registerDao(MusicBean.class, favoritesDao);
        registerDao(MusicBean.class, downloadDao);
        registerDao(MusicBean.class, recentDao);
    }
    
    public void clear() {
        localMusicDaoConfig.getIdentityScope().clear();
        favoritesDaoConfig.getIdentityScope().clear();
        downloadDaoConfig.getIdentityScope().clear();
        recentDaoConfig.getIdentityScope().clear();
    }

    public LocalMusicDao getLocalMusicDao() {
        return localMusicDao;
    }

    public FavoritesDao getFavoritesDao() {
        return favoritesDao;
    }

    public DownloadDao getDownloadDao() {
        return downloadDao;
    }

    public RecentDao getRecentDao() {
        return recentDao;
    }

}
