package com.spring.uniserv.service;

import com.spring.uniserv.dao.UserRepo;
import com.spring.uniserv.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public void addNewUser(User user) {
        System.out.println(user);
    }
}
