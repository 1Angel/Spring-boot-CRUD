package com.example.crud.services;

import com.example.crud.entities.Task;
import com.example.crud.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task Create(Task task){
        return taskRepository.save(task);
    }

    @Override
    public List<Task> GetAll(){
        return taskRepository.findAll();
    }

    @Override
    public Task FindByID(Long id){
        return taskRepository.findById(id).get();
    }

    @Override
    public void DeleteByID(Long id){
        taskRepository.deleteById(id);

    }

    @Override
    public Task EditByID(Task task, Long id){
        Task DB = taskRepository.getOne(id);
        DB.setName(task.getName());
        DB.setDescription(task.getDescription());

       return taskRepository.save(DB);


    }
}
