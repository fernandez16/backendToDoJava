package com.capgemini.backendToDoJava;

import java.util.List;

public interface TaskService {
	 List<Task> list();
	 Task listId(int id);
	 Task add(Task p);
	 Task edit(Task p);
	 void delete(int id);
}
