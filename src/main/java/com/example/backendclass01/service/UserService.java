package com.example.backendclass01.service;

import com.example.backendclass01.model.User;
import com.example.backendclass01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();

    }
// save user
    public User saveUser(User user) {

        return userRepository.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }


    public User updateUser(int userId, User user) {
        return userRepository.updateUser(userId,user);
    }

    public User deleteUser(int userId) {
        return userRepository.deleteUser(userId);
    }
}
