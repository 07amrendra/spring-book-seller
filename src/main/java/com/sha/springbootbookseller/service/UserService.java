package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.User;

import java.util.Optional;

public interface UserService {
    public User saveUser(User user);
    public Optional<User> findByUser(String username);

    void makeAdmin(String username);
}
