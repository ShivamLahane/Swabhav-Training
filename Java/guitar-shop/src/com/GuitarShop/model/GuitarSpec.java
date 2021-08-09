package com.GuitarShop.model;

public class GuitarSpec extends InstrumentSpec
{
	private int numOfStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int noOfStrings)
	{
		super(builder, model, type, backWood, topWood);
		this.numOfStrings = noOfStrings;
	}
	
	public int getNumOfStrings()
	{
		return numOfStrings;
	}

	public boolean matches(InstrumentSpec spec)
	{
		GuitarSpec otherSpec = (GuitarSpec) spec;
		if (builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
			return false;
		if (type != otherSpec.type)
			return false;
		if (numOfStrings == otherSpec.getNumOfStrings())
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		return true;
	}

}
