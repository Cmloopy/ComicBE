package com.cmloopy.comic.controller;

import com.cmloopy.comic.model.Chapter;
import com.cmloopy.comic.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/chapter")
public class ChapterController {
    @Autowired
    ChapterService chapterService;

    //Lay Dsach Chapter cua Comic
    @GetMapping("/comic/{idComic}")
    public List<Chapter> getChapterByIDComic(@PathVariable int idComic){
        return chapterService.getChapterByIDComic(idComic);
    }

    //Lay Chapter theo ID
    @GetMapping("/{idChapter}")
    public  List<Chapter> getChapterByID(@PathVariable int idChapter){
        return chapterService.getChapterByID(idChapter);
    }
}
