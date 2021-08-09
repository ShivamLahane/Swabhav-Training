package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Account ac1 = new Account("Shivam", 1000);
		System.out.println("ID: " + ac1.getAccNo());
		Account ac2 = new Account("Nikhil", 2000);
		System.out.println("ID: " + ac2.getAccNo());
		Account ac3 = new Account("Deepak", 3000);
		System.out.println("ID: " + ac3.getAccNo());
	}
}
