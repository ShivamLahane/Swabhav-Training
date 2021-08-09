package com.techlab.model;

public class Student 
{
	private String name;
	private int rollNo;
	private int greScore;
	private double cgpa;
	private String location;
	
	public double getCgpa()
	{
		return cgpa;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(cgpa) != Double.doubleToLongBits(other.cgpa))
			return false;
		if (greScore != other.greScore)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

	public String getName() 
	{
		return name;
	}

	public int getRollNo() 
	{
		return rollNo;
	}

	public int getGreScore() 
	{
		return greScore;
	}

	public String getLocation() 
	{
		return location;
	}

	public Student(String name, int rollNo, int greScore, double cgpa,String location) 
	{
		this.name = name;
		this.rollNo = rollNo;
		this.greScore = greScore;
		this.cgpa = cgpa;
		this.location = location;
	}
	
	
}
