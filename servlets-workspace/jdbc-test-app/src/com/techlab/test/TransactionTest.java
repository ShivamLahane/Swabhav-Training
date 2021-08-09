package com.techlab.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Statement;

public class TransactionTest
{
	public static void main(String[] args)
	{
		try
		{
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/merchant_customer", "root","Shivam@81199");
			con.setAutoCommit(false);
			try
			{
				Statement stmt = (Statement) con.createStatement();
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.println("Enter purchase amount : ");
				int purchase = Integer.parseInt(br.readLine());
				
				System.out.println("Enter customer id : ");
				int cId = Integer.parseInt(br.readLine());
				
				System.out.println("Enter merchant id : ");
				int mId = Integer.parseInt(br.readLine());
				
				ResultSet rs = stmt.executeQuery("SELECT BALANACE FROM CUSTOMER WHERE C_ID = " + cId + ";");
				rs.next();
				int customerBalance = rs.getInt(1) - purchase;
				if (customerBalance < 0)
				{
					throw new Exception("Can't make transaction, not suffiecient balance");
				}
				stmt.execute("UPDATE CUSTOMER SET BALANACE = " + customerBalance + " WHERE C_ID = " + cId + ";");
				
				rs = stmt.executeQuery("SELECT BALANACE FROM MERCHANT WHERE ID = " + mId + ";");
				rs.next();
				int merchantBalance = rs.getInt(1) + purchase;
				stmt.execute("UPDATE MERCHANT SET BALANACE = " + merchantBalance + " WHERE ID = " + mId + ";");
				
				con.commit();
			}
			catch(Exception e)
			{
				con.rollback();
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
