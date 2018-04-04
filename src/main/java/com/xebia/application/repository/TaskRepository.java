package com.xebia.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xebia.application.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

}
