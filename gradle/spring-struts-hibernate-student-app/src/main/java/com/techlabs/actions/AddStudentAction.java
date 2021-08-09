package com.techlabs.actions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.models.Student;
import com.techlabs.services.StudentService;

public class AddStudentAction implements Action
{
	private Student student;
	@Autowired
	private StudentService service = new StudentService();
	private List<Student> students = new ArrayList<Student>();
	
	public List<Student> getStudents() throws Exception 
	{
		return service.getStudents();
	}

	public void setStudents(List<Student> students) 
	{
		this.students = students;
	}

	public StudentService getService() 
	{
		return service;
	}

	public void setService(StudentService service) 
	{
		this.service = service;
	}

	public Student getStudent() 
	{
		return student;
	}

	public void setStudent(Student student) 
	{
		this.student = student;
	}

	@Override
	public String execute() throws Exception 
	{
		return this.SUCCESS;
	}
	
	public String doAdd() throws SQLException
	{
		System.out.println(student.getName());
		if (student.getCgpa() > 10.0 || student.getCgpa() < 0.0 || student.getName().length() == 0)
		{
			return this.ERROR;
		}
		student.setId(UUID.randomUUID().toString());
		service.addStudent(student);
		return this.SUCCESS;
	}
	
}
