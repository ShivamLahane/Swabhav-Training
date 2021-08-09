package com.techlab.model;

import java.util.UUID;

public class Student
{
	private String name;
	private int rollNo;
	private double cgpa;
	private String location;
	private UUID id;
	
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

	public UUID getId()
	{
		return id;
	}

	public Student(String name, int rollNo, double cgpa, String location)
	{
		this.id = UUID.randomUUID();
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
		this.location = location;
	}
	
}
