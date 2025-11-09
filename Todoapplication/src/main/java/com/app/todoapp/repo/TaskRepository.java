package com.app.todoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.todoapp.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

}
