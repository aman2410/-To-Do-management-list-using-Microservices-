package com.exam.ValueObject;

import com.exam.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ResponseTemplateVO {
	
	private User user;
	private ToDo todo;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ToDo getTodo() {
		return todo;
	}
	public void setTodo(ToDo todo) {
		this.todo = todo;
	}
	public ResponseTemplateVO(User user, ToDo todo) {
		super();
		this.user = user;
		this.todo = todo;
	}
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
