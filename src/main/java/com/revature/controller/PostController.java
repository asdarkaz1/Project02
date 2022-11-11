package com.revature.controller;

import com.revature.model.Post;
import com.revature.service.PostService;
import io.javalin.Javalin;

import java.util.List;

public class PostController implements Controller {

        private PostService postService = new PostService();

        public void mapEndPoints(Javalin app) {

            app.post("", (ctx) -> {});
            app.get("", (ctx) -> {});
            app.get("/users/{user_id}/posts", (ctx) ->{
                String userId = ctx.pathParam("user_id");

                try {
                    int uId = Integer.parseInt(userId);
                    List<Post> posts = postService.getAllPostsBelongingToUser(uId);
                    ctx.json(posts);
                    ctx.status(200);

                } catch (NumberFormatException e) {
                    ctx.result("Id "+userId+" must be a valid int!");
                    ctx.status(400);
                }
            });
            app.get("", (ctx) -> {});

        }
}
