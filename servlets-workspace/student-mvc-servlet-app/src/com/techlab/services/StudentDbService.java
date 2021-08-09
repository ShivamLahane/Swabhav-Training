package com.techlab.services;

import java.sql.SQLException;
import java.util.List;

import com.techlab.dbservice.IStudentService;
import com.techlab.dbservice.StudentDbRepository;
import com.techlab.model.Student;

public class StudentDbService
{
	private IStudentService service;
	
	public StudentDbService() throws Exception
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
