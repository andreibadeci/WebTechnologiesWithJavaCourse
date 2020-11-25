package com.fmi.fmimdb.service;

import com.fmi.fmimdb.model.Comment;
import com.fmi.fmimdb.repository.CommentRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CommentService {

    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void addCast(Comment comment) {
        commentRepository.addComment(comment);
    }

    public void removeCast(Comment comment) {
        commentRepository.removeComment(comment);
    }

    public void updateMovie(Comment originalComment, Comment updatedComment) {
        commentRepository.updateComment(originalComment, updatedComment);
    }

    public List<Comment> getAllMovies() {
        return commentRepository.getAllComments();
    }

}
