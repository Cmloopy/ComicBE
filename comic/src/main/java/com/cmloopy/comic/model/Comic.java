package com.cmloopy.comic.model;

import java.sql.Timestamp;

public class Comic {
    private int idComic;
    private String nameComic;
    private String content;
    private int view;
    private String imageUrl;
    private String urlComic;
    private int likes;
    private int sc;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private int idAuthor;
    private int idUser;

    // Getters and Setters
    public int getIdComic() {
        return idComic;
    }

    public void setIdComic(int idComic) {
        this.idComic = idComic;
    }

    public String getNameComic() {
        return nameComic;
    }

    public void setNameComic(String nameComic) {
        this.nameComic = nameComic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrlComic() {
        return urlComic;
    }

    public void setUrlComic(String urlComic) {
        this.urlComic = urlComic;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getSc() {
        return sc;
    }

    public void setSc(int sc) {
        this.sc = sc;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
