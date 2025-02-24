package com.cmloopy.comic.controller;

import com.cmloopy.comic.model.Category;
import com.cmloopy.comic.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // Lấy tất cả category
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }

    // Lấy category theo id
    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    // Lấy tất cả category của comic theo id_comic
    @GetMapping("/comic/{idComic}")
    public List<Category> getCategoriesByComicId(@PathVariable int idComic) {
        return categoryService.getCategoriesByComicId(idComic);
    }

    // Thêm category mới
    @PostMapping
    public int createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    // Cập nhật category
    @PutMapping("/{id}")
    public int updateCategory(@PathVariable int id, @RequestBody Category category) {
        category.setIdCategory(id);
        return categoryService.updateCategory(category);
    }

    // Xóa category
    @DeleteMapping("/{id}")
    public int deleteCategory(@PathVariable int id) {
        return categoryService.deleteCategory(id);
    }
}

