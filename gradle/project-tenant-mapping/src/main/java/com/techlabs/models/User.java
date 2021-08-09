package com.techlabs.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User
{
	private String name;
	@Id
	private String email;
	private String role;
	private String password;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Tenant tenant;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Task> tasks;
	
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public Set<Task> getTasks()
	{
		return tasks;
	}
	public void setTasks(Set<Task> tasks)
	{
		this.tasks = tasks;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getRole()
	{
		return role;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	public Tenant getTenant()
	{
		return tenant;
	}
	public void setTenant(Tenant tenant)
	{
		this.tenant = tenant;
	}
}
