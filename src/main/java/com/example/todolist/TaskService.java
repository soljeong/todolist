package com.example.todolist;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getList() {
        return this.taskRepository.findAll();
    }
}
