package com.revature.controller;

import com.revature.dao.CommentDao;
import com.revature.model.Comment;
import io.javalin.Javalin;

import java.util.List;

public class CommentController implements Controller{

    //Mapping endpoints for commenting
    private CommentDao commentDao = new CommentDao();
    public void mapEndPoints(Javalin app){

        app.post("/comments", (ctx) -> {

        });

        app.get("/comments", (ctx) -> {


        });

    }

}
