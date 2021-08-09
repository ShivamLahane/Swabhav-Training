package com.techlabs.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product
{
	@Id
	private int id;
	
	@OneToMany
	private Set<LineItem> lineItems;
	
	private double price;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public Set<LineItem> getLineItems()
	{
		return lineItems;
	}

	public void setLineItems(Set<LineItem> lineItems)
	{
		this.lineItems = lineItems;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
}
