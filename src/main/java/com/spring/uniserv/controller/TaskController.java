package com.spring.uniserv.controller;

import com.spring.uniserv.model.Task;
import com.spring.uniserv.service.TaskService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@CrossOrigin
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

    @DeleteMapping("/{id}/delete")
    public void deleteTask(@PathVariable(value = "id") Long id){
        taskService.deleteTask(id);
    }

}
