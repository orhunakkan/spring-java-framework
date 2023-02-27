package com.example.Spring04Abstraction.repository;

import org.springframework.stereotype.Component;

import com.example.Spring04Abstraction.model.Comment;

@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment in DB: " + comment);
    }
}
