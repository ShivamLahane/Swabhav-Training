package com.techlab.dbServices;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.techlab.models.*;

@Repository
public class DbRepository
{
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	private Connection con;
	
	public DbRepository() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","Shivam@81199");
		con.setAutoCommit(false);
	}
	
	public void insertCustomer(Customer customer) throws Exception 
	{
		PreparedStatement stmnt = (PreparedStatement) 
				con.prepareStatement("INSERT INTO BANK_MASTER VALUES(?,?,?)");
		stmnt.setString(1, customer.getName());
		stmnt.setDouble(2, customer.getBalance());
		stmnt.setString(3, customer.getPassword());
		stmnt.execute();
		con.commit();
	}

	public void addTransaction(CustTransaction transction) throws Exception 
	{
		try
		{
			PreparedStatement stmnt = (PreparedStatement) 
					con.prepareStatement("INSERT INTO BANK_TRANSACTIONS VALUES(?,?,?,?)");
			stmnt.setString(1, transction.getName());
			stmnt.setDouble(2, transction.getAmount());
			stmnt.setString(3, transction.getType());
			stmnt.setString(4, transction.getDate().toString());
			boolean status = stmnt.execute();
			System.out.println(status);
			con.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Customer doAuth(String name, String password) throws Exception
	{
		PreparedStatement stmnt = (PreparedStatement) con.prepareStatement("SELECT * FROM BANK_MASTER WHERE NAME = ?");
		stmnt.setString(1, name);
		
		ResultSet rs  = stmnt.executeQuery();
		int count = 0;
		while(rs.next())
		{
			String name1 = rs.getString(1);
			double balance = rs.getDouble(2);
			String pssword = rs.getString(3);
			if (password.equals(pssword))
			{	
				Customer customer = new Customer();
				customer.setName(name1);
				customer.setBalance(balance);
				return customer;
			}
			count++;
		}
		System.out.println(count);
		return null;
	}

	public List<CustTransaction> getTransactions(String name) 
	{
		PreparedStatement stmnt;
		try 
		{
			stmnt = (PreparedStatement) con.prepareStatement("SELECT * FROM BANK_TRANSACTIONS WHERE USERNAME = ?");
			stmnt.setString(1, name);
			ResultSet rs = stmnt.executeQuery();
			List<CustTransaction> transactions = new LinkedList<CustTransaction>();
			while(rs.next())
			{
				CustTransaction transaction = new CustTransaction();
				transaction.setName(rs.getString(1));
				transaction.setAmount(rs.getDouble(2));
				transaction.setType( rs.getString(3));
				transaction.setDate(rs.getString(4));
				transactions.add(0, transaction);
			}
			return transactions;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return null;
		}
	}

	public void updateBalance(String name, double amount) 
	{
		PreparedStatement stmnt;
		try 
		{
			System.out.println(amount);
			stmnt = (PreparedStatement) con.prepareStatement("UPDATE BANK_MASTER SET BALANCE = ? WHERE NAME = ?");
			stmnt.setDouble(1, amount);
			stmnt.setString(2, name);
			boolean status =  stmnt.execute();
			con.commit();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	public boolean checkIfNameAlreadyPresent(String name) throws Exception 
	{
		PreparedStatement stmnt = (PreparedStatement) con.prepareStatement("SELECT * FROM BANK_MASTER WHERE NAME = ?");
		try 
		{
			stmnt.setString(1, name);
			ResultSet rs  = stmnt.executeQuery();
			int count = 0;
			while(rs.next())
			{
				count++;
			}
			if (count > 0)
			{
				return true;
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
	}
}
