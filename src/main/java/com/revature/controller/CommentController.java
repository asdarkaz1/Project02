package com.revature.controller;

import com.revature.dao.CommentDao;
import com.revature.model.Comment;
import io.javalin.Javalin;

import java.util.List;

public class CommentController implements Controller{

    //Map your endpoints separate your resources based on different endpoint mappings.
    private CommentDao commentDao = new CommentDao();
    public void mapEndPoints(Javalin app){

        app.post("/comments", (ctx) -> {

        });

        app.get("/comments", (ctx) -> {


        });


    }

}
