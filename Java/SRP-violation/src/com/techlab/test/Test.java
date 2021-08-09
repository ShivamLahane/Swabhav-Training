package com.techlab.test;

import com.techlab.model.Invoice;

public class Test 
{
	public static void main(String[] args) 
	{
		Invoice invoice = new Invoice(1, "Shivam", 1000, 15);
		Invoice.printToConsole(invoice);
	}
}
