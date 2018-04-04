package com.xebia.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xebia.application.model.Task;
import com.xebia.application.service.TaskService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/task")
	public ResponseEntity<List<Task>> getAllTasks(){
		return ResponseEntity.ok(taskService.getAllTasks());
	}
	
	@GetMapping("/task/{id}")
	public ResponseEntity<Task> getTask(@PathVariable Long id){
		Task task = taskService.getTask(id);
		if(null != task)
			return ResponseEntity.ok(task);
		else
			return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/task")
	public ResponseEntity<Task> createTask(@RequestBody Task task){
		return ResponseEntity.ok(taskService.createOrUpdateTask(task));
	}
	
	@PutMapping("/task")
	public ResponseEntity<Task> updateTask(@RequestBody Task task){
		return ResponseEntity.ok(taskService.createOrUpdateTask(task));
	}
	
	@DeleteMapping("/task/{id}")
	public ResponseEntity<?> deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
		//return new ResponseEntity<Task>(HttpStatus.OK);
		return ResponseEntity.ok(null);
	}
	
}
