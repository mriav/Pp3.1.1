package com.service;

import com.dao.UserDAO;
import com.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return (List<User>) userDAO;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        UserDAO userDAO = this.userDAO;
    }

    @Override
    @Transactional
    public void updateUser(User user, int id) {

        UserDAO userDAO = this.userDAO;
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return (User) userDAO;
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        UserDAO userDAO = this.userDAO;
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return null;
    }
}
