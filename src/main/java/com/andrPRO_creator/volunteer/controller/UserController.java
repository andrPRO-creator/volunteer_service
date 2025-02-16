package com.andrPRO_creator.volunteer.controller;

import com.andrPRO_creator.volunteer.entity.User;
import com.andrPRO_creator.volunteer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user/create")
    public void createUser(@RequestBody User user){
        userService.createUser(user);
    }
}
