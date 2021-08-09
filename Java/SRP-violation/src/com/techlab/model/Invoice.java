package com.techlab.model;

public class Invoice
{
	private int no;
	private String name;
	private double amount;
	private double discountPercentage;
	private float GST;
	
	public Invoice(int no, String name, double amount, double discountPercentage)
	{
		this.no = no;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
	}

	public int getNo() 
	{
		return no;
	}

	public String getName() 
	{
		return name;
	}

	public double getAmount() 
	{
		return amount;
	}

	public double getDiscountPercentage() 
	{
		return discountPercentage;
	}
	
	public double calculateDiscount()
	{
		return amount * (discountPercentage / 100);
	}
	
	public float calculateGST()
	{
		return (float) (amount * (2 / 100));
	}
	
	public double calculateTotalCost()
	{
		return amount - calculateDiscount();
	}
	
	public static void printToConsole(Invoice invoice)
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
