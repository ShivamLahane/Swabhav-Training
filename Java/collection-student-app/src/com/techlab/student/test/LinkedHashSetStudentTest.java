package com.techlab.student.test;

import java.util.LinkedHashSet;
import java.util.Set;

import com.techlab.model.Student;

public class LinkedHashSetStudentTest 
{

	public static void main(String[] args) 
	{
		Set<Student> set = new LinkedHashSet<Student>();
		// create or add
		Student objectToDelete = new Student(3, "abc", 10.0, "a");
		set.add(new Student(1, "abc", 10.0, "a"));
		set.add(new Student(2, "cbd", 9.0, "b"));
		set.add(new Student(1, "abc", 10.0, "a"));
		set.add(objectToDelete);
		// read
		for (Student student : set)
		{
			System.out.println(student);
		}
		// delete
	}

}
