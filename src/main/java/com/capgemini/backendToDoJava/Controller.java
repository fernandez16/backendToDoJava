package com.capgemini.backendToDoJava;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/tasks")
public class Controller {

	@Autowired
	TaskService service;

	@GetMapping
	public List<Task> list() {
		return service.list();
	}

	@PostMapping
	public Task add(@RequestBody Task p) {
		return service.add(p);
	}

	@PutMapping(path = { "/{id}" })
	public Task edit(@RequestBody Task p, @PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}

}
