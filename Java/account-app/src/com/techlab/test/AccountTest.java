package com.techlab.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.techlab.model.Account;

public class AccountTest 
{
	@Test
	public void testDeposit()
	{
		// arrange
		double expectedBalance = 2000;
		// act
		Account ac = new Account(1, "Shivam", 1000);
		ac.deposit(1000);
		// assert
		assertEquals(expectedBalance, ac.getBalance());
	}
	
	@Test
	public void testWithDraw()
	{
		// arrange
		double expectedBalance = 1000;
		// act
		Account ac = new Account(1, "Shivam", 1000);
		ac.withdraw(1000);
		// assert
		assertEquals(expectedBalance, ac.getBalance());
	}
}
