package com.cmloopy.comic.service;

import com.cmloopy.comic.model.ComicMark;
import com.cmloopy.comic.repository.ComicMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComicMarkService {
    @Autowired
    ComicMarkRepository comicMarkRepository;

    //Lay Dsach Mark theo User
    public List<ComicMark> getMarkByIdUser(int idUser){
        return comicMarkRepository.getMarkByIdUser(idUser);
    }

    //Thêm Mark theo User và Comic hoặc Update nếu đã tồn tại
    public void saveOrUpdateMark(ComicMark comicMark) {
        comicMarkRepository.saveOrUpdateMark(comicMark);
    }
}
