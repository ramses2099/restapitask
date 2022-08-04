package com.jprograming.restapitask.configuration;

import com.jprograming.restapitask.model.Task;
import com.jprograming.restapitask.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class TaskConfig {

    @Bean
    CommandLineRunner commandLineRunner(TaskRepository taskRepository) {
        return args -> {
            Task task1 = new Task("Task Test1", LocalDate.now());
            Task task2 = new Task("Task Test2", LocalDate.now());

            taskRepository.saveAll(List.of(task1,task2));
        };
    }
}
