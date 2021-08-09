package com.techlab.model;

public class Student implements Comparable<Student>
{
	@Override
	public int hashCode() 
	{
		return id;
	}

	@Override
	public boolean equals(Object obj) 
	{
		Student s = (Student) obj;
		return this.standard.equals(s.standard);
	}

	@Override
	public String toString() {
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

	public String getStandard() {
		return standard;
	}

	@Override
	public int compareTo(Student o) 
	{
		if (this.id == o.id && this.standard.equals(o.standard))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
