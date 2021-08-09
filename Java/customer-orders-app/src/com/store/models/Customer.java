package com.store.models;

import java.util.ArrayList;
import java.util.List;

public class Customer 
{
	private static int customerCount;
	
	static 
	{
		customerCount = 0;
	}
	
	private int id;
	private String name;
	private List<Order> orders = new ArrayList<Order>();
	
	public static int getCustomerCount()
	{
		return customerCount;
	}

	public Customer(String name)
	{
		this.id = ++customerCount;
		this.name = name;
	}

	public int getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public List<Order> getOrders() 
	{
		return orders;
	}
	
	public void setOrder(Order order)
	{
		orders.add(order);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
}
