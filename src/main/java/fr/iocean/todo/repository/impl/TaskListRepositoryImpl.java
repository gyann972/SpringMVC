package fr.iocean.todo.repository.impl;

import org.springframework.stereotype.Repository;

import fr.iocean.todo.core.JpaRepositoryImpl;
import fr.iocean.todo.model.TaskList;
import fr.iocean.todo.repository.TaskListRepository;

@Repository
public class TaskListRepositoryImpl extends JpaRepositoryImpl<TaskList> implements TaskListRepository {

	@Override
	protected Class<TaskList> getEntityClass() {
		// TODO Auto-generated method stub
		return TaskList.class;
	}

}
