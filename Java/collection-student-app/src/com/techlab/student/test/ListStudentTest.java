package com.techlab.student.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Student;

public class ListStudentTest 
{

	public static void main(String[] args) 
	{
		List<Student> list = new ArrayList<Student>();
		// add
		list.add(new Student(1, "abc", 10.0, "a"));
		list.add(new Student(2, "abc", 9, "b"));
		list.add(new Student(3,"cbd", 7.5, "c"));
		// read
		for (Student student : list)
		{
			System.out.println(student);
		}
		// update 
		list.add(2, new Student(4, "jdg", 8, "a"));
		// Read
		System.out.println("After update reading...");
		for (Student student : list)
		{
			System.out.println(student);
		}
		// delete
		list.remove(2);
		// Read
		System.out.println("After delete reading...");
		for (Student student : list)
		{
			System.out.println(student);
		}
	}

}
