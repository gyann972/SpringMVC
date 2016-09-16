package fr.iocean.todo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.iocean.todo.model.Usr;
import fr.iocean.todo.repository.UsrRepository;
import fr.iocean.todo.service.UsrService;

@Service("usrService")
public class UsrServiceImpl implements UsrService{

	@Autowired private UsrRepository usrRepository;

	@Override
	public Usr findUsrById(int id) {
		return usrRepository.findOne(id);
	} 

}
