package com.example.todolist;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodolistApplicationTests {

	@Autowired
	private TaskRepository taskRepository;

	@Test
	void testJpa() {
		Task task1 = new Task();
		task1.setItem("첫번째할일");
		task1.setCreatedDate(LocalDateTime.now());

		this.taskRepository.save(task1);
		

	}

}
