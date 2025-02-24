package com.cmloopy.comic.repository;


import com.cmloopy.comic.model.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChapterRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Lay tat ca Chap theo ID Comic
    public List<Chapter> getChapterByIDComic(int idComic){
        String sql = "select * from chapter where id_comic = ? order by id_chapter DESC";
        return jdbcTemplate.query(sql, new Object[]{idComic},(rs,rowNum) -> {
            Chapter chapter = new Chapter();
            chapter.setIdChapter(rs.getInt("id_chapter"));
            chapter.setNameChapter(rs.getString("name_chapter"));
            chapter.setViewChapter(rs.getInt("view_chapter"));
            chapter.setLikeChapter(rs.getInt("like_chapter"));
            chapter.setUpdatedAt(rs.getTimestamp("updated_at"));
            chapter.setUrlChapter(rs.getString("url_chapter"));
            chapter.setIdComic(rs.getInt("id_comic"));
            return chapter;
        });
    }

    //Lay TT Chapter theo ID
    public List<Chapter> getChapterByID(int idChapter){
        String sql = "select * from chapter where id_chapter =?";
        return jdbcTemplate.query(sql, new Object[]{idChapter}, (rs,rowNum) -> {
           Chapter chapter = new Chapter();
           chapter.setIdChapter(rs.getInt("id_chapter"));
           chapter.setNameChapter(rs.getString("name_chapter"));
           chapter.setViewChapter(rs.getInt("view_chapter"));
           chapter.setLikeChapter(rs.getInt("like_chapter"));
           chapter.setUpdatedAt(rs.getTimestamp("updated_at"));
           chapter.setUrlChapter(rs.getString("url_chapter"));
           chapter.setIdComic(rs.getInt("id_comic"));
           return chapter;
        });
    }
}
