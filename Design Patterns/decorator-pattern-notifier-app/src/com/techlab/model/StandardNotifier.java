package com.techlab.model;

public class StandardNotifier implements INotifier
{	
	private Customer customer;
	
	public StandardNotifier(Customer customer)
	{
		this.customer = customer;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void sendMessage(String message)
	{
		System.out.println("Standard notofication : " + message);
	}
}
