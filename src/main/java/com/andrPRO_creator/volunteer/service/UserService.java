package com.andrPRO_creator.volunteer.service;

import com.andrPRO_creator.volunteer.entity.User;
import com.andrPRO_creator.volunteer.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public void createUser(User user) {
        User u = new User();
        u.setName(user.getName());
        u.setAddress(user.getAddress());
        userRepo.save(u);
    }
}
