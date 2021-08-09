package com.techlab.model;

public class StandardHat implements IHat
{
	private String name;
	private double price;
	private String descryption;
	

	public String getName() 
	{
		return name;
	}

	public double getPrice() 
	{
		return price;
	}

	public StandardHat(String name, double price, String description) 
	{
		this.name = name;
		this.price = price;
		this.descryption = description;
	}

	public String getDescription() 
	{
		return descryption;
	}
}
