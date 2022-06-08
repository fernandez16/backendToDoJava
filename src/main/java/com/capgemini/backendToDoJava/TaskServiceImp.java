package com.capgemini.backendToDoJava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImp implements TaskService {

	@Autowired
	private TaskRepository repository;
	
	@Override
	public List<Task> list() {		
		return repository.findAll();
	}

	@Override
	public Task listId(int id) {
		return repository.findById(id);
	}

	@Override
	public Task edit(Task p) {
		return repository.save(p);
	}

	@Override
	public Task add(Task p) {
		return repository.save(p);
	}

	@Override
	public void delete(int id) {
	Task p=repository.findById(id);
	if(p!=null) {
		repository.delete(p);
	}

	}

}
