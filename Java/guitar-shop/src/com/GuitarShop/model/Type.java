package com.GuitarShop.model;

public enum Type 
{
	ACCOUSTIC, ELECTRIC;
	
	public String toString()
	{
		switch(this)
		{
			case ACCOUSTIC:
				return "Accoustic";
			case ELECTRIC:
				return "Electric";
			default:
				return null;
		}
	}
}
