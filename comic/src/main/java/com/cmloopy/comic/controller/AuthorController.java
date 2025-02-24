package com.cmloopy.comic.controller;

import com.cmloopy.comic.model.Author;
import com.cmloopy.comic.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    // Lấy tất cả tác giả
    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    // Lấy tác giả theo id
    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable int id) {
        return authorService.getAuthorById(id);
    }

    // Thêm tác giả mới
    @PostMapping
    public int createAuthor(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

    // Cập nhật tác giả
    @PutMapping("/{id}")
    public int updateAuthor(@PathVariable int id, @RequestBody Author author) {
        author.setIdAuthor(id);
        return authorService.updateAuthor(author);
    }

    // Xóa tác giả
    @DeleteMapping("/{id}")
    public int deleteAuthor(@PathVariable int id) {
        return authorService.deleteAuthor(id);
    }
}


