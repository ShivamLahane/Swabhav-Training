package com.techlab.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction 
{
	private LocalDate date;
	private LocalTime time;
	private TransactionType transactionType;
	private double balance;
	private double transactionAmount;
	
	public Transaction(double balance, TransactionType type, double amount)
	{
		this.transactionAmount = amount;
		this.balance = balance;
		this.transactionType = type;
		this.date = LocalDate.now();
		this.time = LocalTime.now();
	}
	
	public double getAmount()
	{
		return transactionAmount;
	}
	
	public double getBalance()
	{
		return balance;
	}

	public LocalDate getDate() 
	{
		return date;
	}

	public LocalTime getTime() 
	{
		return time;
	}

	public String getTransactionType() 
	{
		return transactionType.getType();
	}
}
 