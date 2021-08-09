package com.techlabs.actions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.models.Student;
import com.techlabs.services.StudentService;

public class EditStudentAction implements Action
{
	private Student student;
	@Autowired
	private StudentService service = new StudentService();
	private List<Student> students = new ArrayList<Student>();
	private String id;
	private int rollNo;
	private String name;
	private double cgpa;
	private String location;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Student getStudent() 
	{
		return student;
	}
	
	public void setStudent(Student student) 
	{
		this.student = student;
	}
	
	public StudentService getService() 
	{
		return service;
	}
	
	public void setService(StudentService service) 
	{
		this.service = service;
	}
	
	public List<Student> getStudents() throws Exception 
	{
		return service.getStudents();
	}
	
	public void setStudents(List<Student> students) 
	{
		this.students = students;
	}

	@Override
	public String execute() throws Exception 
	{
		student = new Student();
		student.setId(id);
		student.setName(name);
		student.setCgpa(cgpa);
		student.setRollNo(rollNo);
		student.setLocation(location);
		return this.SUCCESS;
	}
	
	public String doEdit() throws SQLException
	{
		System.out.println(student.getName());
		if (student.getCgpa() > 10.0 || student.getCgpa() < 0.0 || student.getName().length() == 0)
		{
			return this.ERROR;
		}
		service.updateStudent(student);
		return this.SUCCESS;
	}
}
