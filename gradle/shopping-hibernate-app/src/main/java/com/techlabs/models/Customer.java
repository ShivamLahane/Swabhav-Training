package com.techlabs.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Customer
{
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Orders> orders;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Set<Orders> getOrders()
	{
		return orders;
	}
	
	public void setOrders(Set<Orders> orders)
	{
		this.orders = orders;
	}
}
