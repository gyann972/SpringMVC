package fr.iocean.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.iocean.todo.model.Task;
import fr.iocean.todo.service.TaskService;

@Controller
@RequestMapping("/task")
public class TaskController {

	@Autowired
	public TaskService taskService;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<Task> findById(@PathVariable int id) {
		Task task = taskService.findTaskById(id);
		if (task == null) {
			return new ResponseEntity<Task>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Task>(task, HttpStatus.NOT_FOUND);
		}
	}
	
}
