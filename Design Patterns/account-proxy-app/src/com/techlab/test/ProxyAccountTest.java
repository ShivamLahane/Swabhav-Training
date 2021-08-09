package com.techlab.test;

import com.techlab.model.*;

public class ProxyAccountTest
{

	public static void main(String[] args) 
	{
		Account proxyAccount = new ProxyAccount("Shivam", 1000, 10);
		proxyAccount.deposit(2000);
		System.out.println(proxyAccount.getBalance());
	}

}
