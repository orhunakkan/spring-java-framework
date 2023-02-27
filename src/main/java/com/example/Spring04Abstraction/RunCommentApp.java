package com.example.Spring04Abstraction;

import com.example.Spring04Abstraction.model.Comment;
import com.example.Spring04Abstraction.service.CommentService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import com.example.Spring04Abstraction.config.CommentConfig;

public class RunCommentApp {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setText("Hello World!");
        comment.setAuthor("John Doe");

        ApplicationContext context = new AnnotationConfigApplicationContext(CommentConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

        ((AnnotationConfigApplicationContext) context).close();

    }
}
