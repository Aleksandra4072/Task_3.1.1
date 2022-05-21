package com.example.task311.service;

import com.example.task311.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void removeUser(long id);
    User getUserById(long id);
    List<User> allUsers();
}
