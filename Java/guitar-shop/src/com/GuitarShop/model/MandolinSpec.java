package com.GuitarShop.model;

public class MandolinSpec extends InstrumentSpec 
{
	private Style style;
	
	public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) 
	{
		super(builder, model, type, backWood, topWood);
		this.style = style;
	}
	
	public String getStyle()
	{
		return style.toString();
	}
	
	public boolean matches(InstrumentSpec spec) 
	{
		MandolinSpec otherSpec = (MandolinSpec) spec;
		if (builder != otherSpec.builder)
		return false;
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model)))
		return false;
		if (type != otherSpec.type)
		return false;
		if (!getStyle().equals(otherSpec.getStyle()))
		return false;
		if (backWood != otherSpec.backWood)
		return false;
		if (topWood != otherSpec.topWood)
		return false;
		return true;
	}
}
