package com.example.Spring04Abstraction.proxy;

import com.example.Spring04Abstraction.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment to email: " + comment.getText());
    }
}
