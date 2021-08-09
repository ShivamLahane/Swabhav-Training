package com.techlab.student.test;

import java.util.Set;
import java.util.TreeSet;

import com.techlab.model.Student;

public class TreeSetStudentTest 
{

	public static void main(String[] args) 
	{
		Set<Student> set = new TreeSet<Student>();
		// create or add
		set.add(new Student(1, "abc", 10.0, "a"));
		set.add(new Student(6, "cbd", 9.0, "a"));
		set.add(new Student(1, "Shivam", 6, "a"));
		set.add(new Student(1, "cbd", 5, "b"));
		// read
		for (Student student : set)
		{
			System.out.println(student);
		}
	}

}
