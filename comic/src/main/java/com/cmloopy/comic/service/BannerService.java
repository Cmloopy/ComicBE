package com.cmloopy.comic.service;

import com.cmloopy.comic.model.Banner;
import com.cmloopy.comic.repository.BannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {

    @Autowired
    private BannerRepository bannerRepository;

    // Lấy tất cả các banner
    public List<Banner> getAllBanners() {
        return bannerRepository.findAll();
    }

    // Lấy banner theo id
    public Banner getBannerById(int idBanner) {
        return bannerRepository.findById(idBanner);
    }

    // Thêm banner mới
    public int createBanner(Banner banner) {
        return bannerRepository.addBanner(banner);
    }

    // Cập nhật banner
    public int updateBanner(Banner banner) {
        return bannerRepository.updateBanner(banner);
    }

    // Xóa banner
    public int deleteBanner(int idBanner) {
        return bannerRepository.deleteBanner(idBanner);
    }
}

