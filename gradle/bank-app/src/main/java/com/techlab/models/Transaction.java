package com.techlab.models;

import java.time.LocalDateTime;

public class Transaction 
{
	private String name;
	private double amount;
	private String type;
	private String date;
	
	public Transaction(String name, double amount, String type) 
	{
		this.name = name;
		this.amount = amount;
		this.type = type;
		this.date = LocalDateTime.now().toString();
	}
	
	public Transaction(String name, double amount, String type, String date) 
	{
		this.name = name;
		this.amount = amount;
		this.type = type;
		this.date = date;
	}

	public String getName() 
	{
		return name;
	}

	public double getAmount() 
	{
		return amount;
	}

	public String getType()
	{
		return type;
	}

	public String getDate() 
	{
		return date;
	}
	
	
}
