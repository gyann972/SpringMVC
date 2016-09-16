package fr.iocean.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.iocean.todo.model.TaskList;
import fr.iocean.todo.service.TaskListService;

@Controller
@RequestMapping("/taskList")
public class TaskListController {
	
	@Autowired
	private TaskListService taskListService;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<TaskList> findById(@PathVariable int id) {
		TaskList taskList = taskListService.findTaskListById(id);
		if (taskList == null) {
			return new ResponseEntity<TaskList>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<TaskList>(taskList, HttpStatus.NOT_FOUND);
		}
	}
}
