package com.techlab.model;

public abstract class HatDecorator implements IHat
{
	protected IHat hat;
	protected double decorationCharges;
	
	public HatDecorator(IHat hat, double decorationCharges)
	{
		this.hat = hat;
		this.decorationCharges = decorationCharges;
	}

	@Override
	public String getName() 
	{
		return hat.getName();
	}

	@Override
	public double getPrice()
	{
		return hat.getPrice() + decorationCharges;
	}

	@Override
	public abstract String getDescription();
	
}
