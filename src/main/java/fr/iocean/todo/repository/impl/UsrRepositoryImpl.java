package fr.iocean.todo.repository.impl;

import org.springframework.stereotype.Repository;

import fr.iocean.todo.core.JpaRepositoryImpl;
import fr.iocean.todo.model.Usr;
import fr.iocean.todo.repository.UsrRepository;

@Repository
public class UsrRepositoryImpl extends JpaRepositoryImpl<Usr> implements UsrRepository{

	@Override
	protected Class<Usr> getEntityClass() {		return Usr.class;	}

}
