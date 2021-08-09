package com.techlab.model;

public class Man implements IEmotionable, ISocializable
{

	@Override
	public void depart() 
	{
		// TODO Auto-generated method stub
		System.out.println("Man is departing");
	}

	@Override
	public void wish() 
	{
		// TODO Auto-generated method stub
		System.out.println("Man is wishing");
	}

	@Override
	public void cry() 
	{
		// TODO Auto-generated method stub
		System.out.println("Man is crying");
	}

	@Override
	public void laugh() 
	{
		// TODO Auto-generated method stub
		System.out.println("Man is laughing");
	}
	
}
