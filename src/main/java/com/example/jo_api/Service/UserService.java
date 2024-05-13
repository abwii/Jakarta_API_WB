package com.example.jo_api.Service;

import com.example.jo_api.Entity.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public User getUser(Long id);
    public List<User> getUsers();
    public String deleteUser(Long id);
    public User updateUser(Long id, User user);
}
