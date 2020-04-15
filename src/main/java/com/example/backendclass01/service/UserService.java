package com.example.backendclass01.service;

import com.example.backendclass01.model.User;
import com.example.backendclass01.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(){
        return userRepository.getUser();

    }
}
