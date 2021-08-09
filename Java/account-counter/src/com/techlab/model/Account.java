package com.techlab.model;

public class Account 
{
	private int accNo;
	private double balance;
	private String accName;
	private boolean trxnFlag;
	
	private static int lastId;
	private static double minBalance;
	
	static
	{
		lastId = 100;
		minBalance = 1000;
	}
	
	public boolean getTrxnFlag()
	{
		return trxnFlag;
	}
	
	public static double getMinBalance()
	{
		return minBalance;
	}
	
	public Account (String name, double balance)
	{
		this.accNo = ++lastId;
		this.accName = name;
		this.balance = balance;
	}
	
	public int getAccNo()
	{
		return accNo;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getName()
	{
		return accName;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public boolean withdraw(double amount)
	{
		if ((balance - amount) < minBalance)
		{
			trxnFlag = false;
		}
		else
		{
			trxnFlag = true;
			balance -= amount;
		}
		return trxnFlag;
	}
	
	public void printInfo()
	{
		System.out.println("AcNo: " + this.getAccNo());
		System.out.println("Name: " + this.getName());
		System.out.println("balance: " + this.getBalance());
	}
}
