package com.student.test;

import com.student.model.Student;

public class StudentTest 
{
	
	public static void printInfo(Student studRef)
	{
		System.out.println("Id: " + studRef.getId());
		System.out.println("Age: " + studRef.getAge());
		System.out.println("Name: " + studRef.getName());
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setId(0);
		s1.setAge(15);
		s1.setName("Tom Marvolo Riddle");
		printInfo(s1);
	}

}
