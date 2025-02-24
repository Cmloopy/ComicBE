package com.cmloopy.comic.repository;

import com.cmloopy.comic.model.Banner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BannerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Lấy tất cả các banner
    public List<Banner> findAll() {
        String sql = "SELECT * FROM banner";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Banner banner = new Banner();
            banner.setIdBanner(rs.getInt("id_banner"));
            banner.setUrlBanner(rs.getString("url_banner"));
            banner.setIdCategory(rs.getInt("id_category"));
            banner.setAddAt(rs.getTimestamp("add_at"));
            return banner;
        });
    }

    // Lấy banner theo id
    public Banner findById(int idBanner) {
        String sql = "SELECT * FROM banner WHERE id_banner = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{idBanner}, (rs, rowNum) -> {
            Banner banner = new Banner();
            banner.setIdBanner(rs.getInt("id_banner"));
            banner.setUrlBanner(rs.getString("url_banner"));
            banner.setIdCategory(rs.getInt("id_category"));
            banner.setAddAt(rs.getTimestamp("add_at"));
            return banner;
        });
    }

    // Thêm banner mới
    public int addBanner(Banner banner) {
        String sql = "INSERT INTO banner (url_banner, id_category) VALUES (?, ?)";
        return jdbcTemplate.update(sql, banner.getUrlBanner(), banner.getIdCategory());
    }

    // Cập nhật banner
    public int updateBanner(Banner banner) {
        String sql = "UPDATE banner SET url_banner = ?, id_category = ? WHERE id_banner = ?";
        return jdbcTemplate.update(sql, banner.getUrlBanner(), banner.getIdCategory(), banner.getIdBanner());
    }

    // Xóa banner
    public int deleteBanner(int idBanner) {
        String sql = "DELETE FROM banner WHERE id_banner = ?";
        return jdbcTemplate.update(sql, idBanner);
    }
}

