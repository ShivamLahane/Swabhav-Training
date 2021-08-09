package com.techlab.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account 
{
	private int accId;
	private String name;
	private double balance;
	private List<INotifier> notifiers;
	
	public List<INotifier> getNotifiers()
	{
		return notifiers;
	}

	public Account(int accId, String name, double balance) 
	{
		this.accId = accId;
		this.name = name;
		this.balance = balance;
		notifiers = new ArrayList<INotifier>();
	}

	public int getAccId() 
	{
		return accId;
	}

	public String getName()
	{
		return name;
	}

	public double getBalance() 
	{
		return balance;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public void addNotifier(INotifier notifier)
	{
		notifiers.add(notifier);
	}
	
	public void sendNotification()
	{
		for (INotifier notifier : notifiers)
		{
			notifier.notifySubscriber(this);
		}
	}
}
