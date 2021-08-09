package com.techlab.model;

public class InsufficientBalanceException extends Exception
{
	
	public InsufficientBalanceException() 
	{
		super();
	}
	
	public InsufficientBalanceException(String s) 
	{
		super(s);
	}
}
