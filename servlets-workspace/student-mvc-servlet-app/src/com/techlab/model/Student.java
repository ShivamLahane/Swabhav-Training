package com.techlab.model;

import java.util.UUID;

public class Student
{
	private String name;
	private int rollNo;
	private double cgpa;
	private String location;
	private String id;
	
	public String getName()
	{
		return name;
	}

	public int getRollNo()
	{
		return rollNo;
	}

	public double getCgpa()
	{
		return cgpa;
	}

	public String getLocation()
	{
		return location;
	}

	public String getId()
	{
		return id;
	}

	public Student(String name, int rollNo, double cgpa, String location)
	{
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
		this.location = location;
	}
	
	public Student(String id, String name, int rollNo, double cgpa, String location)
	{
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
		this.location = location;
	}
}
