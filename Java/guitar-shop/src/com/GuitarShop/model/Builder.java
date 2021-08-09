package com.GuitarShop.model;

public enum Builder 
{
	FENDER, MARTIN, GIBSON, COLLINGS,
	OLSON, RYAN, PRS, ANY;
	
	public String toString()
	{
		switch(this)
		{
			case FENDER:
				return "Fender";
			case MARTIN:
				return "Electric";
			case GIBSON:
				return "Gibson";
			case COLLINGS:
				return "Collings";
			case OLSON:
				return "Ryan";
			case PRS:
				return "prs";
			case ANY:
				return "Any";
			default:
				return null;
		}
	}
}
