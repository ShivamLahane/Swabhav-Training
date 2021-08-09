package com.model;

public class AudiFactory implements IAutomobileFactory
{
	private static Audi audi;
	
	static
	{
		audi = new Audi();
	}
	@Override
	public IAuto make()
	{
		return audi;
	}

}
