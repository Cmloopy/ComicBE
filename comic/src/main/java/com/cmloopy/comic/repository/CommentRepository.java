package com.cmloopy.comic.repository;

import com.cmloopy.comic.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Lay Comment thuoc Chapter
    public List<Comment> getAllComment(int idChapter){
        String sql = "Select * from comment where id_chapter = ?";
        return jdbcTemplate.query(sql, new Object[]{idChapter}, (rs,rowNum) -> {
            Comment comment = new Comment();
            comment.setIdComment(rs.getInt("id_comment"));
            comment.setIdUser(rs.getInt("id_user"));
            comment.setIdComic(rs.getInt("id_comic"));
            comment.setIdChapter(rs.getInt("id_chapter"));
            comment.setCreatedAt(rs.getTimestamp("created_at"));
            return comment;
        });
    }
    //Lay Comment thuoc Comic
    public List<Comment> getAllCommentByIdComic(int idComic){
        String sql = "select * from comment where id_comic = ?";
        return jdbcTemplate.query(sql, new Object[]{idComic}, (rs,rowNum) -> {
           Comment comment = new Comment();
            comment.setIdComment(rs.getInt("id_comment"));
            comment.setIdUser(rs.getInt("id_user"));
            comment.setIdComic(rs.getInt("id_comic"));
            comment.setIdChapter(rs.getInt("id_chapter"));
            comment.setCreatedAt(rs.getTimestamp("created_at"));
           return comment;
        });
    }

    //Them Comment
    public int addComment(Comment comment){
        String sql = "insert into comment(id_user, id_comic, id_chapter, title) values (?,?,?,?)";
        return jdbcTemplate.update(sql, comment.getIdUser(), comment.getIdComic(), comment.getIdChapter(), comment.getTitle());
    }

    //Xoa Comment
    public int deleteComment(int idComment){
        String sql = "delete from comment where id_comment = ?";
        return jdbcTemplate.update(sql, idComment);
    }
}
