package com.techlab.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class StatementTest
{

	public static void main(String[] args)
	{
		try
		{
			// CONNECTION
			Connection con = DriverManager.getConnection
			("jdbc:mysql://localhost:3306/dept_emp_db", "root","Shivam@81199");
			
			// SELECT QUERY
			Statement stmnt = (Statement) con.createStatement();
			ResultSet rs = stmnt.executeQuery("SELECT * FROM EMP");
			printTable(rs, stmnt);
			System.out.println();
			
			// INSERT QUERY
			stmnt.execute("INSERT INTO EMP VALUES(7890, 'SHIVAM', 'DEV', 7839, '8-NOV-1999', 5000, 0, 10)");
			printTable(rs, stmnt);
			System.out.println();
			
			// UPDATE QUERY
			int rowsUpdated = stmnt.executeUpdate("UPDATE EMP SET ENAME = 'SHIVAML' WHERE EMPNO = 7890");
			printTable(rs, stmnt);
			System.out.println();
			
			// DELETE QUERY
			int rowsDeleted = stmnt.executeUpdate("DELETE FROM EMP WHERE EMPNO = 7890");
			printTable(rs, stmnt);
			System.out.println();
			
			// no of rows updated
			System.out.println("rows updated : " + rowsUpdated);
			
			// no of rows deleted
			System.out.println("rows deleted : " + rowsDeleted);
			
			// Close the connection
			con.close();
			rs.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void printTable(ResultSet rs, Statement stmnt) throws SQLException
	{
		rs = stmnt.executeQuery("SELECT * FROM EMP");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + 
					rs.getString(3) + " " + rs.getInt(4) + " " + rs.getString(5)
					+ " " + rs.getInt(6) + " " + rs.getInt(7) + " " + rs.getInt(8));
		}
	}

}
