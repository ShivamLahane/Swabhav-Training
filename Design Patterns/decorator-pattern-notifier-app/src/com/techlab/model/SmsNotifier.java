package com.techlab.model;

public class SmsNotifier extends NotifierDecorator
{

	public SmsNotifier(INotifier notifier) 
	{
		super(notifier);
	}

	@Override
	public void sendMessage(String message) 
	{
		System.out.println("sms notification : " + message);
		notifier.sendMessage(message);
	}

	@Override
	public Customer getCustomer()
	{
		return notifier.getCustomer();
	}
	
}
