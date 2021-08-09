package com.techlab.model;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart 
{
	private List<Item> items;
	
	public List<Item> getItems()
	{
		return items;
	}
	
	public ShoppingCart()
	{
		items = new LinkedList<Item>();
	}
	
	public void addItem(Item item)
	{
		items.add(item);
	}
	
	public void removeItem(Item item)
	{
		items.remove(item);
	}
}
