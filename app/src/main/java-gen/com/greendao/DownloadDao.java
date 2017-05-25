package com.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DOWNLOAD".
*/
public class DownloadDao extends AbstractDao<MusicBean, Long> {

    public static final String TABLENAME = "DOWNLOAD";

    /**
     * Properties of entity Download.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Artist = new Property(2, String.class, "artist", false, "ARTIST");
        public final static Property Album = new Property(3, String.class, "album", false, "ALBUM");
        public final static Property Path = new Property(4, String.class, "path", false, "PATH");
        public final static Property Duration = new Property(5, String.class, "duration", false, "DURATION");
        public final static Property File_size = new Property(6, String.class, "file_size", false, "FILE_SIZE");
        public final static Property File_name = new Property(7, String.class, "file_name", false, "FILE_NAME");
        public final static Property MediaID = new Property(8, String.class, "mediaID", false, "MEDIA_ID");
    };


    public DownloadDao(DaoConfig config) {
        super(config);
    }
    
    public DownloadDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DOWNLOAD\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TITLE\" TEXT," + // 1: title
                "\"ARTIST\" TEXT," + // 2: artist
                "\"ALBUM\" TEXT," + // 3: album
                "\"PATH\" TEXT," + // 4: path
                "\"DURATION\" TEXT," + // 5: duration
                "\"FILE_SIZE\" TEXT," + // 6: file_size
                "\"FILE_NAME\" TEXT," + // 7: file_name
                "\"MEDIA_ID\" TEXT);"); // 8: mediaID
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DOWNLOAD\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MusicBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String artist = entity.getArtist();
        if (artist != null) {
            stmt.bindString(3, artist);
        }
 
        String album = entity.getAlbum();
        if (album != null) {
            stmt.bindString(4, album);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(5, path);
        }
 
        String duration = entity.getDuration();
        if (duration != null) {
            stmt.bindString(6, duration);
        }
 
        String file_size = entity.getFile_size();
        if (file_size != null) {
            stmt.bindString(7, file_size);
        }
 
        String file_name = entity.getFile_name();
        if (file_name != null) {
            stmt.bindString(8, file_name);
        }
 
        String mediaID = entity.getMediaID();
        if (mediaID != null) {
            stmt.bindString(9, mediaID);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public MusicBean readEntity(Cursor cursor, int offset) {
        MusicBean entity = new MusicBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // artist
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // album
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // path
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // duration
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // file_size
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // file_name
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // mediaID
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MusicBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setArtist(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setAlbum(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPath(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDuration(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFile_size(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFile_name(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMediaID(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(MusicBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(MusicBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
