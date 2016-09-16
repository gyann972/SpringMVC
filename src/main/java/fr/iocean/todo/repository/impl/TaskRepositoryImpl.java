package fr.iocean.todo.repository.impl;

import org.springframework.stereotype.Repository;

import fr.iocean.todo.core.JpaRepositoryImpl;
import fr.iocean.todo.model.Task;
import fr.iocean.todo.repository.TaskRepository;

@Repository
public class TaskRepositoryImpl extends JpaRepositoryImpl<Task> implements TaskRepository {

	@Override
	protected Class<Task> getEntityClass() {
		// TODO Auto-generated method stub
		return Task.class;
	}

}
