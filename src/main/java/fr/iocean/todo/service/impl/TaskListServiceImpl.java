package fr.iocean.todo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.iocean.todo.model.TaskList;
import fr.iocean.todo.repository.TaskListRepository;
import fr.iocean.todo.service.TaskListService;

@Service("taskListService")
public class TaskListServiceImpl implements TaskListService {
	
	@Autowired
	private TaskListRepository taskListRepo;
	
	@Override
	public TaskList findTaskListById(int id) {
		// TODO Auto-generated method stub
		return this.taskListRepo.findOne(id);
	}

}
