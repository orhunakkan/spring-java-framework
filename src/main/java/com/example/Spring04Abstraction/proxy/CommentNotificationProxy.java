package com.example.Spring04Abstraction.proxy;

import com.example.Spring04Abstraction.model.Comment;

public interface CommentNotificationProxy {
    
    void sendComment(Comment comment);

}
