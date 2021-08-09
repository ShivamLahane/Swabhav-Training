package com.techlabs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.models.Customer;
import com.techlabs.dbServices.DbRepository;
import com.techlabs.models.CustTransaction;

@Service
public class DbService
{
	@Autowired
	private DbRepository dbRepository;

	public DbRepository getDbRepository()
	{
		return dbRepository;
	}

	public void setDbRepository(DbRepository dbRepository)
	{
		this.dbRepository = dbRepository;
	}

	public DbService()
	{
		System.out.println("Db service");
	}

	public Customer doAuth(String name, String password) throws Exception
	{
		return dbRepository.doAuth(name, password);
	}

	public void insertCustomer(Customer customer) throws Exception
	{
		dbRepository.insertCustomer(customer);
	}

	public void addTransaction(CustTransaction transaction) throws Exception
	{
		dbRepository.addTransaction(transaction);
	}

	public List<CustTransaction> getTransactions(String name)
	{
		System.out.println(dbRepository);
		return dbRepository.getTransactions(name);
	}

	public void updateBalance(Customer customer)
	{
		dbRepository.updateBalance(customer);
	}

	public boolean checkIfNameAlreadyPresent(String name) throws Exception
	{
		return dbRepository.checkIfNameAlreadyPresent(name);
	}
	
	public void updateCustomer(Customer customer)
	{
		dbRepository.updateCustomer(customer);
	}
}
