package com.example.backendclass01.repository;

import com.example.backendclass01.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user=new User("anishur", "California", 21,"male");
        return user;

    }
