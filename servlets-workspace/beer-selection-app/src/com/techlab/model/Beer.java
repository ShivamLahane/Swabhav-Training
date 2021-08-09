package com.techlab.model;

public class Beer
{
	private double price;
	private String name;
	private String color;
	
	public Beer(double price, String color, String name)
	{
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public double getPrice()
	{
		return price;
	}

	public String getColor()
	{
		return color;
	}
	
	public String getName()
	{
		return name;
	}
	
}
