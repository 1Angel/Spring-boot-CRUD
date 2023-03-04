package com.example.crud.services;

import com.example.crud.entities.Task;

import java.util.List;

public interface TaskService {

    public Task Create(Task task);

    public List<Task> GetAll();

    public Task FindByID(Long id);

    public void DeleteByID(Long id);

    public Task EditByID(Task task, Long id);
}
