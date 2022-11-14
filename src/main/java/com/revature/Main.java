package com.revature;
import com.revature.ProfileModel.User;
import com.revature.controller.CommentController;
import com.revature.controller.Controller;
import com.revature.controller.PostController;
import com.revature.controller.ProfileController;
import com.revature.util.ConnectionFactory;
import io.javalin.Javalin;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Main {

    public static void main(String[] args) {

        //configuring cors policy so that we are able to access the endpoints from another machine.
        //Cross Origin resource sharing. Two different origins 8080 vs. 5500 on the browser.
        //need to use HTTP to go around CORS policy
        Javalin app = Javalin.create( config -> { config.plugins.enableCors((cors) -> cors.add(it -> {
                    it.defaultScheme = "http";
                    it.allowHost("127.0.0.1:5500");
                    it.allowCredentials = true;
                }
        ));});

        Controller[] controllers = {new ProfileController(), new PostController()};
        for(Controller c : controllers){
            c.mapEndPoints(app);
        }
        app.start(8080);



    }
}