package com.andrPRO_creator.volunteer.repository;

import com.andrPRO_creator.volunteer.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
