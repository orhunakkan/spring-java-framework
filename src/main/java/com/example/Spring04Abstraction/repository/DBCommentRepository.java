package com.example.Spring04Abstraction.repository;

public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(String comment) {
        System.out.println("Storing comment in DB: " + comment);
    }
}
