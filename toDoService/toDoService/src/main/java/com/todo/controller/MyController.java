package com.todo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.entity.ToDo;
import com.todo.service.ToDoService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/todolist")
@Slf4j
public class MyController {
	
	@Autowired
	ToDoService todoService;
	
	@PostMapping("/")
	public ToDo saveTodolist(@RequestBody ToDo todo) {
		return todoService.saveTodo(todo);
		
	}
	
	@GetMapping("/{id}")
	public Optional<ToDo> findTodoById(@PathVariable("id") Long projectId) {
		return todoService.findTodoById(projectId);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTodoById(@PathVariable("id") Long projectId) {
	    todoService.deleteTodoById(projectId);
	}
	@PutMapping("/edit")
	public void editTodo(@RequestBody ToDo todo) {
		todoService.saveTodo(todo);
	}

}
