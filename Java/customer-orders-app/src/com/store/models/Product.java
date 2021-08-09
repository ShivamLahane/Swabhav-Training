package com.store.models;

public class Product 
{
	private static int pCount;
	
	static
	{
		pCount = 0;
	}
	
	private int productId;
	private String productName;
	private double productPrice;
	
	public static int getpCount() 
	{
		return pCount;
	}

	public int getId() 
	{
		return productId;
	}

	public String getName() 
	{
		return productName;
	}

	public double getPrice() 
	{
		return productPrice;
	}
	
	public Product(String pName, double price) 
	{
		this.productId = ++pCount;
		this.productName = pName;
		this.productPrice = price;
	}

	@Override
	public String toString() 
	{
		return "Product [id=" + productId + ", name=" + productName + ", price=" + productPrice + "]";
	}
	
}
