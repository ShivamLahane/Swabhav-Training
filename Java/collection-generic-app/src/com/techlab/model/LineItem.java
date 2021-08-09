package com.techlab.model;

public class LineItem 
{
	private int id;
	private String name;
	private double unitPrice;
	private int quantity;
	private double totalItemCost;
	
	// Getters
	
	public int getId() 
	{
		return id;
	}
	
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity
				+ ", totalItemCost=" + totalItemCost + "]";
	}

	public String getName() 
	{
		return name;
	}
	
	public double getUnitPrice() 
	{
		return unitPrice;
	}
	
	public int getQuantity() 
	{
		return quantity;
	}
	
	public double getTotalItemCost() 
	{
		return totalItemCost;
	}
	
	public LineItem(int id, String name, double price, int quantity)
	{
		this.id = id;
		this.name = name;
		this.unitPrice = price;
		this.quantity = quantity;
		this.calculateTotalItemPrice();
	}
	
	private void calculateTotalItemPrice() 
	{
		totalItemCost = unitPrice * quantity;
	}
}

