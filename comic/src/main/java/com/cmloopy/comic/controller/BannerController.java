package com.cmloopy.comic.controller;

import com.cmloopy.comic.model.Banner;
import com.cmloopy.comic.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    // Lấy tất cả banner
    @GetMapping
    public List<Banner> getAllBanners() {
        return bannerService.getAllBanners();
    }

    // Lấy banner theo id
    @GetMapping("/{id}")
    public Banner getBannerById(@PathVariable int id) {
        return bannerService.getBannerById(id);
    }

    // Thêm banner mới
    @PostMapping
    public int createBanner(@RequestBody Banner banner) {
        return bannerService.createBanner(banner);
    }

    // Cập nhật banner
    @PutMapping("/{id}")
    public int updateBanner(@PathVariable int id, @RequestBody Banner banner) {
        banner.setIdBanner(id);
        return bannerService.updateBanner(banner);
    }

    // Xóa banner
    @DeleteMapping("/{id}")
    public int deleteBanner(@PathVariable int id) {
        return bannerService.deleteBanner(id);
    }
}

