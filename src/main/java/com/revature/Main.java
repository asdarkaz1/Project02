package com.revature;

import com.revature.controller.Controller;
//import com.revature.controller.PostController;
import com.revature.controller.UserAuthenticationController;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start();

        Controller[] controllers ={new UserAuthenticationController()};

        for(Controller c : controllers){
            c.mapEndPoints(app);
        }

        app.start(8080);
    }

}
