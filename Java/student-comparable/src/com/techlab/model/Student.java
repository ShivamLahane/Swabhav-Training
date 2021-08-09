package com.techlab.model;

public class Student implements Comparable<Student>
{
	@Override
	public String toString()
	{
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", standard=" + standard + "]";
	}

	private int id;
	private String name;
	private double cgpa;
	private String standard;

	public Student(int id, String name, double cgpa, String standard) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.standard = standard;
	}

	public int getId() 
	{
		return id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public double getCgpa() 
	{
		return cgpa;
	}

	public String getStandard()
	{
		return standard;
	}

	@Override
	public int compareTo(Student o)
	{
		return (int) (this.cgpa - o.cgpa);
	}
}