package com.revature.controller;

import io.javalin.Javalin;

public interface Controller {
    void mapEndPoints(Javalin app);
}
