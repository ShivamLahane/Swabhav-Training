package com.techlab.models;

public class Customer
{
	private String name;
	private double balance;
	private String password;
	
	public static double minimumBalance = 500;
	
	public Customer(String name, double balance)
	{
		this.name = name;
		this.balance = balance;
	}
	
	public Customer(String name, double balance, String password)
	{
		this.name = name;
		this.balance = balance;
		this.password = password;
	}

	public String getPassword() 
	{
		return password;
	}

	public String getName()
	{
		return name;
	}

	public double getBalance() 
	{
		return balance;
	}

	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	
}
