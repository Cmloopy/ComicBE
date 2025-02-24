package com.cmloopy.comic.controller;

import com.cmloopy.comic.model.ComicMark;
import com.cmloopy.comic.service.ComicMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comicmark")
public class ComicMarkController {
    @Autowired
    ComicMarkService comicMarkService;

    //Lay Dsach Mark theo User
    @GetMapping("/user/{idUser}")
    public List<ComicMark> getMarkByIdUser(@PathVariable int idUser){
        return comicMarkService.getMarkByIdUser(idUser);
    }

    //Thêm Mark theo User và Comic hoặc Update nếu đã tồn tại
    @PostMapping("/mark")
    public ResponseEntity<String> saveOrUpdateMark(@RequestBody ComicMark comicMark) {
        comicMarkService.saveOrUpdateMark(comicMark);
        return ResponseEntity.ok("Mark saved or updated successfully.");
    }
}
