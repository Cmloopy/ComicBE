package com.cmloopy.comic.controller;

import com.cmloopy.comic.model.Comment;
import com.cmloopy.comic.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    //Lay Comment theo Chapter
    @GetMapping("/chapter/{idChapter}")
    public List<Comment> getCommentByIdChapter(@PathVariable int idChapter){
        return commentService.getCommentByIdChapter(idChapter);
    }

    //Lay Comment theo Comic
    @GetMapping("/comic/{idComic}")
    public List<Comment> getCommentByIdComic(@PathVariable int idComic){
        return commentService.getAllCommentByIdCommic(idComic);
    }

    //Them Comment
    @PostMapping
    public int addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }

    //Xoa Comment
    @DeleteMapping("/{idComment}")
    public int deleteComment(@PathVariable int idComment){
        return commentService.deleteComment(idComment);
    }
}
