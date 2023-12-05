package com.example.todolist;

import java.util.List;
import java.time.LocalDateTime;


import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getList() {
        return this.taskRepository.findAll();
    }

    public void create(String item) {
        Task task = new Task();
        task.setItem(item);
        task.setCreatedDate(LocalDateTime.now());
        this.taskRepository.save(task);
    }

    public void modify(Integer id) {
        Task task = this.taskRepository.findById(id).orElseThrow();
        task.setStatus(true);
        this.taskRepository.save(task);
    }

}
