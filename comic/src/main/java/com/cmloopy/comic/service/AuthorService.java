package com.cmloopy.comic.service;

import com.cmloopy.comic.model.Author;
import com.cmloopy.comic.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    // Lấy tất cả các tác giả
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    // Lấy tác giả theo id
    public Author getAuthorById(int idAuthor) {
        return authorRepository.findById(idAuthor);
    }

    // Thêm tác giả mới
    public int createAuthor(Author author) {
        return authorRepository.addAuthor(author);
    }

    // Cập nhật thông tin tác giả
    public int updateAuthor(Author author) {
        return authorRepository.updateAuthor(author);
    }

    // Xóa tác giả theo id
    public int deleteAuthor(int idAuthor) {
        return authorRepository.deleteAuthor(idAuthor);
    }
}


