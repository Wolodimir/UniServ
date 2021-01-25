package com.spring.uniserv.controller;

import com.spring.uniserv.model.User;
import com.spring.uniserv.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MainController {

    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public List<User> getSomeJson(){
                return userService.getUsers();
    }

    @PostMapping("/")
    public void registerNewUser(@RequestBody User user){
        userService.addNewUser(user);
    }
}
