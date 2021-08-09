package com.techlab.model;

public class EmailNotifier extends NotifierDecorator
{
	public EmailNotifier(INotifier notifier) 
	{
		super(notifier);
	}

	@Override
	public void sendMessage(String message) 
	{
		System.out.println("Email notification to " + notifier.getCustomer().getEmailAddress() + " : " + message);
		notifier.sendMessage(message);
	}

	@Override
	public Customer getCustomer() 
	{
		return notifier.getCustomer();
	}
	
}
