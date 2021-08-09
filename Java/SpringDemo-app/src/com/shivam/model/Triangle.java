package com.shivam.model;

public class Triangle
{
	private String type;
	private int height;
	
	public Triangle(String type, int height) 
	{
		this.type = type;
		this.height = height;
	}

	public String getType()
	{
		return type;
	}

	public int getHeight() 
	{
		return height;
	}
	
	public void draw()
	{
		System.out.println(type + "triangle of height " + height);
	}
	
}
