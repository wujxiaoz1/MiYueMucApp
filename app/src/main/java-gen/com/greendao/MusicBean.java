package com.greendao;

/**
 * Created by zhangzhendong on 16/5/4.
 */
public class MusicBean implements MusicBeanGen {

    private Long id;
    private String title;
    private String artist;
    private String album;
    private String path;
    private String duration;
    private String file_size;
    private String file_name;
    private String mediaID;

    public MusicBean(){}

    public MusicBean(Long id){
        this.id = id;
    }

    public MusicBean(Long id, String title, String artist, String album, String path, String duration, String file_size, String file_name, String mediaID) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.path = path;
        this.duration = duration;
        this.file_size = file_size;
        this.file_name = file_name;
        this.mediaID = mediaID;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String getTitle() {
        return title;
    }
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String getArtist() {
        return artist;
    }
    @Override
    public void setArtist(String artist) {
        this.artist = artist;
    }
    @Override
    public String getAlbum() {
        return album;
    }
    @Override
    public void setAlbum(String album) {
        this.album = album;
    }
    @Override
    public String getPath() {
        return path;
    }
    @Override
    public void setPath(String path) {
        this.path = path;
    }
    @Override
    public String getDuration() {
        return duration;
    }
    @Override
    public void setDuration(String duration) {
        this.duration = duration;
    }
    @Override
    public String getFile_size() {
        return file_size;
    }
    @Override
    public void setFile_size(String file_size) {
        this.file_size = file_size;
    }
    @Override
    public String getFile_name() {
        return file_name;
    }
    @Override
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    @Override
    public String getMediaID() {
        return mediaID;
    }

    @Override
    public void setMediaID(String mediaID) {
        this.mediaID = mediaID;
    }
}
