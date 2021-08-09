package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Account
{
	private String name;
	private int acNo;
	private double balance;
	private List<Transaction> logs = new ArrayList<Transaction>();
	
	public Account(String name, int acNo, double initialBalance) 
	{
		this.name = name;
		this.acNo = acNo;
		this.balance = initialBalance;
		logs.add(new Transaction(balance, new TypeDeposit(), initialBalance));
	}

	public String getName() 
	{
		return name;
	}

	public int getAcNo() 
	{
		return acNo;
	}

	public double getBalance() 
	{
		return balance;
	}

	public List<Transaction> getLogs() 
	{
		return logs;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		logs.add(new Transaction(balance, new TypeDeposit(), amount));
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
		logs.add(new Transaction(balance, new TypeWithdraw(), amount));
	}
}
