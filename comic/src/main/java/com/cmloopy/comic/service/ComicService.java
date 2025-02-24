package com.cmloopy.comic.service;


import com.cmloopy.comic.model.Comic;
import com.cmloopy.comic.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicService {
    @Autowired
    private ComicRepository comicRepository;

    //Lấy tất cả comic
    public List<Comic> getAllComics(){
        return comicRepository.findAll();
    }

    //Lay Dsach Comic xep theo moi cap nhat
    public List<Comic> getNewUpdateComic(){
        return comicRepository.newUpdate();
    }

    //Lay Dsach Comic theo Category
    public List<Comic> getComicByCategory(int idCategory){
        return comicRepository.getComicByCategory(idCategory);
    }

    //Lay Comic theo ID
    public List<Comic> getComicByID(int idComic){
        return comicRepository.getComicByID(idComic);
    }
}
