package com.GuitarShop.model;

public abstract class Instrument 
{
	
	protected int id;
	protected InstrumentSpec spec;
	protected double price;

	public Instrument(int id, InstrumentSpec spec, double price) 
	{
		this.id = id;
		this.spec = spec;
		this.price = price;
	}

	public int getId() 
	{
		return id;
	}

	public InstrumentSpec getSpec() 
	{
		return spec;
	}

	public double getPrice() 
	{
		return price;
	}
	
}
