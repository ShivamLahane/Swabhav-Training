package com.techlab.models;

public class StudentViewModel
{
	private String name;
	private int rollNo;
	private double cgpa;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getRollNo() 
	{
		return rollNo;
	}
	
	public void setRollNo(int rollNo) 
	{
		this.rollNo = rollNo;
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
