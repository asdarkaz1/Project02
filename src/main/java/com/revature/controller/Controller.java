package com.revature.controller;

import io.javalin.Javalin;

public interface Controller {

//Creating an abstract method to be used for all endpoint mappings.
    public abstract void mapEndPoints(Javalin app);
}
