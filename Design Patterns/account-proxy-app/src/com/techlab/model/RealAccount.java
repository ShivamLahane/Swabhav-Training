package com.techlab.model;

import java.time.LocalTime;

public class RealAccount implements Account
{
	private String name;
	private double balance;
	private int accNo;
	
	private static double minimumBalance = 1000;
	
	public RealAccount(String name, double balance, int accNo) 
	{
		this.name = name;
		this.balance = balance;
		this.accNo = accNo;
	}
	
	public void withdraw(double amount)
	{
		if ((balance - amount) < minimumBalance)
		{
			System.out.println("minimum balance should remain " + minimumBalance);
			return ;
		}
		balance -= amount;
	}
	
	@Override
	public void deposit(double amount)
	{
		System.out.println("before deposit time : " + LocalTime.now());
		balance += amount;
		System.out.println("after deposit time : " + LocalTime.now());
	}

	@Override
	public double getBalance() 
	{
		return balance;
	}
}
