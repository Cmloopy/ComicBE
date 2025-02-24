package com.cmloopy.comic.service;


import com.cmloopy.comic.model.Chapter;
import com.cmloopy.comic.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {
    @Autowired
    ChapterRepository chapterRepository;

    //Lay Dsach Chapter thuoc Comic
    public List<Chapter> getChapterByIDComic(int idComic){
        return chapterRepository.getChapterByIDComic(idComic);
    }

    //Lay Chapter theo ID
    public List<Chapter> getChapterByID(int idComic){
        return chapterRepository.getChapterByID(idComic);
    }
}
