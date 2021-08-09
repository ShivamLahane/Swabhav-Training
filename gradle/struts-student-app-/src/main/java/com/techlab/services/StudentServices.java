package com.techlab.services;

import java.util.ArrayList;
import java.util.List;

import com.techlab.models.StudentViewModel;

public class StudentServices 
{
	private List<StudentViewModel> students = new ArrayList<StudentViewModel>();
	
	public List<StudentViewModel> getStudents() 
	{
		return students;
	}

	public void setStudents(List<StudentViewModel> students) 
	{
		this.students = students;
	}
	
	public void addStudent(StudentViewModel student)
	{
		students.add(student);
	}

	public StudentServices()
	{
 		StudentViewModel student = new StudentViewModel();
		student.setRollNo(1);
		student.setName("Shivam");
		student.setCgpa(10.0);
		students.add(student);
		
		student = new StudentViewModel();
		student.setRollNo(2);
		student.setName("ADMHKL");
		student.setCgpa(10.0);
		students.add(student);
	}
}
