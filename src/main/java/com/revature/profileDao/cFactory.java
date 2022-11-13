package com.revature.profileDao;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class cFactory {

    public static Connection createConnection() throws SQLException {
        String url = "jdbc:postgresql://34.134.248.69:5432/postgres";
        String username = "postgres";
        String password = "password";
        Driver postgresDriver = new Driver();
        DriverManager.registerDriver(postgresDriver);
        Connection connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
