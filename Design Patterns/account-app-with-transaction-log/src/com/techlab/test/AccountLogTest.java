package com.techlab.test;

import com.techlab.model.*;

public class AccountLogTest 
{
	public static void main(String args[])
	{
		// creating account and doing transactions
		Account account = new Account("Shivam", 1, 1000);
		account.deposit(1000);
		account.withdraw(100);
		account.deposit(100000);
		account.withdraw(1000);
		account.withdraw(2500);
		account.deposit(20000);
		// printing log
		LogPrinter printer = new LogPrinter(account);
		printer.printLogs();
	}
}
