package com.techlabs.models;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orders
{
	@Id
	private int id;
	@ManyToOne
	@JoinColumn(name = "Customer_id", nullable = false)
	private Customer customer;
	
	@OneToMany
	private Set<LineItem> lineItems;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	public Set<LineItem> getLineItems()
	{
		return lineItems;
	}
	
	public void setLineItems(Set<LineItem> lineItems)
	{
		this.lineItems = lineItems;
	}
	
}
