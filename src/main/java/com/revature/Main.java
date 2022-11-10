package com.revature;
import com.revature.controller.PostController;
import com.revature.controller.Controller;
import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create();

        //actually mapping the endpoints for comment controller

        //actually mapping the endpoints for post controller

        //Controller is an interface that is implemented by these controllers.
        Controller[] controllers ={new PostController() };

        for(Controller c : controllers){
            c.mapEndPoints(app);
        }

        app.start(8080);
    }

}