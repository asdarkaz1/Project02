package com.revature.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://34.70.219.149:5432/postgres";
        String username = "postgres";
        String password = "password"; // change to environment variables

        return DriverManager.getConnection(url, username, password);
    }
}
