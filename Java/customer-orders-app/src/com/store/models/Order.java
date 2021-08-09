package com.store.models;

import java.util.ArrayList;
import java.util.List;

public class Order 
{
	private static int orderCount;
	
	static
	{
		orderCount = 0;
	}
	
	private int id;
	private String date;
	private double checkoutPrice = 0;
	private List<LineItem> items= new ArrayList<LineItem>();
	
	public int getId() 
	{
		return id;
	}

	public String getDate() 
	{
		return date;
	}

	public double getCheckoutPrice() 
	{
		return checkoutPrice;
	}

	public List<LineItem> getItems() 
	{
		return items;
	}

	public void setCheckoutPrice(LineItem item)
	{
		this.checkoutPrice += item.getTotalPrice();
	}

	public Order(String date)
	{
		this.id = ++orderCount;
		this.date = date;
	}
	
	public void addItem(LineItem item)
	{
		int existIndex = checkIfExists(item);
		if (existIndex == -1) 
		{
			items.add(item);
		}
		else
		{
			LineItem lineItem = items.get(existIndex);
			lineItem.addQuantity(item.getQuantity());
			lineItem.setTotalPrice();
		}
		this.setCheckoutPrice(item);
	}
	
	public int checkIfExists(LineItem item)
	{
		int found = -1;
		for (LineItem i : items)
		{
			if (i.equals(item)) 
			{
				found = items.indexOf(i);
			}
		}
		return found;
	}

	@Override
	public String toString() 
	{
		return "Order [id=" + id + ", date=" + date + ", totalPrice=" + checkoutPrice + ", items=" + items + "]";
	}
	
}
