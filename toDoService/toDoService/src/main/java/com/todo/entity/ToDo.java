package com.todo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class ToDo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projectId;
	private String projectName;
	private String projectDisc;
	private Boolean completed;
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectDisc() {
		return projectDisc;
	}
	public void setProjectDisc(String projectDisc) {
		this.projectDisc = projectDisc;
	}
	public Boolean getCompleted() {
		return completed;
	}
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	public ToDo(Long projectId, String projectName, String projectDisc, Boolean completed) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectDisc = projectDisc;
		this.completed = completed;
	}
	public ToDo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
