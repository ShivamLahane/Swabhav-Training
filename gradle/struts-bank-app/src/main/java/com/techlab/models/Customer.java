package com.techlab.models;

public class Customer
{
	private String name;
	private double balance;
	private String password;
	
	public static double minimumBalance = 500;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public static double getMinimumBalance() 
	{
		return minimumBalance;
	}

	public static void setMinimumBalance(double minimumBalance)
	{
		Customer.minimumBalance = minimumBalance;
	}

}
