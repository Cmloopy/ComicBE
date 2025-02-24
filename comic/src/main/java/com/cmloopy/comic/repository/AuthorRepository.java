package com.cmloopy.comic.repository;

import com.cmloopy.comic.model.Author;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Lấy tất cả các tác giả
    public List<Author> findAll() {
        String sql = "SELECT * FROM author";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Author author = new Author();
            author.setIdAuthor(rs.getInt("id_author"));
            author.setNameAuthor(rs.getString("name_author"));
            return author;
        });
    }

    // Lấy tác giả theo id
    public Author findById(int idAuthor) {
        String sql = "SELECT * FROM author WHERE id_author = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{idAuthor}, (rs, rowNum) -> {
            Author author = new Author();
            author.setIdAuthor(rs.getInt("id_author"));
            author.setNameAuthor(rs.getString("name_author"));
            return author;
        });
    }

    // Thêm tác giả mới
    public int addAuthor(Author author) {
        String sql = "INSERT INTO author (name_author) VALUES (?)";
        return jdbcTemplate.update(sql, author.getNameAuthor());
    }

    // Cập nhật thông tin tác giả
    public int updateAuthor(Author author) {
        String sql = "UPDATE author SET name_author = ? WHERE id_author = ?";
        return jdbcTemplate.update(sql, author.getNameAuthor(), author.getIdAuthor());
    }

    // Xóa tác giả theo id
    public int deleteAuthor(int idAuthor) {
        String sql = "DELETE FROM author WHERE id_author = ?";
        return jdbcTemplate.update(sql, idAuthor);
    }
}


