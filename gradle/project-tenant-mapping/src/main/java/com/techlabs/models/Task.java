package com.techlabs.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Task
{
	@Id
	private String id;
	
	private String taskTxt;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(nullable = true)
	private Task parentTask;
	
	@OneToMany(mappedBy = "parentTask", cascade = CascadeType.ALL)
	private Set<Task> subTasks;
	
	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getTaskTxt()
	{
		return taskTxt;
	}

	public void setTaskTxt(String taskTxt)
	{
		this.taskTxt = taskTxt;
	}

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public Task getParentTask()
	{
		return parentTask;
	}

	public void setParentTask(Task parentTask)
	{
		this.parentTask = parentTask;
	}

	public Set<Task> getSubTasks()
	{
		return subTasks;
	}

	public void setSubTasks(Set<Task> subTasks)
	{
		this.subTasks = subTasks;
	}

}
