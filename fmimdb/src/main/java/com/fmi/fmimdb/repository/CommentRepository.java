package com.fmi.fmimdb.repository;

import com.fmi.fmimdb.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {

    private List<Comment> commentList = new ArrayList<>();

    public void addComment(Comment comment) {
        commentList.add(comment);
        System.out.println("Added comment " + comment.toString());
    }

    public void removeComment(Comment comment) {
        commentList.remove(comment);
        System.out.println("Removed comment " + comment.toString());
    }

    public void updateComment(Comment originalComment, Comment updatedComment) {
        commentList.set(commentList.indexOf(originalComment), updatedComment);
        System.out.println("Updated comment " + originalComment.toString() + " to " + updatedComment.toString());
    }

    public List<Comment> getAllComments() {
        return commentList;
    }

}
