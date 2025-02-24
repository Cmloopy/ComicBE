package com.cmloopy.comic.model;

import java.sql.Timestamp;

public class Chapter {
    private int idChapter;
    private String nameChapter;
    private int viewChapter;
    private int likeChapter;
    private Timestamp updatedAt;
    private String urlChapter;
    private int idComic;

    // Getters and Setters
    public int getIdChapter() {
        return idChapter;
    }

    public void setIdChapter(int idChapter) {
        this.idChapter = idChapter;
    }

    public String getNameChapter() {
        return nameChapter;
    }

    public void setNameChapter(String nameChapter) {
        this.nameChapter = nameChapter;
    }

    public int getViewChapter() {
        return viewChapter;
    }

    public void setViewChapter(int viewChapter) {
        this.viewChapter = viewChapter;
    }

    public int getLikeChapter() {
        return likeChapter;
    }

    public void setLikeChapter(int likeChapter) {
        this.likeChapter = likeChapter;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrlChapter() {
        return urlChapter;
    }

    public void setUrlChapter(String urlChapter) {
        this.urlChapter = urlChapter;
    }

    public int getIdComic() {
        return idComic;
    }

    public void setIdComic(int idComic) {
        this.idComic = idComic;
    }
}

