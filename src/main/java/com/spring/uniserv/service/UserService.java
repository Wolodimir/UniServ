package com.spring.uniserv.service;

import com.spring.uniserv.dao.UserRepo;
import com.spring.uniserv.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<User> userOptional =  userRepo.findByEmail(user.getEmail());
        if(userOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        userRepo.save(user);
    }
}
