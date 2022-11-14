package com.revature.dao;

import com.revature.ProfileModel.User;
import org.postgresql.Driver;

import java.sql.*;

import com.revature.util.ConnectionFactory;
import org.postgresql.util.PSQLException;

public class ProfileDao {

    public User viewProfile(int id) throws SQLException {

        try(Connection connection =  ConnectionFactory.createConnection()) {
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM users WHERE password = ?");
            pstmt.setInt(1, id);

            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                String userName = rs.getString("username");
                String passWord = rs.getString("password");
                String email = rs.getString("email");
                String interest = rs.getString("interest");
                return new User(firstName, lastName, userName,passWord, email,interest);
            }else{
                return null;
               }
          }

        }
    }

