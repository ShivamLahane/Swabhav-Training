package com.techlab.model;

public class LogPrinter 
{
	private Account account;
	
	public LogPrinter(Account account)
	{
		this.account = account;
	}
	
	public void printLogs()
	{
		System.out.println("A/C Holder Name : " + account.getName());
		System.out.println("A/C NO : " + account.getAcNo());
		int count = 0;
		for (Transaction transaction : account.getLogs())
		{
			System.out.println("No : " + (++count));
			System.out.println("Type : " + transaction.getTransactionType());
			System.out.println("Date : " + transaction.getDate());
			System.out.println("Time : " + transaction.getTime() );
			System.out.println(transaction.getTransactionType() +" amount : " + transaction.getAmount());
			System.out.println("Balance : " + transaction.getBalance());
			System.out.println();
		}
	}
}
