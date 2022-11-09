package com.revature.controller;

import com.revature.dao.CommentDao;
import io.javalin.Javalin;

public class PostController implements Controller {

    //Map your endpoints separate your resources based on different endpoint mappings.
    private PostController postDao = new PostController;
    public void mapEndPoints(Javalin app){

        app.post("/post", (ctx) -> {

        });

        app.get("/post", (ctx) -> {


        });


    }



}
