package com.andrPRO_creator.volunteer.controller;

import com.andrPRO_creator.volunteer.entity.Task;
import com.andrPRO_creator.volunteer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @Autowired
    TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping("/task/create")
    public void createTask(@RequestBody Task task){
        taskService.createTask(task);
    }

    @PatchMapping("/task/id={id}")
    public void changeStatus(@PathVariable Long id){
        taskService.changeStatus(id);
    }

    @DeleteMapping("/task/id={id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
