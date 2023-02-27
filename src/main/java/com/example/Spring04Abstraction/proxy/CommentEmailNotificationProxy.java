package com.example.Spring04Abstraction.proxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Spring04Abstraction.model.Comment;

@Component
@Qualifier("EmailNotification")
public class CommentEmailNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending comment to email: " + comment);
    }
}
