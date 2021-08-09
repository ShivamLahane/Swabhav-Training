package com.techlabs.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer
{
	private double balance;
	@Id
	private String name;
	private String password;
	
	public static double minimumBalance = 500;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<CustTransaction> transactions;
	
	public List<CustTransaction> getTransactions()
	{
		return transactions;
	}

	public void setTransactions(List<CustTransaction> transactions)
	{
		this.transactions = transactions;
	}

	public Customer()
	{
		
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
