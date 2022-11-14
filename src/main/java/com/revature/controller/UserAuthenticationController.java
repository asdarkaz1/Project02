package com.revature.controller;

import com.revature.dto.UserLoginCredentials;
import com.revature.dto.UserMessage;
import com.revature.model.User;
import com.revature.service.UserService;
import io.javalin.Javalin;
import jakarta.servlet.http.HttpSession;

public class UserAuthenticationController implements Controller{

    private UserService userService = new UserService();
    public void mapEndPoints(Javalin app) {
        app.post("/login", (ctx) -> {
            UserLoginCredentials credentials = ctx.bodyAsClass(UserLoginCredentials.class);

            if (credentials.getUsername() == null || credentials.getEmail() == null || credentials.getPassword() == null) {
                ctx.result("username and/or email and/or password was not provided");
                ctx.status(400);
            } else {
                User user = userService.login(credentials.getUsername(), credentials.getEmail(), credentials.getPassword());

                //Create an HTTPSession and associate the user object with that session
                //HTTPSessions are used to track which client is sending a particular request
                HttpSession httpSession = ctx.req().getSession();
                httpSession.setAttribute("user_info", user);

                if(user == null) {
                    ctx.status(400);
                    ctx.json(new UserMessage("Invalid login"));
                } else {
                    ctx.json(user); //Send User object in response body in JSON
                }
            }

        });

        app.get("/current-user", (ctx) -> {
            HttpSession httpSession = ctx.req().getSession();
            User loggedInUser = (User) httpSession.getAttribute("user_info");

            if (loggedInUser == null){
                ctx.json(new UserMessage("User is not logged in."));
            } else {
                ctx.json(loggedInUser);
            }
        });
    }
}
