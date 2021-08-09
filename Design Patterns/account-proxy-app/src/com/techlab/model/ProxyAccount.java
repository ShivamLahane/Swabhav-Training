package com.techlab.model;

public class ProxyAccount implements Account
{
	private String name;
	private double balance;
	private int accNo;
	private Account account;
	
	public ProxyAccount(String name, double balance, int accNo)
	{
		this.name = name;
		this.balance = balance;
		this.accNo = accNo;
	}

	@Override
	public void deposit(double amount) 
	{
		if (account == null)
		{
			account = new RealAccount(name, balance, accNo);
		}
		account.deposit(amount);
	}

	@Override
	public double getBalance() 
	{
		return account.getBalance();
	}
	
}
