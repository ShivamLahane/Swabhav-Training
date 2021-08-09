package com.techlabs.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository
public class StudentRepository 
{
	private List<Student> students = new ArrayList<Student>();
	
	public StudentRepository()
	{
		students.add(new Student("Shivam", 1, 10.0));
		students.add(new Student("S", 2, 10.0));
		students.add(new Student("Ssdf", 3, 10.0));
	}

	public List<Student> getStudents()
	{
		return students;
	}
	
}
