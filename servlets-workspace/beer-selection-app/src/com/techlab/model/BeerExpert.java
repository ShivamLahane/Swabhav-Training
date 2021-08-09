package com.techlab.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BeerExpert
{
	public List<String> getBrands(String color)
	{
		BeerInventory inventory = new BeerInventory();
		Set<Beer> beerBrands = inventory.getInventory();
		List<String> brands = new ArrayList<String>();
		for (Beer beer : beerBrands)
		{
			if(color.equals(beer.getColor()))
			{
				brands.add(beer.getName());
			}
		}
		return brands;
	}
}		