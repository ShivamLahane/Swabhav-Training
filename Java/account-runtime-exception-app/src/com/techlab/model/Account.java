package com.techlab.model;

public class Account 
{
	private int accNo;
	private double balance;
	private String accName;
	private boolean isWithdrawable;
	
	private static int count = 0;
	
	private static double minBalance = 1000;
	
	public int getCount()
	{
		return count;
	}
	
	public boolean getTrxnFlag()
	{
		return isWithdrawable;
	}
	
	public static double getMinBalance()
	{
		return minBalance;
	}
	
	public Account (int id, String name, double balance)
	{
		this.accNo = id;
		this.accName = name;
		this.balance = balance;
		count++;
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
			isWithdrawable = false;
			throw new RuntimeException("Insufficient Balance");
		}
		else
		{
			isWithdrawable = true;
			balance -= amount;
		}
		return isWithdrawable;
	}
	
	public void printInfo()
	{
		System.out.println("AcNo: " + this.getAccNo());
		System.out.println("Name: " + this.getName());
		System.out.println("balance: " + this.getBalance());
	}
}
