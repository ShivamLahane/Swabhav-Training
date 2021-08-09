package com.techlabs.repositories;

import java.sql.SQLException;
import java.util.List;

import com.techlabs.models.Student;

public interface IStudentService
{
	public void addStudent(Student student) throws SQLException;
	
	public List<Student> getStudents() throws Exception;
	
	public void updateStudent(Student student) throws SQLException;
	
	public void deleteStudent(String id) throws SQLException;
}
