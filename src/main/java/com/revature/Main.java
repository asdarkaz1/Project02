package com.revature;
import com.revature.controller.PostController;
import com.revature.controller.Controller;
import com.revature.controller.CommentController;
import com.revature.dao.ConnectionFactory;
import com.revature.dao.CommentDao;
import com.revature.dao.PostDao;
import com.revature.model.Comment;
import com.revature.model.Post;
import io.javalin.Javalin;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        //actually mapping the endpoints for comment controller

        //actually mapping the endpoints for post controller

        //Controller is an interface that is implemented by these controllers.
        Controller[] controllers ={
                new CommentController(), new PostController()
        };

        for(Controller c : controllers){
            c.mapEndPoints(app);
        }
        app.start(8080);
    }

}