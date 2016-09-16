package fr.iocean.todo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.iocean.todo.model.Task;
import fr.iocean.todo.model.TaskList;
import fr.iocean.todo.repository.TaskRepository;
import fr.iocean.todo.service.TaskListService;
import fr.iocean.todo.service.TaskService;

@Service("taskService")
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepo;

	@Override
	public Task findTaskById(int id) {
		// TODO Auto-generated method stub
		return this.taskRepo.findOne(id);
	}
	

}
