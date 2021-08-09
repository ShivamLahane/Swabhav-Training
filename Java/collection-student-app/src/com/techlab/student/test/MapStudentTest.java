package com.techlab.student.test;

import java.util.HashMap;
import java.util.Map.Entry;

import com.techlab.model.Student;

public class MapStudentTest 
{
	public static void main(String[] args) 
	{
		HashMap<Student, Student> map = new HashMap<Student, Student>();
		Student s1 = new Student(1, "Shivam", 5, "a");
		Student s2 = new Student(1, "Gaurav", 5, "a");
		//  add
		map.put(s1, s1);
		map.put(s2, s2);
//		// read
//		System.out.println(map);
//		// update
//		Student s3 = new Student(2, "aslfks", 10, "c");
//		map.put(s3.getId(), s3);
//		// read
//		System.out.println(map);
//		// delete
//		map.remove(s1.getId());
//		// read
		for (Entry<Student, Student> m : map.entrySet())
		{
			System.out.println(m.getKey() + " = "+ m.getValue());
		}
	}
}
