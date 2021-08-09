package com.techlab.model;

public class SavingsAccount extends Account
{
	public static final double minBalance = 500;
	
	public SavingsAccount(int accNo, String accName, double balance)
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
