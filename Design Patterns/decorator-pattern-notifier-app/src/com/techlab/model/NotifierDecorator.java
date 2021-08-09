package com.techlab.model;

public abstract class NotifierDecorator implements INotifier
{
	protected INotifier notifier;
	
	public NotifierDecorator(INotifier notifier) 
	{
		this.notifier = notifier;
	}

	@Override
	public abstract void sendMessage(String message);

	@Override
	public abstract Customer getCustomer();

}
