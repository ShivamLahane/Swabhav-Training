package com.techlab.model;

public class RealImage implements Image
{
	private String name;
	
	public RealImage(String name) 
	{
		this.name = name;
	}
	
	@Override
	public void display() 
	{
		System.out.println("displaying image : " + name);
	}
	
}
