package com.cmloopy.comic.model;

import java.sql.Timestamp;

public class Banner {
    private int idBanner;
    private String urlBanner;
    private int idCategory;
    private Timestamp addAt;

    // Getters and Setters
    public int getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(int idBanner) {
        this.idBanner = idBanner;
    }

    public String getUrlBanner() {
        return urlBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public Timestamp getAddAt() {
        return addAt;
    }

    public void setAddAt(Timestamp addAt) {
        this.addAt = addAt;
    }
}
