package fr.iocean.todo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.iocean.todo.core.Model;

@Entity
public class TaskList implements Model{

	private static final long serialVersionUID = 7111294686372496565L;

	@Id
	@GeneratedValue
	@SequenceGenerator(name="seq_todo_list", sequenceName="seq_todo_list", allocationSize=1)
	private int id;
	
	@JsonIgnore
	@ManyToOne
	private Usr user;
	private String label;
	private int status;
	
	@OneToMany(mappedBy = "taskList", fetch = FetchType.EAGER)
	private List<Task> tasks;
	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}
	
	public Usr getUser() {
		return user;
	}

	public void setUser(Usr user) {
		this.user = user;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
