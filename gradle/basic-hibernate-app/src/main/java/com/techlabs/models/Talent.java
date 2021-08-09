package com.techlabs.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Talent 
{
	@Id
	private int id;
	private String name;
	private double cgpa;
	
	public Talent()
	{
		
	}
	
	public Talent(int id, String name, double cgpa) 
	{
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public double getCgpa()
	{
		return cgpa;
	}
	
	public void setCgpa(double cgpa) 
	{
		this.cgpa = cgpa;
	}
}
