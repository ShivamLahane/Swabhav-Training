package com.techlab.model;

public class Printer 
{
	private Invoice invoice;
	
	public Printer(Invoice invoice)
	{
		this.invoice = invoice;
	}
	public void printToConsole()
	{
		System.out.println("Invoice No: " + invoice.getNo());
		System.out.println("Name: " + invoice.getName());
		System.out.println("Amount: " + invoice.getAmount());
		System.out.println("Discount %: " + invoice.getDiscountPercentage());
		System.out.println("Total Discount: " + invoice.calculateDiscount());
		System.out.println("Total GST: " + invoice.calculateGST());
		System.out.println("Total invoice amount: " + invoice.calculateTotalCost());
	}
}
