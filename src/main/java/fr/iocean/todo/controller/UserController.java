package fr.iocean.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.iocean.todo.model.Usr;
import fr.iocean.todo.service.UsrService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired private UsrService usrService;
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ResponseEntity<Usr> findById(@PathVariable int id) {
		Usr usr = usrService.findUsrById(id);
		if(usr==null) return new ResponseEntity<Usr>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<Usr>(usr,HttpStatus.OK);
    }



}
