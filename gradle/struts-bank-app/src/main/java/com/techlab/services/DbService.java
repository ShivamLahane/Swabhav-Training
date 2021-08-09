package com.techlab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.dbServices.DbRepository;
import com.techlab.models.Customer;
import com.techlab.models.CustTransaction;

@Service
public class DbService
{
	private DbRepository dbRepository;
	
	public DbRepository getDbRepository() {
		return dbRepository;
	}

	public void setDbRepository(DbRepository dbRepository) {
		this.dbRepository = dbRepository;
	}

	public DbService() throws Exception
	{
		dbRepository = new DbRepository();
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
		return dbRepository.getTransactions(name);
	}

	public void updateBalance(String name, double amount) 
	{
		dbRepository.updateBalance(name, amount);
	}

	public boolean checkIfNameAlreadyPresent(String name) throws Exception
	{
		return dbRepository.checkIfNameAlreadyPresent(name);
	}
}
