package com.techlab.model;

public class CurrentAccount extends Account
{
	private static final double minBalance = 1000;
	
	public CurrentAccount(int accNo, String accName, double balance)
	{
		super(accNo, accName, balance);
	}
	
	public boolean withdraw(double amount)
	{
		if ((this.getBalance() - amount) < minBalance)
		{
			return false;
		}
		else
		{
			this.setBalance(this.getBalance() - amount);
			return true;
		}
	}
}
