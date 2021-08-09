package com.model;

public class Tesla implements IAuto
{
	static Tesla tesla;
	
	static
	{
		tesla = new Tesla();
	}
	
	@Override
	public void start() 
	{
		System.out.println("Tesla started.");
	}

	@Override
	public void stop() 
	{
		System.out.println("Tesla stopped");
	}

	@Override
	public void getName() 
	{
		System.out.println("Tesla");
	}
	
	@Override
	public void printHashCode() 
	{
		System.out.println(hashCode());
	}

}

