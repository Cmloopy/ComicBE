package com.cmloopy.comic.repository;


import com.cmloopy.comic.model.ComicMark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ComicMarkRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Lay Dsach Mark theo ID user
    public List<ComicMark> getMarkByIdUser(int idUser){
        String sql = "select * from comic_mark where id_user = ?";
        return jdbcTemplate.query(sql, new Object[]{idUser}, (rs,rowNum) -> {
           ComicMark comicMark = new ComicMark();
           comicMark.setIdMark(rs.getInt("id_mark"));
           comicMark.setIdUser(rs.getInt("id_user"));
           comicMark.setIdChapter(rs.getInt("id_chapter"));
           comicMark.setIdComic(rs.getInt("id_comic"));
           comicMark.setCreatedAt(rs.getTimestamp("created_at"));
           return comicMark;
        });
    }

    //Kiểm tra xem ComicMark theo User và Comic có tồn tại không
    // Kiểm tra nếu đánh dấu đã tồn tại
    public boolean existsByUserAndComic(int idUser, int idComic) {
        String sql = "SELECT COUNT(*) FROM comic_mark WHERE id_user = ? AND id_comic = ?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, idUser, idComic);
        return count > 0;
    }

    //Thêm Mark theo User và Comic hoặc Update nếu đã tồn tại
    public void saveOrUpdateMark(ComicMark comicMark) {
        if (existsByUserAndComic(comicMark.getIdUser(), comicMark.getIdComic())) {
            // Nếu đã có, thực hiện UPDATE chapter đánh dấu mới
            String updateSql = "UPDATE comic_mark SET id_chapter = ?, created_at = CURRENT_TIMESTAMP WHERE id_user = ? AND id_comic = ?";
            jdbcTemplate.update(updateSql, comicMark.getIdChapter(), comicMark.getIdUser(), comicMark.getIdComic());
        } else {
            // Nếu chưa có, thực hiện INSERT bản ghi mới
            String insertSql = "INSERT INTO comic_mark (id_user, id_comic, id_chapter) VALUES (?, ?, ?)";
            jdbcTemplate.update(insertSql, comicMark.getIdUser(), comicMark.getIdComic(), comicMark.getIdChapter());
        }
    }

}
