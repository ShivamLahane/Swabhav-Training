package com.techlab.dbServices;

import java.util.List;

import com.techlab.models.Customer;
import com.techlab.models.Transaction;

public interface IDbService 
{
	public void insertCustomer(Customer customer) throws Exception;
	
	public void updateBalance(String name, double amount);

	public Customer doAuth(String name, String password) throws Exception;

	public void addTransaction(Transaction tranasction) throws Exception;
	
	public List<Transaction>  getTransactions(String name);
	
	public boolean checkIfNameAlreadyPresent(String name) throws Exception;
}
