package com.example.crud.controller;

import com.example.crud.entities.Task;
import com.example.crud.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/create")
    public Task Create(@RequestBody Task task){
        return taskService.Create(task);

    }

    @GetMapping("/list")
    public List<Task> Get(){
        return taskService.GetAll();
    }

    @GetMapping("/list/{id}")
    public Task FindById(@PathVariable("id") Long id){
        return taskService.FindByID(id);
    }


    @DeleteMapping("/delete/{id}")
    public String DeleteById(@PathVariable("id") Long id){
         taskService.DeleteByID(id);
         return "the task has been deleted";
    }

    @PutMapping("/edit/{id}")
    public Task EditById(@RequestBody Task task, @PathVariable("id") Long id){
        return  taskService.EditByID(task, id);
    }
}
