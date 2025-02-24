package com.cmloopy.comic.repository;

import com.cmloopy.comic.model.Category;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Repository
public class CategoryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Lấy tất cả các category
    public List<Category> findAll() {
        String sql = "SELECT * FROM category";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Category category = new Category();
            category.setIdCategory(rs.getInt("id_category"));
            category.setNameCategory(rs.getString("name_category"));
            return category;
        });
    }

    // Lấy tất cả các category của comic theo id_comic
    public List<Category> findCategoriesByComicId(int idComic) {
        String sql = "SELECT c.* FROM category c " +
                "JOIN comic_category cc ON c.id_category = cc.id_category " +
                "WHERE cc.id_comic = ?";
        return jdbcTemplate.query(sql, new Object[]{idComic}, (rs, rowNum) -> {
            Category category = new Category();
            category.setIdCategory(rs.getInt("id_category"));
            category.setNameCategory(rs.getString("name_category"));
            return category;
        });
    }

    // Lấy category theo id
    public Category findById(int idCategory) {
        String sql = "SELECT * FROM category WHERE id_category = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{idCategory}, (rs, rowNum) -> {
            Category category = new Category();
            category.setIdCategory(rs.getInt("id_category"));
            category.setNameCategory(rs.getString("name_category"));
            return category;
        });
    }

    // Thêm category mới
    public int addCategory(Category category) {
        String sql = "INSERT INTO category (name_category) VALUES (?)";
        return jdbcTemplate.update(sql, category.getNameCategory());
    }

    // Cập nhật category
    public int updateCategory(Category category) {
        String sql = "UPDATE category SET name_category = ? WHERE id_category = ?";
        return jdbcTemplate.update(sql, category.getNameCategory(), category.getIdCategory());
    }

    // Xóa category
    public int deleteCategory(int idCategory) {
        String sql = "DELETE FROM category WHERE id_category = ?";
        return jdbcTemplate.update(sql, idCategory);
    }
}


