package com.model;

public class TeslaFactory implements IAutomobileFactory
{
	
	private static Tesla tesla;
	
	static
	{
		tesla = new Tesla();
	}
	
	@Override
	public IAuto make() 
	{
		return tesla;
	}

}
