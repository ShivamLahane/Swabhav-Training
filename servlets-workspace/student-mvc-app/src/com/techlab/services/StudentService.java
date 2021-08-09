package com.techlab.services;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.Student;

public class StudentService
{
	private List<Student> students = new ArrayList<Student>();
	
	public StudentService()
	{
		students.add(new Student("Shivam", 12, 8.0, "Panvel"));
		students.add(new Student("Nikhil", 21, 9.0, "Kalyan"));
		students.add(new Student("Deepak", 13, 9.0, "Panvel"));
		students.add(new Student("Gayatri", 16, 10.0, "Mumbai"));
	}
	
	public List<Student> getStudents()
	{
		return students;
	}
	
	public void addStudent(Student student)
	{
		students.add(student);
	}
	
	public int getStudentCount()
	{
		return students.size();
	}
}
