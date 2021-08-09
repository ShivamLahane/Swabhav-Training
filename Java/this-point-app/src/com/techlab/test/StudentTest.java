package com.techlab.test;

import com.techlab.model.Student;

public class StudentTest 
{
	static int noOfObjects;
	public static void main (String args[])
	{
		Student harry = new Student(1, "Harry Potter", 11);
		Student ron = new Student(2, "Ronald Weasly");
		printInfo(harry);
		printInfo(ron);
	}

	private static void printInfo(Student obj) 
	{
		// TODO Auto-generated method stub
		System.out.println("Id :" + obj.getId());
		System.out.println("Name :" + obj.getName());
		System.out.println("Age :" + obj.getAge());
		System.out.println("HachCode :" + obj.hashCode());
		System.out.println("---------------------------");
	}
}
