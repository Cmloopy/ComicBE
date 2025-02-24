package com.cmloopy.comic.model;
import java.sql.Timestamp;

public class ComicMark {
    private int idMark;
    private int idUser;
    private int idComic;
    private int idChapter;
    private Timestamp createdAt;

    // Getters and Setters
    public int getIdMark() {
        return idMark;
    }

    public void setIdMark(int idMark) {
        this.idMark = idMark;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdComic() {
        return idComic;
    }

    public void setIdComic(int idComic) {
        this.idComic = idComic;
    }

    public int getIdChapter() {
        return idChapter;
    }

    public void setIdChapter(int idChapter) {
        this.idChapter = idChapter;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
