package com.techlab.student.test;

import java.util.HashSet;
import java.util.Set;

import com.techlab.model.Student;

public class HashSetStudentTest	
{

	public static void main(String[] args) 
	{
		Set<Student> set = new HashSet<Student>();
		// create or add
		set.add(new Student(1, "abc", 10.0, "a"));
		set.add(new Student(2, "cbd", 9.0, "b"));
		set.add(new Student(1, "shi", 9, "a"));
		// read
		for (Student student : set)
		{
			System.out.println(student);
		}
	}
}
