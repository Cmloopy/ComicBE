package com.cmloopy.comic.controller;

import com.cmloopy.comic.model.Comic;
import com.cmloopy.comic.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/comic")
public class ComicController {
    @Autowired
    private ComicService comicService;

    //Lấy tất cả Comic
    @GetMapping
    public List<Comic> getAllComics(){
        return comicService.getAllComics();
    }

    //Lay Dsach Comic xep theo moi cap nhat
    @GetMapping("/newUpdate")
    public List<Comic> getNewUpdateComic(){
        return comicService.getNewUpdateComic();
    }

    //Lay Dsach Comic theo Category
    @GetMapping("/category/{idCategory}")
    public List<Comic> getComicByCategory(@PathVariable int idCategory){
        return comicService.getComicByCategory(idCategory);
    }

    //Lay Comic theo ID
    @GetMapping("/{idComic}")
    public List<Comic> getComicByID(@PathVariable int idComic){
        return comicService.getComicByID(idComic);
    }
}
