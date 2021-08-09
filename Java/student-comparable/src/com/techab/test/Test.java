package com.techab.test;

import java.util.ArrayList;
import java.util.Collections;

import com.techlab.model.Student;

public class Test
{
	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(3, "Shivam", 10, "a"));
		list.add(new Student(2, "Shivam", 9, "a"));
		list.add(new Student(1, "Shivam", 8, "a"));
		Collections.sort(list);
		for (Student s : list) System.out.println(s);
	}
}
