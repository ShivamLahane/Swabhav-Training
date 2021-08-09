package com.techlabs.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.models.Student;

@Repository
public class StudentDbRepository
{
	private Connection con;
	private Statement stmt;
	
	public StudentDbRepository() throws Exception
	{
		System.out.println("Repository created");
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
			Student student = new Student();
			student.setId(rs.getString(1));
			student.setName(rs.getString(2));
			student.setRollNo(rs.getInt(3));
			student.setCgpa(rs.getDouble(4));
			student.setLocation(rs.getString(5));
			students.add(student);
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
