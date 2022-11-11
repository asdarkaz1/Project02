package com.revature;
import com.revature.controller.PostController;
import com.revature.controller.Controller;
import io.javalin.Javalin;
import org.eclipse.jetty.server.Authentication;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        //create Javalin object and return it
        Javalin app = Javalin.create();


        //Endpoint1 (Delete this endpoint);
        app.get("/profile", (ctx) -> {
            //1.Write the JDBC that will go and query the database for all users.
            String url = "jdbc:postgresql://34.134.127.27:5432/postgres";
            String username = "postgres";
            String password = "revstarProject02";
            Driver postgresDriver = new Driver();
            DriverManager.registerDriver(postgresDriver);
            Connection connection = DriverManager.getConnection(url,username, password);
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM Profile");
            ResultSet rs = pstmt.executeQuery();
            List<Profile> allProfiles = new ArrayList<>();
        });



//Endpoint 2
app.post("/profile",(ctx) -> {
    System.out.println("Connected");
    String user_name = ctx.pathParam("username2");
    String email;
    String pass_word;
    String interest;
    String firstname;
    String lastname;
    String url = "jdbc:postgresql://34.134.127.27:5432/postgres";
    String username = "postgres";
    String password = "revstarProject02";
    Driver postgresDriver = new Driver();
    DriverManager.registerDriver(postgresDriver);
    Connection connection = DriverManager.getConnection(url,username, password);
    //Passing information to the query  //4:35
    PreparedStatement pstmt = connection.prepareStatement("INSERT INTO " +
            "users (username, email, password, interest, firstname, lastname) " +
            "VALUES (? ,?, ?, ?, ?, ?)");
    pstmt.setString(1,user_name);

    pstmt.executeQuery();

    //Take JSON information and create a profile object.




});

        //Controller is an interface that is implemented by these controllers.
        Controller[] controllers ={new PostController() };

        for(Controller c : controllers){
            c.mapEndPoints(app);
        }

        app.start(8080);
    }

}