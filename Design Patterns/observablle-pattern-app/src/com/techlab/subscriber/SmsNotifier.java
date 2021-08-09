package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.INotifier;

public class SmsNotifier implements INotifier
{

	@Override
	public void notifySubscriber(Account ac)
	{
		System.out.println("Notification is sent by SMS. your updated balance is " + ac.getBalance());
	}

}
