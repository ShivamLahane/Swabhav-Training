package com.techlab.model;

public class Hat 
{
	private String shortName;
	private String longName;
	private double basePrice;
	
	public Hat(String s, String l, double price)
	{
		shortName = s;
		longName = l;
		basePrice = price;
	}
	
	public double getPrice()
	{
		return basePrice;
	}
	
	public String getShortName()
	{
		return shortName;
	}
	
	public String getLongName()
	{
		return longName;
	}
}
