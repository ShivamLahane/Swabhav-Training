package com.model;

public class Bmw implements IAuto
{

	@Override
	public void start() 
	{
		System.out.println("BMW has started.");
	}

	@Override
	public void stop() 
	{
		System.out.println("BMW has stopped");
	}

	@Override
	public void getName() 
	{
		System.out.println("BMW");
	}

}
