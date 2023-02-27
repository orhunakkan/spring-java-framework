package com.example.Spring04Abstraction.proxy;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.Spring04Abstraction.model.Comment;

@Component
@Qualifier("PushNotification")
public class CommentPushNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending push notification: " + comment.getText());
    }
    
}
