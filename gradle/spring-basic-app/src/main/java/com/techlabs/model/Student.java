package com.techlabs.model;

public class Student 
{
	private String name;
	private int rollNo;
	private double cgpa;
	
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
	
	public Student(String name, int rollNo, double cgpa) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.cgpa = cgpa;
	}
	
}
