package fr.iocean.todo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import fr.iocean.todo.core.Model;

@Entity
public class Task implements Model {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@SequenceGenerator(name="seq_task", sequenceName="seq_task", allocationSize=1)
	private int id;
	
	private String title;
	private String content;
	private Date target_date;
	private Date done_date;
	
	@JsonIgnore
	@ManyToOne
	private TaskList taskList;
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTarget_date() {
		return target_date;
	}

	public void setTarget_date(Date target_date) {
		this.target_date = target_date;
	}

	public Date getDone_date() {
		return done_date;
	}

	public void setDone_date(Date done_date) {
		this.done_date = done_date;
	}

	public TaskList getTaskList() {
		return taskList;
	}

	public void setTaskList(TaskList taskList) {
		this.taskList = taskList;
	}

}
