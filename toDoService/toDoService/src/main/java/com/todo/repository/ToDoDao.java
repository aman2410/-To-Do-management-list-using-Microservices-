package com.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.entity.ToDo;

@Repository
public interface ToDoDao extends JpaRepository<ToDo, Long> {

	
	

	
	

}
