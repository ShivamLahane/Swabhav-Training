package com.store.models;

public class LineItem 
{
	private static int itemCount;
	
	static
	{
		itemCount = 0;
	}
	
	private int lineItemId;
	private Product product;
	private int quantity;
	private double totalPrice;

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		LineItem other = (LineItem) obj;
		if (product == null) 
		{
			if (other.product != null) return false;
		} 
		else if (!product.equals(other.product)) return false;
		return true;
	}

	public LineItem(Product product, int quantity)
	{
		this.lineItemId = ++itemCount;
		this.product = product;
		this.quantity = quantity;
		this.setTotalPrice();
	}

	public int getId() 
	{
		return lineItemId;
	}

	public Product getProduct() 
	{
		return product;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public double getTotalPrice()
	{
		return totalPrice;
	}

	public void addQuantity(int quantity) 
	{
		this.quantity += quantity;
	}

	public void setTotalPrice()
	{
		this.totalPrice = quantity * product.getPrice();
	}

	@Override
	public String toString()
	{
		return "LineItem [lineItemId=" + lineItemId + ", product=" + product + ", quantity=" + quantity + ", totalPrice=" + totalPrice + " ]";
	}
	
}
