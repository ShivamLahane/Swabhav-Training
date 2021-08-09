package com.techlab.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class NoSQLInjectionTest
{
	public static void main(String[] args)
	{
		try
		{
			// CONNECTION
			Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:4040/dept_emp_db", "root","Shivam@81199");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter empno : ");
			String empNo = br.readLine();
			
			PreparedStatement stmnt = (PreparedStatement) con.prepareStatement("SELECT * FROM EMP WHERE EMPNO = ?");
			stmnt.setInt(1, Integer.parseInt(empNo));
			
			ResultSet rs = stmnt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + 
						rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5)
						+ " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
