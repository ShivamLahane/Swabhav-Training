package com.student.model;

public class Student 
{
	private int id,age;
	private String name;
	
	private static final int minId = 1, maxId = 50, minAge = 16, maxAge = 21;
	
	public void setId(int pId)
	{
		if (pId < minId || pId > maxId)
		{
			id = 100;
		}
		else
		{
			id = pId;
		}
	}
	
	public void setAge(int pAge)
	{
		if (pAge < minAge || pAge > maxAge)
		{
			age = minAge;
		}
		else
		{
			age = pAge;
		}
	}
	
	public void setName(String pName)
	{
		name = pName;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
}
