package com.techlabs.services;

import java.sql.SQLException;
import java.util.List;

import com.techlabs.repositories.IStudentService;
import com.techlabs.repositories.StudentDbRepository;
import com.techlabs.models.Student;

public class StudentService implements IStudentService
{
	private IStudentService service;
	
	public StudentService() throws Exception
	{
		service = new StudentDbRepository();
	}
	
	public List<Student> getStudents() throws Exception
	{
		return service.getStudents();
	}
	
	public void addStudent(Student student) throws SQLException
	{
		service.addStudent(student);
	}

	public void updateStudent(Student student) throws SQLException
	{
		service.updateStudent(student);
	}

	public void deleteStudent(String id) throws SQLException
	{
		service.deleteStudent(id);
	}
	
}

