package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest 
{
	public static void main (String args[])
	{
		Account ac1 = new Account(1, "Shivam", 10000);
		System.out.println(ac1.toString());
		Account ac2 = new Account(1, "Shivam", 10000);
		System.out.println(ac2.toString());
		System.out.println(ac1 == ac2);
		System.out.println(ac1.equals(ac2));
	}
}
