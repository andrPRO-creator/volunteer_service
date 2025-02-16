package com.andrPRO_creator.volunteer.repository;

import com.andrPRO_creator.volunteer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
