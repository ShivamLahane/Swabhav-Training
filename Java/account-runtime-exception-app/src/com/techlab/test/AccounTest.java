package com.techlab.test;

import com.techlab.model.Account;

public class AccounTest 
{
	public static void main(String[] args) throws Exception 
	{
		Account ac = new Account(1, "Ginnie Wheasly", 5000);
		ac.printInfo();
		ac.deposit(1000);
		System.out.println("Balance: " + ac.getBalance());
		try
		{
			ac.withdraw(5500);
		}
		catch (RuntimeException e)
		{
			e.getMessage();
		}
		System.out.println("balance: " + ac.getBalance());
	}
}
