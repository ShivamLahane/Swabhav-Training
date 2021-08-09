package com.techlab.dbServices;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.techlab.models.Customer;
import com.techlab.models.Transaction;

public class DbRepository implements IDbService
{
	private Connection con;
	
	public DbRepository() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","Shivam@81199");
		con.setAutoCommit(false);
	}
	
	@Override
	public void insertCustomer(Customer customer) throws Exception 
	{
		System.out.println("inside customer / add");
		PreparedStatement stmnt = (PreparedStatement) 
				con.prepareStatement("INSERT INTO BANK_MASTER VALUES(?,?,?)");
		stmnt.setString(1, customer.getName());
		stmnt.setDouble(2, customer.getBalance());
		stmnt.setString(3, customer.getPassword());
		stmnt.execute();
		con.commit();
	}

	@Override
	public void addTransaction(Transaction transction) throws Exception 
	{
		try
		{
			System.out.println("transaction : add");
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
	
	@Override
	public Customer doAuth(String name, String password) throws Exception
	{
		PreparedStatement stmnt = (PreparedStatement) con.prepareStatement("SELECT * FROM BANK_MASTER WHERE NAME = ?");
		stmnt.setString(1, name);
		
		ResultSet rs  = stmnt.executeQuery();
		int count = 0;
		while(rs.next())
		{
			String username  = rs.getString(1);
			double balance = rs.getDouble(2);
			String pssword = rs.getString(3);
			if (password.equals(pssword))
			{
				return new Customer(username, balance);
			}
			count++;
		}
		System.out.println(count);
		return null;
	}

	@Override
	public List<Transaction> getTransactions(String name) 
	{
		PreparedStatement stmnt;
		try 
		{
			stmnt = (PreparedStatement) con.prepareStatement("SELECT * FROM BANK_TRANSACTIONS WHERE USERNAME = ?");
			stmnt.setString(1, name);
			ResultSet rs = stmnt.executeQuery();
			List<Transaction> transactions = new LinkedList<Transaction>();
			while(rs.next())
			{
				transactions.add(0, new Transaction(rs.getString(1), rs.getDouble(2), rs.getString(3), rs.getString(4)));
			}
			return transactions;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
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
			System.out.println("update bal : " + status);
			con.commit();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
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
