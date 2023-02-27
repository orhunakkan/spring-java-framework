package com.example.Spring04Abstraction.repository;

import com.example.Spring04Abstraction.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);

}
