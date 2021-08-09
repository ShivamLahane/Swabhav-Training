package com.techlabs.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer
{
	@Id
	private String id;
	private double balance;
	private String name;
	@OneToMany(mappedBy = "customer")
	public Set<Transaction> getTransactions()
	{
		return transactions;
	}

	public void setTransactions(Set<Transaction> transactions)
	{
		this.transactions = transactions;
	}

	private Set<Transaction> transactions;
	
	public Customer()
	{
		
	}
	
	public String getId()
	{
		return id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
