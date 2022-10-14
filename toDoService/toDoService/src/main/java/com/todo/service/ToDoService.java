package com.todo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.entity.ToDo;
import com.todo.repository.ToDoDao;

@Service
public class ToDoService {
	
	@Autowired
	private ToDoDao todoRepository;

	public ToDo saveTodo(ToDo todo) {
		return todoRepository.save(todo);
	}

	public Optional<ToDo> findTodoById(Long projectId) {
		
		return todoRepository.findById(projectId);
	}

	public void deleteTodoById(Long projectId) {
		// TODO Auto-generated method stub
		todoRepository.deleteById(projectId);
		
	}


	

}
