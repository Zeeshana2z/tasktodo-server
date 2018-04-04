package com.xebia.application.service;

import java.util.List;

import com.xebia.application.model.Task;

public interface TaskService {
	
	public List<Task> getAllTasks();
	
	public Task getTask(Long taskId);
	
	public Task createOrUpdateTask(Task task);
	
	public void deleteTask(Long taskId);

}
