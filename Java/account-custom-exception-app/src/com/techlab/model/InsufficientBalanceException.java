package com.techlab.model;

public class InsufficientBalanceException extends RuntimeException 
{
	private double withdrawAmount;
	private Account ac;
	private String message;
	
	public void setMessage() 
	{
		this.message = "Account [accNo=" + ac.getAccNo() + ", balance=" + ac.getBalance() + ", accName=" + ac.getName() + "]";
	}

	public InsufficientBalanceException(Account ac, double amount) 
	{
		this.ac = ac;
		this.withdrawAmount = amount;
	}

	@Override
	public String getMessage()
	{
		this.setMessage();
		return message;
	}
}
