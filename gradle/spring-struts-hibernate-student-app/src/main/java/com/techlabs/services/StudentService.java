package com.techlabs.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.repositories.StudentDbRepository;
import com.techlabs.models.Student;

@Service
public class StudentService
{
	@Autowired
	private StudentDbRepository repository;
	
	public StudentService()
	{
		System.out.println("created StudentService");
	}
	
	public List<Student> getStudents() throws Exception
	{
		return repository.getStudents();
	}
	
	public void addStudent(Student student) throws SQLException
	{
		repository.addStudent(student);
	}

	public void updateStudent(Student student) throws SQLException
	{
		repository.updateStudent(student);
	}

	public void deleteStudent(String id) throws SQLException
	{
		repository.deleteStudent(id);
	}
}

