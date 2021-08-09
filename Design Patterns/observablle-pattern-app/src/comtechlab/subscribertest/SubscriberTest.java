package comtechlab.subscribertest;

import com.techlab.publisher.*;
import com.techlab.subscriber.EmailNotifier;
import com.techlab.subscriber.SmsNotifier;

public class SubscriberTest 
{
	public static void main(String[] args) 
	{
		Account acc = new Account(1, "Shivam", 10000);
		acc.addNotifier(new SmsNotifier());
		acc.addNotifier(new EmailNotifier());
		acc.deposit(1000);
		acc.sendNotification();
	}
}
