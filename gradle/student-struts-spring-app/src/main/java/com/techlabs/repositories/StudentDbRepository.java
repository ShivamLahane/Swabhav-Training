package com.techlabs.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.models.Student;

public class StudentDbRepository implements IStudentService
{
	private Connection con;
	private Statement stmt;
	
	public StudentDbRepository() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root","Shivam@81199");
		stmt = (Statement) con.createStatement();
	}
	
	public List<Student> getStudents() throws Exception
	{
		List<Student> students = new ArrayList<Student>();
		ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");
		
		while(rs.next())
		{
			students.add(
					new Student(rs.getString(1), rs.getString(2), rs.getInt(3), 
							rs.getDouble(4), rs.getString(5)));
		}
		
		return students;
	}
	
	public void addStudent(Student student) throws SQLException
	{
		stmt.execute("INSERT INTO STUDENTS VALUES "
				+ "	("  + "'" + student.getId() + "'" + ", " + "'" + student.getName() + "'" + ", " 
				+ student.getRollNo() + ", " + student.getCgpa()
				+ ", " + "'" + student.getLocation() + "'" + ");");
	}

	public void updateStudent(Student student) throws SQLException
	{
		stmt.executeUpdate("UPDATE STUDENTS SET "
				+ "	name = '" + student.getName() + "', "
				+ "	rollNo = " + student.getRollNo() + ", "
				+ "	cgpa = " + student.getCgpa() + ", "
				+ "	location = '" + student.getLocation() + "'"
				+ " WHERE id = '" + student.getId() + "';");
	}

	public void deleteStudent(String id) throws SQLException
	{
		stmt.execute("DELETE FROM STUDENTS WHERE id = '" + id + "';");
	}
}
