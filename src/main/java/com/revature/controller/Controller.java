package com.revature.controller;

import io.javalin.Javalin;

public interface Controller {
    //public abstract method to be used for all endpoint mappings.
    void mapEndPoints(Javalin app);
}
