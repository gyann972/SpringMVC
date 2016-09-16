package fr.iocean.todo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CascadeType;
import org.hibernate.engine.internal.Cascade;

import fr.iocean.todo.core.Model;

@Entity
public class Usr implements Model{

	private static final long serialVersionUID = -2885009665185962268L;

	@Id
	@GeneratedValue
	@SequenceGenerator(name="seq_usr", sequenceName="seq_usr",allocationSize=1)
	private int id;
	
	private String login;
	private String password;
	private String firstname;
	private String lastname;
	
//	@OneToMany(mappedBy="user", cascade={CascadeType.DELETE})
	@OneToMany(mappedBy="user", fetch = FetchType.EAGER)
	private List<TaskList> todoList;
	
	@Override	public int getId() {		return id;	}
	@Override	public void setId(int id) {		this.id = id;	}
	public String getLogin() {		return login;	}
	public void setLogin(String login) {		this.login = login;	}
	public String getPassword() {		return password;	}
	public void setPassword(String password) {		this.password = password;	}
	public String getFirstname() {		return firstname;	}
	public void setFirstname(String firstname) {		this.firstname = firstname;	}
	public String getLastname() {		return lastname;	}
	public void setLastname(String lastname) {		this.lastname = lastname;	}

}
