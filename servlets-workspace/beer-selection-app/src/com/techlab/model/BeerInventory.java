package com.techlab.model;

import java.util.HashSet;
import java.util.Set;


public class BeerInventory
{
	private Set<Beer> beers = new HashSet<Beer>();
	
	public BeerInventory()
	{
		beers.add(new Beer(10, "light", "Heineken"));
		beers.add(new Beer(12, "light", "Foster's"));
		beers.add(new Beer(14, "amber", "Jack Amber"));
		beers.add(new Beer(12, "amber", "Red Moose"));
		beers.add(new Beer(14, "dark", "Jale Pail Ail"));
		beers.add(new Beer(12, "dark", "Gout Scout"));
		beers.add(new Beer(53, "brown", "Corona"));
	}
	
	public Set<Beer> getInventory()
	{
		return beers;
	}
	
}
