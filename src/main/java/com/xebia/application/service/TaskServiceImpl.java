package com.xebia.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xebia.application.model.Task;
import com.xebia.application.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	@Override
	public Task getTask(Long taskId) {
		return taskRepository.findOne(taskId);
	}

	@Override
	public Task createOrUpdateTask(Task task) {
		return taskRepository.save(task);
	}

	@Override
	public void deleteTask(Long taskId) {
		taskRepository.delete(taskId);

	}

}
