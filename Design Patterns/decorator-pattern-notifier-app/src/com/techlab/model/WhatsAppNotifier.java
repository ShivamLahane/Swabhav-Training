package com.techlab.model;

public class WhatsAppNotifier extends NotifierDecorator
{

	public WhatsAppNotifier(INotifier notifier) 
	{
		super(notifier);
	}

	@Override
	public void sendMessage(String message)
	{
		System.out.println("WhatsApp notification : " + message);
		notifier.sendMessage(message);
	}

	@Override
	public Customer getCustomer() 
	{
		return notifier.getCustomer();
	}
	
}
