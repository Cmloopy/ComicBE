package com.cmloopy.comic.repository;

import com.cmloopy.comic.model.Category;
import com.cmloopy.comic.model.Comic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComicRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Tim tat ca Comic
    public List<Comic> findAll() {
        String sql = "Select * from comic";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Comic comic = new Comic();
            comic.setIdComic(rs.getInt("id_comic"));
            comic.setNameComic(rs.getString("name_comic"));
            comic.setContent(rs.getString("content"));
            comic.setView(rs.getInt("view"));
            comic.setImageUrl(rs.getString("image_url"));
            comic.setUrlComic(rs.getString("url_comic"));
            comic.setLikes(rs.getInt("likes"));
            comic.setSc(rs.getInt("sc"));
            comic.setCreatedAt(rs.getTimestamp("created_at"));
            comic.setUpdatedAt(rs.getTimestamp("updated_at"));
            comic.setIdAuthor(rs.getInt("id_author"));
            comic.setIdUser(rs.getInt("id_user"));
            return comic;
        });
    }
    //Danh sach truyen sap xep theo moi cap nhat
    public List<Comic> newUpdate(){
        String sql = "Select * from comic order by updated_at DESC";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Comic comic = new Comic();
            comic.setIdComic(rs.getInt("id_comic"));
            comic.setNameComic(rs.getString("name_comic"));
            comic.setContent(rs.getString("content"));
            comic.setView(rs.getInt("view"));
            comic.setImageUrl(rs.getString("image_url"));
            comic.setUrlComic(rs.getString("url_comic"));
            comic.setLikes(rs.getInt("likes"));
            comic.setSc(rs.getInt("sc"));
            comic.setCreatedAt(rs.getTimestamp("created_at"));
            comic.setUpdatedAt(rs.getTimestamp("updated_at"));
            comic.setIdAuthor(rs.getInt("id_author"));
            comic.setIdUser(rs.getInt("id_user"));
            return comic;
        });
    }
    //Danh sach truyen theo the loai
    public List<Comic> getComicByCategory(int id_category){
        String sql = "Select * from comic c" +
                " join comic_category cc on c.id_comic = cc.id_comic" +
                " join category ccc on ccc.id_category = cc.id_category" +
                " where ccc.id_category = ?";
        return jdbcTemplate.query(sql, new Object[]{id_category}, (rs, rowNum) -> {
            Comic comic = new Comic();
            comic.setIdComic(rs.getInt("id_comic"));
            comic.setNameComic(rs.getString("name_comic"));
            comic.setContent(rs.getString("content"));
            comic.setView(rs.getInt("view"));
            comic.setImageUrl(rs.getString("image_url"));
            comic.setUrlComic(rs.getString("url_comic"));
            comic.setLikes(rs.getInt("likes"));
            comic.setSc(rs.getInt("sc"));
            comic.setCreatedAt(rs.getTimestamp("created_at"));
            comic.setUpdatedAt(rs.getTimestamp("updated_at"));
            comic.setIdAuthor(rs.getInt("id_author"));
            comic.setIdUser(rs.getInt("id_user"));
            return comic;
        });
    }
    //Lay thong tin comic theo ID
    public List<Comic> getComicByID(int id_comic){
        String sql = "select * from comic where id_comic = ?";
        return jdbcTemplate.query(sql, new Object[]{id_comic}, (rs, rowNum) -> {
            Comic comic = new Comic();
            comic.setIdComic(rs.getInt("id_comic"));
            comic.setNameComic(rs.getString("name_comic"));
            comic.setContent(rs.getString("content"));
            comic.setView(rs.getInt("view"));
            comic.setImageUrl(rs.getString("image_url"));
            comic.setUrlComic(rs.getString("url_comic"));
            comic.setLikes(rs.getInt("likes"));
            comic.setSc(rs.getInt("sc"));
            comic.setCreatedAt(rs.getTimestamp("created_at"));
            comic.setUpdatedAt(rs.getTimestamp("updated_at"));
            comic.setIdAuthor(rs.getInt("id_author"));
            comic.setIdUser(rs.getInt("id_user"));
            return comic;
        });
    }
}
