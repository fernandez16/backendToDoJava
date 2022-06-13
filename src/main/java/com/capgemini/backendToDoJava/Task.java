package com.capgemini.backendToDoJava;

import javax.persistence.*;

@Entity
@Table(name= "tasks")
public class Task {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private boolean done;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getDone() {
		return done;
	}
	
	public void setDone(boolean done) {
		this.done = done;
	}
	

}