package com.model;

public class AutomobileFactory
{
	private static IAuto bmw, tesla, audi;
	
	static
	{
		bmw = new Bmw();
		tesla = new Tesla();
		audi = new Audi();
	}
	
	public IAuto make(AutoType type)
	{
		if(type == AutoType.BMW)
			return bmw;
		if (type == AutoType.AUDI)
			return audi;
		if (type == AutoType.TESLA)
			return tesla;
		return null;
	}
}
