package com.cmloopy.comic.service;

import com.cmloopy.comic.model.Category;
import com.cmloopy.comic.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Lấy tất cả các category
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Lấy category theo id
    public Category getCategoryById(int idCategory) {
        return categoryRepository.findById(idCategory);
    }

    // Lấy tất cả các category của comic theo id_comic
    public List<Category> getCategoriesByComicId(int idComic) {
        return categoryRepository.findCategoriesByComicId(idComic);
    }

    // Thêm category mới
    public int createCategory(Category category) {
        return categoryRepository.addCategory(category);
    }

    // Cập nhật category
    public int updateCategory(Category category) {
        return categoryRepository.updateCategory(category);
    }

    // Xóa category
    public int deleteCategory(int idCategory) {
        return categoryRepository.deleteCategory(idCategory);
    }
}
