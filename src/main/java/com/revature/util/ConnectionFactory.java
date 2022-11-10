package com.revature.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection createConnection() throws SQLException {
        //Database credentials should not be hard coded use system environment
        //variables. 20:53 (restart application after)
        String url = System.getenv("");
        String username = System.getenv("");
        String password = System.getenv("");

        //Instantiating connection object
        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;

    }

}
