package com.techlab.model;

public class RibbonedHatDecorator extends HatDecorator implements IHat
{
	
	public RibbonedHatDecorator(IHat hat, double decorationCharges)
	{
		super(hat, decorationCharges);
	}

	@Override
	public String getDescription() 
	{
		return hat.getDescription() + ", it is ribboned";
	}

}
