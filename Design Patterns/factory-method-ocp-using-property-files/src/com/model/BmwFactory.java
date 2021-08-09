package com.model;

public class BmwFactory implements IAutomobileFactory
{
	private static Bmw bmw;
	
	static 
	{
		bmw = new Bmw();
	}
	
	@Override
	public IAuto make()
	{
		return bmw;
	}

}
