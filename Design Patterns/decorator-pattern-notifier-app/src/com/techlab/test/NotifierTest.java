package com.techlab.test;

import com.techlab.model.*;

public class NotifierTest 
{
	public static void main(String args[]) 
	{
		Customer customer = 
		new Customer("Shivam", 1, "lahaneshivam@gmail.com", "Shivam Lahane", 
		"Shivam#8087", "8087647929", "8087647929");
		
		// initialize standard notifier
		INotifier standardNotofier = new StandardNotifier(customer);
		
		// adding notifiers to each other
		INotifier whatsappNotifier = new WhatsAppNotifier(standardNotofier);
		INotifier emailNotifier = new EmailNotifier(whatsappNotifier);
		INotifier smsNotifier = new SmsNotifier(emailNotifier);
		
		// send message
		smsNotifier.sendMessage("hello, how are you?");
	}
}
