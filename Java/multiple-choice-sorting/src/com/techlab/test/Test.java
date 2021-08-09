package com.techlab.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.techlab.comparators.*;

public class Test 
{
	public static void main(String[] args) 
	{
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(5, "abcd", 10.0, "a"));
		list.add(new Student(6, "cbd", 9.0, "a"));
		list.add(new Student(3, "Shivam", 6, "a"));
		list.add(new Student(2, "cbd", 5, "b"));
		
		System.out.println("Sort by Id: ");
		Collections.sort(list, new SortById());
		for(Student s : list) System.out.println(s);
		
		System.out.println("Sort by Name: ");
		Collections.sort(list, new SortByName());
		for(Student s : list) System.out.println(s);
		
		System.out.println("Sort by Cgpa: ");
		Collections.sort(list, new SortByCgpa());
		for(Student s : list) System.out.println(s);
	}
}