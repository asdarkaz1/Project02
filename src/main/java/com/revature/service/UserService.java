package com.revature.service;

import com.revature.dao.UserDAO;
import com.revature.model.User;

import java.sql.SQLException;

public class UserService {

    private UserDAO userDAO = new UserDAO();
    public User login(String username, String email, String password) throws SQLException {
        return userDAO.findUserByUsernameEmailAndPassword(username, email, password);
    }
}
