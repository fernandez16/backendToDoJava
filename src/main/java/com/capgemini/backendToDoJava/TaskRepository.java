package com.capgemini.backendToDoJava;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface TaskRepository extends Repository<Task, Integer> {
// dialogar contra el motor de MySQL
// CRUD ... CREATE. READ. UPDATE. DELETE --> ABMC
	List<Task> findAll(); // hago overriding del findAll de Repository
	Task findById(int id);
	Task save(Task p);
	void delete(Task p);	
}
