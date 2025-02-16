package com.andrPRO_creator.volunteer.service;

import com.andrPRO_creator.volunteer.entity.Task;
import com.andrPRO_creator.volunteer.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    TaskRepository taskRepository;

    public void createTask(Task task) {
        Task t = new Task();
        t.setDate(task.getDate());
        t.setDescription(task.getDescription());
        t.setStatus(task.getStatus());
        t.setUser_id(task.getUser_id());
        taskRepository.save(t);
    }

    public void changeStatus(Long id) {
        Task task = taskRepository.findById(id).orElse(null);
            if (task.getStatus()==false){
                task.setStatus(true);
                taskRepository.save(task);
                System.out.println("Волонтер откликнулся на вашу заявку!");
            } else  {
                task.setStatus(false);
                taskRepository.save(task);
                System.out.println("К сожалению волонтер отказался :(  \n " +
                        "Не переживайте, скоро на вашу заявку откликнутся снова");
            }
        }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}

