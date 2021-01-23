package com.spring.uniserv.controller;

import com.spring.uniserv.model.Task;
import com.spring.uniserv.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @GetMapping
    public List<Task> allTasks(){
        return taskService.getTasks();
    }

    @PostMapping
    public void addNewTask(@RequestBody Task task){
        taskService.addNewTask(task);
    }

    @DeleteMapping
    public void deleteTask(@RequestBody Task task){
        taskService.deleteTask(task);
    }
}
