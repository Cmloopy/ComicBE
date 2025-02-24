package com.cmloopy.comic.service;

import com.cmloopy.comic.model.Comment;
import com.cmloopy.comic.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    //Lay Comment theo Chapter
    public List<Comment> getCommentByIdChapter(int idChapter){
        return commentRepository.getAllComment(idChapter);
    }

    //Lay Comment theo Comic
    public List<Comment> getAllCommentByIdCommic(int idComic){
        return commentRepository.getAllCommentByIdComic(idComic);
    }

    //Them Comment
    public int addComment(Comment comment){
        return commentRepository.addComment(comment);
    }

    //Xoa Comment
    public int deleteComment(int idComment){
        return commentRepository.deleteComment(idComment);
    }
}
