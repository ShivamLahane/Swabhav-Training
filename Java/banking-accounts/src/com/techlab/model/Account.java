package com.techlab.model;

public abstract class Account 
{
	private int accNo;
	private String accName;
	private double balance;
	
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}

	public int getAccNo() 
	{
		return accNo;
	}

	public String getAccName() 
	{
		return accName;
	}

	public double getBalance() 
	{
		return balance;
	}

	public Account(int accNo, String accName, double balance) 
	{
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public abstract boolean withdraw(double amount);
}
