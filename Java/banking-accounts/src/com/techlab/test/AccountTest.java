package com.techlab.test;

import com.techlab.model.*;

public class AccountTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CurrentAccount currentAcc = new CurrentAccount(1, "Shivam", 1000);
		System.out.println("CurrentAcc Balance: " + currentAcc.getBalance());
		currentAcc.deposit(2000);
		boolean isDone = currentAcc.withdraw(2500);
		if (isDone)
		{
			System.out.println("Balance : " + currentAcc.getBalance());
		}
		else
		{
			System.out.println("Withdraw not possible.");
		}
		
		CurrentAccount savingsAcc = new CurrentAccount(1, "Shivam", 1000);
		System.out.println("CurrentAcc Balance: " + savingsAcc.getBalance());
		savingsAcc.deposit(2000);
		isDone = savingsAcc.withdraw(2500);
		if (isDone)
		{
			System.out.println("Balance : " + savingsAcc.getBalance());
		}
		else
		{
			System.out.println("Withdraw not possible.");
		}
	}

}
