package com.jprograming.restapitask.service;

import com.jprograming.restapitask.model.Task;
import com.jprograming.restapitask.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task>getTasks(){
        return taskRepository.findAll();
    }
}
