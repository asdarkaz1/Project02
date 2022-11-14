package com.revature.controller;

import com.revature.ProfileModel.User;
import io.javalin.Javalin;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProfileController implements Controller{

    public void mapEndPoints(Javalin app) {


        //READ ENDPOINT.
        app.post("/profileview", (ctx) -> {
            System.out.println("Queried");
            String url = "jdbc:postgresql://34.134.248.69:5432/postgres";
            String username = "postgres";
            String password = "password";
            Driver postgresDriver = new Driver();
            DriverManager.registerDriver(postgresDriver);
            Connection connection = DriverManager.getConnection(url, username, password);
            User u = ctx.bodyAsClass(User.class);
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM users WHERE password = ?");
            pstmt.setString(1, u.getPassWord());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String userName = rs.getString("username");
                String passWord = rs.getString("password");
                String email = rs.getString("email");
                String interest = rs.getString("interest");
                ctx.json(new User(firstName, lastName, userName, passWord, email, interest));
                ctx.status(200);
            } else {
                ctx.status(400);
                ctx.result("Sorry, not found in our database.");
            }

        });

        //UPDATE ENDPOINT.
        app.post("/profileupdate", (ctx) -> {
            System.out.println("Updated");
            String url = "jdbc:postgresql://34.134.248.69:5432/postgres";
            String username = "postgres";
            String password = "password";
            Driver postgresDriver = new Driver();
            DriverManager.registerDriver(postgresDriver);
            Connection connection = DriverManager.getConnection(url, username, password);
            User u = ctx.bodyAsClass(User.class);
            PreparedStatement pstmt = connection.prepareStatement(
                    "Update users set username = ? , email = ? ,interest = ? ,firstname= ? , lastname= ? where password = ?;");
            pstmt.setString(1, u.getUsername());
            pstmt.setString(2, u.getEmail());
            pstmt.setString(3, u.getInterest());
            pstmt.setString(4, u.getFirstname());
            pstmt.setString(5, u.getLastname());
            pstmt.setString(6, u.getPassWord());

            int numberOfRecordsUpdated = pstmt.executeUpdate();
            ctx.result(numberOfRecordsUpdated + " record(s) updated");

        });

//DELETE ENDPOINT
        app.post("/profiledelete", (ctx) -> {
            System.out.println("Deleted");
            String url = "jdbc:postgresql://34.134.248.69:5432/postgres";
            String username = "postgres";
            String password = "password";
            Driver postgresDriver = new Driver();
            DriverManager.registerDriver(postgresDriver);
            Connection connection = DriverManager.getConnection(url, username, password);
            User u = ctx.bodyAsClass(User.class);
            PreparedStatement pstmt = connection.prepareStatement("DELETE from users where password= ?;");
            pstmt.setString(1, u.getPassWord());
            int recordsUpdated = pstmt.executeUpdate();
            ctx.result(recordsUpdated + " record(s) deleted.");

        });
    }
}
