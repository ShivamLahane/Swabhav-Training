package com.techlab.model;

public class GoldenHatDecorator extends HatDecorator implements IHat
{
	
	public GoldenHatDecorator(IHat hat, double charge)
	{
		super(hat, charge);
	}

	@Override
	public String getDescription() 
	{
		return hat.getDescription() + ", this is golden colored.";
	}
	
	
}
