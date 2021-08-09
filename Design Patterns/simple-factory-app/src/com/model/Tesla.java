package com.model;

public class Tesla implements IAuto
{

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

}

