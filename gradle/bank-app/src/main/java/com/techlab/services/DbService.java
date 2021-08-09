package com.techlab.services;

import java.util.List;

import com.techlab.dbServices.DbRepository;
import com.techlab.dbServices.IDbService;
import com.techlab.models.Customer;
import com.techlab.models.Transaction;

public class DbService implements IDbService
{
	private DbRepository dbRepository;
	
	public DbService() throws Exception
	{
		dbRepository = new DbRepository();
	}
	
	@Override
	public Customer doAuth(String name, String password) throws Exception
	{
		return dbRepository.doAuth(name, password);
	}

	@Override
	public void insertCustomer(Customer customer) throws Exception 
	{
		dbRepository.insertCustomer(customer);	
	}

	@Override
	public void addTransaction(Transaction transaction) throws Exception 
	{
		dbRepository.addTransaction(transaction);
	}

	@Override
	public List<Transaction> getTransactions(String name) 
	{
		return dbRepository.getTransactions(name);
	}

	@Override
	public void updateBalance(String name, double amount) 
	{
		dbRepository.updateBalance(name, amount);
	}

	@Override
	public boolean checkIfNameAlreadyPresent(String name) throws Exception
	{
		return dbRepository.checkIfNameAlreadyPresent(name);
	}
}
