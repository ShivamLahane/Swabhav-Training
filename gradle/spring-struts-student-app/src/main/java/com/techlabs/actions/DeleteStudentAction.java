package com.techlabs.actions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.techlabs.models.Student;
import com.techlabs.services.StudentService;

public class DeleteStudentAction implements Action
{
	private String id;
	@Autowired
	private StudentService service = new StudentService();
	private List<Student> students = new ArrayList<Student>();
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}

	public List<Student> getStudents() throws Exception {
		return service.getStudents();
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String execute() throws Exception 
	{
		return this.SUCCESS;
	}
	
	public String doDelete() throws SQLException
	{
		System.out.println(id);
		service.deleteStudent(id);
		return this.SUCCESS;
	}
}
