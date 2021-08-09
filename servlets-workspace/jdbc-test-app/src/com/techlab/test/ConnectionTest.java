package com.techlab.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/emp", "root","Shivam@81199");
			System.out.println("Class Name : " + con.getClass());
			System.out.println("Database Name : " + con.getCatalog());
			System.out.println("Timeout : " + con.getNetworkTimeout());
			System.out.println("Server Name : " + con.getMetaData().getDatabaseProductName());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
