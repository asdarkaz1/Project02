package com.revature.controller;

import com.revature.dao.CommentDao;
import io.javalin.Javalin;

public class PostController implements Controller {

    //Mapping endpoints for posting.
    private PostController postDao = new PostController();
    public void mapEndPoints(Javalin app){

        app.post("/post", (ctx) -> {

        });

        app.get("/post", (ctx) -> {


        });


    }



}
