package com.techlabs.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	private String name;
	private int rollNo;
	private double cgpa;
	private String location;
	@Id
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

//	public Student(String name, int rollNo, double cgpa, String location)
//	{
//		this.id = UUID.randomUUID().toString();
//		this.name = name;
//		this.rollNo = rollNo;
//		this.cgpa = cgpa;
//		this.location = location;
//	}
//	
//	public Student(String id, String name, int rollNo, double cgpa, String location)
//	{
//		this.id = id;
//		this.name = name;
//		this.rollNo = rollNo;
//		this.cgpa = cgpa;
//		this.location = location;
//	}
}
