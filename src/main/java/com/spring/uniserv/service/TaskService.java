package com.spring.uniserv.service;

import com.spring.uniserv.dao.TaskRepo;
import com.spring.uniserv.model.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Task> getTasks(){
        return taskRepo.findAll();
    }

    public void addNewTask(Task task){
        taskRepo.save(task);
    }

    public void deleteTask(Task task){
        taskRepo.deleteById(task.getId());
    }
}
